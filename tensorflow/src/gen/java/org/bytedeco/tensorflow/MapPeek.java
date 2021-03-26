// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Op peeks at the values at the specified key.  If the
 * 
 *  underlying container does not contain this key
 *  this op will block until it does.
 * 
 *  Arguments:
 *  * scope: A Scope object
 * 
 *  Returns:
 *  * {@code OutputList}: The values tensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class MapPeek extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MapPeek(Pointer p) { super(p); }

  /** Optional attribute setters for MapPeek */
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
  
    /** Defaults to 0 */
    public native @ByVal Attrs Capacity(@Cast("tensorflow::int64") long x);

    /** Defaults to 0 */
    public native @ByVal Attrs MemoryLimit(@Cast("tensorflow::int64") long x);

    /** Defaults to "" */
    public native @ByVal Attrs Container(@StringPiece BytePointer x);
    public native @ByVal Attrs Container(@StringPiece String x);

    /** Defaults to "" */
    public native @ByVal Attrs SharedName(@StringPiece BytePointer x);
    public native @ByVal Attrs SharedName(@StringPiece String x);

    public native @Cast("tensorflow::int64") long capacity_(); public native Attrs capacity_(long setter);
    public native @Cast("tensorflow::int64") long memory_limit_(); public native Attrs memory_limit_(long setter);
    public native @StringPiece BytePointer container_(); public native Attrs container_(BytePointer setter);
    public native @StringPiece BytePointer shared_name_(); public native Attrs shared_name_(BytePointer setter);
  }
  public MapPeek(@Const @ByRef Scope scope, @ByVal Input key,
          @ByVal Input indices, @Cast("const tensorflow::DataTypeSlice*") @ByRef DataTypeVector dtypes) { super((Pointer)null); allocate(scope, key, indices, dtypes); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input key,
          @ByVal Input indices, @Cast("const tensorflow::DataTypeSlice*") @ByRef DataTypeVector dtypes);
  public MapPeek(@Const @ByRef Scope scope, @ByVal Input key,
          @ByVal Input indices, @Cast("const tensorflow::DataTypeSlice*") @ByRef DataTypeVector dtypes, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, key, indices, dtypes, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input key,
          @ByVal Input indices, @Cast("const tensorflow::DataTypeSlice*") @ByRef DataTypeVector dtypes, @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator []") Output get(@Cast("size_t") long index);


  public static native @ByVal Attrs Capacity(@Cast("tensorflow::int64") long x);
  public static native @ByVal Attrs MemoryLimit(@Cast("tensorflow::int64") long x);
  public static native @ByVal Attrs Container(@StringPiece BytePointer x);
  public static native @ByVal Attrs Container(@StringPiece String x);
  public static native @ByVal Attrs SharedName(@StringPiece BytePointer x);
  public static native @ByVal Attrs SharedName(@StringPiece String x);

  public native @ByRef Operation operation(); public native MapPeek operation(Operation setter);
  public native @ByRef @Cast("tensorflow::OutputList*") OutputVector values(); public native MapPeek values(OutputVector setter);
}
