// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Update '*var' according to the Ftrl-proximal scheme.
 * 
 *  accum_new = accum + grad * grad
 *  linear += grad + (accum_new^(-lr_power) - accum^(-lr_power)) / lr * var
 *  quadratic = 1.0 / (accum_new^(lr_power) * lr) + 2 * l2
 *  var = (sign(linear) * l1 - linear) / quadratic if |linear| > l1 else 0.0
 *  accum = accum_new
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * var: Should be from a Variable().
 *  * accum: Should be from a Variable().
 *  * linear: Should be from a Variable().
 *  * grad: The gradient.
 *  * lr: Scaling factor. Must be a scalar.
 *  * l1: L1 regulariation. Must be a scalar.
 *  * l2: L2 regulariation. Must be a scalar.
 *  * lr_power: Scaling factor. Must be a scalar.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * use_locking: If {@code True}, updating of the var and accum tensors will be protected
 *  by a lock; otherwise the behavior is undefined, but may exhibit less
 *  contention.
 * 
 *  Returns:
 *  * {@code Output}: Same as "var". */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class ApplyFtrl extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ApplyFtrl(Pointer p) { super(p); }

  /** Optional attribute setters for ApplyFtrl */
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
  
    /** If {@code True}, updating of the var and accum tensors will be protected
     *  by a lock; otherwise the behavior is undefined, but may exhibit less
     *  contention.
     * 
     *  Defaults to false */
    public native @ByVal Attrs UseLocking(@Cast("bool") boolean x);

    public native @Cast("bool") boolean use_locking_(); public native Attrs use_locking_(boolean setter);
  }
  public ApplyFtrl(@Const @ByRef Scope scope, @ByVal Input var,
            @ByVal Input accum, @ByVal Input linear,
            @ByVal Input grad, @ByVal Input lr, @ByVal Input l1, @ByVal Input l2, @ByVal Input lr_power) { super((Pointer)null); allocate(scope, var, accum, linear, grad, lr, l1, l2, lr_power); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input var,
            @ByVal Input accum, @ByVal Input linear,
            @ByVal Input grad, @ByVal Input lr, @ByVal Input l1, @ByVal Input l2, @ByVal Input lr_power);
  public ApplyFtrl(@Const @ByRef Scope scope, @ByVal Input var,
            @ByVal Input accum, @ByVal Input linear,
            @ByVal Input grad, @ByVal Input lr, @ByVal Input l1, @ByVal Input l2, @ByVal Input lr_power, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, var, accum, linear, grad, lr, l1, l2, lr_power, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input var,
            @ByVal Input accum, @ByVal Input linear,
            @ByVal Input grad, @ByVal Input lr, @ByVal Input l1, @ByVal Input l2, @ByVal Input lr_power, @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public static native @ByVal Attrs UseLocking(@Cast("bool") boolean x);

  public native @ByRef Operation operation(); public native ApplyFtrl operation(Operation setter);
  public native @ByRef Output out(); public native ApplyFtrl out(Output setter);
}
