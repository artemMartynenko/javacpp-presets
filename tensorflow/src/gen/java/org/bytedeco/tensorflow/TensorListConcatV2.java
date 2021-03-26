// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Concats all tensors in the list along the 0th dimension.
 * 
 *  Requires that all tensors have the same shape except the first dimension.
 * 
 *  input_handle: The input list.
 *  element_shape: The shape of the uninitialized elements in the list. If the first
 *    dimension is not -1, it is assumed that all list elements have the same
 *    leading dim.
 *  leading_dims: The list of leading dims of uninitialized list elements. Used if
 *    the leading dim of input_handle.element_shape or the element_shape input arg
 *    is not already set.
 *  tensor: The concated result.
 *  lengths: Output tensor containing sizes of the 0th dimension of tensors in the list, used for computing the gradient.
 * 
 * 
 *  Arguments:
 *  * scope: A Scope object
 * 
 *  Returns:
 *  * {@code Output} tensor
 *  * {@code Output} lengths */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class TensorListConcatV2 extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TensorListConcatV2(Pointer p) { super(p); }

  public TensorListConcatV2(@Const @ByRef Scope scope, @ByVal Input input_handle, @ByVal Input element_shape,
                     @ByVal Input leading_dims, @Cast("tensorflow::DataType") int element_dtype) { super((Pointer)null); allocate(scope, input_handle, element_shape, leading_dims, element_dtype); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input_handle, @ByVal Input element_shape,
                     @ByVal Input leading_dims, @Cast("tensorflow::DataType") int element_dtype);

  public native @ByRef Operation operation(); public native TensorListConcatV2 operation(Operation setter);
  public native @ByRef Output tensor(); public native TensorListConcatV2 tensor(Output setter);
  public native @ByRef Output lengths(); public native TensorListConcatV2 lengths(Output setter);
}
