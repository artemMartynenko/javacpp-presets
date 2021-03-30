// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;
 // namespace impl

@Namespace("c10") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class NamedTensorMetaInterface extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public NamedTensorMetaInterface() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public NamedTensorMetaInterface(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NamedTensorMetaInterface(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public NamedTensorMetaInterface position(long position) {
        return (NamedTensorMetaInterface)super.position(position);
    }
    @Override public NamedTensorMetaInterface getPointer(long i) {
        return new NamedTensorMetaInterface((Pointer)this).position(position + i);
    }

  public native @UniquePtr NamedTensorMetaInterface clone();
  public native @Cast("int64_t") long slow_dim();
}
