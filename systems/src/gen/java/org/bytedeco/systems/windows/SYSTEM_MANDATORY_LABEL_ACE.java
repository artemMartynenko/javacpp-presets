// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class SYSTEM_MANDATORY_LABEL_ACE extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public SYSTEM_MANDATORY_LABEL_ACE() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SYSTEM_MANDATORY_LABEL_ACE(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SYSTEM_MANDATORY_LABEL_ACE(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public SYSTEM_MANDATORY_LABEL_ACE position(long position) {
        return (SYSTEM_MANDATORY_LABEL_ACE)super.position(position);
    }
    @Override public SYSTEM_MANDATORY_LABEL_ACE getPointer(long i) {
        return new SYSTEM_MANDATORY_LABEL_ACE((Pointer)this).position(position + i);
    }

    public native @ByRef ACE_HEADER Header(); public native SYSTEM_MANDATORY_LABEL_ACE Header(ACE_HEADER setter);
    public native @Cast("ACCESS_MASK") int Mask(); public native SYSTEM_MANDATORY_LABEL_ACE Mask(int setter);
    public native @Cast("DWORD") int SidStart(); public native SYSTEM_MANDATORY_LABEL_ACE SidStart(int setter);
}
