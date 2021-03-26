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

@Name("caffe::DataTransformer<double>") @NoOffset @Properties(inherit = org.bytedeco.caffe.presets.caffe.class)
public class DoubleDataTransformer extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DoubleDataTransformer(Pointer p) { super(p); }

  public DoubleDataTransformer(@Const @ByRef TransformationParameter param, @Cast("caffe::Phase") int phase) { super((Pointer)null); allocate(param, phase); }
  private native void allocate(@Const @ByRef TransformationParameter param, @Cast("caffe::Phase") int phase);

  /**
   * \brief Initialize the Random number generations if needed by the
   *    transformation.
   */
  public native void InitRand();

  /**
   * \brief Applies the transformation defined in the data layer's
   * transform_param block to the data.
   *
   * @param datum
   *    Datum containing the data to be transformed.
   * @param transformed_blob
   *    This is destination blob. It can be part of top blob's data if
   *    set_cpu_data() is used. See data_layer.cpp for an example.
   */
  public native void Transform(@Const @ByRef Datum datum, DoubleBlob transformed_blob);

  /**
   * \brief Applies the transformation defined in the data layer's
   * transform_param block to a vector of Datum.
   *
   * @param datum_vector
   *    A vector of Datum containing the data to be transformed.
   * @param transformed_blob
   *    This is destination blob. It can be part of top blob's data if
   *    set_cpu_data() is used. See memory_layer.cpp for an example.
   */
  public native void Transform(@Const @ByRef DatumVector datum_vector,
                  DoubleBlob transformed_blob);

// #ifdef USE_OPENCV
  /**
   * \brief Applies the transformation defined in the data layer's
   * transform_param block to a vector of Mat.
   *
   * @param mat_vector
   *    A vector of Mat containing the data to be transformed.
   * @param transformed_blob
   *    This is destination blob. It can be part of top blob's data if
   *    set_cpu_data() is used. See memory_layer.cpp for an example.
   */
  public native void Transform(@Const @ByRef MatVector mat_vector,
                  DoubleBlob transformed_blob);

  /**
   * \brief Applies the transformation defined in the data layer's
   * transform_param block to a cv::Mat
   *
   * @param cv_img
   *    cv::Mat containing the data to be transformed.
   * @param transformed_blob
   *    This is destination blob. It can be part of top blob's data if
   *    set_cpu_data() is used. See image_data_layer.cpp for an example.
   */
  public native void Transform(@Const @ByRef Mat cv_img, DoubleBlob transformed_blob);
// #endif  // USE_OPENCV

  /**
   * \brief Applies the same transformation defined in the data layer's
   * transform_param block to all the num images in a input_blob.
   *
   * @param input_blob
   *    A Blob containing the data to be transformed. It applies the same
   *    transformation to all the num images in the blob.
   * @param transformed_blob
   *    This is destination blob, it will contain as many images as the
   *    input blob. It can be part of top blob's data.
   */
  public native void Transform(DoubleBlob input_blob, DoubleBlob transformed_blob);

  /**
   * \brief Infers the shape of transformed_blob will have when
   *    the transformation is applied to the data.
   *
   * @param datum
   *    Datum containing the data to be transformed.
   */
  public native @StdVector IntPointer InferBlobShape(@Const @ByRef Datum datum);
  /**
   * \brief Infers the shape of transformed_blob will have when
   *    the transformation is applied to the data.
   *    It uses the first element to infer the shape of the blob.
   *
   * @param datum_vector
   *    A vector of Datum containing the data to be transformed.
   */
  public native @StdVector IntPointer InferBlobShape(@Const @ByRef DatumVector datum_vector);
  /**
   * \brief Infers the shape of transformed_blob will have when
   *    the transformation is applied to the data.
   *    It uses the first element to infer the shape of the blob.
   *
   * @param mat_vector
   *    A vector of Mat containing the data to be transformed.
   */
// #ifdef USE_OPENCV
  public native @StdVector IntPointer InferBlobShape(@Const @ByRef MatVector mat_vector);
  /**
   * \brief Infers the shape of transformed_blob will have when
   *    the transformation is applied to the data.
   *
   * @param cv_img
   *    cv::Mat containing the data to be transformed.
   */
  public native @StdVector IntPointer InferBlobShape(@Const @ByRef Mat cv_img);
}
