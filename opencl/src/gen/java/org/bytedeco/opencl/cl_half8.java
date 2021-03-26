// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.opencl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.opencl.global.OpenCL.*;


@Properties(inherit = org.bytedeco.opencl.presets.OpenCL.class)
public class cl_half8 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public cl_half8() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public cl_half8(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cl_half8(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public cl_half8 position(long position) {
        return (cl_half8)super.position(position);
    }
    @Override public cl_half8 getPointer(long i) {
        return new cl_half8((Pointer)this).position(position + i);
    }

    public native @Cast("cl_half") int s(int i); public native cl_half8 s(int i, int setter);
    @MemberGetter public native @Cast("cl_half*") IntPointer s();
// #if __CL_HAS_ANON_STRUCT__
// #endif
// #if defined( __CL_HALF2__)
// #endif
// #if defined( __CL_HALF4__)
// #endif
// #if defined( __CL_HALF8__ )
// #endif
}
