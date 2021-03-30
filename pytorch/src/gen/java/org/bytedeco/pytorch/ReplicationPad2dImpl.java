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


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ ReplicationPad2d ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/** Applies ReplicationPad over a 2-D input.
 *  See https://pytorch.org/docs/master/nn.html#torch.nn.ReplicationPad2d to learn
 *  about the exact behavior of this module.
 * 
 *  See the documentation for {@code torch::nn::ReplicationPad2dOptions} class to learn what
 *  constructor arguments are supported for this module.
 * 
 *  Example:
 *  <pre>{@code
 *  ReplicationPad2d model(ReplicationPad2dOptions({1, 1, 2, 0}));
 *  }</pre> */
@Namespace("torch::nn") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class ReplicationPad2dImpl extends ReplicationPad2dImplBase {
    static { Loader.load(); }

  
    public ReplicationPad2dImpl(@ByVal @Cast("torch::ExpandingArray<2*2>*") LongPointer padding) { super((Pointer)null); allocate(padding); }
    @NoDeallocator private native void allocate(@ByVal @Cast("torch::ExpandingArray<2*2>*") LongPointer padding);
    public ReplicationPad2dImpl(@Const @ByRef ReplicationPad2dOptions options_) { super((Pointer)null); allocate(options_); }
    @NoDeallocator private native void allocate(@Const @ByRef ReplicationPad2dOptions options_);
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ReplicationPad2dImpl(Pointer p) { super(p); }

}
