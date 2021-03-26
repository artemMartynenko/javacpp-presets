// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Computes the ids of the positions in sampled_candidates that match true_labels.
 * 
 *  When doing log-odds NCE, the result of this op should be passed through a
 *  SparseToDense op, then added to the logits of the sampled candidates. This has
 *  the effect of 'removing' the sampled labels that match the true labels by
 *  making the classifier sure that they are sampled labels.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * true_classes: The true_classes output of UnpackSparseLabels.
 *  * sampled_candidates: The sampled_candidates output of CandidateSampler.
 *  * num_true: Number of true labels per context.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * seed: If either seed or seed2 are set to be non-zero, the random number
 *  generator is seeded by the given seed.  Otherwise, it is seeded by a
 *  random seed.
 *  * seed2: An second seed to avoid seed collision.
 * 
 *  Returns:
 *  * {@code Output} indices: A vector of indices corresponding to rows of true_candidates.
 *  * {@code Output} ids: A vector of IDs of positions in sampled_candidates that match a true_label
 *  for the row with the corresponding index in indices.
 *  * {@code Output} weights: A vector of the same length as indices and ids, in which each element
 *  is -FLOAT_MAX. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class ComputeAccidentalHits extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ComputeAccidentalHits(Pointer p) { super(p); }

  /** Optional attribute setters for ComputeAccidentalHits */
  public static class Attrs extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public Attrs() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public Attrs(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Attrs(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public Attrs position(long position) {
          return (Attrs)super.position(position);
      }
      @Override public Attrs getPointer(long i) {
          return new Attrs((Pointer)this).position(position + i);
      }
  
    /** If either seed or seed2 are set to be non-zero, the random number
     *  generator is seeded by the given seed.  Otherwise, it is seeded by a
     *  random seed.
     * 
     *  Defaults to 0 */
    
    ///
    public native @ByVal Attrs Seed(@Cast("tensorflow::int64") long x);

    /** An second seed to avoid seed collision.
     * 
     *  Defaults to 0 */
    public native @ByVal Attrs Seed2(@Cast("tensorflow::int64") long x);

    public native @Cast("tensorflow::int64") long seed_(); public native Attrs seed_(long setter);
    public native @Cast("tensorflow::int64") long seed2_(); public native Attrs seed2_(long setter);
  }
  public ComputeAccidentalHits(@Const @ByRef Scope scope, @ByVal Input true_classes, @ByVal Input sampled_candidates,
                        @Cast("tensorflow::int64") long num_true) { super((Pointer)null); allocate(scope, true_classes, sampled_candidates, num_true); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input true_classes, @ByVal Input sampled_candidates,
                        @Cast("tensorflow::int64") long num_true);
  public ComputeAccidentalHits(@Const @ByRef Scope scope, @ByVal Input true_classes, @ByVal Input sampled_candidates,
                        @Cast("tensorflow::int64") long num_true, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, true_classes, sampled_candidates, num_true, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input true_classes, @ByVal Input sampled_candidates,
                        @Cast("tensorflow::int64") long num_true, @Const @ByRef Attrs attrs);

  public static native @ByVal Attrs Seed(@Cast("tensorflow::int64") long x);
  public static native @ByVal Attrs Seed2(@Cast("tensorflow::int64") long x);

  public native @ByRef Operation operation(); public native ComputeAccidentalHits operation(Operation setter);
  public native @ByRef Output indices(); public native ComputeAccidentalHits indices(Output setter);
  public native @ByRef Output ids(); public native ComputeAccidentalHits ids(Output setter);
  public native @ByRef Output weights(); public native ComputeAccidentalHits weights(Output setter);
}
