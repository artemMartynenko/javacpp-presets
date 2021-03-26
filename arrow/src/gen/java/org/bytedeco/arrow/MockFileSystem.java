// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


/** A mock FileSystem implementation that holds its contents in memory.
 * 
 *  Useful for validating the FileSystem API, writing conformance suite,
 *  and bootstrapping FileSystem-based APIs. */
@Namespace("arrow::fs::internal") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class MockFileSystem extends FileSystem {
    static { Loader.load(); }

  public MockFileSystem(@ByVal @Cast("arrow::fs::TimePoint*") Pointer current_time) { super((Pointer)null); allocate(current_time); }
  private native void allocate(@ByVal @Cast("arrow::fs::TimePoint*") Pointer current_time);

  public native @StdString String type_name();

  public native @Cast("bool") boolean Equals(@Const @ByRef FileSystem other);

  // XXX It's not very practical to have to explicitly declare inheritance
  // of default overrides.
  public native @ByVal FileInfoResult GetFileInfo(@StdString String path);
  public native @ByVal FileInfoResult GetFileInfo(@StdString BytePointer path);
  public native @ByVal FileInfoVectorResult GetFileInfo(@Const @ByRef FileSelector select);

  public native @ByVal Status CreateDir(@StdString String path, @Cast("bool") boolean recursive/*=true*/);
  public native @ByVal Status CreateDir(@StdString String path);
  public native @ByVal Status CreateDir(@StdString BytePointer path, @Cast("bool") boolean recursive/*=true*/);
  public native @ByVal Status CreateDir(@StdString BytePointer path);

  public native @ByVal Status DeleteDir(@StdString String path);
  public native @ByVal Status DeleteDir(@StdString BytePointer path);
  public native @ByVal Status DeleteDirContents(@StdString String path);
  public native @ByVal Status DeleteDirContents(@StdString BytePointer path);
  public native @ByVal Status DeleteRootDirContents();

  public native @ByVal Status DeleteFile(@StdString String path);
  public native @ByVal Status DeleteFile(@StdString BytePointer path);

  public native @ByVal Status Move(@StdString String src, @StdString String dest);
  public native @ByVal Status Move(@StdString BytePointer src, @StdString BytePointer dest);

  public native @ByVal Status CopyFile(@StdString String src, @StdString String dest);
  public native @ByVal Status CopyFile(@StdString BytePointer src, @StdString BytePointer dest);

  public native @ByVal InputStreamResult OpenInputStream(
        @StdString String path);
  public native @ByVal InputStreamResult OpenInputStream(
        @StdString BytePointer path);
  public native @ByVal RandomAccessFileResult OpenInputFile(
        @StdString String path);
  public native @ByVal RandomAccessFileResult OpenInputFile(
        @StdString BytePointer path);
  public native @ByVal OutputStreamResult OpenOutputStream(
        @StdString String path);
  public native @ByVal OutputStreamResult OpenOutputStream(
        @StdString BytePointer path);
  public native @ByVal OutputStreamResult OpenAppendStream(
        @StdString String path);
  public native @ByVal OutputStreamResult OpenAppendStream(
        @StdString BytePointer path);

  // Contents-dumping helpers to ease testing.
  // Output is lexicographically-ordered by full path.
  public native @StdVector MockDirInfo AllDirs();
  public native @StdVector MockFileInfo AllFiles();

  // Create a File with a content from a string.
  public native @ByVal Status CreateFile(@StdString String path, @StdString String content,
                      @Cast("bool") boolean recursive/*=true*/);
  public native @ByVal Status CreateFile(@StdString String path, @StdString String content);
  public native @ByVal Status CreateFile(@StdString BytePointer path, @StdString BytePointer content,
                      @Cast("bool") boolean recursive/*=true*/);
  public native @ByVal Status CreateFile(@StdString BytePointer path, @StdString BytePointer content);

  // Create a MockFileSystem out of (empty) FileInfo. The content of every
  // file is empty and of size 0. All directories will be created recursively.
  public static native @ByVal FileSystemResult Make(@ByVal @Cast("arrow::fs::TimePoint*") Pointer current_time,
                                                    @StdVector FileInfo infos);

  @Opaque public static class Impl extends Pointer {
      /** Empty constructor. Calls {@code super((Pointer)null)}. */
      public Impl() { super((Pointer)null); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Impl(Pointer p) { super(p); }
  }
}
