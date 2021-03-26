// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.arrow_dataset;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;
import org.bytedeco.parquet.*;
import static org.bytedeco.arrow.global.parquet.*;

import static org.bytedeco.arrow.global.arrow_dataset.*;


/** \brief Project a RecordBatch to a given schema.
 * 
 *  Projected record batches will reorder columns from input record batches when possible,
 *  otherwise the given schema will be satisfied by augmenting with null or constant
 *  columns.
 * 
 *  RecordBatchProjector is most efficient when projecting record batches with a
 *  consistent schema (for example batches from a table), but it can project record
 *  batches having any schema. */
@Namespace("arrow::dataset") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow_dataset.class)
public class RecordBatchProjector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RecordBatchProjector(Pointer p) { super(p); }

  @MemberGetter public static native int kNoMatch();
  public static final int kNoMatch = kNoMatch();

  /** A column required by the given schema but absent from a record batch will be added
   *  to the projected record batch with all its slots null. */
  public RecordBatchProjector(@SharedPtr @ByVal Schema to) { super((Pointer)null); allocate(to); }
  private native void allocate(@SharedPtr @ByVal Schema to);

  /** If the indexed field is absent from a record batch it will be added to the projected
   *  record batch with all its slots equal to the provided scalar (instead of null). */
  public native @ByVal Status SetDefaultValue(@ByVal FieldRef ref, @SharedPtr @Cast({"", "std::shared_ptr<arrow::Scalar>"}) Scalar scalar);

  public native @ByVal RecordBatchResult Project(@Const @ByRef RecordBatch batch,
                                                 MemoryPool pool/*=arrow::default_memory_pool()*/);
  public native @ByVal RecordBatchResult Project(@Const @ByRef RecordBatch batch);

  public native @Const @SharedPtr @ByRef Schema schema();

  public native @ByVal Status SetInputSchema(@SharedPtr @ByVal Schema from,
                          MemoryPool pool/*=arrow::default_memory_pool()*/);
  public native @ByVal Status SetInputSchema(@SharedPtr @ByVal Schema from);
}
