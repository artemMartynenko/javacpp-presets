// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.flycapture.FlyCapture2;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.flycapture.global.FlyCapture2.*;


    /** Options for saving TIFF images. */
    @Namespace("FlyCapture2") @NoOffset @Properties(inherit = org.bytedeco.flycapture.presets.FlyCapture2.class)
public class TIFFOption extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public TIFFOption(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public TIFFOption(long size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(long size);
        @Override public TIFFOption position(long position) {
            return (TIFFOption)super.position(position);
        }
        @Override public TIFFOption getPointer(long i) {
            return new TIFFOption((Pointer)this).position(position + i);
        }
    
        /** enum FlyCapture2::TIFFOption::CompressionMethod */
        public static final int
            /** Save without any compression. */
            NONE = 1,
            /** Save using PACKBITS compression. */
            PACKBITS = 2,
            /** Save using DEFLATE compression (ZLIB compression). */
            DEFLATE = 3,
            /** Save using ADOBE DEFLATE compression */
            ADOBE_DEFLATE = 4,
            /**
             * Save using CCITT Group 3 fax encoding. This is only valid for
             * 1-bit images only. Default to LZW for other bit depths.
             */
            CCITTFAX3 = 5,
            /**
             * Save using CCITT Group 4 fax encoding. This is only valid for
             * 1-bit images only. Default to LZW for other bit depths.
             */
            CCITTFAX4 = 6,
            /** Save using LZW compression. */
            LZW = 7,
            /**
             * Save using JPEG compression. This is only valid for 8-bit
             * greyscale and 24-bit only. Default to LZW for other bit depths.
             */
            JPEG = 8;

        /** Compression method to use for encoding TIFF images. */
        public native @Cast("FlyCapture2::TIFFOption::CompressionMethod") int compression(); public native TIFFOption compression(int setter);
        /** Reserved for future use. */
        public native @Cast("unsigned int") int reserved(int i); public native TIFFOption reserved(int i, int setter);
        @MemberGetter public native @Cast("unsigned int*") IntPointer reserved();

        public TIFFOption() { super((Pointer)null); allocate(); }
        private native void allocate();
    }
