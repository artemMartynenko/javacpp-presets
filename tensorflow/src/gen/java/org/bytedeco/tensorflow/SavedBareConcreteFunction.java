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
public class SavedBareConcreteFunction extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SavedBareConcreteFunction(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SavedBareConcreteFunction(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public SavedBareConcreteFunction position(long position) {
        return (SavedBareConcreteFunction)super.position(position);
    }
    @Override public SavedBareConcreteFunction getPointer(long i) {
        return new SavedBareConcreteFunction((Pointer)this).position(position + i);
    }

  public SavedBareConcreteFunction() { super((Pointer)null); allocate(); }
  private native void allocate();

  public SavedBareConcreteFunction(@Const @ByRef SavedBareConcreteFunction from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef SavedBareConcreteFunction from);

  public native @ByRef @Name("operator =") SavedBareConcreteFunction put(@Const @ByRef SavedBareConcreteFunction from);

  public native Arena GetArena();
  public native Pointer GetMaybeArenaPointer();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer GetDescriptor();
  public static native @Cast("const google::protobuf::Reflection*") Pointer GetReflection();
  public static native @Const @ByRef SavedBareConcreteFunction default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const SavedBareConcreteFunction internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void UnsafeArenaSwap(SavedBareConcreteFunction other);
  public native void Swap(SavedBareConcreteFunction other);
  

  // implements Message ----------------------------------------------

  public native SavedBareConcreteFunction New();

  public native SavedBareConcreteFunction New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef SavedBareConcreteFunction from);
  public native void MergeFrom(@Const @ByRef SavedBareConcreteFunction from);
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

  // repeated string argument_keywords = 2;
  public native int argument_keywords_size();
  public native void clear_argument_keywords();
  @MemberGetter public static native int kArgumentKeywordsFieldNumber();
  public static final int kArgumentKeywordsFieldNumber = kArgumentKeywordsFieldNumber();
  public native @StdString BytePointer argument_keywords(int index);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_argument_keywords(int index);
  public native void set_argument_keywords(int index, @StdString BytePointer value);
  public native void set_argument_keywords(int index, @StdString String value);
  public native void set_argument_keywords(int index, @Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_argument_keywords(int index, String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer add_argument_keywords();
  public native void add_argument_keywords(@StdString BytePointer value);
  public native void add_argument_keywords(@StdString String value);
  public native void add_argument_keywords(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void add_argument_keywords(String value, @Cast("size_t") long size);

  // string concrete_function_name = 1;
  public native void clear_concrete_function_name();
  @MemberGetter public static native int kConcreteFunctionNameFieldNumber();
  public static final int kConcreteFunctionNameFieldNumber = kConcreteFunctionNameFieldNumber();
  public native @StdString BytePointer concrete_function_name();
  public native void set_concrete_function_name(@StdString BytePointer value);
  public native void set_concrete_function_name(@StdString String value);
  public native void set_concrete_function_name(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_concrete_function_name(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_concrete_function_name();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_concrete_function_name();
  public native void set_allocated_concrete_function_name(@StdString @Cast({"char*", "std::string*"}) BytePointer concrete_function_name);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer unsafe_arena_release_concrete_function_name();
  public native void unsafe_arena_set_allocated_concrete_function_name(
        @StdString @Cast({"char*", "std::string*"}) BytePointer concrete_function_name);

  // int64 allowed_positional_arguments = 3;
  public native void clear_allowed_positional_arguments();
  @MemberGetter public static native int kAllowedPositionalArgumentsFieldNumber();
  public static final int kAllowedPositionalArgumentsFieldNumber = kAllowedPositionalArgumentsFieldNumber();
  public native @Cast("google::protobuf::int64") long allowed_positional_arguments();
  public native void set_allowed_positional_arguments(@Cast("google::protobuf::int64") long value);
}
