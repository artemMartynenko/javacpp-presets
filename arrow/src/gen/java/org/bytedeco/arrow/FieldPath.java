// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


// ----------------------------------------------------------------------
// FieldRef

/** \class FieldPath
 * 
 *  Represents a path to a nested field using indices of child fields.
 *  For example, given indices {5, 9, 3} the field would be retrieved with
 *  schema->field(5)->type()->field(9)->type()->field(3)
 * 
 *  Attempting to retrieve a child field using a FieldPath which is not valid for
 *  a given schema will raise an error. Invalid FieldPaths include:
 *  - an index is out of range
 *  - the path is empty (note: a default constructed FieldPath will be empty)
 * 
 *  FieldPaths provide a number of accessors for drilling down to potentially nested
 *  children. They are overloaded for convenience to support Schema (returns a field),
 *  DataType (returns a child field), Field (returns a child field of this field's type)
 *  Array (returns a child array), RecordBatch (returns a column). */
@Namespace("arrow") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class FieldPath extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FieldPath(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public FieldPath(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public FieldPath position(long position) {
        return (FieldPath)super.position(position);
    }
    @Override public FieldPath getPointer(long i) {
        return new FieldPath((Pointer)this).position(position + i);
    }

  public FieldPath() { super((Pointer)null); allocate(); }
  private native void allocate();

  public FieldPath(@StdVector IntPointer indices) { super((Pointer)null); allocate(indices); }
  private native void allocate(@StdVector IntPointer indices);
  public FieldPath(@StdVector IntBuffer indices) { super((Pointer)null); allocate(indices); }
  private native void allocate(@StdVector IntBuffer indices);
  public FieldPath(@StdVector int[] indices) { super((Pointer)null); allocate(indices); }
  private native void allocate(@StdVector int[] indices);

  public native @StdString String ToString();

  public native @Cast("size_t") long hash();
  public static class Hash extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public Hash() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public Hash(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Hash(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public Hash position(long position) {
          return (Hash)super.position(position);
      }
      @Override public Hash getPointer(long i) {
          return new Hash((Pointer)this).position(position + i);
      }
  
    public native @Cast("size_t") @Name("operator ()") long apply(@Const @ByRef FieldPath path);
  }

  public native @Cast("bool") boolean empty();
  public native @Cast("bool") @Name("operator ==") boolean equals(@Const @ByRef FieldPath other);
  public native @Cast("bool") @Name("operator !=") boolean notEquals(@Const @ByRef FieldPath other);

  public native @StdVector IntPointer indices();
  public native @Name("operator []") int get(@Cast("size_t") long i);
  public native @ByVal @Cast("std::vector<int>::const_iterator*") IntPointer begin();
  public native @ByVal @Cast("std::vector<int>::const_iterator*") IntPointer end();

  /** \brief Retrieve the referenced child Field from a Schema, Field, or DataType */
  
  
  
  

  /** \brief Retrieve the referenced column from a RecordBatch or Table */
  

  /** \brief Retrieve the referenced child from an Array or ArrayData */
  
  
}
