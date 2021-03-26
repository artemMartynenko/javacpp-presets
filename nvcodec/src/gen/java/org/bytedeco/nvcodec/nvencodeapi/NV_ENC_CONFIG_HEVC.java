// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.nvcodec.nvencodeapi;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;
import org.bytedeco.nvcodec.nvcuvid.*;
import static org.bytedeco.nvcodec.global.nvcuvid.*;

import static org.bytedeco.nvcodec.global.nvencodeapi.*;


/**
 * \struct _NV_ENC_CONFIG_HEVC
 * HEVC encoder configuration parameters to be set during initialization.
 */
@Properties(inherit = org.bytedeco.nvcodec.presets.nvencodeapi.class)
public class NV_ENC_CONFIG_HEVC extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public NV_ENC_CONFIG_HEVC() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public NV_ENC_CONFIG_HEVC(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NV_ENC_CONFIG_HEVC(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public NV_ENC_CONFIG_HEVC position(long position) {
        return (NV_ENC_CONFIG_HEVC)super.position(position);
    }
    @Override public NV_ENC_CONFIG_HEVC getPointer(long i) {
        return new NV_ENC_CONFIG_HEVC((Pointer)this).position(position + i);
    }

    /** [in]: Specifies the level of the encoded bitstream.*/
    public native @Cast("uint32_t") int level(); public native NV_ENC_CONFIG_HEVC level(int setter);
    /** [in]: Specifies the level tier of the encoded bitstream.*/
    public native @Cast("uint32_t") int tier(); public native NV_ENC_CONFIG_HEVC tier(int setter);
    /** [in]: Specifies the minimum size of luma coding unit.*/
    public native @Cast("NV_ENC_HEVC_CUSIZE") int minCUSize(); public native NV_ENC_CONFIG_HEVC minCUSize(int setter);
    /** [in]: Specifies the maximum size of luma coding unit. Currently NVENC SDK only supports maxCUSize equal to NV_ENC_HEVC_CUSIZE_32x32.*/
    public native @Cast("NV_ENC_HEVC_CUSIZE") int maxCUSize(); public native NV_ENC_CONFIG_HEVC maxCUSize(int setter);
    /** [in]: Set 1 to enable constrained intra prediction. */
    public native @Cast("uint32_t") @NoOffset int useConstrainedIntraPred(); public native NV_ENC_CONFIG_HEVC useConstrainedIntraPred(int setter);
    /** [in]: Set 1 to disable in loop filtering across slice boundary.*/
    public native @Cast("uint32_t") @NoOffset int disableDeblockAcrossSliceBoundary(); public native NV_ENC_CONFIG_HEVC disableDeblockAcrossSliceBoundary(int setter);
    /** [in]: Set 1 to write SEI buffering period syntax in the bitstream */
    public native @Cast("uint32_t") @NoOffset int outputBufferingPeriodSEI(); public native NV_ENC_CONFIG_HEVC outputBufferingPeriodSEI(int setter);
    /** [in]: Set 1 to write SEI picture timing syntax in the bitstream */
    public native @Cast("uint32_t") @NoOffset int outputPictureTimingSEI(); public native NV_ENC_CONFIG_HEVC outputPictureTimingSEI(int setter);
    /** [in]: Set 1 to write Access Unit Delimiter syntax. */
    public native @Cast("uint32_t") @NoOffset int outputAUD(); public native NV_ENC_CONFIG_HEVC outputAUD(int setter);
    /** [in]: Set to 1 to enable LTR (Long Term Reference) frame support. LTR can be used in two modes: "LTR Trust" mode and "LTR Per Picture" mode.
                                                                                   LTR Trust mode: In this mode, ltrNumFrames pictures after IDR are automatically marked as LTR. This mode is enabled by setting ltrTrustMode = 1.
                                                                                                   Use of LTR Trust mode is strongly discouraged as this mode may be deprecated in future releases.
                                                                                   LTR Per Picture mode: In this mode, client can control whether the current picture should be marked as LTR. Enable this mode by setting
                                                                                                         ltrTrustMode = 0 and ltrMarkFrame = 1 for the picture to be marked as LTR. This is the preferred mode
                                                                                                         for using LTR.
                                                                                   Note that LTRs are not supported if encoding session is configured with B-frames */
    public native @Cast("uint32_t") @NoOffset int enableLTR(); public native NV_ENC_CONFIG_HEVC enableLTR(int setter);
    /** [in]: Set 1 to disable VPS, SPS and PPS signaling in the bitstream. */
    public native @Cast("uint32_t") @NoOffset int disableSPSPPS(); public native NV_ENC_CONFIG_HEVC disableSPSPPS(int setter);
    /** [in]: Set 1 to output VPS,SPS and PPS for every IDR frame.*/
    public native @Cast("uint32_t") @NoOffset int repeatSPSPPS(); public native NV_ENC_CONFIG_HEVC repeatSPSPPS(int setter);
    /** [in]: Set 1 to enable gradual decoder refresh or intra refresh. If the GOP structure uses B frames this will be ignored */
    public native @Cast("uint32_t") @NoOffset int enableIntraRefresh(); public native NV_ENC_CONFIG_HEVC enableIntraRefresh(int setter);
    /** [in]: Specifies the chroma format. Should be set to 1 for yuv420 input, 3 for yuv444 input.*/
    public native @Cast("uint32_t") @NoOffset int chromaFormatIDC(); public native NV_ENC_CONFIG_HEVC chromaFormatIDC(int setter);
    /** [in]: Specifies pixel bit depth minus 8. Should be set to 0 for 8 bit input, 2 for 10 bit input.*/
    public native @Cast("uint32_t") @NoOffset int pixelBitDepthMinus8(); public native NV_ENC_CONFIG_HEVC pixelBitDepthMinus8(int setter);
    /** [in]: Set to 1 to enable insertion of filler data in the bitstream.
                                                                                   This flag will take effect only when one of the CBR rate
                                                                                   control modes (NV_ENC_PARAMS_RC_CBR, NV_ENC_PARAMS_RC_CBR_HQ,
                                                                                   NV_ENC_PARAMS_RC_CBR_LOWDELAY_HQ) is in use and both
                                                                                   NV_ENC_INITIALIZE_PARAMS::frameRateNum and
                                                                                   NV_ENC_INITIALIZE_PARAMS::frameRateDen are set to non-zero
                                                                                   values. Setting this field when
                                                                                   NV_ENC_INITIALIZE_PARAMS::enableOutputInVidmem is also set
                                                                                   is currently not supported and will make ::NvEncInitializeEncoder()
                                                                                   return an error. */
    public native @Cast("uint32_t") @NoOffset int enableFillerDataInsertion(); public native NV_ENC_CONFIG_HEVC enableFillerDataInsertion(int setter);
    /** [in]: Set this to 1 to enable constrainedFrame encoding where each slice in the constrained picture is independent of other slices.
                                                                                   Constrained encoding works only with rectangular slices.
                                                                                   Check support for constrained encoding using ::NV_ENC_CAPS_SUPPORT_CONSTRAINED_ENCODING caps. */
    public native @Cast("uint32_t") @NoOffset int enableConstrainedEncoding(); public native NV_ENC_CONFIG_HEVC enableConstrainedEncoding(int setter);
    /** [in]: Set this to 1 to enable HEVC encode with alpha layer. */
    public native @Cast("uint32_t") @NoOffset int enableAlphaLayerEncoding(); public native NV_ENC_CONFIG_HEVC enableAlphaLayerEncoding(int setter);
    /** [in]: Reserved bitfields.*/
    public native @Cast("uint32_t") @NoOffset int reserved(); public native NV_ENC_CONFIG_HEVC reserved(int setter);
    /** [in]: Specifies the IDR interval. If not set, this is made equal to gopLength in NV_ENC_CONFIG. Low latency application client can set IDR interval to NVENC_INFINITE_GOPLENGTH so that IDR frames are not inserted automatically. */
    public native @Cast("uint32_t") int idrPeriod(); public native NV_ENC_CONFIG_HEVC idrPeriod(int setter);
    /** [in]: Specifies the interval between successive intra refresh if enableIntrarefresh is set. Requires enableIntraRefresh to be set.
                                                                        Will be disabled if NV_ENC_CONFIG::gopLength is not set to NVENC_INFINITE_GOPLENGTH. */
    public native @Cast("uint32_t") int intraRefreshPeriod(); public native NV_ENC_CONFIG_HEVC intraRefreshPeriod(int setter);
    /** [in]: Specifies the length of intra refresh in number of frames for periodic intra refresh. This value should be smaller than intraRefreshPeriod */
    public native @Cast("uint32_t") int intraRefreshCnt(); public native NV_ENC_CONFIG_HEVC intraRefreshCnt(int setter);
    /** [in]: Specifies the maximum number of references frames in the DPB.*/
    public native @Cast("uint32_t") int maxNumRefFramesInDPB(); public native NV_ENC_CONFIG_HEVC maxNumRefFramesInDPB(int setter);
    /** [in]: This parameter has different meaning in two LTR modes.
                                                                                   In "LTR Trust" mode (ltrTrustMode = 1), encoder will mark the first ltrNumFrames base layer reference frames within each IDR interval as LTR.
                                                                                   In "LTR Per Picture" mode (ltrTrustMode = 0 and ltrMarkFrame = 1), ltrNumFrames specifies maximum number of LTR frames in DPB. */
    public native @Cast("uint32_t") int ltrNumFrames(); public native NV_ENC_CONFIG_HEVC ltrNumFrames(int setter);
    /** [in]: Specifies the VPS id of the video parameter set */
    public native @Cast("uint32_t") int vpsId(); public native NV_ENC_CONFIG_HEVC vpsId(int setter);
    /** [in]: Specifies the SPS id of the sequence header */
    public native @Cast("uint32_t") int spsId(); public native NV_ENC_CONFIG_HEVC spsId(int setter);
    /** [in]: Specifies the PPS id of the picture header */
    public native @Cast("uint32_t") int ppsId(); public native NV_ENC_CONFIG_HEVC ppsId(int setter);
    /** [in]: This parameter in conjunction with sliceModeData specifies the way in which the picture is divided into slices
                                                                                    sliceMode = 0 CTU based slices, sliceMode = 1 Byte based slices, sliceMode = 2 CTU row based slices, sliceMode = 3, numSlices in Picture
                                                                                    When sliceMode == 0 and sliceModeData == 0 whole picture will be coded with one slice */
    public native @Cast("uint32_t") int sliceMode(); public native NV_ENC_CONFIG_HEVC sliceMode(int setter);
    /** [in]: Specifies the parameter needed for sliceMode. For:
                                                                                    sliceMode = 0, sliceModeData specifies # of CTUs in each slice (except last slice)
                                                                                    sliceMode = 1, sliceModeData specifies maximum # of bytes in each slice (except last slice)
                                                                                    sliceMode = 2, sliceModeData specifies # of CTU rows in each slice (except last slice)
                                                                                    sliceMode = 3, sliceModeData specifies number of slices in the picture. Driver will divide picture into slices optimally */
    public native @Cast("uint32_t") int sliceModeData(); public native NV_ENC_CONFIG_HEVC sliceModeData(int setter);
    /** [in]: Specifies the max temporal layer used for hierarchical coding. */
    public native @Cast("uint32_t") int maxTemporalLayersMinus1(); public native NV_ENC_CONFIG_HEVC maxTemporalLayersMinus1(int setter);
    /** [in]: Specifies the HEVC video usability info parameters */
    public native @ByRef @Cast("NV_ENC_CONFIG_HEVC_VUI_PARAMETERS*") NV_ENC_CONFIG_H264_VUI_PARAMETERS hevcVUIParameters(); public native NV_ENC_CONFIG_HEVC hevcVUIParameters(NV_ENC_CONFIG_H264_VUI_PARAMETERS setter);
    /** [in]: Specifies the LTR operating mode. See comments near NV_ENC_CONFIG_HEVC::enableLTR for description of the two modes.
                                                                                   Set to 1 to use "LTR Trust" mode of LTR operation. Clients are discouraged to use "LTR Trust" mode as this mode may 
                                                                                   be deprecated in future releases.
                                                                                   Set to 0 when using "LTR Per Picture" mode of LTR operation. */
    public native @Cast("uint32_t") int ltrTrustMode(); public native NV_ENC_CONFIG_HEVC ltrTrustMode(int setter);
    /** [in]: Specifies the B-Frame as reference mode. Check support for useBFramesAsRef mode using  ::NV_ENC_CAPS_SUPPORT_BFRAME_REF_MODE caps.*/
    public native @Cast("NV_ENC_BFRAME_REF_MODE") int useBFramesAsRef(); public native NV_ENC_CONFIG_HEVC useBFramesAsRef(int setter);
    /** [in]: Specifies max number of reference frames in reference picture list L0, that can be used by hardware for prediction of a frame. 
                                                                                   Check support for numRefL0 using ::NV_ENC_CAPS_SUPPORT_MULTIPLE_REF_FRAMES caps. */
    public native @Cast("NV_ENC_NUM_REF_FRAMES") int numRefL0(); public native NV_ENC_CONFIG_HEVC numRefL0(int setter);
    /** [in]: Specifies max number of reference frames in reference picture list L1, that can be used by hardware for prediction of a frame. 
                                                                                   Check support for numRefL1 using ::NV_ENC_CAPS_SUPPORT_MULTIPLE_REF_FRAMES caps. */
    public native @Cast("NV_ENC_NUM_REF_FRAMES") int numRefL1(); public native NV_ENC_CONFIG_HEVC numRefL1(int setter);
    /** [in]: Reserved and must be set to 0.*/
    public native @Cast("uint32_t") int reserved1(int i); public native NV_ENC_CONFIG_HEVC reserved1(int i, int setter);
    @MemberGetter public native @Cast("uint32_t*") IntPointer reserved1();
    /** [in]: Reserved and must be set to NULL */
    public native Pointer reserved2(int i); public native NV_ENC_CONFIG_HEVC reserved2(int i, Pointer setter);
    @MemberGetter public native @Cast("void**") PointerPointer reserved2();
}
