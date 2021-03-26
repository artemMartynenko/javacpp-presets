// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.caffe;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;
import org.bytedeco.opencv.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;
import org.bytedeco.hdf5.*;
import static org.bytedeco.hdf5.global.hdf5.*;

import static org.bytedeco.caffe.global.caffe.*;

@Name("std::vector<boost::shared_ptr<caffe::Net<float> > >") @Properties(inherit = org.bytedeco.caffe.presets.caffe.class)
public class FloatNetSharedVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FloatNetSharedVector(Pointer p) { super(p); }
    public FloatNetSharedVector(FloatNet value) { this(1); put(0, value); }
    public FloatNetSharedVector(FloatNet ... array) { this(array.length); put(array); }
    public FloatNetSharedVector()       { allocate();  }
    public FloatNetSharedVector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator =") @ByRef FloatNetSharedVector put(@ByRef FloatNetSharedVector x);

    public boolean empty() { return size() == 0; }
    public native long size();
    public void clear() { resize(0); }
    public native void resize(@Cast("size_t") long n);

    @Index(function = "at") public native @SharedPtr FloatNet get(@Cast("size_t") long i);
    public native FloatNetSharedVector put(@Cast("size_t") long i, FloatNet value);

    public native @ByVal Iterator insert(@ByVal Iterator pos, @SharedPtr FloatNet value);
    public native @ByVal Iterator erase(@ByVal Iterator pos);
    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator ++") @ByRef Iterator increment();
        public native @Name("operator ==") boolean equals(@ByRef Iterator it);
        public native @Name("operator *") @SharedPtr @Const FloatNet get();
    }

    public FloatNet[] get() {
        FloatNet[] array = new FloatNet[size() < Integer.MAX_VALUE ? (int)size() : Integer.MAX_VALUE];
        for (int i = 0; i < array.length; i++) {
            array[i] = get(i);
        }
        return array;
    }
    @Override public String toString() {
        return java.util.Arrays.toString(get());
    }

    public FloatNet pop_back() {
        long size = size();
        FloatNet value = get(size - 1);
        resize(size - 1);
        return value;
    }
    public FloatNetSharedVector push_back(FloatNet value) {
        long size = size();
        resize(size + 1);
        return put(size, value);
    }
    public FloatNetSharedVector put(FloatNet value) {
        if (size() != 1) { resize(1); }
        return put(0, value);
    }
    public FloatNetSharedVector put(FloatNet ... array) {
        if (size() != array.length) { resize(array.length); }
        for (int i = 0; i < array.length; i++) {
            put(i, array[i]);
        }
        return this;
    }
}

