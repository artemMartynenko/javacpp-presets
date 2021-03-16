// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;


/** matrix iterator: used for n-ary operations on dense arrays */
@Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class CvNArrayIterator extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CvNArrayIterator() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CvNArrayIterator(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvNArrayIterator(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CvNArrayIterator position(long position) {
        return (CvNArrayIterator)super.position(position);
    }
    @Override public CvNArrayIterator getPointer(long i) {
        return new CvNArrayIterator((Pointer)this).position(position + i);
    }

    /** number of arrays */
    public native int count(); public native CvNArrayIterator count(int setter);
    /** number of dimensions to iterate */
    public native int dims(); public native CvNArrayIterator dims(int setter);
    /** maximal common linear size: { width = size, height = 1 } */
    public native @ByRef CvSize size(); public native CvNArrayIterator size(CvSize setter);
    /** pointers to the array slices */
    public native @Cast("uchar*") BytePointer ptr(int i); public native CvNArrayIterator ptr(int i, BytePointer setter);
    @MemberGetter public native @Cast("uchar**") PointerPointer ptr();
    /** for internal use */
    public native int stack(int i); public native CvNArrayIterator stack(int i, int setter);
    @MemberGetter public native IntPointer stack();
    /** pointers to the headers of the
                                     matrices that are processed */
    public native CvMatND hdr(int i); public native CvNArrayIterator hdr(int i, CvMatND setter);
    @MemberGetter public native @Cast("CvMatND**") PointerPointer hdr();
}
