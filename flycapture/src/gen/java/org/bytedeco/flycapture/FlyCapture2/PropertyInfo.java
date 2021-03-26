// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.flycapture.FlyCapture2;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.flycapture.global.FlyCapture2.*;


    /**
     * Information about a specific camera property. This structure is also
     * also used as the TriggerDelayInfo structure.
     */
    @Namespace("FlyCapture2") @NoOffset @Properties(inherit = org.bytedeco.flycapture.presets.FlyCapture2.class)
public class PropertyInfo extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public PropertyInfo(Pointer p) { super(p); }
    
        /** Property info type. */
        public native @Cast("FlyCapture2::PropertyType") int type(); public native PropertyInfo type(int setter);
        /** Flag indicating if the property is present. */
        public native @Cast("bool") boolean present(); public native PropertyInfo present(boolean setter);
        /** Flag indicating if auto is supported. */
        public native @Cast("bool") boolean autoSupported(); public native PropertyInfo autoSupported(boolean setter);
        /** Flag indicating if manual is supported. */
        public native @Cast("bool") boolean manualSupported(); public native PropertyInfo manualSupported(boolean setter);
        /** Flag indicating if on/off is supported. */
        public native @Cast("bool") boolean onOffSupported(); public native PropertyInfo onOffSupported(boolean setter);
        /** Flag indicating if one push is supported. */
        public native @Cast("bool") boolean onePushSupported(); public native PropertyInfo onePushSupported(boolean setter);
        /** Flag indicating if absolute mode is supported. */
        public native @Cast("bool") boolean absValSupported(); public native PropertyInfo absValSupported(boolean setter);
        /** Flag indicating if property value can be read out. */
        public native @Cast("bool") boolean readOutSupported(); public native PropertyInfo readOutSupported(boolean setter);
        /** Minimum value (as an integer). */
        public native @Cast("unsigned int") int min(); public native PropertyInfo min(int setter);
        /** Maximum value (as an integer). */
        public native @Cast("unsigned int") int max(); public native PropertyInfo max(int setter);
        /** Minimum value (as a floating point value). */
        public native float absMin(); public native PropertyInfo absMin(float setter);
        /** Maximum value (as a floating point value). */
        public native float absMax(); public native PropertyInfo absMax(float setter);
        /** Textual description of units. */
        public native @Cast("char") byte pUnits(int i); public native PropertyInfo pUnits(int i, byte setter);
        @MemberGetter public native @Cast("char*") BytePointer pUnits();
        /** Abbreviated textual description of units. */
        public native @Cast("char") byte pUnitAbbr(int i); public native PropertyInfo pUnitAbbr(int i, byte setter);
        @MemberGetter public native @Cast("char*") BytePointer pUnitAbbr();
        /** Reserved for future use. */
        public native @Cast("unsigned int") int reserved(int i); public native PropertyInfo reserved(int i, int setter);
        @MemberGetter public native @Cast("unsigned int*") IntPointer reserved();

        public PropertyInfo() { super((Pointer)null); allocate(); }
        private native void allocate();

        public PropertyInfo( @Cast("FlyCapture2::PropertyType") int propType ) { super((Pointer)null); allocate(propType); }
        private native void allocate( @Cast("FlyCapture2::PropertyType") int propType );
    }
