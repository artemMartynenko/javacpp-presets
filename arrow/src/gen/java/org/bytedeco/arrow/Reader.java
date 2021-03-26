// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


// ----------------------------------------------------------------------
// Metadata accessor classes

/** \class Reader
 *  \brief An interface for reading columns from Feather files */
@Namespace("arrow::ipc::feather") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class Reader extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Reader(Pointer p) { super(p); }


  /** \brief Open a Feather file from a RandomAccessFile interface
   * 
   *  @param source [in] a RandomAccessFile instance
   *  @return the table reader */
  public static native @ByVal FeatherReaderResult Open(
        @SharedPtr @Cast({"", "std::shared_ptr<arrow::io::RandomAccessFile>"}) RandomAccessFile source);

  /** \brief Return the version number of the Feather file */
  public native int version();

  
  ///
  ///
  public native @SharedPtr @ByVal Schema schema();

  /** \brief Read all columns from the file as an arrow::Table.
   * 
   *  @param out [out] the returned table
   *  @return Status
   * 
   *  This function is zero-copy if the file source supports zero-copy reads */
  
  ///
  ///
  public native @ByVal Status Read(@SharedPtr Table out);

  /** \brief Read only the specified columns from the file as an arrow::Table.
   * 
   *  @param indices [in] the column indices to read
   *  @param out [out] the returned table
   *  @return Status
   * 
   *  This function is zero-copy if the file source supports zero-copy reads */
  
  ///
  ///
  public native @ByVal Status Read(@StdVector IntPointer indices, @SharedPtr Table out);
  public native @ByVal Status Read(@StdVector IntBuffer indices, @SharedPtr Table out);
  public native @ByVal Status Read(@StdVector int[] indices, @SharedPtr Table out);

  /** \brief Read only the specified columns from the file as an arrow::Table.
   * 
   *  @param names [in] the column names to read
   *  @param out [out] the returned table
   *  @return Status
   * 
   *  This function is zero-copy if the file source supports zero-copy reads */
  public native @ByVal Status Read(@Const @ByRef StringVector names,
                        @SharedPtr Table out);
}
