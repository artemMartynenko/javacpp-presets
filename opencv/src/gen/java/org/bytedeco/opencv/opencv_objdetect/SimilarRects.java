// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_objdetect;

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

import static org.bytedeco.opencv.global.opencv_objdetect.*;


/** \addtogroup objdetect
 *  \{
<p>
///////////////////////////// Object Detection ////////////////////////////
 <p>
 *  class for grouping object candidates, detected by Cascade Classifier, HOG etc.
 *  instance of the class is to be passed to cv::partition (see cxoperations.hpp) */
@Namespace("cv") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_objdetect.class)
public class SimilarRects extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SimilarRects(Pointer p) { super(p); }

    public SimilarRects(double _eps) { super((Pointer)null); allocate(_eps); }
    private native void allocate(double _eps);
    public native @Cast("bool") @Name("operator ()") boolean apply(@Const @ByRef Rect r1, @Const @ByRef Rect r2);
    public native double eps(); public native SimilarRects eps(double setter);
}
