// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;

@Name("std::vector<double>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class DoubleVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DoubleVector(Pointer p) { super(p); }
    public DoubleVector(double value) { this(1); put(0, value); }
    public DoubleVector(double ... array) { this(array.length); put(array); }
    public DoubleVector()       { allocate();  }
    public DoubleVector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator =") @ByRef DoubleVector put(@ByRef DoubleVector x);

    public boolean empty() { return size() == 0; }
    public native long size();
    public void clear() { resize(0); }
    public native void resize(@Cast("size_t") long n);

    @Index(function = "at") public native double get(@Cast("size_t") long i);
    public native DoubleVector put(@Cast("size_t") long i, double value);

    public native @ByVal Iterator insert(@ByVal Iterator pos, double value);
    public native @ByVal Iterator erase(@ByVal Iterator pos);
    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator ++") @ByRef Iterator increment();
        public native @Name("operator ==") boolean equals(@ByRef Iterator it);
        public native @Name("operator *") double get();
    }

    public double[] get() {
        double[] array = new double[size() < Integer.MAX_VALUE ? (int)size() : Integer.MAX_VALUE];
        for (int i = 0; i < array.length; i++) {
            array[i] = get(i);
        }
        return array;
    }
    @Override public String toString() {
        return java.util.Arrays.toString(get());
    }

    public double pop_back() {
        long size = size();
        double value = get(size - 1);
        resize(size - 1);
        return value;
    }
    public DoubleVector push_back(double value) {
        long size = size();
        resize(size + 1);
        return put(size, value);
    }
    public DoubleVector put(double value) {
        if (size() != 1) { resize(1); }
        return put(0, value);
    }
    public DoubleVector put(double ... array) {
        if (size() != array.length) { resize(array.length); }
        for (int i = 0; i < array.length; i++) {
            put(i, array[i]);
        }
        return this;
    }
}

