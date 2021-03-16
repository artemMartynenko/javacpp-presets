// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;


/** \brief Random Number Generator
<p>
Random number generator. It encapsulates the state (currently, a 64-bit
integer) and has methods to return scalar random values and to fill
arrays with random values. Currently it supports uniform and Gaussian
(normal) distributions. The generator uses Multiply-With-Carry
algorithm, introduced by G. Marsaglia (
<http://en.wikipedia.org/wiki/Multiply-with-carry> ).
Gaussian-distribution random numbers are generated using the Ziggurat
algorithm ( <http://en.wikipedia.org/wiki/Ziggurat_algorithm> ),
introduced by G. Marsaglia and W. W. Tsang.
*/
@Namespace("cv") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class RNG extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RNG(Pointer p) { super(p); }

    /** enum cv::RNG:: */
    public static final int UNIFORM = 0,
           NORMAL  = 1;

    /** \brief constructor
    <p>
    These are the RNG constructors. The first form sets the state to some
    pre-defined value, equal to 2\*\*32-1 in the current implementation. The
    second form sets the state to the specified value. If you passed state=0
    , the constructor uses the above default value instead to avoid the
    singular random number sequence, consisting of all zeros.
    */
    public RNG() { super((Pointer)null); allocate(); }
    private native void allocate();
    /** \overload
    @param state 64-bit value used to initialize the RNG.
    */
    public RNG(@Cast("uint64") int state) { super((Pointer)null); allocate(state); }
    private native void allocate(@Cast("uint64") int state);
    /**The method updates the state using the MWC algorithm and returns the
    next 32-bit random number.*/
    public native @Cast("unsigned") int next();

    /**Each of the methods updates the state using the MWC algorithm and
    returns the next random number of the specified type. In case of integer
    types, the returned number is from the available value range for the
    specified type. In case of floating-point types, the returned value is
    from [0,1) range.
    */
    public native @Cast("uchar") @Name("operator uchar") byte asByte();
    /** \overload */
    /** \overload */
    public native @Cast("ushort") @Name("operator ushort") short asShort();
    /** \overload */
    /** \overload */
    public native @Cast("unsigned") @Name("operator unsigned") int asInt();
    /** \overload */
    /** \overload */
    public native @Name("operator float") float asFloat();
    /** \overload */
    public native @Name("operator double") double asDouble();

    /** \brief returns a random integer sampled uniformly from [0, N).
    <p>
    The methods transform the state using the MWC algorithm and return the
    next random number. The first form is equivalent to RNG::next . The
    second form returns the random number modulo N , which means that the
    result is in the range [0, N) .
    */
    public native @Cast("unsigned") @Name("operator ()") int apply();
    /** \overload
    @param N upper non-inclusive boundary of the returned random number.
    */
    public native @Cast("unsigned") @Name("operator ()") int apply(@Cast("unsigned") int N);

    /** \brief returns uniformly distributed integer random number from [a,b) range
    <p>
    The methods transform the state using the MWC algorithm and return the
    next uniformly-distributed random number of the specified type, deduced
    from the input parameter type, from the range [a, b) . There is a nuance
    illustrated by the following sample:
    <p>
    <pre>{@code {.cpp}
    RNG rng;

    // always produces 0
    double a = rng.uniform(0, 1);

    // produces double from [0, 1)
    double a1 = rng.uniform((double)0, (double)1);

    // produces float from [0, 1)
    float b = rng.uniform(0.f, 1.f);

    // produces double from [0, 1)
    double c = rng.uniform(0., 1.);

    // may cause compiler error because of ambiguity:
    //  RNG::uniform(0, (int)0.999999)? or RNG::uniform((double)0, 0.99999)?
    double d = rng.uniform(0, 0.999999);
    }</pre>
    <p>
    The compiler does not take into account the type of the variable to
    which you assign the result of RNG::uniform . The only thing that
    matters to the compiler is the type of a and b parameters. So, if you
    want a floating-point random number, but the range boundaries are
    integer numbers, either put dots in the end, if they are constants, or
    use explicit type cast operators, as in the a1 initialization above.
    @param a lower inclusive boundary of the returned random number.
    @param b upper non-inclusive boundary of the returned random number.
    */
    public native int uniform(int a, int b);
    /** \overload */
    public native float uniform(float a, float b);
    /** \overload */
    public native double uniform(double a, double b);

    /** \brief Fills arrays with random numbers.
    <p>
    @param mat 2D or N-dimensional matrix; currently matrices with more than
    4 channels are not supported by the methods, use Mat::reshape as a
    possible workaround.
    @param distType distribution type, RNG::UNIFORM or RNG::NORMAL.
    @param a first distribution parameter; in case of the uniform
    distribution, this is an inclusive lower boundary, in case of the normal
    distribution, this is a mean value.
    @param b second distribution parameter; in case of the uniform
    distribution, this is a non-inclusive upper boundary, in case of the
    normal distribution, this is a standard deviation (diagonal of the
    standard deviation matrix or the full standard deviation matrix).
    @param saturateRange pre-saturation flag; for uniform distribution only;
    if true, the method will first convert a and b to the acceptable value
    range (according to the mat datatype) and then will generate uniformly
    distributed random numbers within the range [saturate(a), saturate(b)),
    if saturateRange=false, the method will generate uniformly distributed
    random numbers in the original range [a, b) and then will saturate them,
    it means, for example, that
    <tt>theRNG().fill(mat_8u, RNG::UNIFORM, -DBL_MAX, DBL_MAX)</tt> will likely
    produce array mostly filled with 0's and 255's, since the range (0, 255)
    is significantly smaller than [-DBL_MAX, DBL_MAX).
    <p>
    Each of the methods fills the matrix with the random values from the
    specified distribution. As the new numbers are generated, the RNG state
    is updated accordingly. In case of multiple-channel images, every
    channel is filled independently, which means that RNG cannot generate
    samples from the multi-dimensional Gaussian distribution with
    non-diagonal covariance matrix directly. To do that, the method
    generates samples from multi-dimensional standard Gaussian distribution
    with zero mean and identity covariation matrix, and then transforms them
    using transform to get samples from the specified Gaussian distribution.
    */
    public native @Name("fill") void _fill( @ByVal Mat mat, int distType, @ByVal Mat a, @ByVal Mat b, @Cast("bool") boolean saturateRange/*=false*/ );
    public native @Name("fill") void _fill( @ByVal Mat mat, int distType, @ByVal Mat a, @ByVal Mat b );
    public native @Name("fill") void _fill( @ByVal UMat mat, int distType, @ByVal UMat a, @ByVal UMat b, @Cast("bool") boolean saturateRange/*=false*/ );
    public native @Name("fill") void _fill( @ByVal UMat mat, int distType, @ByVal UMat a, @ByVal UMat b );
    public native @Name("fill") void _fill( @ByVal GpuMat mat, int distType, @ByVal GpuMat a, @ByVal GpuMat b, @Cast("bool") boolean saturateRange/*=false*/ );
    public native @Name("fill") void _fill( @ByVal GpuMat mat, int distType, @ByVal GpuMat a, @ByVal GpuMat b );

    /** \brief Returns the next random number sampled from the Gaussian distribution
    @param sigma standard deviation of the distribution.
    <p>
    The method transforms the state using the MWC algorithm and returns the
    next random number from the Gaussian distribution N(0,sigma) . That is,
    the mean value of the returned random numbers is zero and the standard
    deviation is the specified sigma .
    */
    public native double gaussian(double sigma);

    public native @Cast("uint64") int state(); public native RNG state(int setter);

    public native @Cast("bool") @Name("operator ==") boolean equals(@Const @ByRef RNG other);
}
