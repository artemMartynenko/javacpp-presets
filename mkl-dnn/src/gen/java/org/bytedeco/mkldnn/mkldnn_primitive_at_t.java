// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.mkldnn;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.mkldnn.global.mklml.*;

import static org.bytedeco.mkldnn.global.mkldnn.*;


/** A wrapper structure to specify a particular output of a primitive. */
@Properties(inherit = org.bytedeco.mkldnn.presets.mkldnn.class)
public class mkldnn_primitive_at_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public mkldnn_primitive_at_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public mkldnn_primitive_at_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public mkldnn_primitive_at_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public mkldnn_primitive_at_t position(long position) {
        return (mkldnn_primitive_at_t)super.position(position);
    }
    @Override public mkldnn_primitive_at_t getPointer(long i) {
        return new mkldnn_primitive_at_t((Pointer)this).position(position + i);
    }

    /** Primitive to specify the output for. */
    public native @Const mkldnn_primitive primitive(); public native mkldnn_primitive_at_t primitive(mkldnn_primitive setter);
    /** Desired output index. */
    public native @Cast("size_t") long output_index(); public native mkldnn_primitive_at_t output_index(long setter);
}
