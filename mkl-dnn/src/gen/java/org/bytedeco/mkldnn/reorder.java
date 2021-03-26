// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.mkldnn;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.mkldnn.global.mklml.*;

import static org.bytedeco.mkldnn.global.mkldnn.*;


/** \}
 <p>
 *  \addtogroup cpp_api_reorder Reorder
 *  A primitive to copy data between memory formats.
 * 
 *  @see \ref c_api_reorder in \ref c_api
 *  \{ */

@Namespace("mkldnn") @Properties(inherit = org.bytedeco.mkldnn.presets.mkldnn.class)
public class reorder extends primitive {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public reorder(Pointer p) { super(p); }

    public static class primitive_desc extends mkldnn_primitive_desc_handle {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public primitive_desc(Pointer p) { super(p); }
    
        public primitive_desc(@Const @ByRef memory.primitive_desc input,
                               @Const @ByRef memory.primitive_desc output) { super((Pointer)null); allocate(input, output); }
        private native void allocate(@Const @ByRef memory.primitive_desc input,
                               @Const @ByRef memory.primitive_desc output);

        public primitive_desc(@Const @ByRef memory.primitive_desc input,
                        @Const @ByRef memory.primitive_desc output,
                        @Const @ByRef primitive_attr aattr) { super((Pointer)null); allocate(input, output, aattr); }
        private native void allocate(@Const @ByRef memory.primitive_desc input,
                        @Const @ByRef memory.primitive_desc output,
                        @Const @ByRef primitive_attr aattr);

        public native @ByVal engine get_engine();
    }

    public reorder(@Const @ByRef primitive_desc aprimitive_desc,
                @Const @ByRef primitive.at input, @Const @ByRef memory output) { super((Pointer)null); allocate(aprimitive_desc, input, output); }
    private native void allocate(@Const @ByRef primitive_desc aprimitive_desc,
                @Const @ByRef primitive.at input, @Const @ByRef memory output);

    public reorder(@Const @ByRef primitive.at input, @Const @ByRef memory output) { super((Pointer)null); allocate(input, output); }
    private native void allocate(@Const @ByRef primitive.at input, @Const @ByRef memory output);
}
