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


/** Options for {@code torch::nn::functional::embedding}.
 * 
 *  Example:
 *  <pre>{@code
 *  namespace F = torch::nn::functional;
 *  F::embedding(input, weight, F::EmbeddingFuncOptions().norm_type(2.5).scale_grad_by_freq(true).sparse(true));
 *  }</pre> */
@Namespace("torch::nn::functional") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class EmbeddingFuncOptions extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public EmbeddingFuncOptions() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public EmbeddingFuncOptions(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public EmbeddingFuncOptions(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public EmbeddingFuncOptions position(long position) {
        return (EmbeddingFuncOptions)super.position(position);
    }
    @Override public EmbeddingFuncOptions getPointer(long i) {
        return new EmbeddingFuncOptions((Pointer)this).position(position + i);
    }

  public native @ByRef @NoException LongOptional padding_idx();
  public native @ByRef @NoException DoubleOptional max_norm();
  public native @ByRef @NoException DoublePointer norm_type();
  public native @Cast("bool*") @ByRef @NoException BoolPointer scale_grad_by_freq();
  public native @Cast("bool*") @ByRef @NoException BoolPointer sparse();
}
