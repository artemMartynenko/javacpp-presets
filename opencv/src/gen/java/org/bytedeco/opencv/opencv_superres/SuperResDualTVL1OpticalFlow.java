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



//        CV_EXPORTS Ptr<DenseOpticalFlowExt> createOptFlow_Simple();


        @Name("cv::superres::DualTVL1OpticalFlow") @Properties(inherit = org.bytedeco.opencv.presets.opencv_superres.class)
public class SuperResDualTVL1OpticalFlow extends DenseOpticalFlowExt {
            static { Loader.load(); }
            /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
            public SuperResDualTVL1OpticalFlow(Pointer p) { super(p); }
        
            /** @see setTau */
            public native double getTau();
            /** \copybrief getTau @see getTau */
            public native void setTau(double val);
            /** @see setLambda */
            public native double getLambda();
            /** \copybrief getLambda @see getLambda */
            public native void setLambda(double val);
            /** @see setTheta */
            public native double getTheta();
            /** \copybrief getTheta @see getTheta */
            public native void setTheta(double val);
            /** @see setScalesNumber */
            public native int getScalesNumber();
            /** \copybrief getScalesNumber @see getScalesNumber */
            public native void setScalesNumber(int val);
            /** @see setWarpingsNumber */
            public native int getWarpingsNumber();
            /** \copybrief getWarpingsNumber @see getWarpingsNumber */
            public native void setWarpingsNumber(int val);
            /** @see setEpsilon */
            public native double getEpsilon();
            /** \copybrief getEpsilon @see getEpsilon */
            public native void setEpsilon(double val);
            /** @see setIterations */
            public native int getIterations();
            /** \copybrief getIterations @see getIterations */
            public native void setIterations(int val);
            /** @see setUseInitialFlow */
            public native @Cast("bool") boolean getUseInitialFlow();
            /** \copybrief getUseInitialFlow @see getUseInitialFlow */
            public native void setUseInitialFlow(@Cast("bool") boolean val);
        }
