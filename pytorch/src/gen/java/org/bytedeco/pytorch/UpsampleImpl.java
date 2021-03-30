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


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Upsample ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/** Upsamples a given multi-channel 1D (temporal), 2D (spatial) or 3D
 *  (volumetric) data.
 *  See https://pytorch.org/docs/master/nn.html#torch.nn.Upsample to learn
 *  about the exact behavior of this module.
 * 
 *  See the documentation for {@code torch::nn::UpsampleOptions} class to learn what
 *  constructor arguments are supported for this module.
 * 
 *  Example:
 *  <pre>{@code
 *  Upsample model(UpsampleOptions().scale_factor({3}).mode(torch::kLinear).align_corners(false));
 *  }</pre> */
@Namespace("torch::nn") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class UpsampleImpl extends UpsampleImplCloneable {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public UpsampleImpl(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public UpsampleImpl(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public UpsampleImpl position(long position) {
        return (UpsampleImpl)super.position(position);
    }
    @Override public UpsampleImpl getPointer(long i) {
        return new UpsampleImpl((Pointer)this).position(position + i);
    }

  public UpsampleImpl(@Const @ByRef(nullValue = "torch::nn::UpsampleOptions{}") UpsampleOptions options_) { super((Pointer)null); allocate(options_); }
  @NoDeallocator private native void allocate(@Const @ByRef(nullValue = "torch::nn::UpsampleOptions{}") UpsampleOptions options_);
  public UpsampleImpl() { super((Pointer)null); allocate(); }
  @NoDeallocator private native void allocate();

  public native void reset();

  /** Pretty prints the {@code Upsample} module into the given {@code stream}. */
  public native void pretty_print(@Cast("std::ostream*") @ByRef Pointer stream);

  public native @ByVal Tensor forward(@Const @ByRef Tensor input);

  /** The options with which this {@code Module} was constructed. */
  public native @ByRef UpsampleOptions options(); public native UpsampleImpl options(UpsampleOptions setter);
}
