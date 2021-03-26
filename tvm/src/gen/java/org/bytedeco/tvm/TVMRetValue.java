// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.tvm;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;
import org.bytedeco.dnnl.*;
import static org.bytedeco.dnnl.global.dnnl.*;
import org.bytedeco.llvm.LLVM.*;
import static org.bytedeco.llvm.global.LLVM.*;
import static org.bytedeco.mkl.global.mkl_rt.*;

import static org.bytedeco.tvm.global.tvm_runtime.*;


/**
 * \brief Return Value container,
 *  Unlike TVMArgValue, which only holds reference and do not delete
 *  the underlying container during destruction.
 *
 *  TVMRetValue holds value and will manage the underlying containers
 *  when it stores a complicated data type.
 */
@Namespace("tvm::runtime") @Properties(inherit = org.bytedeco.tvm.presets.tvm_runtime.class)
public class TVMRetValue extends TVMPODValue_ {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TVMRetValue(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TVMRetValue(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public TVMRetValue position(long position) {
        return (TVMRetValue)super.position(position);
    }
    @Override public TVMRetValue getPointer(long i) {
        return new TVMRetValue((Pointer)this).position(position + i);
    }

  /** \brief default constructor */
  public TVMRetValue() { super((Pointer)null); allocate(); }
  private native void allocate();
  /**
   * \brief move constructor from anoter return value.
   * @param other The other return value.
   */
  public TVMRetValue(@ByVal TVMRetValue other) { super((Pointer)null); allocate(other); }
  private native void allocate(@ByVal TVMRetValue other);
  /** \brief destructor */
  // reuse converter from parent
  // conversion operators
  public native @Name("operator std::string") @StdString BytePointer asBytePointer();
  public native @ByVal @Name("operator DLDataType") DLDataType asDLDataType();
  public native @ByVal @Name("operator tvm::runtime::DataType") DataType asDataType();
  public native @ByVal @Name("operator tvm::runtime::PackedFunc") PackedFunc asPackedFunc();
  // Assign operators
  public native @ByRef @Name("operator =") TVMRetValue put(@ByVal TVMRetValue other);
  public native @ByRef @Name("operator =") TVMRetValue put(double value);
  public native @ByRef @Name("operator =") TVMRetValue put(Pointer value);
  public native @ByRef @Name("operator =") TVMRetValue put(@Cast("int64_t") long value);
  public native @ByRef @Name("operator =") TVMRetValue put(int value);
  public native @ByRef @Name("operator =") TVMRetValue put(@ByVal @Cast("TVMContext*") DLContext value);
  public native @ByRef @Name("operator =") TVMRetValue put(@ByVal DLDataType t);
  public native @ByRef @Name("operator =") TVMRetValue put(@Const @ByRef DataType other);
  public native @ByRef @Name("operator =") TVMRetValue put(@Cast("bool") boolean value);
  public native @ByRef @Name("operator =") TVMRetValue put(@StdString BytePointer value);
  public native @ByRef @Name("operator =") TVMRetValue put(@StdString String value);
  public native @ByRef @Name("operator =") TVMRetValue put(@ByVal TVMByteArray value);
  public native @ByRef @Name("operator =") TVMRetValue put(@ByVal NDArray other);
  public native @ByRef @Name("operator =") TVMRetValue put(@ByVal Module m);
  public native @ByRef @Name("operator =") TVMRetValue put(@ByVal PackedFunc f);
  public native @ByRef @Name("operator =") TVMRetValue put(@Const @ByRef TVMArgValue other);
  public native @ByRef @Name("operator =") TVMRetValue put(@ByVal TVMMovableArgValue_ other);
  /**
   * \brief Move the value back to front-end via C API.
   *  This marks the current container as null.
   *  The managed resources are moved to the front-end.
   *  The front end should take charge in managing them.
   *
   * @param ret_value The return value.
   * @param ret_type_code The return type code.
   */
  public native void MoveToCHost(TVMValue ret_value, IntPointer ret_type_code);
  public native void MoveToCHost(TVMValue ret_value, IntBuffer ret_type_code);
  public native void MoveToCHost(TVMValue ret_value, int[] ret_type_code);
  /**
   * \brief Construct a new TVMRetValue by
   *        moving from return value stored via C API.
   * @param value the value.
   * @param type_code The type code.
   * @return The created TVMRetValue.
   */
  public static native @ByVal TVMRetValue MoveFromCHost(@ByVal TVMValue value, int type_code);
  /** @return The value field, if the data is POD */
  public native @Const @ByRef TVMValue value();
  // ObjectRef handling
}
