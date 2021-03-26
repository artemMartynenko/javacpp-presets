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
public class SignatureDef extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SignatureDef(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SignatureDef(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public SignatureDef position(long position) {
        return (SignatureDef)super.position(position);
    }
    @Override public SignatureDef getPointer(long i) {
        return new SignatureDef((Pointer)this).position(position + i);
    }

  public SignatureDef() { super((Pointer)null); allocate(); }
  private native void allocate();

  public SignatureDef(@Const @ByRef SignatureDef from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef SignatureDef from);

  public native @ByRef @Name("operator =") SignatureDef put(@Const @ByRef SignatureDef from);

  public native Arena GetArena();
  public native Pointer GetMaybeArenaPointer();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer GetDescriptor();
  public static native @Cast("const google::protobuf::Reflection*") Pointer GetReflection();
  public static native @Const @ByRef SignatureDef default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const SignatureDef internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void UnsafeArenaSwap(SignatureDef other);
  public native void Swap(SignatureDef other);
  

  // implements Message ----------------------------------------------

  public native SignatureDef New();

  public native SignatureDef New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef SignatureDef from);
  public native void MergeFrom(@Const @ByRef SignatureDef from);
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

  // map<string, .tensorflow.TensorInfo> inputs = 1;
  public native int inputs_size();
  public native void clear_inputs();
  @MemberGetter public static native int kInputsFieldNumber();
  public static final int kInputsFieldNumber = kInputsFieldNumber();
  public native @Const @ByRef StringTensorInfoMap inputs();
  public native StringTensorInfoMap mutable_inputs();

  // map<string, .tensorflow.TensorInfo> outputs = 2;
  public native int outputs_size();
  public native void clear_outputs();
  @MemberGetter public static native int kOutputsFieldNumber();
  public static final int kOutputsFieldNumber = kOutputsFieldNumber();
  public native @Const @ByRef StringTensorInfoMap outputs();
  public native StringTensorInfoMap mutable_outputs();

  // string method_name = 3;
  public native void clear_method_name();
  @MemberGetter public static native int kMethodNameFieldNumber();
  public static final int kMethodNameFieldNumber = kMethodNameFieldNumber();
  public native @StdString BytePointer method_name();
  public native void set_method_name(@StdString BytePointer value);
  public native void set_method_name(@StdString String value);
  public native void set_method_name(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_method_name(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_method_name();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_method_name();
  public native void set_allocated_method_name(@StdString @Cast({"char*", "std::string*"}) BytePointer method_name);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer unsafe_arena_release_method_name();
  public native void unsafe_arena_set_allocated_method_name(
        @StdString @Cast({"char*", "std::string*"}) BytePointer method_name);
}
