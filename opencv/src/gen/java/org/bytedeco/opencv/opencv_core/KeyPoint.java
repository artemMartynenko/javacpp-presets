// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;
 // namespace


/////////////////////////////// KeyPoint ////////////////////////////////

/** \brief Data structure for salient point detectors.
<p>
The class instance stores a keypoint, i.e. a point feature found by one of many available keypoint
detectors, such as Harris corner detector, #FAST, %StarDetector, %SURF, %SIFT etc.
<p>
The keypoint is characterized by the 2D position, scale (proportional to the diameter of the
neighborhood that needs to be taken into account), orientation and some other parameters. The
keypoint neighborhood is then analyzed by another algorithm that builds a descriptor (usually
represented as a feature vector). The keypoints representing the same object in different images
can then be matched using %KDTree or another method.
*/
@Namespace("cv") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class KeyPoint extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public KeyPoint(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public KeyPoint(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public KeyPoint position(long position) {
        return (KeyPoint)super.position(position);
    }
    @Override public KeyPoint getPointer(long i) {
        return new KeyPoint((Pointer)this).position(position + i);
    }

    /** the default constructor */
    public KeyPoint() { super((Pointer)null); allocate(); }
    private native void allocate();
    /**
    @param _pt x & y coordinates of the keypoint
    @param _size keypoint diameter
    @param _angle keypoint orientation
    @param _response keypoint detector response on the keypoint (that is, strength of the keypoint)
    @param _octave pyramid octave in which the keypoint has been detected
    @param _class_id object id
     */
    public KeyPoint(@ByVal Point2f _pt, float _size, float _angle/*=-1*/, float _response/*=0*/, int _octave/*=0*/, int _class_id/*=-1*/) { super((Pointer)null); allocate(_pt, _size, _angle, _response, _octave, _class_id); }
    private native void allocate(@ByVal Point2f _pt, float _size, float _angle/*=-1*/, float _response/*=0*/, int _octave/*=0*/, int _class_id/*=-1*/);
    public KeyPoint(@ByVal Point2f _pt, float _size) { super((Pointer)null); allocate(_pt, _size); }
    private native void allocate(@ByVal Point2f _pt, float _size);
    /**
    @param x x-coordinate of the keypoint
    @param y y-coordinate of the keypoint
    @param _size keypoint diameter
    @param _angle keypoint orientation
    @param _response keypoint detector response on the keypoint (that is, strength of the keypoint)
    @param _octave pyramid octave in which the keypoint has been detected
    @param _class_id object id
     */
    public KeyPoint(float x, float y, float _size, float _angle/*=-1*/, float _response/*=0*/, int _octave/*=0*/, int _class_id/*=-1*/) { super((Pointer)null); allocate(x, y, _size, _angle, _response, _octave, _class_id); }
    private native void allocate(float x, float y, float _size, float _angle/*=-1*/, float _response/*=0*/, int _octave/*=0*/, int _class_id/*=-1*/);
    public KeyPoint(float x, float y, float _size) { super((Pointer)null); allocate(x, y, _size); }
    private native void allocate(float x, float y, float _size);

    public native @Cast("size_t") long hash();

    /**
    This method converts vector of keypoints to vector of points or the reverse, where each keypoint is
    assigned the same size and the same orientation.
    <p>
    @param keypoints Keypoints obtained from any feature detection algorithm like SIFT/SURF/ORB
    @param points2f Array of (x,y) coordinates of each keypoint
    @param keypointIndexes Array of indexes of keypoints to be converted to points. (Acts like a mask to
    convert only specified keypoints)
    */
    public static native void convert(@Const @ByRef KeyPointVector keypoints,
                                    @ByRef Point2fVector points2f,
                                    @StdVector IntPointer keypointIndexes/*=std::vector<int>()*/);
    public static native void convert(@Const @ByRef KeyPointVector keypoints,
                                    @ByRef Point2fVector points2f);
    public static native void convert(@Const @ByRef KeyPointVector keypoints,
                                    @ByRef Point2fVector points2f,
                                    @StdVector IntBuffer keypointIndexes/*=std::vector<int>()*/);
    public static native void convert(@Const @ByRef KeyPointVector keypoints,
                                    @ByRef Point2fVector points2f,
                                    @StdVector int[] keypointIndexes/*=std::vector<int>()*/);
    /** \overload
    @param points2f Array of (x,y) coordinates of each keypoint
    @param keypoints Keypoints obtained from any feature detection algorithm like SIFT/SURF/ORB
    @param size keypoint diameter
    @param response keypoint detector response on the keypoint (that is, strength of the keypoint)
    @param octave pyramid octave in which the keypoint has been detected
    @param class_id object id
    */
    public static native void convert(@Const @ByRef Point2fVector points2f,
                                    @ByRef KeyPointVector keypoints,
                                    float size/*=1*/, float response/*=1*/, int octave/*=0*/, int class_id/*=-1*/);
    public static native void convert(@Const @ByRef Point2fVector points2f,
                                    @ByRef KeyPointVector keypoints);

    /**
    This method computes overlap for pair of keypoints. Overlap is the ratio between area of keypoint
    regions' intersection and area of keypoint regions' union (considering keypoint region as circle).
    If they don't overlap, we get zero. If they coincide at same location with same size, we get 1.
    @param kp1 First keypoint
    @param kp2 Second keypoint
    */
    public static native float overlap(@Const @ByRef KeyPoint kp1, @Const @ByRef KeyPoint kp2);

    /** coordinates of the keypoints */
    public native @ByRef Point2f pt(); public native KeyPoint pt(Point2f setter);
    /** diameter of the meaningful keypoint neighborhood */
    public native float size(); public native KeyPoint size(float setter);
    /** computed orientation of the keypoint (-1 if not applicable);
     *  it's in [0,360) degrees and measured relative to
     *  image coordinate system, ie in clockwise. */
    public native float angle(); public native KeyPoint angle(float setter);
    /** the response by which the most strong keypoints have been selected. Can be used for the further sorting or subsampling */
    public native float response(); public native KeyPoint response(float setter);
    /** octave (pyramid layer) from which the keypoint has been extracted */
    public native int octave(); public native KeyPoint octave(int setter);
    /** object class (if the keypoints need to be clustered by an object they belong to) */
    public native int class_id(); public native KeyPoint class_id(int setter);
}
