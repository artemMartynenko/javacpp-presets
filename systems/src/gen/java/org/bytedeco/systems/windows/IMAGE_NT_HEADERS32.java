// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class IMAGE_NT_HEADERS32 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public IMAGE_NT_HEADERS32() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public IMAGE_NT_HEADERS32(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IMAGE_NT_HEADERS32(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public IMAGE_NT_HEADERS32 position(long position) {
        return (IMAGE_NT_HEADERS32)super.position(position);
    }
    @Override public IMAGE_NT_HEADERS32 getPointer(long i) {
        return new IMAGE_NT_HEADERS32((Pointer)this).position(position + i);
    }

    public native @Cast("DWORD") int Signature(); public native IMAGE_NT_HEADERS32 Signature(int setter);
    public native @ByRef IMAGE_FILE_HEADER FileHeader(); public native IMAGE_NT_HEADERS32 FileHeader(IMAGE_FILE_HEADER setter);
    public native @ByRef IMAGE_OPTIONAL_HEADER32 OptionalHeader(); public native IMAGE_NT_HEADERS32 OptionalHeader(IMAGE_OPTIONAL_HEADER32 setter);
}
