// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_superres;

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
import org.bytedeco.opencv.opencv_objdetect.*;
import static org.bytedeco.opencv.global.opencv_objdetect.*;
import org.bytedeco.opencv.opencv_dnn.*;
import static org.bytedeco.opencv.global.opencv_dnn.*;
import org.bytedeco.opencv.opencv_video.*;
import static org.bytedeco.opencv.global.opencv_video.*;
import org.bytedeco.opencv.opencv_ximgproc.*;
import static org.bytedeco.opencv.global.opencv_ximgproc.*;
import org.bytedeco.opencv.opencv_optflow.*;
import static org.bytedeco.opencv.global.opencv_optflow.*;

import static org.bytedeco.opencv.global.opencv_superres.*;


        /** \brief Base class for Super Resolution algorithms.
        <p>
        The class is only used to define the common interface for the whole family of Super Resolution
        algorithms.
         */
        @Namespace("cv::superres") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_superres.class)
public class SuperResolution extends Algorithm {
            static { Loader.load(); }
            /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
            public SuperResolution(Pointer p) { super(p); }
            public FrameSource asFrameSource() { return asFrameSource(this); }
            @Namespace public static native @Name("static_cast<cv::superres::FrameSource*>") FrameSource asFrameSource(SuperResolution pointer);
        
            /** \brief Set input frame source for Super Resolution algorithm.
            <p>
            @param frameSource Input frame source
             */
            public native void setInput(@Ptr FrameSource frameSource);

            /** \brief Process next frame from input and return output result.
            <p>
            @param frame Output result
             */
            public native void nextFrame(@ByVal Mat frame);
            public native void nextFrame(@ByVal UMat frame);
            public native void nextFrame(@ByVal GpuMat frame);
            public native void reset();

            /** \brief Clear all inner buffers.
            */
            public native void collectGarbage();

            /** \brief Scale factor
            /** @see setScale */
            public native int getScale();
            /** \copybrief getScale @see getScale */
            public native void setScale(int val);

            /** \brief Iterations count
            /** @see setIterations */
            public native int getIterations();
            /** \copybrief getIterations @see getIterations */
            public native void setIterations(int val);

            /** \brief Asymptotic value of steepest descent method
            /** @see setTau */
            public native double getTau();
            /** \copybrief getTau @see getTau */
            public native void setTau(double val);

            /** \brief Weight parameter to balance data term and smoothness term
            /** @see setLambda */
            public native double getLambda();
            /** \copybrief getLambda @see getLambda */
            public native void setLambda(double val);

            /** \brief Parameter of spacial distribution in Bilateral-TV
            /** @see setAlpha */
            public native double getAlpha();
            /** \copybrief getAlpha @see getAlpha */
            public native void setAlpha(double val);

            /** \brief Kernel size of Bilateral-TV filter
            /** @see setKernelSize */
            public native int getKernelSize();
            /** \copybrief getKernelSize @see getKernelSize */
            public native void setKernelSize(int val);

            /** \brief Gaussian blur kernel size
            /** @see setBlurKernelSize */
            public native int getBlurKernelSize();
            /** \copybrief getBlurKernelSize @see getBlurKernelSize */
            public native void setBlurKernelSize(int val);

            /** \brief Gaussian blur sigma
            /** @see setBlurSigma */
            public native double getBlurSigma();
            /** \copybrief getBlurSigma @see getBlurSigma */
            public native void setBlurSigma(double val);

            /** \brief Radius of the temporal search area
            /** @see setTemporalAreaRadius */
            public native int getTemporalAreaRadius();
            /** \copybrief getTemporalAreaRadius @see getTemporalAreaRadius */
            public native void setTemporalAreaRadius(int val);

            /** \brief Dense optical flow algorithm
            /** @see setOpticalFlow */
            public native @Ptr DenseOpticalFlowExt getOpticalFlow();
            /** \copybrief getOpticalFlow @see getOpticalFlow */
            public native void setOpticalFlow(@Ptr DenseOpticalFlowExt val);
        }
