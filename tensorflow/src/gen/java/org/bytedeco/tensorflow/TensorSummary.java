// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Outputs a {@code Summary} protocol buffer with a tensor.
 * 
 *  This op is being phased out in favor of TensorSummaryV2, which lets callers pass
 *  a tag as well as a serialized SummaryMetadata proto string that contains
 *  plugin-specific data. We will keep this op to maintain backwards compatibility.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * tensor: A tensor to serialize.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * description: A json-encoded SummaryDescription proto.
 *  * labels: An unused list of strings.
 *  * display_name: An unused string.
 * 
 *  Returns:
 *  * {@code Output}: The summary tensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class TensorSummary extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TensorSummary(Pointer p) { super(p); }

  /** Optional attribute setters for TensorSummary */
  public static class Attrs extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public Attrs() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public Attrs(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Attrs(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public Attrs position(long position) {
          return (Attrs)super.position(position);
      }
      @Override public Attrs getPointer(long i) {
          return new Attrs((Pointer)this).position(position + i);
      }
  
    /** A json-encoded SummaryDescription proto.
     * 
     *  Defaults to "" */
    
    ///
    public native @ByVal Attrs Description(@StringPiece BytePointer x);
    public native @ByVal Attrs Description(@StringPiece String x);

    /** An unused list of strings.
     * 
     *  Defaults to [] */
    
    ///
    public native @ByVal Attrs Labels(@Cast("const tensorflow::gtl::ArraySlice<tensorflow::string>*") @ByRef StringVector x);

    /** An unused string.
     * 
     *  Defaults to "" */
    public native @ByVal Attrs DisplayName(@StringPiece BytePointer x);
    public native @ByVal Attrs DisplayName(@StringPiece String x);

    public native @StringPiece BytePointer description_(); public native Attrs description_(BytePointer setter);
    public native @ByRef @Cast("tensorflow::gtl::ArraySlice<tensorflow::string>*") StringVector labels_(); public native Attrs labels_(StringVector setter);
    public native @StringPiece BytePointer display_name_(); public native Attrs display_name_(BytePointer setter);
  }
  public TensorSummary(@Const @ByRef Scope scope, @ByVal Input tensor) { super((Pointer)null); allocate(scope, tensor); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input tensor);
  public TensorSummary(@Const @ByRef Scope scope, @ByVal Input tensor,
                @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, tensor, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input tensor,
                @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public static native @ByVal Attrs Description(@StringPiece BytePointer x);
  public static native @ByVal Attrs Description(@StringPiece String x);
  public static native @ByVal Attrs Labels(@Cast("const tensorflow::gtl::ArraySlice<tensorflow::string>*") @ByRef StringVector x);
  public static native @ByVal Attrs DisplayName(@StringPiece BytePointer x);
  public static native @ByVal Attrs DisplayName(@StringPiece String x);

  public native @ByRef Operation operation(); public native TensorSummary operation(Operation setter);
  public native @ByRef Output summary(); public native TensorSummary summary(Output setter);
}
