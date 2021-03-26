// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.onnx.global.onnx.*;

@NoOffset @Name("std::pair<int,int>") @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class UseTypeIntPair extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public UseTypeIntPair(Pointer p) { super(p); }
    public UseTypeIntPair(int firstValue, int secondValue) { this(); put(firstValue, secondValue); }
    public UseTypeIntPair()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef UseTypeIntPair put(@ByRef UseTypeIntPair x);


    @MemberGetter public native int first(); public native UseTypeIntPair first(int first);
    @MemberGetter public native int second();  public native UseTypeIntPair second(int second);

    public UseTypeIntPair put(int firstValue, int secondValue) {
        first(firstValue);
        second(secondValue);
        return this;
    }
}

