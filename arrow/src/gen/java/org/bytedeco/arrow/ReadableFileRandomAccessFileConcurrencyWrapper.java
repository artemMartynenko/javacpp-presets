// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


@Name("arrow::io::internal::RandomAccessFileConcurrencyWrapper<arrow::io::ReadableFile>") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class ReadableFileRandomAccessFileConcurrencyWrapper extends RandomAccessFile {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ReadableFileRandomAccessFileConcurrencyWrapper(Pointer p) { super(p); }

  public native @ByVal Status Close();

  public native @ByVal Status Abort();

  public native @ByVal LongResult Tell();

  public native @ByVal LongResult Read(@Cast("int64_t") long nbytes, Pointer out);

  public native @ByVal BufferResult Read(@Cast("int64_t") long nbytes);

  public native @ByVal StringViewResult Peek(@Cast("int64_t") long nbytes);

  public native @ByVal Status Seek(@Cast("int64_t") long _position);

  public native @ByVal LongResult GetSize();

  // NOTE: ReadAt doesn't use stream pointer, but it is allowed to update it
  // (it's the case on Windows when using ReadFileEx).
  // So any method that relies on the current position (even if it doesn't
  // update it, such as Peek) cannot run in parallel with ReadAt and has
  // to use the exclusive_guard.

  public native @ByVal LongResult ReadAt(@Cast("int64_t") long _position, @Cast("int64_t") long nbytes, Pointer out);

  public native @ByVal BufferResult ReadAt(@Cast("int64_t") long _position, @Cast("int64_t") long nbytes);
}
