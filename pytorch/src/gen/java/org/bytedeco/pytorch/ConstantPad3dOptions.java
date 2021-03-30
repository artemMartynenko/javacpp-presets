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

@Name("torch::nn::ConstantPadOptions<3>") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class ConstantPad3dOptions extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ConstantPad3dOptions(Pointer p) { super(p); }

  public ConstantPad3dOptions(@ByVal @Cast("torch::ExpandingArray<3*2>*") LongPointer padding, double value) { super((Pointer)null); allocate(padding, value); }
  private native void allocate(@ByVal @Cast("torch::ExpandingArray<3*2>*") LongPointer padding, double value);
  public native @Cast("torch::ExpandingArray<3*2>*") @ByRef @NoException LongPointer padding();
  public native @ByRef @NoException DoublePointer value();
}
