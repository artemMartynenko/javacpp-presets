// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.libfreenect2;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.libfreenect2.global.freenect2.*;


 @Namespace("libfreenect2") @Properties(inherit = org.bytedeco.libfreenect2.presets.freenect2.class)
public class DumpPacketPipeline extends PacketPipeline {
     static { Loader.load(); }
     /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
     public DumpPacketPipeline(Pointer p) { super(p); }
     /** Native array allocator. Access with {@link Pointer#position(long)}. */
     public DumpPacketPipeline(long size) { super((Pointer)null); allocateArray(size); }
     private native void allocateArray(long size);
     @Override public DumpPacketPipeline position(long position) {
         return (DumpPacketPipeline)super.position(position);
     }
     @Override public DumpPacketPipeline getPointer(long i) {
         return new DumpPacketPipeline((Pointer)this).position(position + i);
     }
 
   public DumpPacketPipeline() { super((Pointer)null); allocate(); }
   private native void allocate();

   // These are all required to decode depth data
   public native @Cast("const unsigned char*") BytePointer getDepthP0Tables(@Cast("size_t*") SizeTPointer length);

   public native @Const FloatPointer getDepthXTable(@Cast("size_t*") SizeTPointer length);
   public native @Const FloatPointer getDepthZTable(@Cast("size_t*") SizeTPointer length);
   public native @Const ShortPointer getDepthLookupTable(@Cast("size_t*") SizeTPointer length);
 }
