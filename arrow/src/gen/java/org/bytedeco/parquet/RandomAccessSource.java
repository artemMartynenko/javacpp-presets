// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.parquet;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;

import static org.bytedeco.arrow.global.parquet.*;


/** It is the responsibility of implementations to mind threadsafety of shared
 *  resources */
@Namespace("parquet") @Properties(inherit = org.bytedeco.arrow.presets.parquet.class)
public class RandomAccessSource extends FileInterface {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RandomAccessSource(Pointer p) { super(p); }


  public native @Cast("int64_t") long Size();

  // Returns bytes read
  public native @Cast("int64_t") long Read(@Cast("int64_t") long nbytes, @Cast("uint8_t*") BytePointer out);
  public native @Cast("int64_t") long Read(@Cast("int64_t") long nbytes, @Cast("uint8_t*") ByteBuffer out);
  public native @Cast("int64_t") long Read(@Cast("int64_t") long nbytes, @Cast("uint8_t*") byte[] out);

  public native @Cast("parquet::Buffer*") @SharedPtr ArrowBuffer Read(@Cast("int64_t") long nbytes);

  public native @Cast("parquet::Buffer*") @SharedPtr ArrowBuffer ReadAt(@Cast("int64_t") long _position, @Cast("int64_t") long nbytes);

  /** Returns bytes read */
  public native @Cast("int64_t") long ReadAt(@Cast("int64_t") long _position, @Cast("int64_t") long nbytes, @Cast("uint8_t*") BytePointer out);
  public native @Cast("int64_t") long ReadAt(@Cast("int64_t") long _position, @Cast("int64_t") long nbytes, @Cast("uint8_t*") ByteBuffer out);
  public native @Cast("int64_t") long ReadAt(@Cast("int64_t") long _position, @Cast("int64_t") long nbytes, @Cast("uint8_t*") byte[] out);
}
