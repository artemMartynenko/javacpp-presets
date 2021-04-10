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
 // namespace functional

// ============================================================================

/** Options for the {@code HingeEmbeddingLoss} module.
 * 
 *  Example:
 *  <pre>{@code
 *  HingeEmbeddingLoss model(HingeEmbeddingLossOptions().margin(4).reduction(torch::kNone));
 *  }</pre> */
@Namespace("torch::nn") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class HingeEmbeddingLossOptions extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public HingeEmbeddingLossOptions() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public HingeEmbeddingLossOptions(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public HingeEmbeddingLossOptions(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public HingeEmbeddingLossOptions position(long position) {
        return (HingeEmbeddingLossOptions)super.position(position);
    }
    @Override public HingeEmbeddingLossOptions getPointer(long i) {
        return new HingeEmbeddingLossOptions((Pointer)this).position(position + i);
    }

  public native @ByRef @NoException DoublePointer margin();
  public native @Cast("torch::nn::HingeEmbeddingLossOptions::reduction_t*") @ByRef @NoException Pointer reduction();
}
