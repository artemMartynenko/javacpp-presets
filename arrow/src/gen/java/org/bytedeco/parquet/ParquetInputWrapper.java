// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.parquet;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;

import static org.bytedeco.arrow.global.parquet.*;


// ----------------------------------------------------------------------
// Wrapper classes

@Namespace("parquet") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.parquet.class)
public class ParquetInputWrapper extends RandomAccessFile {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ParquetInputWrapper(Pointer p) { super(p); }

  public ParquetInputWrapper(@UniquePtr RandomAccessSource source) { super((Pointer)null); allocate(source); }
  private native void allocate(@UniquePtr RandomAccessSource source);

  // FileInterface
  public native @ByVal Status Close();
  public native @ByVal LongResult Tell();
  public native @Cast("bool") boolean closed();

  // Seekable
  public native @ByVal Status Seek(@Cast("int64_t") long _position);

  // InputStream / RandomAccessFile
  public native @ByVal LongResult Read(@Cast("int64_t") long nbytes, Pointer out);
  public native @ByVal BufferResult Read(@Cast("int64_t") long nbytes);
  public native @ByVal BufferResult ReadAt(@Cast("int64_t") long _position,
                                                    @Cast("int64_t") long nbytes);
  public native @ByVal LongResult GetSize();
}
