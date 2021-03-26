// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.dnnl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;

import static org.bytedeco.dnnl.global.dnnl.*;


/** \} dnnl_api_pooling_v2
 <p>
 *  \addtogroup dnnl_api_prelu PReLU
 * 
 *  PReLU primitive
 *  A primitive to perform PReLU (leaky ReLU with trainable alpha parameter)
 * 
 *  @see \ref dev_guide_prelu in developer guide
 * 
 *  \{
 <p>
 *  PReLU forward propagation primitive. */
@Namespace("dnnl") @Properties(inherit = org.bytedeco.dnnl.presets.dnnl.class)
public class prelu_forward extends primitive {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public prelu_forward(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public prelu_forward(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public prelu_forward position(long position) {
        return (prelu_forward)super.position(position);
    }
    @Override public prelu_forward getPointer(long i) {
        return new prelu_forward((Pointer)this).position(position + i);
    }

    /** Descriptor for a PReLU forward propagation primitive. */
    @NoOffset public static class desc extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public desc(Pointer p) { super(p); }
    
        
        ///
        public native @ByRef dnnl_prelu_desc_t data(); public native desc data(dnnl_prelu_desc_t setter);

        /** Constructs a descriptor for a PReLU forward propagation
         *  primitive.
         * 
         *  @param aprop_kind Propagation kind. Possible values are
         *      #dnnl::prop_kind::forward_training, and
         *      #dnnl::prop_kind::forward_inference.
         *  @param data_desc Source and destination memory descriptors.
         *  @param weight_desc Alpha parameters memory descriptor. */
        public desc(prop_kind aprop_kind, @Const @ByRef memory.desc data_desc,
                        @Const @ByRef memory.desc weight_desc) { super((Pointer)null); allocate(aprop_kind, data_desc, weight_desc); }
        private native void allocate(prop_kind aprop_kind, @Const @ByRef memory.desc data_desc,
                        @Const @ByRef memory.desc weight_desc);
        public desc(@Cast("dnnl::prop_kind") int aprop_kind, @Const @ByRef memory.desc data_desc,
                        @Const @ByRef memory.desc weight_desc) { super((Pointer)null); allocate(aprop_kind, data_desc, weight_desc); }
        private native void allocate(@Cast("dnnl::prop_kind") int aprop_kind, @Const @ByRef memory.desc data_desc,
                        @Const @ByRef memory.desc weight_desc);
    }

    /** Primitive descriptor for a PReLU forward propagation primitive. */
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

        /** Constructs a primitive descriptor for a PReLU forward
         *  propagation primitive.
         * 
         *  @param adesc Descriptor for a PReLU forward propagation
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

        /** Constructs a primitive descriptor for a PReLU forward
         *  propagation primitive.
         * 
         *  @param adesc Descriptor for a PReLU forward propagation
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

        /** Constructs a primitive descriptor for a prelu forward
         *  propagation primitive from a C API primitive descriptor that must
         *  have a matching kind.
         * 
         *  @param pd C API primitive descriptor for a prelu forward
         *      propagation primitive. */
        public primitive_desc(dnnl_primitive_desc pd) { super((Pointer)null); allocate(pd); }
        private native void allocate(dnnl_primitive_desc pd);

        /** \copydoc dnnl::primitive_desc_base::src_desc()const */
        public native @ByVal memory.desc src_desc();

        /** \copydoc dnnl::primitive_desc_base::dst_desc()const */
        public native @ByVal memory.desc dst_desc();
    }

    /** Default constructor. Produces an empty object. */
    public prelu_forward() { super((Pointer)null); allocate(); }
    private native void allocate();

    /** Constructs a prelu forward propagation primitive.
     *  @param pd Primitive descriptor for a prelu forward propagation
     *      primitive. */
    public prelu_forward(@Const @ByRef primitive_desc pd) { super((Pointer)null); allocate(pd); }
    private native void allocate(@Const @ByRef primitive_desc pd);
}
