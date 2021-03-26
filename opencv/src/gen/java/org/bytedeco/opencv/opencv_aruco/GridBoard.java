// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_aruco;

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

import static org.bytedeco.opencv.global.opencv_aruco.*;




/**
 * \brief Planar board with grid arrangement of markers
 * More common type of board. All markers are placed in the same plane in a grid arrangement.
 * The board can be drawn using drawPlanarBoard() function (@see drawPlanarBoard)
 */
@Namespace("cv::aruco") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_aruco.class)
public class GridBoard extends Board {
    static { Loader.load(); }
    /** Default native constructor. */
    public GridBoard() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public GridBoard(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public GridBoard(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public GridBoard position(long position) {
        return (GridBoard)super.position(position);
    }
    @Override public GridBoard getPointer(long i) {
        return new GridBoard((Pointer)this).position(position + i);
    }

    /**
     * \brief Draw a GridBoard
     *
     * @param outSize size of the output image in pixels.
     * @param img output image with the board. The size of this image will be outSize
     * and the board will be on the center, keeping the board proportions.
     * @param marginSize minimum margins (in pixels) of the board in the output image
     * @param borderBits width of the marker borders.
     *
     * This function return the image of the GridBoard, ready to be printed.
     */
    public native void draw(@ByVal Size outSize, @ByVal Mat img, int marginSize/*=0*/, int borderBits/*=1*/);
    public native void draw(@ByVal Size outSize, @ByVal Mat img);
    public native void draw(@ByVal Size outSize, @ByVal UMat img, int marginSize/*=0*/, int borderBits/*=1*/);
    public native void draw(@ByVal Size outSize, @ByVal UMat img);
    public native void draw(@ByVal Size outSize, @ByVal GpuMat img, int marginSize/*=0*/, int borderBits/*=1*/);
    public native void draw(@ByVal Size outSize, @ByVal GpuMat img);


    /**
     * \brief Create a GridBoard object
     *
     * @param markersX number of markers in X direction
     * @param markersY number of markers in Y direction
     * @param markerLength marker side length (normally in meters)
     * @param markerSeparation separation between two markers (same unit as markerLength)
     * @param dictionary dictionary of markers indicating the type of markers
     * @param firstMarker id of first marker in dictionary to use on board.
     * @return the output GridBoard object
     *
     * This functions creates a GridBoard object given the number of markers in each direction and
     * the marker size and marker separation.
     */
    public static native @Ptr GridBoard create(int markersX, int markersY, float markerLength,
                                             float markerSeparation, @Ptr Dictionary dictionary, int firstMarker/*=0*/);
    public static native @Ptr GridBoard create(int markersX, int markersY, float markerLength,
                                             float markerSeparation, @Ptr Dictionary dictionary);

    /**
      *
      */
    public native @ByVal Size getGridSize();

    /**
      *
      */
    public native float getMarkerLength();

    /**
      *
      */
    public native float getMarkerSeparation();
}
