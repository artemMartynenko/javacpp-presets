// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// Wrapper for immutable RunStep requests that use a non-owned
// protobuf message.
//
// This interface is typically used by server-side components in the
// TensorFlow master, where the incoming message is a (possibly const)
// `RunStepRequest*`.
@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class ProtoRunStepRequest extends RunStepRequestWrapper {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ProtoRunStepRequest(Pointer p) { super(p); }

  public ProtoRunStepRequest(@Const RunStepRequest request) { super((Pointer)null); allocate(request); }
  private native void allocate(@Const RunStepRequest request);

  // RunStepRequestWrapper methods.
  public native @StdString BytePointer session_handle();
  public native @StdString BytePointer partial_run_handle();
  public native @Cast("size_t") long num_feeds();
  public native @StdString BytePointer feed_name(@Cast("size_t") long i);
  public native @ByVal Status FeedValue(@Cast("size_t") long i, Tensor out_tensor);
  public native @ByVal Status FeedValue(@Cast("size_t") long i, TensorProto out_tensor);
  public native @Cast("size_t") long num_fetches();
  public native @StdString BytePointer fetch_name(@Cast("size_t") long i);
  public native @Cast("size_t") long num_targets();
  public native @StdString BytePointer target_name(@Cast("size_t") long i);
  public native @Const @ByRef RunOptions options();
  public native @StdString BytePointer DebugString();
  public native @Const @ByRef RunStepRequest ToProto();
  public native @Cast("bool") boolean store_errors_in_response_body();
  public native @Cast("tensorflow::int64") long request_id();
}
