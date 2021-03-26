// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


@Namespace("arrow::csv") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class ConvertOptions extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ConvertOptions() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ConvertOptions(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ConvertOptions(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ConvertOptions position(long position) {
        return (ConvertOptions)super.position(position);
    }
    @Override public ConvertOptions getPointer(long i) {
        return new ConvertOptions((Pointer)this).position(position + i);
    }

  // Conversion options

  /** Whether to check UTF8 validity of string columns */
  public native @Cast("bool") boolean check_utf8(); public native ConvertOptions check_utf8(boolean setter);
  /** Optional per-column types (disabling type inference on those columns) */
  public native @ByRef StringDataTypeMap column_types(); public native ConvertOptions column_types(StringDataTypeMap setter);
  /** Recognized spellings for null values */
  public native @ByRef StringVector null_values(); public native ConvertOptions null_values(StringVector setter);
  /** Recognized spellings for boolean true values */
  public native @ByRef StringVector true_values(); public native ConvertOptions true_values(StringVector setter);
  /** Recognized spellings for boolean false values */
  
  ///
  public native @ByRef StringVector false_values(); public native ConvertOptions false_values(StringVector setter);
  /** Whether string / binary columns can have null values.
   * 
   *  If true, then strings in "null_values" are considered null for string columns.
   *  If false, then all strings are valid string values. */
  
  ///
  public native @Cast("bool") boolean strings_can_be_null(); public native ConvertOptions strings_can_be_null(boolean setter);

  /** Whether to try to automatically dict-encode string / binary data.
   *  If true, then when type inference detects a string or binary column,
   *  it is dict-encoded up to {@code auto_dict_max_cardinality} distinct values
   *  (per chunk), after which it switches to regular encoding.
   * 
   *  This setting is ignored for non-inferred columns (those in {@code column_types}). */
  public native @Cast("bool") boolean auto_dict_encode(); public native ConvertOptions auto_dict_encode(boolean setter);
  public native int auto_dict_max_cardinality(); public native ConvertOptions auto_dict_max_cardinality(int setter);

  // XXX Should we have a separate FilterOptions?

  /** If non-empty, indicates the names of columns from the CSV file that should
   *  be actually read and converted (in the vector's order).
   *  Columns not in this vector will be ignored. */
  public native @ByRef StringVector include_columns(); public native ConvertOptions include_columns(StringVector setter);
  /** If false, columns in {@code include_columns} but not in the CSV file will error out.
   *  If true, columns in {@code include_columns} but not in the CSV file will produce
   *  a column of nulls (whose type is selected using {@code column_types},
   *  or null by default)
   *  This option is ignored if {@code include_columns} is empty. */
  public native @Cast("bool") boolean include_missing_columns(); public native ConvertOptions include_missing_columns(boolean setter);

  /** User-defined timestamp parsers, using the virtual parser interface in
   *  arrow/util/value_parsing.h. More than one parser can be specified, and
   *  the CSV conversion logic will try parsing values starting from the
   *  beginning of this vector. If no parsers are specified, we use the default
   *  built-in ISO-8601 parser. */
  

  /** Create conversion options with default values, including conventional
   *  values for {@code null_values}, {@code true_values} and {@code false_values} */
  public static native @ByVal ConvertOptions Defaults();
}
