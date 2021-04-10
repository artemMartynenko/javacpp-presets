// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.nvml;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.nvml.*;


/** \} */

/***************************************************************************************************/
/** \defgroup nvml vGPU Migration
 * This chapter describes operations that are associated with vGPU Migration.
 *  \{
 */
/***************************************************************************************************/

/**
 * Structure representing range of vGPU versions.
 */
@Properties(inherit = org.bytedeco.cuda.presets.nvml.class)
public class nvmlVgpuVersion_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public nvmlVgpuVersion_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public nvmlVgpuVersion_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public nvmlVgpuVersion_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public nvmlVgpuVersion_t position(long position) {
        return (nvmlVgpuVersion_t)super.position(position);
    }
    @Override public nvmlVgpuVersion_t getPointer(long i) {
        return new nvmlVgpuVersion_t((Pointer)this).position(position + i);
    }

    /** Minimum vGPU version. */
    public native @Cast("unsigned int") int minVersion(); public native nvmlVgpuVersion_t minVersion(int setter);
    /** Maximum vGPU version. */
    public native @Cast("unsigned int") int maxVersion(); public native nvmlVgpuVersion_t maxVersion(int setter);
}
