// Targeted by JavaCPP version 1.5.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.openpose;

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
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;
import org.bytedeco.opencv.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;
import org.bytedeco.hdf5.*;
import static org.bytedeco.hdf5.global.hdf5.*;
import org.bytedeco.caffe.*;
import static org.bytedeco.caffe.global.caffe.*;

import static org.bytedeco.openpose.global.openpose.*;

    /**
     * WrapperStructHand: Hand estimation and rendering configuration struct.
     * WrapperStructHand allows the user to set up the hand estimation and rendering parameters that will be used for
     * the OpenPose WrapperT template and Wrapper class.
     */
    @Namespace("op") @NoOffset @Properties(inherit = org.bytedeco.openpose.presets.openpose.class)
public class WrapperStructHand extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public WrapperStructHand(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public WrapperStructHand(long size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(long size);
        @Override public WrapperStructHand position(long position) {
            return (WrapperStructHand)super.position(position);
        }
        @Override public WrapperStructHand getPointer(long i) {
            return new WrapperStructHand((Pointer)this).position(position + i);
        }
    
        /**
         * Whether to extract hand.
         */
        public native @Cast("bool") boolean enable(); public native WrapperStructHand enable(boolean setter);

        /**
         * Kind of hand rectangle detector. Recommended Detector::Body (fastest one if body is enabled and most
         * accurate one), which is based on the OpenPose body keypoint detector.
         * For hand, there is the alternative of Detector::BodyWithTracking. If selected, it will add tracking
         * between frames. Adding hand tracking might improve hand keypoints detection for webcam (if the frame
         * rate is high enough, i.e., >7 FPS per GPU) and video. This is not person ID tracking, it simply looks
         * for hands in positions at which hands were located in previous frames, but it does not guarantee the
         * same person id among frames.
         */
        public native Detector detector(); public native WrapperStructHand detector(Detector setter);

        /**
         * CCN (Conv Net) input size.
         * The greater, the slower and more memory it will be needed, but it will potentially increase accuracy.
         * Both width and height must be divisible by 16.
         */
        public native @ByRef IntPoint netInputSize(); public native WrapperStructHand netInputSize(IntPoint setter);

        /**
         * Number of scales to process.
         * The greater, the slower and more memory it will be needed, but it will potentially increase accuracy.
         * This parameter is related with scaleRange, such as the final pose estimation will be an average of the
         * predicted results for each scale.
         */
        public native int scalesNumber(); public native WrapperStructHand scalesNumber(int setter);

        /**
         * Total range between smallest and biggest scale. The scales will be centered in ratio 1. E.g., if
         * scaleRange = 0.4 and scalesNumber = 2, then there will be 2 scales, 0.8 and 1.2.
         */
        public native float scaleRange(); public native WrapperStructHand scaleRange(float setter);

        /**
         * Whether to render the output (pose locations, body, background or PAF heat maps) with CPU or GPU.
         * Select {@code None} for no rendering, {@code Cpu} or {@code Gpu} por CPU and GPU rendering respectively.
         */
        public native RenderMode renderMode(); public native WrapperStructHand renderMode(RenderMode setter);

        /**
         * Rendering blending alpha value of the pose point locations with respect to the background image.
         * Value in the range [0, 1]. 0 will only render the background, 1 will fully render the pose.
         */
        public native float alphaKeypoint(); public native WrapperStructHand alphaKeypoint(float setter);

        /**
         * Rendering blending alpha value of the heat maps (hand part, background or PAF) with respect to the
         * background image.
         * Value in the range [0, 1]. 0 will only render the background, 1 will only render the heat map.
         */
        public native float alphaHeatMap(); public native WrapperStructHand alphaHeatMap(float setter);

        /**
         * Rendering threshold. Only estimated keypoints whose score confidences are higher than this value will be
         * rendered. Note: Rendered refers only to visual display in the OpenPose basic GUI, not in the saved results.
         * Generally, a high threshold (> 0.5) will only render very clear body parts; while small thresholds
         * (~0.1) will also output guessed and occluded keypoints, but also more false positives (i.e., wrong
         * detections).
         */
        public native float renderThreshold(); public native WrapperStructHand renderThreshold(float setter);

        /**
         * Constructor of the struct.
         * It has the recommended and default values we recommend for each element of the struct.
         * Since all the elements of the struct are public, they can also be manually filled.
         */
        public WrapperStructHand(
                    @Cast("const bool") boolean enable/*=false*/, Detector detector/*=op::Detector::Body*/,
                    @Const @ByRef(nullValue = "op::Point<int>{368, 368}") IntPoint netInputSize, int scalesNumber/*=1*/,
                    float scaleRange/*=0.4f*/, RenderMode renderMode/*=op::RenderMode::Auto*/,
                    float alphaKeypoint/*=HAND_DEFAULT_ALPHA_KEYPOINT*/,
                    float alphaHeatMap/*=HAND_DEFAULT_ALPHA_HEAT_MAP*/, float renderThreshold/*=0.2f*/) { super((Pointer)null); allocate(enable, detector, netInputSize, scalesNumber, scaleRange, renderMode, alphaKeypoint, alphaHeatMap, renderThreshold); }
        private native void allocate(
                    @Cast("const bool") boolean enable/*=false*/, Detector detector/*=op::Detector::Body*/,
                    @Const @ByRef(nullValue = "op::Point<int>{368, 368}") IntPoint netInputSize, int scalesNumber/*=1*/,
                    float scaleRange/*=0.4f*/, RenderMode renderMode/*=op::RenderMode::Auto*/,
                    float alphaKeypoint/*=HAND_DEFAULT_ALPHA_KEYPOINT*/,
                    float alphaHeatMap/*=HAND_DEFAULT_ALPHA_HEAT_MAP*/, float renderThreshold/*=0.2f*/);
        public WrapperStructHand() { super((Pointer)null); allocate(); }
        private native void allocate();
    }
