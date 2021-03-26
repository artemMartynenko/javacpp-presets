// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Selects elements from {@code x} or {@code y}, depending on {@code condition}.
 * 
 *  The {@code x}, and {@code y} tensors must all have the same shape, and the
 *  output will also have that shape.
 * 
 *  The {@code condition} tensor must be a scalar if {@code x} and {@code y} are scalars.
 *  If {@code x} and {@code y} are vectors or higher rank, then {@code condition} must be either a
 *  scalar, a vector with size matching the first dimension of {@code x}, or must have
 *  the same shape as {@code x}.
 * 
 *  The {@code condition} tensor acts as a mask that chooses, based on the value at each
 *  element, whether the corresponding element / row in the output should be
 *  taken from {@code x} (if true) or {@code y} (if false).
 * 
 *  If {@code condition} is a vector and {@code x} and {@code y} are higher rank matrices, then
 *  it chooses which row (outer dimension) to copy from {@code x} and {@code y}.
 *  If {@code condition} has the same shape as {@code x} and {@code y}, then it chooses which
 *  element to copy from {@code x} and {@code y}.
 * 
 *  For example:
 * 
 *  <pre>{@code python
 *  # 'condition' tensor is [[True,  False]
 *  #                        [False, True]]
 *  # 't' is [[1, 2],
 *  #         [3, 4]]
 *  # 'e' is [[5, 6],
 *  #         [7, 8]]
 *  select(condition, t, e)  # => [[1, 6], [7, 4]]
 * 
 * 
 *  # 'condition' tensor is [True, False]
 *  # 't' is [[1, 2],
 *  #         [3, 4]]
 *  # 'e' is [[5, 6],
 *  #         [7, 8]]
 *  select(condition, t, e) ==> [[1, 2],
 *                               [7, 8]]
 * 
 *  }</pre>
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * x: = A {@code Tensor} which may have the same shape as {@code condition}.
 *  If {@code condition} is rank 1, {@code x} may have higher rank,
 *  but its first dimension must match the size of {@code condition}.
 *  * y: = A {@code Tensor} with the same type and shape as {@code x}.
 * 
 *  Returns:
 *  * {@code Output}: = A {@code Tensor} with the same type and shape as {@code x} and {@code y}. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class Where3 extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Where3(Pointer p) { super(p); }

  public Where3(@Const @ByRef Scope scope, @ByVal Input condition,
         @ByVal Input x, @ByVal Input y) { super((Pointer)null); allocate(scope, condition, x, y); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input condition,
         @ByVal Input x, @ByVal Input y);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native Where3 operation(Operation setter);
  public native @ByRef Output output(); public native Where3 output(Output setter);
}
