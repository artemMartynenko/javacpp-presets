// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// Bucketing strategies for the samplers.
//
// We automatically add -DBL_MAX and DBL_MAX to the ranges, so that no sample
// goes out of bounds.
//
// WARNING: If you are changing the interface here, please do change the same in
// mobile_sampler.h.
@Namespace("tensorflow::monitoring") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class Buckets extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Buckets(Pointer p) { super(p); }


  // Sets up buckets of the form:
  // [-DBL_MAX, ..., scale * growth^i,
  //   scale * growth_factor^(i + 1), ..., DBL_MAX].
  //
  // So for powers of 2 with a bucket count of 10, you would say (1, 2, 10)
  public static native @MoveUniquePtr Buckets Exponential(double scale,
                                                double growth_factor,
                                                int bucket_count);

  // Sets up buckets of the form:
  // [-DBL_MAX, ..., bucket_limits[i], bucket_limits[i + 1], ..., DBL_MAX].

  // This alternative Explicit Buckets factory method is primarily meant to be
  // used by the CLIF layer code paths that are incompatible with
  // initialize_lists.
  public static native @MoveUniquePtr Buckets Explicit(@StdVector DoublePointer bucket_limits);
  public static native @MoveUniquePtr Buckets Explicit(@StdVector DoubleBuffer bucket_limits);
  public static native @MoveUniquePtr Buckets Explicit(@StdVector double... bucket_limits);

  public native @StdVector DoublePointer explicit_bounds();
}
