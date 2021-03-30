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


/** Applies fold over a 3-D input.
 *  See https://pytorch.org/docs/master/nn.html#torch.nn.Fold to learn about
 *  the exact behavior of this module.
 * 
 *  See the documentation for {@code torch::nn::FoldOptions} class to learn what
 *  constructor arguments are supported for this module.
 * 
 *  Example:
 *  <pre>{@code
 *  Fold model(FoldOptions({8, 8}, {3, 3}).dilation(2).padding({2, 1}).stride(2));
 *  }</pre> */
@Namespace("torch::nn") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class FoldImpl extends FoldImplCloneable {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FoldImpl(Pointer p) { super(p); }

  public FoldImpl(@ByVal @Cast("torch::ExpandingArray<2>*") LongPointer output_size, @ByVal @Cast("torch::ExpandingArray<2>*") LongPointer kernel_size) { super((Pointer)null); allocate(output_size, kernel_size); }
  @NoDeallocator private native void allocate(@ByVal @Cast("torch::ExpandingArray<2>*") LongPointer output_size, @ByVal @Cast("torch::ExpandingArray<2>*") LongPointer kernel_size);
  public FoldImpl(@Const @ByRef FoldOptions options_) { super((Pointer)null); allocate(options_); }
  @NoDeallocator private native void allocate(@Const @ByRef FoldOptions options_);

  public native void reset();

  /** Pretty prints the {@code Fold} module into the given {@code stream}. */
  public native void pretty_print(@Cast("std::ostream*") @ByRef Pointer stream);

  public native @ByVal Tensor forward(@Const @ByRef Tensor input);

  /** The options with which this {@code Module} was constructed. */
  public native @ByRef FoldOptions options(); public native FoldImpl options(FoldOptions setter);
}
