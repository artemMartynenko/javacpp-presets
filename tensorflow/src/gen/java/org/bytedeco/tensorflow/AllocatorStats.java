// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// Runtime statistics collected by an allocator. Exactly the same as
// stream_executor::AllocatorStats, but independently defined to preserve the
// mutual independence of StreamExecutor and TensorFlow.
@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class AllocatorStats extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AllocatorStats(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AllocatorStats(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public AllocatorStats position(long position) {
        return (AllocatorStats)super.position(position);
    }
    @Override public AllocatorStats getPointer(long i) {
        return new AllocatorStats((Pointer)this).position(position + i);
    }

  public native @Cast("tensorflow::int64") long num_allocs(); public native AllocatorStats num_allocs(long setter);          // Number of allocations.
  public native @Cast("tensorflow::int64") long bytes_in_use(); public native AllocatorStats bytes_in_use(long setter);        // Number of bytes in use.
  public native @Cast("tensorflow::int64") long peak_bytes_in_use(); public native AllocatorStats peak_bytes_in_use(long setter);   // The peak bytes in use.
  public native @Cast("tensorflow::int64") long largest_alloc_size(); public native AllocatorStats largest_alloc_size(long setter);  // The largest single allocation seen.

  // The upper limit of bytes of user allocatable device memory, if such a limit
  // is known.

  // Stats for reserved memory usage.
  public native @Cast("tensorflow::int64") long bytes_reserved(); public native AllocatorStats bytes_reserved(long setter);       // Number of bytes reserved.
  public native @Cast("tensorflow::int64") long peak_bytes_reserved(); public native AllocatorStats peak_bytes_reserved(long setter);  // The peak number of bytes reserved.
  // The upper limit on the number bytes of reservable memory,
  // if such a limit is known.

  public AllocatorStats() { super((Pointer)null); allocate(); }
  private native void allocate();

  public native @StdString BytePointer DebugString();
}
