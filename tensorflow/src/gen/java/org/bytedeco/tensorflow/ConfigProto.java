// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

// -------------------------------------------------------------------

@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class ConfigProto extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ConfigProto(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ConfigProto(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public ConfigProto position(long position) {
        return (ConfigProto)super.position(position);
    }
    @Override public ConfigProto getPointer(long i) {
        return new ConfigProto((Pointer)this).position(position + i);
    }

  public ConfigProto() { super((Pointer)null); allocate(); }
  private native void allocate();

  public ConfigProto(@Const @ByRef ConfigProto from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef ConfigProto from);

  public native @ByRef @Name("operator =") ConfigProto put(@Const @ByRef ConfigProto from);

  public native Arena GetArena();
  public native Pointer GetMaybeArenaPointer();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer GetDescriptor();
  public static native @Cast("const google::protobuf::Reflection*") Pointer GetReflection();
  public static native @Const @ByRef ConfigProto default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const ConfigProto internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void UnsafeArenaSwap(ConfigProto other);
  public native void Swap(ConfigProto other);
  

  // implements Message ----------------------------------------------

  public native ConfigProto New();

  public native ConfigProto New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef ConfigProto from);
  public native void MergeFrom(@Const @ByRef ConfigProto from);
  public native void Clear();
  public native @Cast("bool") boolean IsInitialized();

  public native @Cast("size_t") long ByteSizeLong();
//   #if GOOGLE_PROTOBUF_ENABLE_EXPERIMENTAL_PARSER
//   #else
  public native @Cast("bool") boolean MergePartialFromCodedStream(
        CodedInputStream input);
//   #endif  // GOOGLE_PROTOBUF_ENABLE_EXPERIMENTAL_PARSER
  public native void SerializeWithCachedSizes(
        CodedOutputStream output);
  public native @Cast("google::protobuf::uint8*") BytePointer InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") BytePointer target);
  public native @Cast("google::protobuf::uint8*") ByteBuffer InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") ByteBuffer target);
  public native @Cast("google::protobuf::uint8*") byte[] InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") byte[] target);
  public native int GetCachedSize();

  public native @ByVal @Cast("google::protobuf::Metadata*") Pointer GetMetadata();

  // nested types ----------------------------------------------------

  // accessors -------------------------------------------------------

  // map<string, int32> device_count = 1;
  public native int device_count_size();
  public native void clear_device_count();
  @MemberGetter public static native int kDeviceCountFieldNumber();
  public static final int kDeviceCountFieldNumber = kDeviceCountFieldNumber();
  public native @Const @ByRef StringIntMap device_count();
  public native StringIntMap mutable_device_count();

  // repeated string device_filters = 4;
  public native int device_filters_size();
  public native void clear_device_filters();
  @MemberGetter public static native int kDeviceFiltersFieldNumber();
  public static final int kDeviceFiltersFieldNumber = kDeviceFiltersFieldNumber();
  public native @StdString BytePointer device_filters(int index);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_device_filters(int index);
  public native void set_device_filters(int index, @StdString BytePointer value);
  public native void set_device_filters(int index, @StdString String value);
  public native void set_device_filters(int index, @Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_device_filters(int index, String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer add_device_filters();
  public native void add_device_filters(@StdString BytePointer value);
  public native void add_device_filters(@StdString String value);
  public native void add_device_filters(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void add_device_filters(String value, @Cast("size_t") long size);

  // repeated .tensorflow.ThreadPoolOptionProto session_inter_op_thread_pool = 12;
  public native int session_inter_op_thread_pool_size();
  public native void clear_session_inter_op_thread_pool();
  @MemberGetter public static native int kSessionInterOpThreadPoolFieldNumber();
  public static final int kSessionInterOpThreadPoolFieldNumber = kSessionInterOpThreadPoolFieldNumber();
  public native ThreadPoolOptionProto mutable_session_inter_op_thread_pool(int index);
  public native @Const @ByRef ThreadPoolOptionProto session_inter_op_thread_pool(int index);
  public native ThreadPoolOptionProto add_session_inter_op_thread_pool();

  // .tensorflow.GPUOptions gpu_options = 6;
  public native @Cast("bool") boolean has_gpu_options();
  public native void clear_gpu_options();
  @MemberGetter public static native int kGpuOptionsFieldNumber();
  public static final int kGpuOptionsFieldNumber = kGpuOptionsFieldNumber();
  public native @Const @ByRef GPUOptions gpu_options();
  public native GPUOptions release_gpu_options();
  public native GPUOptions mutable_gpu_options();
  public native void set_allocated_gpu_options(GPUOptions gpu_options);
  public native void unsafe_arena_set_allocated_gpu_options(
        GPUOptions gpu_options);
  public native GPUOptions unsafe_arena_release_gpu_options();

  // .tensorflow.GraphOptions graph_options = 10;
  public native @Cast("bool") boolean has_graph_options();
  public native void clear_graph_options();
  @MemberGetter public static native int kGraphOptionsFieldNumber();
  public static final int kGraphOptionsFieldNumber = kGraphOptionsFieldNumber();
  public native @Const @ByRef GraphOptions graph_options();
  public native GraphOptions release_graph_options();
  public native GraphOptions mutable_graph_options();
  public native void set_allocated_graph_options(GraphOptions graph_options);
  public native void unsafe_arena_set_allocated_graph_options(
        GraphOptions graph_options);
  public native GraphOptions unsafe_arena_release_graph_options();

  // .tensorflow.RPCOptions rpc_options = 13;
  public native @Cast("bool") boolean has_rpc_options();
  public native void clear_rpc_options();
  @MemberGetter public static native int kRpcOptionsFieldNumber();
  public static final int kRpcOptionsFieldNumber = kRpcOptionsFieldNumber();
  public native @Const @ByRef RPCOptions rpc_options();
  public native RPCOptions release_rpc_options();
  public native RPCOptions mutable_rpc_options();
  public native void set_allocated_rpc_options(RPCOptions rpc_options);
  public native void unsafe_arena_set_allocated_rpc_options(
        RPCOptions rpc_options);
  public native RPCOptions unsafe_arena_release_rpc_options();

  // .tensorflow.ClusterDef cluster_def = 14;
  public native @Cast("bool") boolean has_cluster_def();
  public native void clear_cluster_def();
  @MemberGetter public static native int kClusterDefFieldNumber();
  public static final int kClusterDefFieldNumber = kClusterDefFieldNumber();
  public native @Const @ByRef ClusterDef cluster_def();
  public native ClusterDef release_cluster_def();
  public native ClusterDef mutable_cluster_def();
  public native void set_allocated_cluster_def(ClusterDef cluster_def);
  public native void unsafe_arena_set_allocated_cluster_def(
        ClusterDef cluster_def);
  public native ClusterDef unsafe_arena_release_cluster_def();

  // .tensorflow.ConfigProto.Experimental experimental = 16;
  public native @Cast("bool") boolean has_experimental();
  public native void clear_experimental();
  @MemberGetter public static native int kExperimentalFieldNumber();
  public static final int kExperimentalFieldNumber = kExperimentalFieldNumber();
  public native @Const @ByRef ConfigProto_Experimental experimental();
  public native ConfigProto_Experimental release_experimental();
  public native ConfigProto_Experimental mutable_experimental();
  public native void set_allocated_experimental(ConfigProto_Experimental experimental);
  public native void unsafe_arena_set_allocated_experimental(
        ConfigProto_Experimental experimental);
  public native ConfigProto_Experimental unsafe_arena_release_experimental();

  // int32 intra_op_parallelism_threads = 2;
  public native void clear_intra_op_parallelism_threads();
  @MemberGetter public static native int kIntraOpParallelismThreadsFieldNumber();
  public static final int kIntraOpParallelismThreadsFieldNumber = kIntraOpParallelismThreadsFieldNumber();
  public native @Cast("google::protobuf::int32") int intra_op_parallelism_threads();
  public native void set_intra_op_parallelism_threads(@Cast("google::protobuf::int32") int value);

  // int32 placement_period = 3;
  public native void clear_placement_period();
  @MemberGetter public static native int kPlacementPeriodFieldNumber();
  public static final int kPlacementPeriodFieldNumber = kPlacementPeriodFieldNumber();
  public native @Cast("google::protobuf::int32") int placement_period();
  public native void set_placement_period(@Cast("google::protobuf::int32") int value);

  // int32 inter_op_parallelism_threads = 5;
  public native void clear_inter_op_parallelism_threads();
  @MemberGetter public static native int kInterOpParallelismThreadsFieldNumber();
  public static final int kInterOpParallelismThreadsFieldNumber = kInterOpParallelismThreadsFieldNumber();
  public native @Cast("google::protobuf::int32") int inter_op_parallelism_threads();
  public native void set_inter_op_parallelism_threads(@Cast("google::protobuf::int32") int value);

  // bool use_per_session_threads = 9;
  public native void clear_use_per_session_threads();
  @MemberGetter public static native int kUsePerSessionThreadsFieldNumber();
  public static final int kUsePerSessionThreadsFieldNumber = kUsePerSessionThreadsFieldNumber();
  public native @Cast("bool") boolean use_per_session_threads();
  public native void set_use_per_session_threads(@Cast("bool") boolean value);

  // bool allow_soft_placement = 7;
  public native void clear_allow_soft_placement();
  @MemberGetter public static native int kAllowSoftPlacementFieldNumber();
  public static final int kAllowSoftPlacementFieldNumber = kAllowSoftPlacementFieldNumber();
  public native @Cast("bool") boolean allow_soft_placement();
  public native void set_allow_soft_placement(@Cast("bool") boolean value);

  // bool log_device_placement = 8;
  public native void clear_log_device_placement();
  @MemberGetter public static native int kLogDevicePlacementFieldNumber();
  public static final int kLogDevicePlacementFieldNumber = kLogDevicePlacementFieldNumber();
  public native @Cast("bool") boolean log_device_placement();
  public native void set_log_device_placement(@Cast("bool") boolean value);

  // bool isolate_session_state = 15;
  public native void clear_isolate_session_state();
  @MemberGetter public static native int kIsolateSessionStateFieldNumber();
  public static final int kIsolateSessionStateFieldNumber = kIsolateSessionStateFieldNumber();
  public native @Cast("bool") boolean isolate_session_state();
  public native void set_isolate_session_state(@Cast("bool") boolean value);

  // int64 operation_timeout_in_ms = 11;
  public native void clear_operation_timeout_in_ms();
  @MemberGetter public static native int kOperationTimeoutInMsFieldNumber();
  public static final int kOperationTimeoutInMsFieldNumber = kOperationTimeoutInMsFieldNumber();
  public native @Cast("google::protobuf::int64") long operation_timeout_in_ms();
  public native void set_operation_timeout_in_ms(@Cast("google::protobuf::int64") long value);
}
