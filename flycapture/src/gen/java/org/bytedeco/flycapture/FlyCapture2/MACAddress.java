// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.flycapture.FlyCapture2;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.flycapture.global.FlyCapture2.*;


    /** MAC address. */
    @Namespace("FlyCapture2") @NoOffset @Properties(inherit = org.bytedeco.flycapture.presets.FlyCapture2.class)
public class MACAddress extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public MACAddress(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public MACAddress(long size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(long size);
        @Override public MACAddress position(long position) {
            return (MACAddress)super.position(position);
        }
        @Override public MACAddress getPointer(long i) {
            return new MACAddress((Pointer)this).position(position + i);
        }
    
        public native @Cast("unsigned char") byte octets(int i); public native MACAddress octets(int i, byte setter);
        @MemberGetter public native @Cast("unsigned char*") BytePointer octets();

        public MACAddress() { super((Pointer)null); allocate(); }
        private native void allocate();

        public MACAddress( @Cast("unsigned int") int macAddressValHigh, @Cast("unsigned int") int macAddressValLow ) { super((Pointer)null); allocate(macAddressValHigh, macAddressValLow); }
        private native void allocate( @Cast("unsigned int") int macAddressValHigh, @Cast("unsigned int") int macAddressValLow );

        /** Equality operator. */
        public native @Cast("bool") @Name("operator ==") boolean equals( @Const @ByRef MACAddress _address );

        /** Inequality operator. */
        public native @Cast("bool") @Name("operator !=") boolean notEquals( @Const @ByRef MACAddress _address );
    }
