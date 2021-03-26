// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.tensorrt.nvinfer_plugin;

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
import org.bytedeco.tensorrt.nvinfer.*;
import static org.bytedeco.tensorrt.global.nvinfer.*;

import static org.bytedeco.tensorrt.global.nvinfer_plugin.*;


/**
 *  \brief The Region plugin layer performs region proposal calculation: generate 5 bounding boxes per cell (for
 *  yolo9000, generate 3 bounding boxes per cell).
 * 
 *  For each box, calculating its probablities of objects detections from 80 pre-defined classifications (yolo9000
 *  has 9418 pre-defined classifications, and these 9418 items are organized as work-tree structure).
 *  RegionParameters defines a set of parameters for creating the Region plugin layer.
 * 
 *  @param num Number of predicted bounding box for each grid cell.
 *  @param coords Number of coordinates for a bounding box.
 *  @param classes Number of classfications to be predicted.
 *  @param softmaxTree When performing yolo9000, softmaxTree is helping to do softmax on confidence scores, for element
 *         to get the precise classfication through word-tree structured classfication definition.
 * 
 *  @deprecated . This plugin is superseded by createRegionPlugin and will be removed in TensorRT 8.0.
 *  */
@Namespace("nvinfer1::plugin") @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer_plugin.class)
public class softmaxTree extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public softmaxTree() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public softmaxTree(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public softmaxTree(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public softmaxTree position(long position) {
        return (softmaxTree)super.position(position);
    }
    @Override public softmaxTree getPointer(long i) {
        return new softmaxTree((Pointer)this).position(position + i);
    }

    public native IntPointer leaf(); public native softmaxTree leaf(IntPointer setter);
    public native int n(); public native softmaxTree n(int setter);
    public native IntPointer parent(); public native softmaxTree parent(IntPointer setter);
    public native IntPointer child(); public native softmaxTree child(IntPointer setter);
    public native IntPointer group(); public native softmaxTree group(IntPointer setter);
    public native @Cast("char*") BytePointer name(int i); public native softmaxTree name(int i, BytePointer setter);
    public native @Cast("char**") PointerPointer name(); public native softmaxTree name(PointerPointer setter);

    public native int groups(); public native softmaxTree groups(int setter);
    public native IntPointer groupSize(); public native softmaxTree groupSize(IntPointer setter);
    public native IntPointer groupOffset(); public native softmaxTree groupOffset(IntPointer setter);
}
