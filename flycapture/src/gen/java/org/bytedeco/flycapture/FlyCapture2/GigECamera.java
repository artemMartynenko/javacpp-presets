// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.flycapture.FlyCapture2;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.flycapture.global.FlyCapture2.*;

	/**
	 * The GigECamera object represents a physical Gigabit Ethernet camera.
	 * The object must first be connected to using Connect() before any
	 * other operations can proceed.
	 *
	 * Please see Camera.h for basic functions that this class inherits from.
	 *
	 * \nosubgrouping
	 */
	@Namespace("FlyCapture2") @Properties(inherit = org.bytedeco.flycapture.presets.FlyCapture2.class)
public class GigECamera extends CameraBase {
	    static { Loader.load(); }
	    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
	    public GigECamera(Pointer p) { super(p); }
	    /** Native array allocator. Access with {@link Pointer#position(long)}. */
	    public GigECamera(long size) { super((Pointer)null); allocateArray(size); }
	    private native void allocateArray(long size);
	    @Override public GigECamera position(long position) {
	        return (GigECamera)super.position(position);
	    }
	    @Override public GigECamera getPointer(long i) {
	        return new GigECamera((Pointer)this).position(position + i);
	    }
	

			/**
			 * Default constructor.
			 */
			public GigECamera() { super((Pointer)null); allocate(); }
			private native void allocate();

			/**
			 * Default destructor.
			 */

			/**
			 * \name GVCP Register Operation
			 *
			 * These functions deal with GVCP register operation on the camera.
			 */
			/*@{*/

			/**
			 * Write a GVCP register.
			 *
			 * @param address GVCP address to be written to.
			 * @param value The value to be written.
			 * @param broadcast Whether the action should be broadcast.
			 *
			 * @return An Error indicating the success or failure of the function.
			 */
			public native @ByVal Error WriteGVCPRegister(
								@Cast("unsigned int") int _address,
								@Cast("unsigned int") int value,
								@Cast("bool") boolean broadcast/*=false*/);
			public native @ByVal Error WriteGVCPRegister(
								@Cast("unsigned int") int _address,
								@Cast("unsigned int") int value);

			/**
			 * Read a GVCP register.
			 *
			 * @param address GVCP address to be read from.
			 * @param pValue The value that is read.
			 *
			 * @return An Error indicating the success or failure of the function.
			 */
			public native @ByVal Error ReadGVCPRegister(
								@Cast("unsigned int") int _address,
								@Cast("unsigned int*") IntPointer pValue );
			public native @ByVal Error ReadGVCPRegister(
								@Cast("unsigned int") int _address,
								@Cast("unsigned int*") IntBuffer pValue );
			public native @ByVal Error ReadGVCPRegister(
								@Cast("unsigned int") int _address,
								@Cast("unsigned int*") int[] pValue );

			/**
			 * Write a GVCP register block.
			 *
			 * @param address GVCP address to be write to.
			 * @param pBuffer Array containing data to be written.
			 * @param length Size of array, in quadlets.
			 *
			 * @return An Error indicating the success or failure of the function.
			 */
			public native @ByVal Error WriteGVCPRegisterBlock(
								@Cast("unsigned int") int _address,
								@Cast("const unsigned int*") IntPointer pBuffer,
								@Cast("unsigned int") int length );
			public native @ByVal Error WriteGVCPRegisterBlock(
								@Cast("unsigned int") int _address,
								@Cast("const unsigned int*") IntBuffer pBuffer,
								@Cast("unsigned int") int length );
			public native @ByVal Error WriteGVCPRegisterBlock(
								@Cast("unsigned int") int _address,
								@Cast("const unsigned int*") int[] pBuffer,
								@Cast("unsigned int") int length );

			/**
			 * Read a GVCP register block.
			 *
			 * @param address GVCP address to be read from.
			 * @param pBuffer Array for data to be read into.
			 * @param length Size of array, in quadlets.
			 *
			 * @return An Error indicating the success or failure of the function.
			 */
			public native @ByVal Error ReadGVCPRegisterBlock(
								@Cast("unsigned int") int _address,
								@Cast("unsigned int*") IntPointer pBuffer,
								@Cast("unsigned int") int length );
			public native @ByVal Error ReadGVCPRegisterBlock(
								@Cast("unsigned int") int _address,
								@Cast("unsigned int*") IntBuffer pBuffer,
								@Cast("unsigned int") int length );
			public native @ByVal Error ReadGVCPRegisterBlock(
								@Cast("unsigned int") int _address,
								@Cast("unsigned int*") int[] pBuffer,
								@Cast("unsigned int") int length );

			/**
			 * Write a GVCP Memory block.
			 *
			 * @param address GVCP address to be write to.
			 * @param pBuffer Array containing data to be written in increments.
			 * @param length Size of array, in quadlets.
			 *
			 * @return An Error indicating the success or failure of the function.
			 */
			public native @ByVal Error WriteGVCPMemory(
								@Cast("unsigned int") int _address,
								@Cast("const unsigned char*") BytePointer pBuffer,
								@Cast("unsigned int") int length );
			public native @ByVal Error WriteGVCPMemory(
								@Cast("unsigned int") int _address,
								@Cast("const unsigned char*") ByteBuffer pBuffer,
								@Cast("unsigned int") int length );
			public native @ByVal Error WriteGVCPMemory(
								@Cast("unsigned int") int _address,
								@Cast("const unsigned char*") byte[] pBuffer,
								@Cast("unsigned int") int length );

			/**
			 * Read a GVCP memory block.
			 *
			 * @param address GVCP address to be read from.
			 * @param pBuffer Array for data to be read into.
			 * @param length Size of array, in quadlets.
			 *
			 * @return An Error indicating the success or failure of the function.
			 */
			public native @ByVal Error ReadGVCPMemory(
								@Cast("unsigned int") int _address,
								@Cast("unsigned char*") BytePointer pBuffer,
								@Cast("unsigned int") int length );
			public native @ByVal Error ReadGVCPMemory(
								@Cast("unsigned int") int _address,
								@Cast("unsigned char*") ByteBuffer pBuffer,
								@Cast("unsigned int") int length );
			public native @ByVal Error ReadGVCPMemory(
								@Cast("unsigned int") int _address,
								@Cast("unsigned char*") byte[] pBuffer,
								@Cast("unsigned int") int length );

			/*@}*/

			/**
			 * \name GigE property manipulation
			 *
			 * These functions deal with GigE properties.
			 */
			/*@{*/

			/**
			 * Get the specified GigEProperty. The GigEPropertyType field must
			 * be set in order for this function to succeed.
			 *
			 * @param pGigEProp The GigE property to get.
			 *
			 * @return An Error indicating the success or failure of the function.
			 */
			public native @ByVal Error GetGigEProperty( GigEProperty pGigEProp );

			/**
			 * Set the specified GigEProperty. The GigEPropertyType field must
			 * be set in order for this function to succeed.
			 *
			 * @param pGigEProp The GigE property to set.
			 *
			 * @return An Error indicating the success or failure of the function.
			 */
			public native @ByVal Error SetGigEProperty( @Const GigEProperty pGigEProp );

			/**
			 * Discover the largest packet size that works for the network link
			 * between the PC and the camera. This is useful in cases where
			 * there may be multiple links between the PC and the camera and
			 * there is a possiblity of a component not supporting the
			 * recommended jumbo frame packet size of 9000.
			 *
			 * @param packetSize The maximum packet size supported by the link.
			 *
			 * @return An Error indicating the success or failure of the function.
			 */
			public native @ByVal Error DiscoverGigEPacketSize( @Cast("unsigned int*") IntPointer packetSize );
			public native @ByVal Error DiscoverGigEPacketSize( @Cast("unsigned int*") IntBuffer packetSize );
			public native @ByVal Error DiscoverGigEPacketSize( @Cast("unsigned int*") int[] packetSize );

			/*@}*/

			/**
			 * \name GigE image settings
			 *
			 * These functions deal with GigE image setting.
			 */
			/*@{*/

			/**
			 * Check if the particular imaging mode is supported by the camera.
			 *
			 * @param mode The mode to check.
			 * @param isSupported Whether the mode is supported.
			 *
			 * @return An Error indicating the success or failure of the function.
			 */
			public native @ByVal Error QueryGigEImagingMode( @Cast("FlyCapture2::Mode") int mode, @Cast("bool*") BoolPointer isSupported );
			public native @ByVal Error QueryGigEImagingMode( @Cast("FlyCapture2::Mode") int mode, @Cast("bool*") boolean[] isSupported );

			/**
			 * Get the current imaging mode on the camera.
			 *
			 * @param mode Current imaging mode on the camera.
			 *
			 * @return An Error indicating the success or failure of the function.
			 */
			public native @ByVal Error GetGigEImagingMode( @Cast("FlyCapture2::Mode*") IntPointer mode );
			public native @ByVal Error GetGigEImagingMode( @Cast("FlyCapture2::Mode*") IntBuffer mode );
			public native @ByVal Error GetGigEImagingMode( @Cast("FlyCapture2::Mode*") int[] mode );

			/**
			 * Set the current imaging mode to the camera. This should only be
			 * done when the camera is not streaming images.
			 *
			 * @param mode Imaging mode to set to the camera.
			 *
			 * @return An Error indicating the success or failure of the function.
			 */
			public native @ByVal Error SetGigEImagingMode( @Cast("FlyCapture2::Mode") int mode );

			/**
			 * Get information about the image settings possible on the camera.
			 *
			 * @param pInfo Image settings information.
			 *
			 * @return An Error indicating the success or failure of the function.
			 */
			public native @ByVal Error GetGigEImageSettingsInfo( GigEImageSettingsInfo pInfo );

			/**
			 * Get the current image settings on the camera.
			 *
			 * @param pImageSettings Current image settings on camera.
			 *
			 * @return An Error indicating the success or failure of the function.
			 */
			public native @ByVal Error GetGigEImageSettings( GigEImageSettings pImageSettings );

			/**
			 * Set the image settings specified to the camera.
			 *
			 * @param pImageSettings Image settings to set to camera.
			 *
			 * @return An Error indicating the success or failure of the function.
			 */
			public native @ByVal Error SetGigEImageSettings( @Const GigEImageSettings pImageSettings );

			/*@}*/

			/**
			 * \name GigE image binning settings
			 *
			 * These functions deal with GigE image binning settings.
			 */
			/*@{*/

			/**
			 * Get the current binning settings on the camera.
			 *
			 * @param horzBinnningValue Current horizontal binning value.
			 * @param vertBinnningValue Current vertical binning value.
			 *
			 * @return An Error indicating the success or failure of the function.
			 */
			public native @ByVal Error GetGigEImageBinningSettings( @Cast("unsigned int*") IntPointer horzBinnningValue, @Cast("unsigned int*") IntPointer vertBinnningValue );
			public native @ByVal Error GetGigEImageBinningSettings( @Cast("unsigned int*") IntBuffer horzBinnningValue, @Cast("unsigned int*") IntBuffer vertBinnningValue );
			public native @ByVal Error GetGigEImageBinningSettings( @Cast("unsigned int*") int[] horzBinnningValue, @Cast("unsigned int*") int[] vertBinnningValue );

			/**
			 * Set the specified binning values to the camera. It is recommended
			 * that GetGigEImageSettingsInfo() be called after this function
			 * succeeds to retrieve the new image settings information for
			 * the new binning mode.
			 *
			 * @param horzBinnningValue Horizontal binning value.
			 * @param vertBinnningValue Vertical binning value.
			 *
			 * @return An Error indicating the success or failure of the function.
			 */
			public native @ByVal Error SetGigEImageBinningSettings( @Cast("unsigned int") int horzBinnningValue, @Cast("unsigned int") int vertBinnningValue );

			/*@}*/

			/**
			 * \name GigE image stream configuration
			 *
			 * These functions deal with GigE image stream configuration.
			 */
			/*@{*/

			/**
			 * Get the number of stream channels present on the camera.
			 *
			 * @param numChannels Number of stream channels present.
			 *
			 * @return An Error indicating the success or failure of the function.
			 */
			public native @ByVal Error GetNumStreamChannels( @Cast("unsigned int*") IntPointer numChannels );
			public native @ByVal Error GetNumStreamChannels( @Cast("unsigned int*") IntBuffer numChannels );
			public native @ByVal Error GetNumStreamChannels( @Cast("unsigned int*") int[] numChannels );

			/**
			 * Get the stream channel information for the specified channel.
			 *
			 * @param channel Channel number to use.
			 * @param pChannel Stream channel information for the specified channel.
			 *
			 * @return An Error indicating the success or failure of the function.
			 */
			public native @ByVal Error GetGigEStreamChannelInfo( @Cast("unsigned int") int channel, GigEStreamChannel pChannel );

			/**
			 * Set the stream channel information for the specified channel.
			 *
			 * Note that the source UDP port of the stream channel is read-only.
			 *
			 * @param channel Channel number to use.
			 * @param pChannel Stream channel information to use for the specified channel.
			 *
			 * @return An Error indicating the success or failure of the function.
			 */
			public native @ByVal Error SetGigEStreamChannelInfo( @Cast("unsigned int") int channel, GigEStreamChannel pChannel );

			/**
			 * Get the current gige config on the camera.
			 *
			 * @param pGigEConfig Current configuration on camera.
			 *
			 * @return An Error indicating the success or failure of the function.
			 */
			public native @ByVal Error GetGigEConfig( GigEConfig pGigEConfig );

			/**
			 * Set the gige config specified to the camera.
			 *
			 * @param pGigEConfig configuration to set to camera.
			 *
			 * @return An Error indicating the success or failure of the function.
			 */
			public native @ByVal Error SetGigEConfig( @Const GigEConfig pGigEConfig );

			/*@}*/

			/**
			 * The following functions are inherited from CameraBase. See
			 * CameraBase.h for further information.
			 */

			public native @ByVal Error Connect( PGRGuid pGuid/*=NULL*/ );
			public native @ByVal Error Connect( );
			public native @ByVal Error Disconnect();
			public native @Cast("bool") boolean IsConnected();
			public native @ByVal Error SetCallback(
								ImageEventCallback callbackFn,
								@Const Pointer pCallbackData/*=NULL*/ );
			public native @ByVal Error SetCallback(
								ImageEventCallback callbackFn );
			public native @ByVal Error StartCapture(
								ImageEventCallback callbackFn/*=NULL*/,
								@Const Pointer pCallbackData/*=NULL*/ );
			public native @ByVal Error StartCapture( );

			/**
			 * StartSyncCapture() with GigE Cameras is not supported.
			 * This function has been deprecated and will be removed
			 * in a future version of FlyCapture.
			 */
			public static native @ByVal Error StartSyncCapture(
								@Cast("unsigned int") int numCameras,
								@Cast("const FlyCapture2::GigECamera**") PointerPointer ppCameras,
								@Cast("FlyCapture2::ImageEventCallback*") @ByPtrPtr ImageEventCallback pCallbackFns/*=NULL*/,
								@Cast("const void**") PointerPointer pCallbackDataArray/*=NULL*/ );
			public static native @ByVal Error StartSyncCapture(
								@Cast("unsigned int") int numCameras,
								@Const @ByPtrPtr GigECamera ppCameras );
			public static native @ByVal Error StartSyncCapture(
								@Cast("unsigned int") int numCameras,
								@Const @ByPtrPtr GigECamera ppCameras,
								@Cast("FlyCapture2::ImageEventCallback*") @ByPtrPtr ImageEventCallback pCallbackFns/*=NULL*/,
								@Cast("const void**") @ByPtrPtr Pointer pCallbackDataArray/*=NULL*/ );
			public native @ByVal Error RetrieveBuffer( Image pImage );
			public native @ByVal Error StopCapture();
			public native @ByVal Error WaitForBufferEvent( Image pImage, @Cast("unsigned int") int eventNumber );
			public native @ByVal Error SetUserBuffers(
								@Cast("unsigned char*const") BytePointer pMemBuffers,
								int size,
								int numBuffers );
			public native @ByVal Error SetUserBuffers(
								@Cast("unsigned char*const") ByteBuffer pMemBuffers,
								int size,
								int numBuffers );
			public native @ByVal Error SetUserBuffers(
								@Cast("unsigned char*const") byte[] pMemBuffers,
								int size,
								int numBuffers );
			public native @ByVal Error GetConfiguration( FC2Config pConfig );
			public native @ByVal Error SetConfiguration( @Const FC2Config pConfig );
			public native @ByVal Error GetCameraInfo( CameraInfo pCameraInfo );
			public native @ByVal Error GetPropertyInfo( PropertyInfo pPropInfo );
			public native @ByVal Error GetProperty( Property pProp );
			public native @ByVal Error SetProperty(
								@Const Property pProp,
								@Cast("bool") boolean broadcast/*=false*/ );
			public native @ByVal Error SetProperty(
								@Const Property pProp );
			public native @ByVal Error GetGPIOPinDirection( @Cast("unsigned int") int pin, @Cast("unsigned int*") IntPointer pDirection);
			public native @ByVal Error GetGPIOPinDirection( @Cast("unsigned int") int pin, @Cast("unsigned int*") IntBuffer pDirection);
			public native @ByVal Error GetGPIOPinDirection( @Cast("unsigned int") int pin, @Cast("unsigned int*") int[] pDirection);
			public native @ByVal Error SetGPIOPinDirection( @Cast("unsigned int") int pin, @Cast("unsigned int") int direction, @Cast("bool") boolean broadcast/*=false*/ );
			public native @ByVal Error SetGPIOPinDirection( @Cast("unsigned int") int pin, @Cast("unsigned int") int direction );
			public native @ByVal Error GetTriggerModeInfo( TriggerModeInfo pTriggerModeInfo );
			public native @ByVal Error GetTriggerMode( TriggerMode pTriggerMode );
			public native @ByVal Error SetTriggerMode(
								@Const TriggerMode pTriggerMode,
								@Cast("bool") boolean broadcast/*=false*/ );
			public native @ByVal Error SetTriggerMode(
								@Const TriggerMode pTriggerMode );
			public native @ByVal Error FireSoftwareTrigger( @Cast("bool") boolean broadcast/*=false*/ );
			public native @ByVal Error FireSoftwareTrigger( );
			public native @ByVal Error GetTriggerDelayInfo( @Cast("FlyCapture2::TriggerDelayInfo*") PropertyInfo pTriggerDelayInfo );
			public native @ByVal Error GetTriggerDelay( @Cast("FlyCapture2::TriggerDelay*") Property pTriggerDelay );
			public native @ByVal Error SetTriggerDelay(
								@Cast("const FlyCapture2::TriggerDelay*") Property pTriggerDelay,
								@Cast("bool") boolean broadcast/*=false*/ );
			public native @ByVal Error SetTriggerDelay(
								@Cast("const FlyCapture2::TriggerDelay*") Property pTriggerDelay );
			public native @ByVal Error GetStrobeInfo( StrobeInfo pStrobeInfo );
			public native @ByVal Error GetStrobe( StrobeControl pStrobeControl );
			public native @ByVal Error SetStrobe(
								@Const StrobeControl pStrobeControl,
								@Cast("bool") boolean broadcast/*=false*/ );
			public native @ByVal Error SetStrobe(
								@Const StrobeControl pStrobeControl );
			public native @ByVal Error GetLUTInfo( LUTData pData );
			public native @ByVal Error GetLUTBankInfo(
								@Cast("unsigned int") int bank,
								@Cast("bool*") BoolPointer pReadSupported,
								@Cast("bool*") BoolPointer pWriteSupported );
			public native @ByVal Error GetLUTBankInfo(
								@Cast("unsigned int") int bank,
								@Cast("bool*") boolean[] pReadSupported,
								@Cast("bool*") boolean[] pWriteSupported );
			public native @ByVal Error GetActiveLUTBank( @Cast("unsigned int*") IntPointer pActiveBank );
			public native @ByVal Error GetActiveLUTBank( @Cast("unsigned int*") IntBuffer pActiveBank );
			public native @ByVal Error GetActiveLUTBank( @Cast("unsigned int*") int[] pActiveBank );
			public native @ByVal Error SetActiveLUTBank( @Cast("unsigned int") int activeBank );
			public native @ByVal Error EnableLUT( @Cast("bool") boolean on );
			public native @ByVal Error GetLUTChannel(
								@Cast("unsigned int") int bank,
								@Cast("unsigned int") int channel,
								@Cast("unsigned int") int sizeEntries,
								@Cast("unsigned int*") IntPointer pEntries );
			public native @ByVal Error GetLUTChannel(
								@Cast("unsigned int") int bank,
								@Cast("unsigned int") int channel,
								@Cast("unsigned int") int sizeEntries,
								@Cast("unsigned int*") IntBuffer pEntries );
			public native @ByVal Error GetLUTChannel(
								@Cast("unsigned int") int bank,
								@Cast("unsigned int") int channel,
								@Cast("unsigned int") int sizeEntries,
								@Cast("unsigned int*") int[] pEntries );
			public native @ByVal Error SetLUTChannel(
								@Cast("unsigned int") int bank,
								@Cast("unsigned int") int channel,
								@Cast("unsigned int") int sizeEntries,
								@Cast("const unsigned int*") IntPointer pEntries );
			public native @ByVal Error SetLUTChannel(
								@Cast("unsigned int") int bank,
								@Cast("unsigned int") int channel,
								@Cast("unsigned int") int sizeEntries,
								@Cast("const unsigned int*") IntBuffer pEntries );
			public native @ByVal Error SetLUTChannel(
								@Cast("unsigned int") int bank,
								@Cast("unsigned int") int channel,
								@Cast("unsigned int") int sizeEntries,
								@Cast("const unsigned int*") int[] pEntries );
			public native @ByVal Error GetMemoryChannel( @Cast("unsigned int*") IntPointer pCurrentChannel );
			public native @ByVal Error GetMemoryChannel( @Cast("unsigned int*") IntBuffer pCurrentChannel );
			public native @ByVal Error GetMemoryChannel( @Cast("unsigned int*") int[] pCurrentChannel );
			public native @ByVal Error SaveToMemoryChannel( @Cast("unsigned int") int channel );
			public native @ByVal Error RestoreFromMemoryChannel( @Cast("unsigned int") int channel );
			public native @ByVal Error GetMemoryChannelInfo( @Cast("unsigned int*") IntPointer pNumChannels );
			public native @ByVal Error GetMemoryChannelInfo( @Cast("unsigned int*") IntBuffer pNumChannels );
			public native @ByVal Error GetMemoryChannelInfo( @Cast("unsigned int*") int[] pNumChannels );
			public native @ByVal Error GetEmbeddedImageInfo( EmbeddedImageInfo pInfo );
			public native @ByVal Error SetEmbeddedImageInfo( EmbeddedImageInfo pInfo );
			public native @ByVal Error WriteRegister(
								@Cast("unsigned int") int _address,
								@Cast("unsigned int") int value,
								@Cast("bool") boolean broadcast/*=false*/);
			public native @ByVal Error WriteRegister(
								@Cast("unsigned int") int _address,
								@Cast("unsigned int") int value);
			public native @ByVal Error ReadRegister(
								@Cast("unsigned int") int _address,
								@Cast("unsigned int*") IntPointer pValue );
			public native @ByVal Error ReadRegister(
								@Cast("unsigned int") int _address,
								@Cast("unsigned int*") IntBuffer pValue );
			public native @ByVal Error ReadRegister(
								@Cast("unsigned int") int _address,
								@Cast("unsigned int*") int[] pValue );
			public native @ByVal Error WriteRegisterBlock(
								@Cast("unsigned short") short addressHigh,
								@Cast("unsigned int") int addressLow,
								@Cast("const unsigned int*") IntPointer pBuffer,
								@Cast("unsigned int") int length );
			public native @ByVal Error WriteRegisterBlock(
								@Cast("unsigned short") short addressHigh,
								@Cast("unsigned int") int addressLow,
								@Cast("const unsigned int*") IntBuffer pBuffer,
								@Cast("unsigned int") int length );
			public native @ByVal Error WriteRegisterBlock(
								@Cast("unsigned short") short addressHigh,
								@Cast("unsigned int") int addressLow,
								@Cast("const unsigned int*") int[] pBuffer,
								@Cast("unsigned int") int length );
			public native @ByVal Error ReadRegisterBlock(
								@Cast("unsigned short") short addressHigh,
								@Cast("unsigned int") int addressLow,
								@Cast("unsigned int*") IntPointer pBuffer,
								@Cast("unsigned int") int length );
			public native @ByVal Error ReadRegisterBlock(
								@Cast("unsigned short") short addressHigh,
								@Cast("unsigned int") int addressLow,
								@Cast("unsigned int*") IntBuffer pBuffer,
								@Cast("unsigned int") int length );
			public native @ByVal Error ReadRegisterBlock(
								@Cast("unsigned short") short addressHigh,
								@Cast("unsigned int") int addressLow,
								@Cast("unsigned int*") int[] pBuffer,
								@Cast("unsigned int") int length );
			public static native @Cast("const char*") BytePointer GetRegisterString( @Cast("unsigned int") int registerVal);
			public native @ByVal Error GetCycleTime(TimeStamp timeStamp);
			public native @ByVal Error GetStats( CameraStats pStats );
			public native @ByVal Error ResetStats();

			public native @ByVal Error RegisterEvent( EventOptions pOpts );
			public native @ByVal Error DeregisterEvent( EventOptions pOpts );
			public native @ByVal Error RegisterAllEvents( EventOptions pOpts );
			public native @ByVal Error DeregisterAllEvents( );
	}
