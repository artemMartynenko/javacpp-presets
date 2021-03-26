// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.flycapture.FlyCapture2_C;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.flycapture.FlyCapture2.*;
import static org.bytedeco.flycapture.global.FlyCapture2.*;

import static org.bytedeco.flycapture.global.FlyCapture2_C.*;


    /** Image settings for a GigE camera. */
    @Properties(inherit = org.bytedeco.flycapture.presets.FlyCapture2_C.class)
public class fc2GigEImageSettings extends Pointer {
        static { Loader.load(); }
        /** Default native constructor. */
        public fc2GigEImageSettings() { super((Pointer)null); allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public fc2GigEImageSettings(long size) { super((Pointer)null); allocateArray(size); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public fc2GigEImageSettings(Pointer p) { super(p); }
        private native void allocate();
        private native void allocateArray(long size);
        @Override public fc2GigEImageSettings position(long position) {
            return (fc2GigEImageSettings)super.position(position);
        }
        @Override public fc2GigEImageSettings getPointer(long i) {
            return new fc2GigEImageSettings((Pointer)this).position(position + i);
        }
    
        /** Horizontal image offset. */
        public native @Cast("unsigned int") int offsetX(); public native fc2GigEImageSettings offsetX(int setter);
        /** Vertical image offset. */
        public native @Cast("unsigned int") int offsetY(); public native fc2GigEImageSettings offsetY(int setter);
        /** Width of image. */
        public native @Cast("unsigned int") int width(); public native fc2GigEImageSettings width(int setter);
        /** Height of image. */
        public native @Cast("unsigned int") int height(); public native fc2GigEImageSettings height(int setter);
        /** Pixel format of image. */
        public native @Cast("fc2PixelFormat") int pixelFormat(); public native fc2GigEImageSettings pixelFormat(int setter);
        /** Reserved for future use. */
        public native @Cast("unsigned int") int reserved(int i); public native fc2GigEImageSettings reserved(int i, int setter);
        @MemberGetter public native @Cast("unsigned int*") IntPointer reserved();
    }
