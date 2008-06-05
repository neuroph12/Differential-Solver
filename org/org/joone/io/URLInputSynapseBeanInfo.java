package org.joone.io;

import java.beans.*;

public class URLInputSynapseBeanInfo extends SimpleBeanInfo {
    
    // Bean descriptor //GEN-FIRST:BeanDescriptor
    /*lazy BeanDescriptor*/
    private static BeanDescriptor getBdescriptor(){
        BeanDescriptor beanDescriptor = new BeanDescriptor  ( URLInputSynapse.class , null );//GEN-HEADEREND:BeanDescriptor
        
        // Here you can add code for customizing the BeanDescriptor.
        
        return beanDescriptor;         }//GEN-LAST:BeanDescriptor
    
    
    // Property identifiers //GEN-FIRST:Properties
    private static final int PROPERTY_advancedColumnSelector = 0;
    private static final int PROPERTY_buffered = 1;
    private static final int PROPERTY_decimalPoint = 2;
    private static final int PROPERTY_enabled = 3;
    private static final int PROPERTY_firstRow = 4;
    private static final int PROPERTY_inputPatterns = 5;
    private static final int PROPERTY_lastRow = 6;
    private static final int PROPERTY_maxBufSize = 7;
    private static final int PROPERTY_monitor = 8;
    private static final int PROPERTY_name = 9;
    private static final int PROPERTY_plugIn = 10;
    private static final int PROPERTY_stepCounter = 11;
    private static final int PROPERTY_URL = 12;

    // Property array 
    /*lazy PropertyDescriptor*/
    private static PropertyDescriptor[] getPdescriptor(){
        PropertyDescriptor[] properties = new PropertyDescriptor[13];
    
        try {
            properties[PROPERTY_advancedColumnSelector] = new PropertyDescriptor ( "advancedColumnSelector", URLInputSynapse.class, "getAdvancedColumnSelector", "setAdvancedColumnSelector" );
            properties[PROPERTY_advancedColumnSelector].setDisplayName ( "Advanced Column Selector" );
            properties[PROPERTY_buffered] = new PropertyDescriptor ( "buffered", URLInputSynapse.class, "isBuffered", "setBuffered" );
            properties[PROPERTY_decimalPoint] = new PropertyDescriptor ( "decimalPoint", URLInputSynapse.class, "getDecimalPoint", "setDecimalPoint" );
            properties[PROPERTY_enabled] = new PropertyDescriptor ( "enabled", URLInputSynapse.class, "isEnabled", "setEnabled" );
            properties[PROPERTY_firstRow] = new PropertyDescriptor ( "firstRow", URLInputSynapse.class, "getFirstRow", "setFirstRow" );
            properties[PROPERTY_inputPatterns] = new PropertyDescriptor ( "inputPatterns", URLInputSynapse.class, "getInputPatterns", "setInputPatterns" );
            properties[PROPERTY_inputPatterns].setExpert ( true );
            properties[PROPERTY_lastRow] = new PropertyDescriptor ( "lastRow", URLInputSynapse.class, "getLastRow", "setLastRow" );
            properties[PROPERTY_maxBufSize] = new PropertyDescriptor ( "maxBufSize", URLInputSynapse.class, "getMaxBufSize", "setMaxBufSize" );
            properties[PROPERTY_monitor] = new PropertyDescriptor ( "monitor", URLInputSynapse.class, "getMonitor", "setMonitor" );
            properties[PROPERTY_monitor].setExpert ( true );
            properties[PROPERTY_name] = new PropertyDescriptor ( "name", URLInputSynapse.class, "getName", "setName" );
            properties[PROPERTY_plugIn] = new PropertyDescriptor ( "plugIn", URLInputSynapse.class, "getPlugIn", "setPlugIn" );
            properties[PROPERTY_plugIn].setExpert ( true );
            properties[PROPERTY_stepCounter] = new PropertyDescriptor ( "stepCounter", URLInputSynapse.class, "isStepCounter", "setStepCounter" );
            properties[PROPERTY_URL] = new PropertyDescriptor ( "URL", URLInputSynapse.class, "getURL", "setURL" );
        }
        catch( IntrospectionException e) {}//GEN-HEADEREND:Properties
        
        // Here you can add code for customizing the properties array.
        
        return properties;         }//GEN-LAST:Properties
    
    // EventSet identifiers//GEN-FIRST:Events

    // EventSet array
    /*lazy EventSetDescriptor*/
    private static EventSetDescriptor[] getEdescriptor(){
        EventSetDescriptor[] eventSets = new EventSetDescriptor[0];//GEN-HEADEREND:Events
        
        // Here you can add code for customizing the event sets array.
        
        return eventSets;         }//GEN-LAST:Events
    
    // Method identifiers //GEN-FIRST:Methods

    // Method array 
    /*lazy MethodDescriptor*/
    private static MethodDescriptor[] getMdescriptor(){
        MethodDescriptor[] methods = new MethodDescriptor[0];//GEN-HEADEREND:Methods
        
        // Here you can add code for customizing the methods array.
        
        return methods;         }//GEN-LAST:Methods
    
    
    private static final int defaultPropertyIndex = -1;//GEN-BEGIN:Idx
    private static final int defaultEventIndex = -1;//GEN-END:Idx
    
    
 //GEN-FIRST:Superclass
    
    // Here you can add code for customizing the Superclass BeanInfo.
    
 //GEN-LAST:Superclass
    
    /**
     * Gets the bean's <code>BeanDescriptor</code>s.
     *
     * @return BeanDescriptor describing the editable
     * properties of this bean.  May return null if the
     * information should be obtained by automatic analysis.
     */
    public BeanDescriptor getBeanDescriptor() {
        return getBdescriptor();
    }
    
    /**
     * Gets the bean's <code>PropertyDescriptor</code>s.
     *
     * @return An array of PropertyDescriptors describing the editable
     * properties supported by this bean.  May return null if the
     * information should be obtained by automatic analysis.
     * <p>
     * If a property is indexed, then its entry in the result array will
     * belong to the IndexedPropertyDescriptor subclass of PropertyDescriptor.
     * A client of getPropertyDescriptors can use "instanceof" to check
     * if a given PropertyDescriptor is an IndexedPropertyDescriptor.
     */
    public PropertyDescriptor[] getPropertyDescriptors() {
        return getPdescriptor();
    }
    
    /**
     * Gets the bean's <code>EventSetDescriptor</code>s.
     *
     * @return  An array of EventSetDescriptors describing the kinds of
     * events fired by this bean.  May return null if the information
     * should be obtained by automatic analysis.
     */
    public EventSetDescriptor[] getEventSetDescriptors() {
        return getEdescriptor();
    }
    
    /**
     * Gets the bean's <code>MethodDescriptor</code>s.
     *
     * @return  An array of MethodDescriptors describing the methods
     * implemented by this bean.  May return null if the information
     * should be obtained by automatic analysis.
     */
    public MethodDescriptor[] getMethodDescriptors() {
        return getMdescriptor();
    }
    
    /**
     * A bean may have a "default" property that is the property that will
     * mostly commonly be initially chosen for update by human's who are
     * customizing the bean.
     * @return  Index of default property in the PropertyDescriptor array
     * 		returned by getPropertyDescriptors.
     * <P>	Returns -1 if there is no default property.
     */
    public int getDefaultPropertyIndex() {
        return defaultPropertyIndex;
    }
    
    /**
     * A bean may have a "default" event that is the event that will
     * mostly commonly be used by human's when using the bean.
     * @return Index of default event in the EventSetDescriptor array
     *		returned by getEventSetDescriptors.
     * <P>	Returns -1 if there is no default event.
     */
    public int getDefaultEventIndex() {
        return defaultEventIndex;
    }
}

