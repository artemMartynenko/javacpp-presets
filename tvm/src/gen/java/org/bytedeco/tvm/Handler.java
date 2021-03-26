// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.tvm;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;
import org.bytedeco.dnnl.*;
import static org.bytedeco.dnnl.global.dnnl.*;
import org.bytedeco.llvm.LLVM.*;
import static org.bytedeco.llvm.global.LLVM.*;
import static org.bytedeco.mkl.global.mkl_rt.*;

import static org.bytedeco.tvm.global.tvm_runtime.*;


@Name("dmlc::serializer::Handler<DLDataType>") @Properties(inherit = org.bytedeco.tvm.presets.tvm_runtime.class)
public class Handler extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public Handler() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Handler(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Handler(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public Handler position(long position) {
        return (Handler)super.position(position);
    }
    @Override public Handler getPointer(long i) {
        return new Handler((Pointer)this).position(position + i);
    }

  public static native void Write(Stream strm, @Const @ByRef DLDataType dtype);
  public static native @Cast("bool") boolean Read(Stream strm, DLDataType dtype);
}
