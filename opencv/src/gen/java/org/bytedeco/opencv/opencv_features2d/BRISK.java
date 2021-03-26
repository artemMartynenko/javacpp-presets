// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_features2d;

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

import static org.bytedeco.opencv.global.opencv_features2d.*;



/** \brief Class implementing the BRISK keypoint detector and descriptor extractor, described in \cite LCS11 .
 */
@Namespace("cv") @Properties(inherit = org.bytedeco.opencv.presets.opencv_features2d.class)
public class BRISK extends Feature2D {
    static { Loader.load(); }
    /** Default native constructor. */
    public BRISK() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public BRISK(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BRISK(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public BRISK position(long position) {
        return (BRISK)super.position(position);
    }
    @Override public BRISK getPointer(long i) {
        return new BRISK((Pointer)this).position(position + i);
    }

    /** \brief The BRISK constructor
    <p>
    @param thresh AGAST detection threshold score.
    @param octaves detection octaves. Use 0 to do single scale.
    @param patternScale apply this scale to the pattern used for sampling the neighbourhood of a
    keypoint.
     */
    public static native @Ptr BRISK create(int thresh/*=30*/, int octaves/*=3*/, float patternScale/*=1.0f*/);
    public static native @Ptr BRISK create();

    /** \brief The BRISK constructor for a custom pattern
    <p>
    @param radiusList defines the radii (in pixels) where the samples around a keypoint are taken (for
    keypoint scale 1).
    @param numberList defines the number of sampling points on the sampling circle. Must be the same
    size as radiusList..
    @param dMax threshold for the short pairings used for descriptor formation (in pixels for keypoint
    scale 1).
    @param dMin threshold for the long pairings used for orientation determination (in pixels for
    keypoint scale 1).
    @param indexChange index remapping of the bits. */
    public static native @Ptr BRISK create(@StdVector FloatPointer radiusList, @StdVector IntPointer numberList,
            float dMax/*=5.85f*/, float dMin/*=8.2f*/, @StdVector IntPointer indexChange/*=std::vector<int>()*/);
    public static native @Ptr BRISK create(@StdVector FloatPointer radiusList, @StdVector IntPointer numberList);
    public static native @Ptr BRISK create(@StdVector FloatBuffer radiusList, @StdVector IntBuffer numberList,
            float dMax/*=5.85f*/, float dMin/*=8.2f*/, @StdVector IntBuffer indexChange/*=std::vector<int>()*/);
    public static native @Ptr BRISK create(@StdVector FloatBuffer radiusList, @StdVector IntBuffer numberList);
    public static native @Ptr BRISK create(@StdVector float[] radiusList, @StdVector int[] numberList,
            float dMax/*=5.85f*/, float dMin/*=8.2f*/, @StdVector int[] indexChange/*=std::vector<int>()*/);
    public static native @Ptr BRISK create(@StdVector float[] radiusList, @StdVector int[] numberList);

    /** \brief The BRISK constructor for a custom pattern, detection threshold and octaves
    <p>
    @param thresh AGAST detection threshold score.
    @param octaves detection octaves. Use 0 to do single scale.
    @param radiusList defines the radii (in pixels) where the samples around a keypoint are taken (for
    keypoint scale 1).
    @param numberList defines the number of sampling points on the sampling circle. Must be the same
    size as radiusList..
    @param dMax threshold for the short pairings used for descriptor formation (in pixels for keypoint
    scale 1).
    @param dMin threshold for the long pairings used for orientation determination (in pixels for
    keypoint scale 1).
    @param indexChange index remapping of the bits. */
    public static native @Ptr BRISK create(int thresh, int octaves, @StdVector FloatPointer radiusList,
            @StdVector IntPointer numberList, float dMax/*=5.85f*/, float dMin/*=8.2f*/,
            @StdVector IntPointer indexChange/*=std::vector<int>()*/);
    public static native @Ptr BRISK create(int thresh, int octaves, @StdVector FloatPointer radiusList,
            @StdVector IntPointer numberList);
    public static native @Ptr BRISK create(int thresh, int octaves, @StdVector FloatBuffer radiusList,
            @StdVector IntBuffer numberList, float dMax/*=5.85f*/, float dMin/*=8.2f*/,
            @StdVector IntBuffer indexChange/*=std::vector<int>()*/);
    public static native @Ptr BRISK create(int thresh, int octaves, @StdVector FloatBuffer radiusList,
            @StdVector IntBuffer numberList);
    public static native @Ptr BRISK create(int thresh, int octaves, @StdVector float[] radiusList,
            @StdVector int[] numberList, float dMax/*=5.85f*/, float dMin/*=8.2f*/,
            @StdVector int[] indexChange/*=std::vector<int>()*/);
    public static native @Ptr BRISK create(int thresh, int octaves, @StdVector float[] radiusList,
            @StdVector int[] numberList);
    public native @Str @Override BytePointer getDefaultName();

    /** \brief Set detection threshold.
    @param threshold AGAST detection threshold score.
    */
    public native void setThreshold(int threshold);
    public native int getThreshold();

    /** \brief Set detection octaves.
    @param octaves detection octaves. Use 0 to do single scale.
    */
    public native void setOctaves(int octaves);
    public native int getOctaves();
}
