// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;

@NoOffset @Name("c10::optional<bool>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class BoolOptional extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BoolOptional(Pointer p) { super(p); }
    public BoolOptional(boolean value) { put(value); }
    public BoolOptional()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef BoolOptional put(@ByRef BoolOptional x);


    @Name("value") public native @Cast("bool") boolean get();
    @ValueSetter public native BoolOptional put(@Cast("bool") boolean value);
}

