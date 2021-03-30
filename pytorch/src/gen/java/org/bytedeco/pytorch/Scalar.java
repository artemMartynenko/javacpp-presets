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


/**
 * Scalar represents a 0-dimensional tensor which contains a single element.
 * Unlike a tensor, numeric literals (in C++) are implicitly convertible to
 * Scalar (which is why, for example, we provide both add(Tensor) and
 * add(Scalar) overloads for many operations). It may also be used in
 * circumstances where you statically know a tensor is 0-dim and single size,
 * but don't know its type.
 */
@Namespace("c10") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class Scalar extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Scalar(Pointer p) { super(p); }

  public Scalar() { super((Pointer)null); allocate(); }
  private native void allocate();

// #define DEFINE_IMPLICIT_CTOR(type, name)
//   Scalar(type vv) : Scalar(vv, true) { }

  public Scalar(@Cast("uint8_t") byte vv) { super((Pointer)null); allocate(vv); }
  private native void allocate(@Cast("uint8_t") byte vv); 
  public Scalar(short vv) { super((Pointer)null); allocate(vv); }
  private native void allocate(short vv); 
  public Scalar(int vv) { super((Pointer)null); allocate(vv); }
  private native void allocate(int vv); 
  public Scalar(@Cast("int64_t") long vv) { super((Pointer)null); allocate(vv); }
  private native void allocate(@Cast("int64_t") long vv); 
  public Scalar(float vv) { super((Pointer)null); allocate(vv); }
  private native void allocate(float vv); 
  public Scalar(double vv) { super((Pointer)null); allocate(vv); }
  private native void allocate(double vv); 
  public Scalar(@ByVal Half vv) { super((Pointer)null); allocate(vv); }
  private native void allocate(@ByVal Half vv); 
  public Scalar(@ByVal BFloat16 vv) { super((Pointer)null); allocate(vv); }
  private native void allocate(@ByVal BFloat16 vv);

// #undef DEFINE_IMPLICIT_CTOR

  // Value* is both implicitly convertible to SymbolicVariable and bool which
  // causes ambiguity error. Specialized constructor for bool resolves this
  // problem.

// #define DEFINE_ACCESSOR(type, name)
//   type to##name() const {
//     if (Tag::HAS_d == tag) {
//       return checked_convert<type, double>(v.d, #type);
//     } else if (Tag::HAS_z == tag) {
//       return checked_convert<type, c10::complex<double>>(
//           v.z, #type);
//     } if (Tag::HAS_b == tag) {
//       return checked_convert<type, bool>(v.i, #type);
//     } else {
//       return checked_convert<type, int64_t>(v.i, #type);
//     }
//   }

  // TODO: Support ComplexHalf accessor
  public native @Cast("uint8_t") byte toByte();
  public native byte toChar();
  public native short toShort();
  public native int toInt();
  public native @Cast("int64_t") long toLong();
  public native @ByVal Half toHalf();
  public native float toFloat();
  public native double toDouble();
  public native @Cast("bool") boolean toBool();
  public native @ByVal BFloat16 toBFloat16();

  // also support scalar.to<int64_t>();

// #undef DEFINE_ACCESSOR
  public native @Cast("bool") boolean isFloatingPoint();

  public native @Cast("bool") @Deprecated boolean isIntegral();
  public native @Cast("bool") boolean isIntegral(@Cast("bool") boolean includeBool);

  public native @Cast("bool") boolean isComplex();
  public native @Cast("bool") boolean isBoolean();

  public native @ByVal @Name("operator -") Scalar subtract();
  public native @ByVal Scalar conj();
  public native @ByVal Scalar log();

  public native @Cast("bool") boolean equal(@Cast("bool") boolean num);

  public native ScalarType type();
}
