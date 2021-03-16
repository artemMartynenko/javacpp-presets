// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;


@Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class CvMemStorage extends AbstractCvMemStorage {
    static { Loader.load(); }
    /** Default native constructor. */
    public CvMemStorage() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CvMemStorage(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvMemStorage(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CvMemStorage position(long position) {
        return (CvMemStorage)super.position(position);
    }
    @Override public CvMemStorage getPointer(long i) {
        return new CvMemStorage((Pointer)this).position(position + i);
    }

    public native int signature(); public native CvMemStorage signature(int setter);
    /** First allocated block.                   */
    public native CvMemBlock bottom(); public native CvMemStorage bottom(CvMemBlock setter);
    /** Current memory block - top of the stack. */
    public native CvMemBlock top(); public native CvMemStorage top(CvMemBlock setter);
    /** We get new blocks from parent as needed. */
    public native CvMemStorage parent(); public native CvMemStorage parent(CvMemStorage setter);
    /** Block size.                              */
    public native int block_size(); public native CvMemStorage block_size(int setter);
    /** Remaining free space in current block.   */
    public native int free_space(); public native CvMemStorage free_space(int setter);
}
