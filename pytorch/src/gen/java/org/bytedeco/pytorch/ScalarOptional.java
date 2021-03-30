// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;

@NoOffset @Name("c10::optional<c10::Scalar>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class ScalarOptional extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ScalarOptional(Pointer p) { super(p); }
    public ScalarOptional(Scalar value) { put(value); }
    public ScalarOptional()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef ScalarOptional put(@ByRef ScalarOptional x);


    @Name("value") public native @ByRef Scalar get();
    @ValueSetter public native ScalarOptional put(@ByRef Scalar value);
}

