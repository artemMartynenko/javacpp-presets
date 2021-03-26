// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Concatenates a list of {@code N} tensors along the first dimension.
 * 
 *  The input tensors are all required to have size 1 in the first dimension.
 * 
 *  For example:
 * 
 *  <pre>{@code
 *  # 'x' is [[1, 4]]
 *  # 'y' is [[2, 5]]
 *  # 'z' is [[3, 6]]
 *  parallel_concat([x, y, z]) => [[1, 4], [2, 5], [3, 6]]  # Pack along first dim.
 *  }</pre>
 * 
 *  The difference between concat and parallel_concat is that concat requires all
 *  of the inputs be computed before the operation will begin but doesn't require
 *  that the input shapes be known during graph construction.  Parallel concat
 *  will copy pieces of the input into the output as they become available, in
 *  some situations this can provide a performance benefit.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * values: Tensors to be concatenated. All must have size 1 in the first dimension
 *  and same shape.
 *  * shape: the final shape of the result; should be equal to the shapes of any input
 *  but with the number of input values in the first dimension.
 * 
 *  Returns:
 *  * {@code Output}: The concatenated tensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class ParallelConcat extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ParallelConcat(Pointer p) { super(p); }

  public ParallelConcat(@Const @ByRef Scope scope, @ByVal InputList values, @ByVal PartialTensorShape shape) { super((Pointer)null); allocate(scope, values, shape); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal InputList values, @ByVal PartialTensorShape shape);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native ParallelConcat operation(Operation setter);
  public native @ByRef Output output(); public native ParallelConcat output(Output setter);
}
