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


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ PReLU ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/** Applies the PReLU function element-wise.
 *  See https://pytorch.org/docs/master/nn.html#torch.nn.PReLU to learn
 *  about the exact behavior of this module.
 * 
 *  See the documentation for {@code torch::nn::PReLUOptions} class to learn what
 *  constructor arguments are supported for this module.
 * 
 *  Example:
 *  <pre>{@code
 *  PReLU model(PReLUOptions().num_parameters(42));
 *  }</pre> */
@Namespace("torch::nn") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class PReLUImpl extends PReLUImplCloneable {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PReLUImpl(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PReLUImpl(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public PReLUImpl position(long position) {
        return (PReLUImpl)super.position(position);
    }
    @Override public PReLUImpl getPointer(long i) {
        return new PReLUImpl((Pointer)this).position(position + i);
    }

  public PReLUImpl(@Const @ByRef(nullValue = "torch::nn::PReLUOptions{}") PReLUOptions options_) { super((Pointer)null); allocate(options_); }
  @NoDeallocator private native void allocate(@Const @ByRef(nullValue = "torch::nn::PReLUOptions{}") PReLUOptions options_);
  public PReLUImpl() { super((Pointer)null); allocate(); }
  @NoDeallocator private native void allocate();

  public native @ByVal Tensor forward(@Const @ByRef Tensor input);

  public native void reset();

  /** Pretty prints the {@code PReLU} module into the given {@code stream}. */
  public native void pretty_print(@Cast("std::ostream*") @ByRef Pointer stream);

  /** The options with which this {@code Module} was constructed. */
  public native @ByRef PReLUOptions options(); public native PReLUImpl options(PReLUOptions setter);

  /** The learned weight. */
  public native @ByRef Tensor weight(); public native PReLUImpl weight(Tensor setter);
}
