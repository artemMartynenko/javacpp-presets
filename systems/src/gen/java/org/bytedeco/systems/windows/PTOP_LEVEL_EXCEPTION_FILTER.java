// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


// #if WINAPI_FAMILY_PARTITION(WINAPI_PARTITION_DESKTOP)

//
// Typedefs
//

@Convention("__stdcall") @Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class PTOP_LEVEL_EXCEPTION_FILTER extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    PTOP_LEVEL_EXCEPTION_FILTER(Pointer p) { super(p); }
    protected PTOP_LEVEL_EXCEPTION_FILTER() { allocate(); }
    private native void allocate();
    public native @Cast("LONG") int call(
    EXCEPTION_POINTERS ExceptionInfo
    );
}
