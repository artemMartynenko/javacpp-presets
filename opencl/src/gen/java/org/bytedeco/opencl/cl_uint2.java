// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.opencl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.opencl.global.OpenCL.*;



/* ---- cl_uintn ---- */
@Properties(inherit = org.bytedeco.opencl.presets.OpenCL.class)
public class cl_uint2 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public cl_uint2() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public cl_uint2(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cl_uint2(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public cl_uint2 position(long position) {
        return (cl_uint2)super.position(position);
    }
    @Override public cl_uint2 getPointer(long i) {
        return new cl_uint2((Pointer)this).position(position + i);
    }

    public native @Cast("cl_uint") int s(int i); public native cl_uint2 s(int i, int setter);
    @MemberGetter public native @Cast("cl_uint*") IntPointer s();
// #if __CL_HAS_ANON_STRUCT__
// #endif
// #if defined( __CL_UINT2__)
// #endif
}
