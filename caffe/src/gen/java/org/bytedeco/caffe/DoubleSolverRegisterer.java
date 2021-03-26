// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.caffe;

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

import static org.bytedeco.caffe.global.caffe.*;



@Name("caffe::SolverRegisterer<double>") @Properties(inherit = org.bytedeco.caffe.presets.caffe.class)
public class DoubleSolverRegisterer extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DoubleSolverRegisterer(Pointer p) { super(p); }

  public static class Creator_SolverParameter extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Creator_SolverParameter(Pointer p) { super(p); }
      protected Creator_SolverParameter() { allocate(); }
      private native void allocate();
      public native DoubleSolver call(@Const @ByRef SolverParameter arg0);
  }
  public DoubleSolverRegisterer(@StdString BytePointer type,
        Creator_SolverParameter creator) { super((Pointer)null); allocate(type, creator); }
  private native void allocate(@StdString BytePointer type,
        Creator_SolverParameter creator);
  public DoubleSolverRegisterer(@StdString String type,
        Creator_SolverParameter creator) { super((Pointer)null); allocate(type, creator); }
  private native void allocate(@StdString String type,
        Creator_SolverParameter creator);
}
