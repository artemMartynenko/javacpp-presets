// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.dnnl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;

import static org.bytedeco.dnnl.global.dnnl.*;


/** \} dnnl_api_softmax
 <p>
 *  \addtogroup dnnl_api_logsoftmax LogSoftmax
 * 
 *  A primitive to perform logsoftmax.
 * 
 *  @see \ref dev_guide_logsoftmax in developer guide
 * 
 *  \{
 <p>
 *  Logsoftmax forward propagation primitive. */
@Namespace("dnnl") @Properties(inherit = org.bytedeco.dnnl.presets.dnnl.class)
public class logsoftmax_forward extends primitive {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public logsoftmax_forward(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public logsoftmax_forward(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public logsoftmax_forward position(long position) {
        return (logsoftmax_forward)super.position(position);
    }
    @Override public logsoftmax_forward getPointer(long i) {
        return new logsoftmax_forward((Pointer)this).position(position + i);
    }

    /** Descriptor for a logsoftmax forward propagation primitive. */
    @NoOffset public static class desc extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public desc(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public desc(long size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(long size);
        @Override public desc position(long position) {
            return (desc)super.position(position);
        }
        @Override public desc getPointer(long i) {
            return new desc((Pointer)this).position(position + i);
        }
    
        public native @ByRef @Cast("dnnl_logsoftmax_desc_t*") dnnl_softmax_desc_t data(); public native desc data(dnnl_softmax_desc_t setter);

        /** Default constructor. Produces an empty object. */
        
        ///
        public desc() { super((Pointer)null); allocate(); }
        private native void allocate();

        /** Constructs a descriptor for a logsoftmax forward propagation
         *  primitive.
         * 
         *  @param aprop_kind Propagation kind. Possible values are
         *      #dnnl::prop_kind::forward_training, and
         *      #dnnl::prop_kind::forward_inference.
         *  @param data_desc Source and destination memory descriptor.
         *  @param logsoftmax_axis Axis over which softmax is computed. */
        public desc(prop_kind aprop_kind, @Const @ByRef memory.desc data_desc,
                        int logsoftmax_axis) { super((Pointer)null); allocate(aprop_kind, data_desc, logsoftmax_axis); }
        private native void allocate(prop_kind aprop_kind, @Const @ByRef memory.desc data_desc,
                        int logsoftmax_axis);
        public desc(@Cast("dnnl::prop_kind") int aprop_kind, @Const @ByRef memory.desc data_desc,
                        int logsoftmax_axis) { super((Pointer)null); allocate(aprop_kind, data_desc, logsoftmax_axis); }
        private native void allocate(@Cast("dnnl::prop_kind") int aprop_kind, @Const @ByRef memory.desc data_desc,
                        int logsoftmax_axis);
    }

    /** Primitive descriptor for a logsoftmax forward propagation primitive. */
    public static class primitive_desc extends org.bytedeco.dnnl.primitive_desc {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public primitive_desc(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public primitive_desc(long size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(long size);
        @Override public primitive_desc position(long position) {
            return (primitive_desc)super.position(position);
        }
        @Override public primitive_desc getPointer(long i) {
            return new primitive_desc((Pointer)this).position(position + i);
        }
    
        /** Default constructor. Produces an empty object. */
        
        ///
        public primitive_desc() { super((Pointer)null); allocate(); }
        private native void allocate();

        /** Constructs a primitive descriptor for a logsoftmax forward
         *  propagation primitive.
         * 
         *  @param adesc descriptor for a logsoftmax forward propagation
         *      primitive.
         *  @param aengine Engine to use.
         *  @param allow_empty A flag signifying whether construction is
         *      allowed to fail without throwing an exception. In this case an
         *      empty object will be produced. This flag is optional and
         *      defaults to false. */
        
        ///
        public primitive_desc(@Const @ByRef desc adesc, @Const @ByRef engine aengine,
                        @Cast("bool") boolean allow_empty/*=false*/) { super((Pointer)null); allocate(adesc, aengine, allow_empty); }
        private native void allocate(@Const @ByRef desc adesc, @Const @ByRef engine aengine,
                        @Cast("bool") boolean allow_empty/*=false*/);
        public primitive_desc(@Const @ByRef desc adesc, @Const @ByRef engine aengine) { super((Pointer)null); allocate(adesc, aengine); }
        private native void allocate(@Const @ByRef desc adesc, @Const @ByRef engine aengine);

        /** Constructs a primitive descriptor for a logsoftmax forward
         *  propagation primitive.
         * 
         *  @param adesc Descriptor for a logsoftmax forward propagation
         *      primitive.
         *  @param aengine Engine to use.
         *  @param attr Primitive attributes to use.
         *  @param allow_empty A flag signifying whether construction is
         *      allowed to fail without throwing an exception. In this case an
         *      empty object will be produced. This flag is optional and
         *      defaults to false. */
        
        ///
        public primitive_desc(@Const @ByRef desc adesc, @Const @ByRef primitive_attr attr,
                        @Const @ByRef engine aengine, @Cast("bool") boolean allow_empty/*=false*/) { super((Pointer)null); allocate(adesc, attr, aengine, allow_empty); }
        private native void allocate(@Const @ByRef desc adesc, @Const @ByRef primitive_attr attr,
                        @Const @ByRef engine aengine, @Cast("bool") boolean allow_empty/*=false*/);
        public primitive_desc(@Const @ByRef desc adesc, @Const @ByRef primitive_attr attr,
                        @Const @ByRef engine aengine) { super((Pointer)null); allocate(adesc, attr, aengine); }
        private native void allocate(@Const @ByRef desc adesc, @Const @ByRef primitive_attr attr,
                        @Const @ByRef engine aengine);

        /** Constructs a primitive descriptor for a logsoftmax forward
         *  propagation primitive from a C API primitive descriptor that must
         *  have a matching kind.
         * 
         *  @param pd C API primitive descriptor for a logsoftmax forward
         *      propagation primitive. */
        public primitive_desc(dnnl_primitive_desc pd) { super((Pointer)null); allocate(pd); }
        private native void allocate(dnnl_primitive_desc pd);

        /** \copydoc dnnl::primitive_desc_base::src_desc()const */
        public native @ByVal memory.desc src_desc();

        /** \copydoc dnnl::primitive_desc_base::dst_desc()const */
        public native @ByVal memory.desc dst_desc();
    }

    /** Default constructor. Produces an empty object. */
    public logsoftmax_forward() { super((Pointer)null); allocate(); }
    private native void allocate();

    /** Constructs a logsoftmax forward propagation primitive.
     *  @param pd Primitive descriptor for a logsoftmax forward propagation
     *      primitive. */
    public logsoftmax_forward(@Const @ByRef primitive_desc pd) { super((Pointer)null); allocate(pd); }
    private native void allocate(@Const @ByRef primitive_desc pd);
}
