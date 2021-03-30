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


/** Options for the {@code L1Loss} module.
 * 
 *  Example:
 *  <pre>{@code
 *  L1Loss model(L1LossOptions(torch::kNone));
 *  }</pre> */
@Namespace("torch::nn") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class L1LossOptions extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public L1LossOptions(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public L1LossOptions(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public L1LossOptions position(long position) {
        return (L1LossOptions)super.position(position);
    }
    @Override public L1LossOptions getPointer(long i) {
        return new L1LossOptions((Pointer)this).position(position + i);
    }


  public L1LossOptions() { super((Pointer)null); allocate(); }
  private native void allocate();
public L1LossOptions(@ByVal kNone reduction) { super((Pointer)null); allocate(reduction); }
private native void allocate(@ByVal kNone reduction);
public L1LossOptions(@ByVal kMean reduction) { super((Pointer)null); allocate(reduction); }
private native void allocate(@ByVal kMean reduction);
public L1LossOptions(@ByVal kSum reduction) { super((Pointer)null); allocate(reduction); }
private native void allocate(@ByVal kSum reduction);
  public native @Cast("torch::nn::L1LossOptions::reduction_t*") @ByRef @NoException Pointer reduction();
}
