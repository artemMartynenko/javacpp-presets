// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.flycapture.FlyCapture2;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.flycapture.global.FlyCapture2.*;


    /*@}*/

    /**
     * \defgroup Structures Structures
     */

    /*@{*/

    /** The current version of the library. */
    @Namespace("FlyCapture2") @Properties(inherit = org.bytedeco.flycapture.presets.FlyCapture2.class)
public class FC2Version extends Pointer {
        static { Loader.load(); }
        /** Default native constructor. */
        public FC2Version() { super((Pointer)null); allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public FC2Version(long size) { super((Pointer)null); allocateArray(size); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public FC2Version(Pointer p) { super(p); }
        private native void allocate();
        private native void allocateArray(long size);
        @Override public FC2Version position(long position) {
            return (FC2Version)super.position(position);
        }
        @Override public FC2Version getPointer(long i) {
            return new FC2Version((Pointer)this).position(position + i);
        }
    
        /** Major version number. */
        public native @Cast("unsigned int") int major(); public native FC2Version major(int setter);
        /** Minor version number. */
        public native @Cast("unsigned int") int minor(); public native FC2Version minor(int setter);
        /** Type version number. */
        public native @Cast("unsigned int") int type(); public native FC2Version type(int setter);
        /** Build version number. */
        public native @Cast("unsigned int") int build(); public native FC2Version build(int setter);
    }
