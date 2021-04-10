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


@Name("torch::optim::OptimizerCloneableOptions<torch::optim::AdamOptions>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class OptimizerCloneableAdamOptions extends OptimizerOptions {
    static { Loader.load(); }
    /** Default native constructor. */
    public OptimizerCloneableAdamOptions() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public OptimizerCloneableAdamOptions(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public OptimizerCloneableAdamOptions(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public OptimizerCloneableAdamOptions position(long position) {
        return (OptimizerCloneableAdamOptions)super.position(position);
    }
    @Override public OptimizerCloneableAdamOptions getPointer(long i) {
        return new OptimizerCloneableAdamOptions((Pointer)this).position(position + i);
    }

}
