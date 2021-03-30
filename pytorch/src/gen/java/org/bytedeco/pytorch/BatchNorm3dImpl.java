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


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ BatchNorm3d ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/** Applies the BatchNorm3d function.
 *  See https://pytorch.org/docs/master/nn.html#torch.nn.BatchNorm3d to learn
 *  about the exact behavior of this module.
 * 
 *  See the documentation for {@code torch::nn::BatchNorm3dOptions} class to learn what
 *  constructor arguments are supported for this module.
 * 
 *  Example:
 *  <pre>{@code
 *  BatchNorm3d model(BatchNorm3dOptions(4).eps(0.5).momentum(0.1).affine(false).track_running_stats(true));
 *  }</pre> */
@Namespace("torch::nn") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class BatchNorm3dImpl extends BatchNorm3dImplBase {
    static { Loader.load(); }

  
    
      public BatchNorm3dImpl(@Const @ByRef BatchNormOptions options_) { super((Pointer)null); allocate(options_); }
      private native void allocate(@Const @ByRef BatchNormOptions options_);
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BatchNorm3dImpl(Pointer p) { super(p); }

}
