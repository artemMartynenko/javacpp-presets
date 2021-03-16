// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_xphoto;

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
import org.bytedeco.opencv.opencv_photo.*;
import static org.bytedeco.opencv.global.opencv_photo.*;

import static org.bytedeco.opencv.global.opencv_xphoto.*;


/** \brief More sophisticated learning-based automatic white balance algorithm.
<p>
As \ref GrayworldWB, this algorithm works by applying different gains to the input
image channels, but their computation is a bit more involved compared to the
simple gray-world assumption. More details about the algorithm can be found in
\cite Cheng2015 .
<p>
To mask out saturated pixels this function uses only pixels that satisfy the
following condition:
<p>
<pre>{@code \[ \frac{\textrm{max}(R,G,B)}{\texttt{range_max_val}} < \texttt{saturation_thresh} \]}</pre>
<p>
Currently supports images of type \ref CV_8UC3 and \ref CV_16UC3.
 */
@Namespace("cv::xphoto") @Properties(inherit = org.bytedeco.opencv.presets.opencv_xphoto.class)
public class LearningBasedWB extends WhiteBalancer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LearningBasedWB(Pointer p) { super(p); }

    /** \brief Implements the feature extraction part of the algorithm.
    <p>
    In accordance with \cite Cheng2015 , computes the following features for the input image:
    1. Chromaticity of an average (R,G,B) tuple
    2. Chromaticity of the brightest (R,G,B) tuple (while ignoring saturated pixels)
    3. Chromaticity of the dominant (R,G,B) tuple (the one that has the highest value in the RGB histogram)
    4. Mode of the chromaticity palette, that is constructed by taking 300 most common colors according to
       the RGB histogram and projecting them on the chromaticity plane. Mode is the most high-density point
       of the palette, which is computed by a straightforward fixed-bandwidth kernel density estimator with
       a Epanechnikov kernel function.
    <p>
    @param src Input three-channel image (BGR color space is assumed).
    @param dst An array of four (r,g) chromaticity tuples corresponding to the features listed above.
    */
    public native void extractSimpleFeatures(@ByVal Mat src, @ByVal Mat dst);
    public native void extractSimpleFeatures(@ByVal UMat src, @ByVal UMat dst);
    public native void extractSimpleFeatures(@ByVal GpuMat src, @ByVal GpuMat dst);

    /** \brief Maximum possible value of the input image (e.g. 255 for 8 bit images,
               4095 for 12 bit images)
    @see setRangeMaxVal */
    public native int getRangeMaxVal();
    /** \copybrief getRangeMaxVal @see getRangeMaxVal */
    public native void setRangeMaxVal(int val);

    /** \brief Threshold that is used to determine saturated pixels, i.e. pixels where at least one of the
        channels exceeds {@code \texttt{saturation_threshold}\times\texttt{range_max_val}} are ignored.
    @see setSaturationThreshold */
    public native float getSaturationThreshold();
    /** \copybrief getSaturationThreshold @see getSaturationThreshold */
    public native void setSaturationThreshold(float val);

    /** \brief Defines the size of one dimension of a three-dimensional RGB histogram that is used internally
        by the algorithm. It often makes sense to increase the number of bins for images with higher bit depth
        (e.g. 256 bins for a 12 bit image).
    @see setHistBinNum */
    public native int getHistBinNum();
    /** \copybrief getHistBinNum @see getHistBinNum */
    public native void setHistBinNum(int val);
}
