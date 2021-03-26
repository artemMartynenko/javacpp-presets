// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


/** A class that reads an entire CSV file into a Arrow Table */
@Namespace("arrow::csv") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class TableReader extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TableReader(Pointer p) { super(p); }


  /** Read the entire CSV file and convert it to a Arrow Table */
  public native @ByVal TableResult Read();

  /** Create a TableReader instance */
  public static native @ByVal TableReaderResult Make(MemoryPool pool,
                                                     @SharedPtr InputStream input,
                                                     @Const @ByRef ReadOptions arg2,
                                                     @Const @ByRef CsvParseOptions arg3,
                                                     @Const @ByRef ConvertOptions arg4);
}
