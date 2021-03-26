// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


@NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class TFE_OpInferenceContext extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TFE_OpInferenceContext(Pointer p) { super(p); }

  public TFE_OpInferenceContext(@Const OpDef op_def) { super((Pointer)null); allocate(op_def); }
  private native void allocate(@Const OpDef op_def);

  public native @Const OpDef op_def(); public native TFE_OpInferenceContext op_def(OpDef setter);  // op definition from protobuf
  public native int input_arg_idx(); public native TFE_OpInferenceContext input_arg_idx(int setter);  // arg definition index for the next input to be added
  public native @ByRef StringFlatSet attrs(); public native TFE_OpInferenceContext attrs(StringFlatSet setter);  // attributes inferred so far
}
