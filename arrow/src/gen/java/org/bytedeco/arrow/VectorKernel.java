// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


/** \brief Kernel data structure for implementations of VectorFunction. In
 *  addition to the members found in ArrayKernel, contains an optional
 *  finalizer function, the null handling and memory pre-allocation preferences
 *  (which have different defaults from ScalarKernel), and some other
 *  execution-related options. */
@Namespace("arrow::compute") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class VectorKernel extends ArrayKernel {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public VectorKernel(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public VectorKernel(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public VectorKernel position(long position) {
        return (VectorKernel)super.position(position);
    }
    @Override public VectorKernel getPointer(long i) {
        return new VectorKernel((Pointer)this).position(position + i);
    }

  public VectorKernel() { super((Pointer)null); allocate(); }
  private native void allocate();

  public VectorKernel(@SharedPtr @Cast({"", "std::shared_ptr<arrow::compute::KernelSignature>"}) KernelSignature sig, @ByVal @Cast("arrow::compute::ArrayKernelExec*") Pointer exec) { super((Pointer)null); allocate(sig, exec); }
  private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<arrow::compute::KernelSignature>"}) KernelSignature sig, @ByVal @Cast("arrow::compute::ArrayKernelExec*") Pointer exec);

  public VectorKernel(@StdVector InputType in_types, @ByVal OutputType out_type, @ByVal @Cast("arrow::compute::ArrayKernelExec*") Pointer exec,
                 @ByVal(nullValue = "arrow::compute::KernelInit(nullptr)") @Cast("arrow::compute::KernelInit*") Pointer init, @ByVal(nullValue = "arrow::compute::VectorFinalize(nullptr)") @Cast("arrow::compute::VectorFinalize*") Pointer _finalize) { super((Pointer)null); allocate(in_types, out_type, exec, init, _finalize); }
  private native void allocate(@StdVector InputType in_types, @ByVal OutputType out_type, @ByVal @Cast("arrow::compute::ArrayKernelExec*") Pointer exec,
                 @ByVal(nullValue = "arrow::compute::KernelInit(nullptr)") @Cast("arrow::compute::KernelInit*") Pointer init, @ByVal(nullValue = "arrow::compute::VectorFinalize(nullptr)") @Cast("arrow::compute::VectorFinalize*") Pointer _finalize);
  public VectorKernel(@StdVector InputType in_types, @ByVal OutputType out_type, @ByVal @Cast("arrow::compute::ArrayKernelExec*") Pointer exec) { super((Pointer)null); allocate(in_types, out_type, exec); }
  private native void allocate(@StdVector InputType in_types, @ByVal OutputType out_type, @ByVal @Cast("arrow::compute::ArrayKernelExec*") Pointer exec);

  public VectorKernel(@SharedPtr @Cast({"", "std::shared_ptr<arrow::compute::KernelSignature>"}) KernelSignature sig, @ByVal @Cast("arrow::compute::ArrayKernelExec*") Pointer exec,
                 @ByVal @Cast("arrow::compute::KernelInit*") Pointer init, @ByVal(nullValue = "arrow::compute::VectorFinalize(nullptr)") @Cast("arrow::compute::VectorFinalize*") Pointer _finalize) { super((Pointer)null); allocate(sig, exec, init, _finalize); }
  private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<arrow::compute::KernelSignature>"}) KernelSignature sig, @ByVal @Cast("arrow::compute::ArrayKernelExec*") Pointer exec,
                 @ByVal @Cast("arrow::compute::KernelInit*") Pointer init, @ByVal(nullValue = "arrow::compute::VectorFinalize(nullptr)") @Cast("arrow::compute::VectorFinalize*") Pointer _finalize);
  public VectorKernel(@SharedPtr @Cast({"", "std::shared_ptr<arrow::compute::KernelSignature>"}) KernelSignature sig, @ByVal @Cast("arrow::compute::ArrayKernelExec*") Pointer exec,
                 @ByVal @Cast("arrow::compute::KernelInit*") Pointer init) { super((Pointer)null); allocate(sig, exec, init); }
  private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<arrow::compute::KernelSignature>"}) KernelSignature sig, @ByVal @Cast("arrow::compute::ArrayKernelExec*") Pointer exec,
                 @ByVal @Cast("arrow::compute::KernelInit*") Pointer init);

  /** \brief For VectorKernel, convert intermediate results into finalized
   *  results. Mutates input argument. Some kernels may accumulate state
   *  (example: hashing-related functions) through processing chunked inputs, and
   *  then need to attach some accumulated state to each of the outputs of
   *  processing each chunk of data. */
  public native @ByRef @Cast("arrow::compute::VectorFinalize*") @Name("finalize") Pointer _finalize(); public native VectorKernel _finalize(Pointer setter);

  /** Since vector kernels generally are implemented rather differently from
   *  scalar/elementwise kernels (and they may not even yield arrays of the same
   *  size), so we make the developer opt-in to any memory preallocation rather
   *  than having to turn it off. */
  public native NullHandling.type null_handling(); public native VectorKernel null_handling(NullHandling.type setter);
  public native MemAllocation.type mem_allocation(); public native VectorKernel mem_allocation(MemAllocation.type setter);

  /** Some vector kernels can do chunkwise execution using ExecBatchIterator,
   *  in some cases accumulating some state. Other kernels (like Take) need to
   *  be passed whole arrays and don't work on ChunkedArray inputs */
  
  ///
  public native @Cast("bool") boolean can_execute_chunkwise(); public native VectorKernel can_execute_chunkwise(boolean setter);

  /** Some kernels (like unique and value_counts) yield non-chunked output from
   *  chunked-array inputs. This option controls how the results are boxed when
   *  returned from ExecVectorFunction
   * 
   *  true -> ChunkedArray
   *  false -> Array */
  public native @Cast("bool") boolean output_chunked(); public native VectorKernel output_chunked(boolean setter);
}
