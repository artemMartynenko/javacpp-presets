// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;

@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class SID_IDENTIFIER_AUTHORITY extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public SID_IDENTIFIER_AUTHORITY() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SID_IDENTIFIER_AUTHORITY(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SID_IDENTIFIER_AUTHORITY(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public SID_IDENTIFIER_AUTHORITY position(long position) {
        return (SID_IDENTIFIER_AUTHORITY)super.position(position);
    }
    @Override public SID_IDENTIFIER_AUTHORITY getPointer(long i) {
        return new SID_IDENTIFIER_AUTHORITY((Pointer)this).position(position + i);
    }

    public native @Cast("BYTE") byte Value(int i); public native SID_IDENTIFIER_AUTHORITY Value(int i, byte setter);
    @MemberGetter public native @Cast("BYTE*") BytePointer Value();
}
