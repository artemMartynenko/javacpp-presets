// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.hdf5;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.hdf5.global.hdf5.*;


// User data for visit iteration
@Namespace("H5") @Properties(inherit = org.bytedeco.hdf5.presets.hdf5.class)
public class UserData4Visit extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public UserData4Visit() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public UserData4Visit(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public UserData4Visit(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public UserData4Visit position(long position) {
        return (UserData4Visit)super.position(position);
    }
    @Override public UserData4Visit getPointer(long i) {
        return new UserData4Visit((Pointer)this).position(position + i);
    }

        public native visit_operator_t op(); public native UserData4Visit op(visit_operator_t setter);
        public native Pointer opData(); public native UserData4Visit opData(Pointer setter);
        public native H5Object obj(); public native UserData4Visit obj(H5Object setter);
}
