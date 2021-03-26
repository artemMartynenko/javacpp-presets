// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.ffmpeg.avformat;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.ffmpeg.avutil.*;
import static org.bytedeco.ffmpeg.global.avutil.*;
import org.bytedeco.ffmpeg.swresample.*;
import static org.bytedeco.ffmpeg.global.swresample.*;
import org.bytedeco.ffmpeg.avcodec.*;
import static org.bytedeco.ffmpeg.global.avcodec.*;

import static org.bytedeco.ffmpeg.global.avformat.*;


/*************************************************/
/* input/output formats */

@Opaque @Properties(inherit = org.bytedeco.ffmpeg.presets.avformat.class)
public class AVCodecTag extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public AVCodecTag() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVCodecTag(Pointer p) { super(p); }
}
