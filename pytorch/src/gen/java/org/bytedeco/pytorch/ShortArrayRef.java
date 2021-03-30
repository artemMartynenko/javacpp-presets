// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;

@Name("c10::ArrayRef<jshort>") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class ShortArrayRef extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ShortArrayRef(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ShortArrayRef(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public ShortArrayRef position(long position) {
        return (ShortArrayRef)super.position(position);
    }
    @Override public ShortArrayRef getPointer(long i) {
        return new ShortArrayRef((Pointer)this).position(position + i);
    }

  /** \name Constructors
   *  \{
   <p>
   *  Construct an empty ArrayRef. */
  /* implicit */ public ShortArrayRef() { super((Pointer)null); allocate(); }
private native void allocate();

  /** Construct an ArrayRef from a single element. */
  // TODO Make this explicit
  public ShortArrayRef(short OneElt) { super((Pointer)null); allocate(OneElt); }
  private native void allocate(short OneElt);

  /** Construct an ArrayRef from a pointer and length. */
  public ShortArrayRef(@Const ShortPointer data, @Cast("size_t") long length) { super((Pointer)null); allocate(data, length); }
  private native void allocate(@Const ShortPointer data, @Cast("size_t") long length);
  public ShortArrayRef(@Const ShortBuffer data, @Cast("size_t") long length) { super((Pointer)null); allocate(data, length); }
  private native void allocate(@Const ShortBuffer data, @Cast("size_t") long length);
  public ShortArrayRef(@Const short[] data, @Cast("size_t") long length) { super((Pointer)null); allocate(data, length); }
  private native void allocate(@Const short[] data, @Cast("size_t") long length);

  /** Construct an ArrayRef from a range. */
  public ShortArrayRef(@Const ShortPointer begin, @Const ShortPointer end) { super((Pointer)null); allocate(begin, end); }
  private native void allocate(@Const ShortPointer begin, @Const ShortPointer end);
  public ShortArrayRef(@Const ShortBuffer begin, @Const ShortBuffer end) { super((Pointer)null); allocate(begin, end); }
  private native void allocate(@Const ShortBuffer begin, @Const ShortBuffer end);
  public ShortArrayRef(@Const short[] begin, @Const short[] end) { super((Pointer)null); allocate(begin, end); }
  private native void allocate(@Const short[] begin, @Const short[] end);

  /** Construct an ArrayRef from a SmallVector. This is templated in order to
   *  avoid instantiating SmallVectorTemplateCommon<T> whenever we
   *  copy-construct an ArrayRef. */

  /** Construct an ArrayRef from a std::vector. */
  // The enable_if stuff here makes sure that this isn't used for std::vector<bool>,
  // because ArrayRef can't work on a std::vector<bool> bitfield.

  /** Construct an ArrayRef from a std::array */

  /** Construct an ArrayRef from a C array. */

  /** Construct an ArrayRef from a std::initializer_list. */
  /* implicit */

  /** \}
   *  \name Simple Operations
   *  \{ */

  public native @ByVal @Cast("const c10::ArrayRef<jshort>::iterator*") ShortPointer begin();
  public native @ByVal @Cast("const c10::ArrayRef<jshort>::iterator*") ShortPointer end();

  // These are actually the same as iterator, since ArrayRef only
  // gives you const iterators.
  public native @ByVal @Cast("const c10::ArrayRef<jshort>::const_iterator*") ShortPointer cbegin();
  public native @ByVal @Cast("const c10::ArrayRef<jshort>::const_iterator*") ShortPointer cend();

  /** empty - Check if the array is empty. */
  public native @Cast("const bool") boolean empty();

  public native @Const ShortPointer data();

  /** size - Get the array size. */
  public native @Cast("const size_t") long size();

  /** front - Get the first element. */
  public native short front();

  /** back - Get the last element. */
  public native short back();

  /** equals - Check for element-wise equality. */
  public native @Cast("const bool") boolean equals(@ByVal @Cast("c10::ArrayRef<jshort>*") ShortArrayRef RHS);

  /** slice(n, m) - Take M elements of the array starting at element N */
  public native @ByVal @Cast("const c10::ArrayRef<jshort>*") ShortArrayRef slice(@Cast("size_t") long N, @Cast("size_t") long M);

  /** slice(n) - Chop off the first N elements of the array. */
  public native @ByVal @Cast("const c10::ArrayRef<jshort>*") ShortArrayRef slice(@Cast("size_t") long N);

  /** \}
   *  \name Operator Overloads
   *  \{ */
  public native @Name("operator []") short get(@Cast("size_t") long Index);

  /** Vector compatibility */
  
  ///
  public native short at(@Cast("size_t") long Index);

  /** Disallow accidental assignment from a temporary.
   * 
   *  The declaration here is extra complicated so that "arrayRef = {}"
   *  continues to select the move assignment operator. */
  

  /** Disallow accidental assignment from a temporary.
   * 
   *  The declaration here is extra complicated so that "arrayRef = {}"
   *  continues to select the move assignment operator. */
  

  /** \}
   *  \name Expensive Operations
   *  \{ */
  public native @StdVector ShortPointer vec();

  /** \} */
}
