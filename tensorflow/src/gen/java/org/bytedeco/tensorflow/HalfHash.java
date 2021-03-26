// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;
  // end namespace tensorflow
@Name("std::hash<tensorflow::bfloat16>") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class HalfHash extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public HalfHash() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public HalfHash(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public HalfHash(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public HalfHash position(long position) {
        return (HalfHash)super.position(position);
    }
    @Override public HalfHash getPointer(long i) {
        return new HalfHash((Pointer)this).position(position + i);
    }

  public native @Cast("std::size_t") @Name("operator ()") long apply(@Const @ByRef bfloat16 v);
}
