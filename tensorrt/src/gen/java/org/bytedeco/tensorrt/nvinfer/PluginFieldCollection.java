// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.tensorrt.nvinfer;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;
import org.bytedeco.cuda.cublas.*;
import static org.bytedeco.cuda.global.cublas.*;
import org.bytedeco.cuda.cudnn.*;
import static org.bytedeco.cuda.global.cudnn.*;
import org.bytedeco.cuda.nvrtc.*;
import static org.bytedeco.cuda.global.nvrtc.*;

import static org.bytedeco.tensorrt.global.nvinfer.*;


@Namespace("nvinfer1") @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class PluginFieldCollection extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PluginFieldCollection() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PluginFieldCollection(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PluginFieldCollection(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PluginFieldCollection position(long position) {
        return (PluginFieldCollection)super.position(position);
    }
    @Override public PluginFieldCollection getPointer(long i) {
        return new PluginFieldCollection((Pointer)this).position(position + i);
    }

    /** Number of PluginField entries */
    public native int nbFields(); public native PluginFieldCollection nbFields(int setter);
    /** Pointer to PluginField entries */
    public native @Const PluginField fields(); public native PluginFieldCollection fields(PluginField setter);
}
