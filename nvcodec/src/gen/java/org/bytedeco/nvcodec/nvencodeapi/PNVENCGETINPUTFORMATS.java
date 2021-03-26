// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.nvcodec.nvencodeapi;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;
import org.bytedeco.nvcodec.nvcuvid.*;
import static org.bytedeco.nvcodec.global.nvcuvid.*;

import static org.bytedeco.nvcodec.global.nvencodeapi.*;

@Properties(inherit = org.bytedeco.nvcodec.presets.nvencodeapi.class)
public class PNVENCGETINPUTFORMATS extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    PNVENCGETINPUTFORMATS(Pointer p) { super(p); }
    protected PNVENCGETINPUTFORMATS() { allocate(); }
    private native void allocate();
    public native @Cast("NVENCSTATUS") int call(Pointer encoder, @ByVal GUID encodeGUID, @Cast("NV_ENC_BUFFER_FORMAT*") IntPointer inputFmts, @Cast("uint32_t") int inputFmtArraySize, @Cast("uint32_t*") IntPointer inputFmtCount);
}
