// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


////////////////////////////////////////////////////////////////////////////////
//
// Wrapper classes for the `WorkerService.RunGraph` response message.
//
// The `RunGraphResponse` message can contain potentially large tensor
// data as part of its `recv` submessages. Here we provide specialized
// wrappers that avoid copying the tensor data wherever possible.
//
// See `RunGraphResponse` in tensorflow/core/protobuf/worker.proto for the
// protocol buffer definition.
//
////////////////////////////////////////////////////////////////////////////////

// Abstract interface for a mutable RunGraphResponse message.
//
// Note that there is no corresponding (immutable)
// RunGraphResponseWrapper class, because the RunGraphResponse object
// is always used as a mutable pointer.
@Namespace("tensorflow") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class MutableRunGraphResponseWrapper extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MutableRunGraphResponseWrapper(Pointer p) { super(p); }


  // A list of tensors corresponding to those requested by
  // `RunGraphRequest.recv_key`.
  public native @Cast("size_t") long num_recvs();
  public native @StdString BytePointer recv_key(@Cast("size_t") long i);
  // NOTE: The following methods may perform a destructive read, for
  // efficiency.
  public native @ByVal Status RecvValue(@Cast("size_t") long i, TensorProto out_tensor);
  public native @ByVal Status RecvValue(@Cast("size_t") long i, Tensor out_tensor);
  public native void AddRecv(@StdString BytePointer key, @Const @ByRef Tensor value);
  public native void AddRecv(@StdString String key, @Const @ByRef Tensor value);

  // Submessages that store performance statistics about the subgraph
  // execution, if necessary.
  public native StepStats mutable_step_stats();
  public native CostGraphDef mutable_cost_graph();
  public native @Cast("size_t") long num_partition_graphs();
  public native GraphDef mutable_partition_graph(@Cast("size_t") long i);
  public native void AddPartitionGraph(@Const @ByRef GraphDef partition_graph);

  // Returned status if requested.
  public native @Cast("tensorflow::errors::Code") int status_code();
  public native @StdString BytePointer status_error_message();
  public native void set_status(@Const @ByRef Status status);
}
