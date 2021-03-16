// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;


/** \addtogroup core_optim
The algorithms in this section minimize or maximize function value within specified constraints or
without any constraints.
\{
*/

/** \brief Basic interface for all solvers
 */
@Namespace("cv") @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class MinProblemSolver extends Algorithm {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MinProblemSolver(Pointer p) { super(p); }

    /** \brief Represents function being optimized
     */
    public static class Function extends Pointer {
        static { Loader.load(); }
        /** Default native constructor. */
        public Function() { super((Pointer)null); allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public Function(long size) { super((Pointer)null); allocateArray(size); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public Function(Pointer p) { super(p); }
        private native void allocate();
        private native void allocateArray(long size);
        @Override public Function position(long position) {
            return (Function)super.position(position);
        }
        @Override public Function getPointer(long i) {
            return new Function((Pointer)this).position(position + i);
        }
    
        @Virtual(true) public native @Const({false, false, true}) int getDims();
        @Virtual public native @Const({false, false, true}) double getGradientEps();
        @Virtual(true) public native @Const({false, false, true}) double calc(@Const DoublePointer x);
        @Virtual public native void getGradient(@Const DoublePointer x,DoublePointer grad);
    }

    /** \brief Getter for the optimized function.
    <p>
    The optimized function is represented by Function interface, which requires derivatives to
    implement the calc(double*) and getDim() methods to evaluate the function.
    <p>
    @return Smart-pointer to an object that implements Function interface - it represents the
    function that is being optimized. It can be empty, if no function was given so far.
     */
    public native @Ptr Function getFunction();

    /** \brief Setter for the optimized function.
    <p>
    *It should be called at least once before the call to* minimize(), as default value is not usable.
    <p>
    @param f The new function to optimize.
     */
    public native void setFunction(@Ptr Function f);

    /** \brief Getter for the previously set terminal criteria for this algorithm.
    <p>
    @return Deep copy of the terminal criteria used at the moment.
     */
    public native @ByVal TermCriteria getTermCriteria();

    /** \brief Set terminal criteria for solver.
    <p>
    This method *is not necessary* to be called before the first call to minimize(), as the default
    value is sensible.
    <p>
    Algorithm stops when the number of function evaluations done exceeds termcrit.maxCount, when
    the function values at the vertices of simplex are within termcrit.epsilon range or simplex
    becomes so small that it can enclosed in a box with termcrit.epsilon sides, whatever comes
    first.
    @param termcrit Terminal criteria to be used, represented as cv::TermCriteria structure.
     */
    public native void setTermCriteria(@Const @ByRef TermCriteria termcrit);

    /** \brief actually runs the algorithm and performs the minimization.
    <p>
    The sole input parameter determines the centroid of the starting simplex (roughly, it tells
    where to start), all the others (terminal criteria, initial step, function to be minimized) are
    supposed to be set via the setters before the call to this method or the default values (not
    always sensible) will be used.
    <p>
    @param x The initial point, that will become a centroid of an initial simplex. After the algorithm
    will terminate, it will be set to the point where the algorithm stops, the point of possible
    minimum.
    @return The value of a function at the point found.
     */
    public native double minimize(@ByVal Mat x);
    public native double minimize(@ByVal UMat x);
    public native double minimize(@ByVal GpuMat x);
}
