// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cpython.global.python.*;



@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class _PyErr_StackItem extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public _PyErr_StackItem() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public _PyErr_StackItem(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public _PyErr_StackItem(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public _PyErr_StackItem position(long position) {
        return (_PyErr_StackItem)super.position(position);
    }
    @Override public _PyErr_StackItem getPointer(long i) {
        return new _PyErr_StackItem((Pointer)this).position(position + i);
    }

    /* This struct represents an entry on the exception stack, which is a
     * per-coroutine state. (Coroutine in the computer science sense,
     * including the thread and generators).
     * This ensures that the exception state is not impacted by "yields"
     * from an except handler.
     */
    public native PyObject exc_type(); public native _PyErr_StackItem exc_type(PyObject setter);
    public native PyObject exc_value(); public native _PyErr_StackItem exc_value(PyObject setter);
    public native PyObject exc_traceback(); public native _PyErr_StackItem exc_traceback(PyObject setter);

    public native @Cast("_err_stackitem*") _PyErr_StackItem previous_item(); public native _PyErr_StackItem previous_item(_PyErr_StackItem setter);

}
