// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


/** \brief Contains the number of required arguments for the function.
 * 
 *  Naming conventions taken from https://en.wikipedia.org/wiki/Arity. */
@Namespace("arrow::compute") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class Arity extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Arity(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Arity(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public Arity position(long position) {
        return (Arity)super.position(position);
    }
    @Override public Arity getPointer(long i) {
        return new Arity((Pointer)this).position(position + i);
    }

  /** \brief A function taking no arguments */
  public static native @ByVal Arity Nullary();

  /** \brief A function taking 1 argument */
  public static native @ByVal Arity Unary();

  /** \brief A function taking 2 arguments */
  public static native @ByVal Arity Binary();

  /** \brief A function taking 3 arguments */
  
  ///
  public static native @ByVal Arity Ternary();

  /** \brief A function taking a variable number of arguments
   * 
   *  @param min_args [in] the minimum number of arguments required when
   *  invoking the function */
  public static native @ByVal Arity VarArgs(int min_args/*=0*/);
  public static native @ByVal Arity VarArgs();

  // NOTE: the 0-argument form (default constructor) is required for Cython
  public Arity(int num_args/*=0*/, @Cast("bool") boolean is_varargs/*=false*/) { super((Pointer)null); allocate(num_args, is_varargs); }
  private native void allocate(int num_args/*=0*/, @Cast("bool") boolean is_varargs/*=false*/);
  public Arity() { super((Pointer)null); allocate(); }
  private native void allocate();

  /** The number of required arguments (or the minimum number for varargs
   *  functions). */
  public native int num_args(); public native Arity num_args(int setter);

  /** If true, then the num_args is the minimum number of required arguments. */
  public native @Cast("bool") boolean is_varargs(); public native Arity is_varargs(boolean setter);
}
