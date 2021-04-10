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

/** Options for the {@code PairwiseDistance} module.
 * 
 *  Example:
 *  <pre>{@code
 *  PairwiseDistance model(PairwiseDistanceOptions().p(3).eps(0.5).keepdim(true));
 *  }</pre> */
@Namespace("torch::nn") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class PairwiseDistanceOptions extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PairwiseDistanceOptions() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PairwiseDistanceOptions(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PairwiseDistanceOptions(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PairwiseDistanceOptions position(long position) {
        return (PairwiseDistanceOptions)super.position(position);
    }
    @Override public PairwiseDistanceOptions getPointer(long i) {
        return new PairwiseDistanceOptions((Pointer)this).position(position + i);
    }

  public native @ByRef @NoException DoublePointer p();
  public native @ByRef @NoException DoublePointer eps();
  public native @Cast("bool*") @ByRef @NoException BoolPointer keepdim();
}
