#!/bin/bash
# This file is meant to be included by the parent cppbuild.sh script
if [[ -z "$PLATFORM" ]]; then
    pushd ..
    bash cppbuild.sh "$@" pytorch
    popd
    exit
fi

export MAX_JOBS=$MAKEJ
export USE_CUDA=0
export USE_OPENMP=1
if [[ "$EXTENSION" == *gpu ]]; then
    export USE_CUDA=1
    export TORCH_CUDA_ARCH_LIST="3.5+PTX"
fi

PYTORCH_VERSION=1.8.1

mkdir -p "$PLATFORM$EXTENSION"
cd "$PLATFORM$EXTENSION"
INSTALL_PATH=`pwd`

if [[ ! -d pytorch ]]; then
    git clone https://github.com/pytorch/pytorch
fi
cd pytorch
git reset --hard
git checkout v$PYTORCH_VERSION
git submodule update --init --recursive --jobs $MAKEJ
git submodule foreach --recursive 'git reset --hard'

CPYTHON_PATH="$INSTALL_PATH/../../../cpython/cppbuild/$PLATFORM/"
OPENBLAS_PATH="$INSTALL_PATH/../../../openblas/cppbuild/$PLATFORM/"
NUMPY_PATH="$INSTALL_PATH/../../../numpy/cppbuild/$PLATFORM/"

if [[ -n "${BUILD_PATH:-}" ]]; then
    PREVIFS="$IFS"
    IFS="$BUILD_PATH_SEPARATOR"
    for P in $BUILD_PATH; do
        if [[ $(find "$P" -name Python.h) ]]; then
            CPYTHON_PATH="$P"
        elif [[ -f "$P/include/openblas_config.h" ]]; then
            OPENBLAS_PATH="$P"
        elif [[ -f "$P/python/numpy/core/include/numpy/numpyconfig.h" ]]; then
            NUMPY_PATH="$P"
        fi
    done
    IFS="$PREVIFS"
fi

CPYTHON_PATH="${CPYTHON_PATH//\\//}"
OPENBLAS_PATH="${OPENBLAS_PATH//\\//}"
NUMPY_PATH="${NUMPY_PATH//\\//}"

if [[ -f "$CPYTHON_PATH/include/python3.9/Python.h" ]]; then
    # setup.py won't pick up the right libgfortran.so without this
    export LD_LIBRARY_PATH="$OPENBLAS_PATH/lib/:$CPYTHON_PATH/lib/:$NUMPY_PATH/lib/"
    export PYTHON_BIN_PATH="$CPYTHON_PATH/bin/python3.9"
    export PYTHON_INCLUDE_PATH="$CPYTHON_PATH/include/python3.9/"
    export PYTHON_LIB_PATH="$CPYTHON_PATH/lib/python3.9/"
    export PYTHON_INSTALL_PATH="$INSTALL_PATH/lib/python3.9/site-packages/"
    chmod +x "$PYTHON_BIN_PATH"
elif [[ -f "$CPYTHON_PATH/include/Python.h" ]]; then
    CPYTHON_PATH=$(cygpath $CPYTHON_PATH)
    OPENBLAS_PATH=$(cygpath $OPENBLAS_PATH)
    NUMPY_PATH=$(cygpath $NUMPY_PATH)
    export PATH="$OPENBLAS_PATH:$CPYTHON_PATH:$NUMPY_PATH:$PATH"
    export PYTHON_BIN_PATH="$CPYTHON_PATH/bin/python.exe"
    export PYTHON_INCLUDE_PATH="$CPYTHON_PATH/include/"
    export PYTHON_LIB_PATH="$CPYTHON_PATH/lib/"
    export PYTHON_INSTALL_PATH="$INSTALL_PATH/lib/site-packages/"
fi
export PYTHONPATH="$PYTHON_INSTALL_PATH:$NUMPY_PATH/python/"
mkdir -p "$PYTHON_INSTALL_PATH"

export CFLAGS="-I$CPYTHON_PATH/include/ -I$PYTHON_LIB_PATH/include/python/ -L$CPYTHON_PATH/lib/ -L$CPYTHON_PATH/libs/"
export PYTHONNOUSERSITE=1
$PYTHON_BIN_PATH -m pip install --target=$PYTHON_LIB_PATH setuptools pyyaml typing_extensions

case $PLATFORM in
    linux-x86)
        export CC="gcc -m32"
        export CXX="g++ -m32"
        ;;
    linux-x86_64)
        export CC="gcc -m64"
        export CXX="g++ -m64"
        ;;
    macosx-*)
        ln -sf pytorch/torch/lib ../lib
        cp /usr/local/lib/libomp.dylib ../lib/libiomp5.dylib
        chmod +w ../lib/libiomp5.dylib
        install_name_tool -id @rpath/libiomp5.dylib ../lib/libiomp5.dylib
        export CC="clang -L$INSTALL_PATH/lib -Wl,-rpath,$INSTALL_PATH/lib -liomp5 -Wno-unused-command-line-argument"
        export CXX="clang++ -L$INSTALL_PATH/lib -Wl,-rpath,$INSTALL_PATH/lib -liomp5 -Wno-unused-command-line-argument"
        ;;
    windows-x86_64)
        export CC="cl.exe"
        export CXX="cl.exe"
        export CFLAGS="-I$CPYTHON_PATH/include/ -I$PYTHON_LIB_PATH/include/python/"
        ;;
    *)
        echo "Error: Platform \"$PLATFORM\" is not supported"
        return 0
        ;;
esac

# work around some compiler bugs
sedinplace 's/using ExpandingArrayDouble/public: using ExpandingArrayDouble/g' ./torch/csrc/api/include/torch/nn/options/pooling.h
sedinplace 's/typedef c10::variant/public: typedef c10::variant/g' ./torch/csrc/api/include/torch/nn/options/upsampling.h
sedinplace "s/BUILD_DIR = 'build'/BUILD_DIR = os.environ['BUILD_DIR'] if 'BUILD_DIR' in os.environ else 'build'/g" tools/setup_helpers/env.py

"$PYTHON_BIN_PATH" setup.py build

rm -Rf ../lib
ln -sf pytorch/torch/include ../include
ln -sf pytorch/torch/lib ../lib
ln -sf pytorch/torch/bin ../bin

cd ../..
