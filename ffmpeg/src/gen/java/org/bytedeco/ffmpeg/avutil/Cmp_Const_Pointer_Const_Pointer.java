// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.ffmpeg.avutil;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.ffmpeg.global.avutil.*;


/**
 * Find an element.
 * @param root a pointer to the root node of the tree
 * @param next If next is not NULL, then next[0] will contain the previous
 *             element and next[1] the next element. If either does not exist,
 *             then the corresponding entry in next is unchanged.
 * @param cmp compare function used to compare elements in the tree,
 *            API identical to that of Standard C's qsort
 *            It is guaranteed that the first and only the first argument to cmp()
 *            will be the key parameter to av_tree_find(), thus it could if the
 *            user wants, be a different type (like an opaque context).
 * @return An element with cmp(key, elem) == 0 or NULL if no such element
 *         exists in the tree.
 */
@Properties(inherit = org.bytedeco.ffmpeg.presets.avutil.class)
public class Cmp_Const_Pointer_Const_Pointer extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    Cmp_Const_Pointer_Const_Pointer(Pointer p) { super(p); }
    protected Cmp_Const_Pointer_Const_Pointer() { allocate(); }
    private native void allocate();
    public native int call(@Const Pointer key, @Const Pointer b);
}
