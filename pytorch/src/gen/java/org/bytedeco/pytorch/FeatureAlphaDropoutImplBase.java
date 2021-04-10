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


@Name("torch::nn::detail::_DropoutNd<torch::nn::FeatureAlphaDropoutImpl>") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class FeatureAlphaDropoutImplBase extends FeatureAlphaDropoutImplCloneable {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FeatureAlphaDropoutImplBase(Pointer p) { super(p); }

  public FeatureAlphaDropoutImplBase(double p) { super((Pointer)null); allocate(p); }
  @NoDeallocator private native void allocate(double p);

  public FeatureAlphaDropoutImplBase(@Const @ByRef(nullValue = "torch::nn::DropoutOptions{}") DropoutOptions options_) { super((Pointer)null); allocate(options_); }
  @NoDeallocator private native void allocate(@Const @ByRef(nullValue = "torch::nn::DropoutOptions{}") DropoutOptions options_);
  public FeatureAlphaDropoutImplBase() { super((Pointer)null); allocate(); }
  @NoDeallocator private native void allocate();

  public native void reset();

  /** The options with which this {@code Module} was constructed. */
  public native @ByRef DropoutOptions options(); public native FeatureAlphaDropoutImplBase options(DropoutOptions setter);
}
