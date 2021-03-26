// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Returns a batched matrix tensor with new batched diagonal values.
 * 
 *  Given {@code input} and {@code diagonal}, this operation returns a tensor with the
 *  same shape and values as {@code input}, except for the specified diagonals of the
 *  innermost matrices. These will be overwritten by the values in {@code diagonal}.
 * 
 *  {@code input} has {@code r+1} dimensions {@code [I, J, ..., L, M, N]}. When {@code k} is scalar or
 *  {@code k[0] == k[1]}, {@code diagonal} has {@code r} dimensions {@code [I, J, ..., L, max_diag_len]}.
 *  Otherwise, it has {@code r+1} dimensions {@code [I, J, ..., L, num_diags, max_diag_len]}.
 *  {@code num_diags} is the number of diagonals, {@code num_diags = k[1] - k[0] + 1}.
 *  {@code max_diag_len} is the longest diagonal in the range {@code [k[0], k[1]]},
 *  {@code max_diag_len = min(M + min(k[1], 0), N + min(-k[0], 0))}
 * 
 *  The output is a tensor of rank {@code k+1} with dimensions {@code [I, J, ..., L, M, N]}.
 *  If {@code k} is scalar or {@code k[0] == k[1]}:
 * 
 *  <pre>{@code
 *  output[i, j, ..., l, m, n]
 *    = diagonal[i, j, ..., l, n-max(k[1], 0)] ; if n - m == k[1]
 *      output[i, j, ..., l, m, n]             ; otherwise
 *  }</pre>
 * 
 *  Otherwise,
 * 
 *  <pre>{@code
 *  output[i, j, ..., l, m, n]
 *    = diagonal[i, j, ..., l, k[1]-d, n-max(d, 0)] ; if d_lower <= d <= d_upper
 *      input[i, j, ..., l, m, n]                   ; otherwise
 *  }</pre>
 *  where {@code d = n - m}
 * 
 *  For example:
 * 
 *  <pre>{@code
 *  # The main diagonal.
 *  input = np.array([[[7, 7, 7, 7],              # Input shape: (2, 3, 4)
 *                     [7, 7, 7, 7],
 *                     [7, 7, 7, 7]],
 *                    [[7, 7, 7, 7],
 *                     [7, 7, 7, 7],
 *                     [7, 7, 7, 7]]])
 *  diagonal = np.array([[1, 2, 3],               # Diagonal shape: (2, 3)
 *                       [4, 5, 6]])
 *  tf.matrix_diag(diagonal) ==> [[[1, 7, 7, 7],  # Output shape: (2, 3, 4)
 *                                 [7, 2, 7, 7],
 *                                 [7, 7, 3, 7]],
 *                                [[4, 7, 7, 7],
 *                                 [7, 5, 7, 7],
 *                                 [7, 7, 6, 7]]]
 * 
 *  # A superdiagonal (per batch).
 *  tf.matrix_diag(diagonal, k = 1)
 *    ==> [[[7, 1, 7, 7],  # Output shape: (2, 3, 4)
 *          [7, 7, 2, 7],
 *          [7, 7, 7, 3]],
 *         [[7, 4, 7, 7],
 *          [7, 7, 5, 7],
 *          [7, 7, 7, 6]]]
 * 
 *  # A band of diagonals.
 *  diagonals = np.array([[[1, 2, 3],  # Diagonal shape: (2, 2, 3)
 *                         [4, 5, 0]],
 *                        [[6, 1, 2],
 *                         [3, 4, 0]]])
 *  tf.matrix_diag(diagonals, k = (-1, 0))
 *    ==> [[[1, 7, 7, 7],  # Output shape: (2, 3, 4)
 *          [4, 2, 7, 7],
 *          [0, 5, 3, 7]],
 *         [[6, 7, 7, 7],
 *          [3, 1, 7, 7],
 *          [7, 4, 2, 7]]]
 * 
 *  }</pre>
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * input: Rank {@code r+1}, where {@code r >= 1}.
 *  * diagonal: Rank {@code r} when {@code k} is an integer or {@code k[0] == k[1]}. Otherwise, it has rank {@code r+1}.
 *  {@code k >= 1}.
 *  * k: Diagonal offset(s). Positive value means superdiagonal, 0 refers to the main
 *  diagonal, and negative value means subdiagonals. {@code k} can be a single integer
 *  (for a single diagonal) or a pair of integers specifying the low and high ends
 *  of a matrix band. {@code k[0]} must not be larger than {@code k[1]}.
 * 
 *  Returns:
 *  * {@code Output}: Rank {@code r+1}, with {@code output.shape = input.shape}. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class MatrixSetDiagV2 extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MatrixSetDiagV2(Pointer p) { super(p); }

  public MatrixSetDiagV2(@Const @ByRef Scope scope, @ByVal Input input,
                  @ByVal Input diagonal, @ByVal Input k) { super((Pointer)null); allocate(scope, input, diagonal, k); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input,
                  @ByVal Input diagonal, @ByVal Input k);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native MatrixSetDiagV2 operation(Operation setter);
  public native @ByRef Output output(); public native MatrixSetDiagV2 output(Output setter);
}
