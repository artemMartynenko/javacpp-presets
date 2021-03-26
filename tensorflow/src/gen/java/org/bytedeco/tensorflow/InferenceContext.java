// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// Shape inference functions registered on ops in REGISTER_OP implement
// their shape functions in terms of this InferenceContext.  An InferenceContext
// is created by the framework and passed to a shape inference function.  The
// shape inference function calls functions on the context, and should call
// set_output() to set the shape on all outputs.
//
// To infer shapes for user-defined functions see ShapeRefiner.
//
// All Shape* and Dimension* returned by functions of InferenceContext are owned
// by the InferenceContext.
@Namespace("tensorflow::shape_inference") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class InferenceContext extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public InferenceContext(Pointer p) { super(p); }

  @MemberGetter public static native @Cast("const tensorflow::int64") long kUnknownDim();
  public static final long kUnknownDim = kUnknownDim();
  @MemberGetter public static native int kUnknownRank();
  public static final int kUnknownRank = kUnknownRank();

  // <input_tensors> is NULL-padded to be the same size as <input_shapes>.
  //
  // Elements of <input_tensors_as_shapes> are used for when a shape function
  // makes a call to MakeShapeFromShapeTensor; in particular, when the
  // input_tensors[i] is nullptr but the shape represented by it is partially
  // known from analysis of the graph.
  // <input_tensors_as_shapes> can have fewer elements than <input_shapes>.
  // Values of <input_tensors_as_shapes> do not need to outlive the context.
  //
  // REQUIRES: <node_def> is not NULL, and must outlive the InferenceContext.

  // <input_tensors> is NULL-padded to be the same size as <input_shapes>.
  //
  // Elements of <input_tensors_as_shapes> are used for when a shape
  // function makes a call to MakeShapeFromShapeTensor; in particular, when
  // the input_tensors[i] is nullptr but the shape represented by it is
  // partially known from analysis of the graph. <input_tensors_as_shapes>
  // can have fewer elements than <input_shapes>. Values of
  // <input_tensors_as_shapes> do not need to outlive the context.
  //
  // REQUIRES: <node_def> is not NULL, and must outlive the
  // InferenceContext.

  // <input_tensors> is NULL-padded to be the same size as <input_shapes>.
  //
  // Elements of <input_tensors_as_shapes> are used for when a shape
  // function makes a call to MakeShapeFromShapeTensor; in particular, when
  // the input_tensors[i] is nullptr but the shape represented by it is
  // partially known from analysis of the graph. <input_tensors_as_shapes>
  // can have fewer elements than <input_shapes>. Values of
  // <input_tensors_as_shapes> do not need to outlive the context.
  //
  // REQUIRES: <node_def> is not NULL, and must outlive the
  // InferenceContext.

  // Runs the shape inference function 'fn' with 'this' as the
  // argument, returns the status of the inference.
  //
  // On error, additional context is provided in the error message.
  public native @ByVal Status Run(@ByVal ShapeInferenceFn fn);

  // Merge the stored shape of the input in position idx with <shape> according
  // to the following rules:
  //
  // - If the ShapeHandles are the same or <shape> is unknown, there will be no
  //   change. Otherwise if the stored shape is unknown, the new shape will be
  //   <shape>.
  // - If both shapes are known, then they must have the same rank.
  // - For any one dimension, if the values for that dimension in both shapes
  //   are known, then the values must match.
  // - If one shape has equal or more information than the other shape in every
  //   dimension, the new shape will become the shape with more information.
  // - Example: merging [2,?] and [?,2] results in [2,2]
  // - Example: [2,2] cannot be merged with [1,2]
  //
  // This requires idx to be in the [0, num_inputs) range. If the merge is
  // successful, return true. Return false otherwise.
  public native @Cast("bool") boolean MergeInput(int idx, @ByVal ShapeHandle shape);

  // Relax the stored shape of the input in position idx with <shape> according
  // to the following rules:
  //
  // - If the ShapeHandles are the same then the stored shape will be returned.
  // - If either of the ShapeHandles are unknown, then a new UnknownShape will
  //   be returned. A new shape must be returned because we cannot claim that
  //   the resulting shape is necessarily the same as either of the input
  //   shapes.
  // - If the shapes both have known ranks but their ranks are different, a new
  //   UnknownShape will be returned.
  // - For any one dimension, if the value for that dimension in either of the
  //   shapes is unknown, a new shape will be returned with a new UnknownDim in
  //   that dimension.
  // - For any one dimension, if the values for that dimension in both shapes
  //   are known but do not match, a new shape will be returned with a new
  //   UnknownDim in that dimension.
  // - If both shapes have the same known rank and match in every dimension,
  //   the stored shape will be returned.
  // - Example: relaxing [2,?] and [?,2] results in [?,?]
  // - Example: relaxing [2,2] and [3,2] results in [?,2]
  // - Example: relaxing [2,2] with [1,2,3] results in ?
  //
  // This requires idx to be in the [0, num_inputs) range. If the relax is
  // successful and the new shape differs from the old one, store the new
  // shape and return true. Return false otherwise.
  public native @Cast("bool") boolean RelaxInput(int idx, @ByVal ShapeHandle shape);

  public native void SetInput(int idx, @ByVal ShapeHandle shape);

  public native @ByVal ShapeHandle input(@Cast("tensorflow::int64") long idx);
  public native @ByVal Status input(@StringPiece BytePointer input_name, @StdVector ShapeHandle output);
  public native @ByVal Status input(@StringPiece String input_name, @StdVector ShapeHandle output);
  public native int num_inputs();

  // Returns the input tensor at index <idx>, or nullptr if the input tensor is
  // not available at the time of shape inference.
  public native @Const Tensor input_tensor(int idx);

  // Returns true iff input_tensor(idx) was called by the shape function.
  public native @Cast("bool") boolean requested_input_tensor(int idx);

  // Returns true if MakeShapeFromInputTensor was called but the constant
  // input_tensor was not present.
  public native @Cast("bool") boolean requested_input_tensor_as_partial_shape(int idx);

  public native void set_input_tensors(@Const @ByRef ConstTensorPtrVector input_tensors);

  public native void set_input_tensors_as_shapes(
        @StdVector ShapeHandle input_tensors_as_shapes);

  public native @StdVector ShapeHandle input_tensors_as_shapes();

  public native @ByVal ShapeHandle output(@Cast("tensorflow::int64") long idx);
  public native void set_output(int idx, @ByVal ShapeHandle shape);
  public native @ByVal Status set_output(@StringPiece BytePointer output_name,
                      @StdVector ShapeHandle shapes);
  public native @ByVal Status set_output(@StringPiece String output_name,
                      @StdVector ShapeHandle shapes);

  public native int num_outputs();
  public native @ByVal ShapeHandle output(int idx);
  public native @ByVal Status output(@StringPiece BytePointer output_name,
                  @StdVector ShapeHandle output);
  public native @ByVal Status output(@StringPiece String output_name,
                  @StdVector ShapeHandle output);

  public native @ByVal AttrSlice attrs();

  public native @StdString BytePointer op();

  // idx can be negative for an offset from end of dimensions.
  // idx must be in the range [-1 * s.rank, s.rank).
  public native @ByVal DimensionHandle Dim(@ByVal ShapeHandle s, @Cast("tensorflow::int64") long idx);
  // As above, but asserts that the rank of the shape is known.
  public static native @ByVal DimensionHandle DimKnownRank(@ByVal ShapeHandle s, @Cast("tensorflow::int64") long idx);

  public static native int Rank(@ByVal ShapeHandle s);
  public static native @Cast("bool") boolean RankKnown(@ByVal ShapeHandle s);
  public static native @Cast("tensorflow::int64") long Value(@ByVal DimensionOrConstant d);
  public static native @Cast("bool") boolean ValueKnown(@ByVal DimensionOrConstant d);

  // Fills the output proto with the shape defined by the handle.
  // "proto" is expected to be empty prior to the call.
  public native void ShapeHandleToProto(@ByVal ShapeHandle handle, TensorShapeProto proto);

  // Returns true if the rank and all dimensions of the Shape are known.
  public native @Cast("bool") boolean FullyDefined(@ByVal ShapeHandle s);

  // Returns the total number of elements, or an unknown dimension for an
  // incomplete shape.
  public native @ByVal DimensionHandle NumElements(@ByVal ShapeHandle s);

  public native @StdString BytePointer DebugString(@ByVal ShapeHandle s);
  public native @StdString BytePointer DebugString(@ByVal DimensionHandle d);
  public native @StdString BytePointer DebugString(@Const @ByRef ShapeAndType shape_and_type);

  // Describes the whole context, for debugging purposes.
  public native @StdString BytePointer DebugString();

  // If <shape> has rank <rank>, or its rank is unknown, return OK and return
  // the shape with asserted rank in <*out>. Otherwise return an error.
  //
  // Note that <*out> may be set to <shape>.
  public native @ByVal Status WithRank(@ByVal ShapeHandle shape, @Cast("tensorflow::int64") long rank,
                    ShapeHandle out);
  public native @ByVal Status WithRankAtLeast(@ByVal ShapeHandle shape, @Cast("tensorflow::int64") long rank,
                           ShapeHandle out);
  public native @ByVal Status WithRankAtMost(@ByVal ShapeHandle shape, @Cast("tensorflow::int64") long rank,
                          ShapeHandle out);

  // If <dim> has value <value>, or its value is unknown, returns OK and returns
  // the dimension with asserted value in <*out>. Otherwise returns an error.
  //
  // Note that <*out> may be set to <dim>.
  public native @ByVal Status WithValue(@ByVal DimensionHandle dim, @Cast("tensorflow::int64") long value,
                     DimensionHandle out);

  // Merges <s0> and <s1> and returns the merged shape in <*out>. See
  // 'MergeInput' function for full details and examples.
  public native @ByVal Status Merge(@ByVal ShapeHandle s0, @ByVal ShapeHandle s1,
                 ShapeHandle out);

  // Asserts that <s>'s rank >= <prefix>'s rank, and the first
  // <prefix.rank> dimensions of <s> are compatible with the dimensions of
  // <prefix>.
  // Returns the merged results in <*s_out> and <*prefix_out>.
  public native @ByVal Status MergePrefix(@ByVal ShapeHandle s, @ByVal ShapeHandle prefix, ShapeHandle s_out,
                       ShapeHandle prefix_out);

  // Merges <d0> and <d1> and returns the merged dimension in <*out>. If <d0>
  // and <d1> have incompatible values, returns an error.
  //
  // Note that <*out> may be set to <d0> or <d1>.
  public native @ByVal Status Merge(@ByVal DimensionHandle d0, @ByVal DimensionHandle d1,
                 DimensionHandle out);

  // Returns in <*out> a sub-shape of <s> with dimensions [start:].
  // <start> can be negative to index from the end of the shape. If <start> >
  // rank of <s>, then an empty subshape is returned.
  public native @ByVal Status Subshape(@ByVal ShapeHandle s, @Cast("tensorflow::int64") long start,
                    ShapeHandle out);

  // Returns in <*out> a sub-shape of <s>, with dimensions [start:end].
  // <start> and <end> can be negative, to index from the end of the shape.
  // <start> and <end> are set to the rank of <s> if > rank of <s>.
  public native @ByVal Status Subshape(@ByVal ShapeHandle s, @Cast("tensorflow::int64") long start, @Cast("tensorflow::int64") long end,
                    ShapeHandle out);

  // Returns in <*out> a sub-shape of <s>, with dimensions [start:end:stride].
  // <start> and <end> can be negative, to index from the end of the shape.
  // <start> and <end> are set to the rank of <s> if > rank of <s>.
  // <stride> can be negative, to reverse the <s>.
  public native @ByVal Status Subshape(@ByVal ShapeHandle s, @Cast("tensorflow::int64") long start, @Cast("tensorflow::int64") long end, @Cast("tensorflow::int64") long stride,
                    ShapeHandle out);

  // Returns in <*out> the result of appending the dimensions of <s2> to those
  // of <s1>.
  public native @ByVal Status Concatenate(@ByVal ShapeHandle s1, @ByVal ShapeHandle s2,
                       ShapeHandle out);

  // Returns in <out> the shape from replacing <s.dim[dim_index]> with
  // <new_dim>.
  public native @ByVal Status ReplaceDim(@ByVal ShapeHandle s, @Cast("tensorflow::int64") long dim_index, @ByVal DimensionHandle new_dim,
                      ShapeHandle out);

  // Returns a new shape with the given dims. The returned value is owned by
  // this context.
  public native @ByVal ShapeHandle MakeShape(@StdVector DimensionHandle dims);

  // Returns a new unknown shape.
  public native @ByVal ShapeHandle UnknownShape();

  // Returns a shape with specified rank but unknown dims.
  public native @ByVal ShapeHandle UnknownShapeOfRank(@Cast("tensorflow::int64") long rank);

  // Returns a new shape of zero dimensions.
  public native @ByVal ShapeHandle Scalar();

  // Returns a new shape of one dimension.
  public native @ByVal ShapeHandle Vector(@ByVal DimensionOrConstant dim);

  // Returns a new shape of two dimensions.
  public native @ByVal ShapeHandle Matrix(@ByVal DimensionOrConstant dim1, @ByVal DimensionOrConstant dim2);

  // Returns in <out> a new shape whose dimension sizes come from input tensor
  // <input_idx>. The tensor must be a 1-dimensional int32 or int64 tensor.  If
  // the input tensor is NULL, then an unknown shape is returned.
  public native @ByVal Status MakeShapeFromShapeTensor(int input_idx, ShapeHandle out);

  // Like the function above, but treats scalar values as unknown
  // shapes.  **NOTE** If the scalar is statically known, its value
  // must be -1 or an error is returned.
  public native @ByVal Status MakeShapeFromShapeTensorTreatScalarAsUnknownShape(int input_idx,
                                                             ShapeHandle out);

  // Returns in <out> a new shape corresponding to <proto>.
  public native @ByVal Status MakeShapeFromShapeProto(@Const @ByRef TensorShapeProto proto,
                                   ShapeHandle out);

  // Returns in <out> a new shape corresponding to <partial_shape>.
  public native @ByVal Status MakeShapeFromPartialTensorShape(
        @Const @ByRef PartialTensorShape partial_shape, ShapeHandle out);

  // Returns in <out> a new shape corresponding to <shape>.
  public native @ByVal Status MakeShapeFromTensorShape(@Const @ByRef TensorShape shape, ShapeHandle out);

  // Returns a new dimension of the given size.  The returned value is owned by
  // this context.
  public native @ByVal DimensionHandle MakeDim(@ByVal DimensionOrConstant d);

  public native @ByVal DimensionHandle UnknownDim();

  // Returns in <val> a scalar value from an input tensor <t>.  The input tensor
  // must be a 1-dimensional int32 or int64 tensor.  Caller must ensure that the
  // input tensor is not NULL.
  public native @ByVal Status GetScalarFromTensor(@Const Tensor t, @Cast("tensorflow::int64*") LongPointer val);
  public native @ByVal Status GetScalarFromTensor(@Const Tensor t, @Cast("tensorflow::int64*") LongBuffer val);
  public native @ByVal Status GetScalarFromTensor(@Const Tensor t, @Cast("tensorflow::int64*") long... val);

  // Returns a new dimension whose value is given by a scalar input tensor.
  // The input tensor must be in host memory, since it is dereferenced to get
  // the value.
  public native @ByVal Status MakeDimForScalarInput(int idx, DimensionHandle out);

  // Returns a new dimension whose value is given by a scalar input tensor.
  // This allows for a negative input dimension given the rank of a separate
  // tensor.  This rank can be negative if unknown.
  // The input tensor must be in host memory, since it is dereferenced to get
  // the value.
  public native @ByVal Status MakeDimForScalarInputWithNegativeIndexing(int idx, int input_rank,
                                                     DimensionHandle out);

  // Look up the attr for the NodeDef being evaluated with name attr_name and
  // set *value to its value.  If no attr with attr_name is found in def(), or
  // the attr does not have a matching type, a non-ok status will be returned.

  // Returns in <out> the result of dividing <dividend> by <divisor>.
  // Returns an error if <divisor>  is not positive or if <evenly_divisible>
  // and <divisor> does not evenly divide <dividend>.
  public native @ByVal Status Divide(@ByVal DimensionHandle dividend, @ByVal DimensionOrConstant divisor,
                  @Cast("bool") boolean evenly_divisible, DimensionHandle out);

  // Returns in <out> the sum of <first> and <second>.
  public native @ByVal Status Add(@ByVal DimensionHandle first, @ByVal DimensionOrConstant second,
               DimensionHandle out);

  // Returns in <out> the dimension that is <first> minus <second>.
  public native @ByVal Status Subtract(@ByVal DimensionHandle first, @ByVal DimensionOrConstant second,
                    DimensionHandle out);

  // Returns in <out> the product of <first> and <second>.
  public native @ByVal Status Multiply(@ByVal DimensionHandle first, @ByVal DimensionOrConstant second,
                    DimensionHandle out);

  // Returns in <out> the minimum of <first> and <second>. If either <first> or
  // <second> is zero the results is zero. Otherwise, if either <first> or
  // <second> is unknown the results is unknown.
  public native @ByVal Status Min(@ByVal DimensionHandle first, @ByVal DimensionOrConstant second,
               DimensionHandle out);

  // Returns in <out> the maximum of <first> and <second>. If either <first> or
  // <second> is unknown the results is unknown.
  public native @ByVal Status Max(@ByVal DimensionHandle first, @ByVal DimensionOrConstant second,
               DimensionHandle out);

  public native @ByVal Status construction_status();

  // Methods to propagate shape and dtype on edges of handles. Handles are the
  // dtype DT_RESOURCE which can be used to access state stored in a
  // ResourceManager. When ops (such as variables) consume these handles to
  // produce tensors they might need to know side-information about the shapes
  // and dtypes of tensors which can be accessed via the handle. These methods
  // propagate that information. Output handle dtypes and shapes are ignored if
  // the output tensor is not of type DT_RESOURCE.

  // Merge the stored shapes and types corresponding to the input handle in
  // position idx with the specified shapes and types. This requires idx to be
  // in the [0, num_inputs) range.
  //
  // If the merge is successful and any of the new shapes differs from the old
  // one, or any of the old dtypes was DT_INVALID, store the new shapes and
  // return true.  Return false otherwise.
  //
  // See 'MergeInput' function for full details and examples.
  public native @Cast("bool") boolean MergeInputHandleShapesAndTypes(
        int idx,
        @StdVector ShapeAndType shapes_and_types);

  // As MergeInputHandleShapesAndTypes, but for an output.
  public native @Cast("bool") boolean MergeOutputHandleShapesAndTypes(
        int idx,
        @StdVector ShapeAndType shapes_and_types);

  // Relaxes the stored shapes and types corresponding to the input handle in
  // position idx with the specified shapes and types. This requires idx to be
  // in the [0, num_inputs) range.
  //
  // If the relax is successful (sizes are the same, old dtypes match new ones
  // or are DT_INVALID), then store the relaxed shapes and return true.
  // Return false otherwise.
  //
  // See 'RelaxInput' function for full details and examples.
  public native @Cast("bool") boolean RelaxInputHandleShapesAndMergeTypes(
        int idx,
        @StdVector ShapeAndType shapes_and_types);

  // As RelaxInputHandleShapesAndTypes, but for an output.
  public native @Cast("bool") boolean RelaxOutputHandleShapesAndMergeTypes(
        int idx,
        @StdVector ShapeAndType shapes_and_types);

  public native void set_input_handle_shapes_and_types(
        int idx, @StdVector ShapeAndType shapes_and_types);

  // Returns the output handle shapes and types, for the resource tensor output
  // at index <idx>. Returns NULL if the shape and types were never set.
  public native @StdVector ShapeAndType output_handle_shapes_and_types(int idx);

  // Returns the inputs handle shapes and types, for the resource tensor output
  // at index <idx>. Returns NULL if the shape and types were not available.
  public native @StdVector ShapeAndType input_handle_shapes_and_types(int idx);

  public native void set_output_handle_shapes_and_types(
        int idx, @StdVector ShapeAndType shapes_and_types);

  // Note that shape functions should usually call MakeShapeFromShapeTensor,
  // as it does more analysis to provide partial shapes.
  //
  // Returns in <out> a new shape whose dimension sizes come from tensor <t>.
  // The tensor must be a 1-dimensional int32 or int64 tensor.  If <t> is NULL,
  // then an unknown shape is returned.
  public native @ByVal Status MakeShapeFromTensor(@Const Tensor t, @ByVal ShapeHandle tensor_shape,
                               ShapeHandle out);

  public native int graph_def_version();

  public native @StdVector ShapeHandlePair MergedShapes();
  public native @StdVector DimensionHandlePair MergedDims();

  // Adds new outputs; useful when mutating the graph.
  public native @ByVal Status ExpandOutputs(int new_output_size);
}
