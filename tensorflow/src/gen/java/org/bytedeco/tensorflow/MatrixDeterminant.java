// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Computes the determinant of one or more square matrices.
 * 
 *  The input is a tensor of shape {@code [..., M, M]} whose inner-most 2 dimensions
 *  form square matrices. The output is a tensor containing the determinants
 *  for all input submatrices {@code [..., :, :]}.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * input: Shape is {@code [..., M, M]}.
 * 
 *  Returns:
 *  * {@code Output}: Shape is {@code [...]}. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class MatrixDeterminant extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MatrixDeterminant(Pointer p) { super(p); }

  public MatrixDeterminant(@Const @ByRef Scope scope, @ByVal Input input) { super((Pointer)null); allocate(scope, input); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native MatrixDeterminant operation(Operation setter);
  public native @ByRef Output output(); public native MatrixDeterminant output(Output setter);
}
