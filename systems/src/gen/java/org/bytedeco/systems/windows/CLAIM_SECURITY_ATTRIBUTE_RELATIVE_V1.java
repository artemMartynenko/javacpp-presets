// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


//
//  Relative form of the security attribute.
//


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class CLAIM_SECURITY_ATTRIBUTE_RELATIVE_V1 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CLAIM_SECURITY_ATTRIBUTE_RELATIVE_V1() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CLAIM_SECURITY_ATTRIBUTE_RELATIVE_V1(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CLAIM_SECURITY_ATTRIBUTE_RELATIVE_V1(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CLAIM_SECURITY_ATTRIBUTE_RELATIVE_V1 position(long position) {
        return (CLAIM_SECURITY_ATTRIBUTE_RELATIVE_V1)super.position(position);
    }
    @Override public CLAIM_SECURITY_ATTRIBUTE_RELATIVE_V1 getPointer(long i) {
        return new CLAIM_SECURITY_ATTRIBUTE_RELATIVE_V1((Pointer)this).position(position + i);
    }


    //
    //  Name of the attribute.
    //  Offset from beginning of structure.
    //

    public native @Cast("DWORD") int Name(); public native CLAIM_SECURITY_ATTRIBUTE_RELATIVE_V1 Name(int setter);

    //
    //  Data type of attribute.
    //

    public native @Cast("WORD") short ValueType(); public native CLAIM_SECURITY_ATTRIBUTE_RELATIVE_V1 ValueType(short setter);

    //
    //  Pass 0 in a set operation and check for 0 in
    //  a get operation.
    //

    public native @Cast("WORD") short Reserved(); public native CLAIM_SECURITY_ATTRIBUTE_RELATIVE_V1 Reserved(short setter);

    //
    // Attribute Flags
    //

    public native @Cast("DWORD") int Flags(); public native CLAIM_SECURITY_ATTRIBUTE_RELATIVE_V1 Flags(int setter);

    //
    //  Number of values.
    //

    public native @Cast("DWORD") int ValueCount(); public native CLAIM_SECURITY_ATTRIBUTE_RELATIVE_V1 ValueCount(int setter);

    //
    //  The actual value itself.
    //

        @Name("Values.pInt64") public native @Cast("DWORD") int Values_pInt64(int i); public native CLAIM_SECURITY_ATTRIBUTE_RELATIVE_V1 Values_pInt64(int i, int setter);
        @Name("Values.pInt64") @MemberGetter public native @Cast("DWORD*") IntPointer Values_pInt64();
        @Name("Values.pUint64") public native @Cast("DWORD") int Values_pUint64(int i); public native CLAIM_SECURITY_ATTRIBUTE_RELATIVE_V1 Values_pUint64(int i, int setter);
        @Name("Values.pUint64") @MemberGetter public native @Cast("DWORD*") IntPointer Values_pUint64();
        @Name("Values.ppString") public native @Cast("DWORD") int Values_ppString(int i); public native CLAIM_SECURITY_ATTRIBUTE_RELATIVE_V1 Values_ppString(int i, int setter);
        @Name("Values.ppString") @MemberGetter public native @Cast("DWORD*") IntPointer Values_ppString();
        @Name("Values.pFqbn") public native @Cast("DWORD") int Values_pFqbn(int i); public native CLAIM_SECURITY_ATTRIBUTE_RELATIVE_V1 Values_pFqbn(int i, int setter);
        @Name("Values.pFqbn") @MemberGetter public native @Cast("DWORD*") IntPointer Values_pFqbn();
        @Name("Values.pOctetString") public native @Cast("DWORD") int Values_pOctetString(int i); public native CLAIM_SECURITY_ATTRIBUTE_RELATIVE_V1 Values_pOctetString(int i, int setter);
        @Name("Values.pOctetString") @MemberGetter public native @Cast("DWORD*") IntPointer Values_pOctetString();
}
