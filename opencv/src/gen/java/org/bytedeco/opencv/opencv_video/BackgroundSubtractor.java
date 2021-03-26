// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_video;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;
import org.bytedeco.opencv.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;
import org.bytedeco.opencv.opencv_flann.*;
import static org.bytedeco.opencv.global.opencv_flann.*;
import org.bytedeco.opencv.opencv_features2d.*;
import static org.bytedeco.opencv.global.opencv_features2d.*;
import org.bytedeco.opencv.opencv_calib3d.*;
import static org.bytedeco.opencv.global.opencv_calib3d.*;
import org.bytedeco.opencv.opencv_dnn.*;
import static org.bytedeco.opencv.global.opencv_dnn.*;

import static org.bytedeco.opencv.global.opencv_video.*;


/** \addtogroup video_motion
 *  \{
<p>
/** \brief Base class for background/foreground segmentation. :
<p>
The class is only used to define the common interface for the whole family of background/foreground
segmentation algorithms.
 */
@Namespace("cv") @Properties(inherit = org.bytedeco.opencv.presets.opencv_video.class)
public class BackgroundSubtractor extends Algorithm {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BackgroundSubtractor(Pointer p) { super(p); }

    /** \brief Computes a foreground mask.
    <p>
    @param image Next video frame.
    @param fgmask The output foreground mask as an 8-bit binary image.
    @param learningRate The value between 0 and 1 that indicates how fast the background model is
    learnt. Negative parameter value makes the algorithm to use some automatically chosen learning
    rate. 0 means that the background model is not updated at all, 1 means that the background model
    is completely reinitialized from the last frame.
     */
    public native void apply(@ByVal Mat image, @ByVal Mat fgmask, double learningRate/*=-1*/);
    public native void apply(@ByVal Mat image, @ByVal Mat fgmask);
    public native void apply(@ByVal UMat image, @ByVal UMat fgmask, double learningRate/*=-1*/);
    public native void apply(@ByVal UMat image, @ByVal UMat fgmask);
    public native void apply(@ByVal GpuMat image, @ByVal GpuMat fgmask, double learningRate/*=-1*/);
    public native void apply(@ByVal GpuMat image, @ByVal GpuMat fgmask);

    /** \brief Computes a background image.
    <p>
    @param backgroundImage The output background image.
    <p>
    \note Sometimes the background image can be very blurry, as it contain the average background
    statistics.
     */
    public native void getBackgroundImage(@ByVal Mat backgroundImage);
    public native void getBackgroundImage(@ByVal UMat backgroundImage);
    public native void getBackgroundImage(@ByVal GpuMat backgroundImage);
}
