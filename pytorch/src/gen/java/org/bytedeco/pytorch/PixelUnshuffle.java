// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;


/** A {@code ModuleHolder} subclass for {@code PixelUnshuffleImpl}.
 *  See the documentation for {@code PixelUnshuffleImpl} class to learn what methods
 *  it provides, and examples of how to use {@code PixelUnshuffle} with
 *  {@code torch::nn::PixelUnshuffleOptions}. See the documentation for {@code ModuleHolder}
 *  to learn about PyTorch's module storage semantics. */
@Namespace("torch::nn") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class PixelUnshuffle extends PixelUnshuffleImplModuleHolder {
    static { Loader.load(); }

     public PixelUnshuffle(@ByVal @Cast("std::nullptr_t*") PointerPointer arg0) { super((Pointer)null); allocate(arg0); }
    private native void allocate(@ByVal @Cast("std::nullptr_t*") PointerPointer arg0); public PixelUnshuffle(@SharedPtr @Cast({"", "std::shared_ptr<torch::nn::PixelUnshuffleImpl>"}) PixelUnshuffleImpl module) { super((Pointer)null); allocate(module); }
    private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<torch::nn::PixelUnshuffleImpl>"}) PixelUnshuffleImpl module);
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PixelUnshuffle(Pointer p) { super(p); }

  }
