// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_text;

import org.bytedeco.javacpp.annotation.Index;
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
import org.bytedeco.opencv.opencv_dnn.*;
import static org.bytedeco.opencv.global.opencv_dnn.*;
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;
import org.bytedeco.opencv.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;
import org.bytedeco.opencv.opencv_flann.*;
import static org.bytedeco.opencv.global.opencv_flann.*;
import org.bytedeco.opencv.opencv_features2d.*;
import static org.bytedeco.opencv.global.opencv_features2d.*;
import org.bytedeco.opencv.opencv_ml.*;
import static org.bytedeco.opencv.global.opencv_ml.*;

import static org.bytedeco.opencv.global.opencv_text.*;


/** \addtogroup text_detect
 *  \{
<p>
/** \brief An abstract class providing interface for text detection algorithms
 */
@Namespace("cv::text") @Properties(inherit = org.bytedeco.opencv.presets.opencv_text.class)
public class TextDetector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TextDetector(Pointer p) { super(p); }

    /**
    \brief Method that provides a quick and simple interface to detect text inside an image
    <p>
    @param inputImage an image to process
    @param Bbox a vector of Rect that will store the detected word bounding box
    @param confidence a vector of float that will be updated with the confidence the classifier has for the selected bounding box
    */
    public native void detect(@ByVal Mat inputImage, @ByRef RectVector Bbox, @ByRef FloatVector confidence);
    public native void detect(@ByVal UMat inputImage, @ByRef RectVector Bbox, @ByRef FloatVector confidence);
    public native void detect(@ByVal GpuMat inputImage, @ByRef RectVector Bbox, @ByRef FloatVector confidence);
}
