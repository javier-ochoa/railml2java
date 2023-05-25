//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.05.25 at 11:54:17 AM EEST 
//


package railml;

import javax.xml.datatype.Duration;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Detectors are devices detecting the exceeding of a particular characteristic and providing an output to the interlocking. Depending on the function it may influence the route signalling.
 * 
 * <p>Java class for GenericDetector complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GenericDetector"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.railml.org/schemas/3.2}LogicalDevice"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="detectorType" type="{https://www.railml.org/schemas/3.2}EntityILref"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="affectsRouteSignalling" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="allowsSingleOverride" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="allowsPermanentOverride" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="hasTriggeredSelfTest" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="selfTestToleranceTime" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
 *       &lt;attribute name="selfTestInterval" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
 *       &lt;anyAttribute namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenericDetector", propOrder = {
    "detectorType"
})
public class GenericDetector
    extends LogicalDevice
{

    @XmlElement(required = true)
    protected EntityILref detectorType;
    @XmlAttribute(name = "affectsRouteSignalling")
    protected Boolean affectsRouteSignalling;
    @XmlAttribute(name = "allowsSingleOverride")
    protected Boolean allowsSingleOverride;
    @XmlAttribute(name = "allowsPermanentOverride")
    protected Boolean allowsPermanentOverride;
    @XmlAttribute(name = "hasTriggeredSelfTest")
    protected Boolean hasTriggeredSelfTest;
    @XmlAttribute(name = "selfTestToleranceTime")
    protected Duration selfTestToleranceTime;
    @XmlAttribute(name = "selfTestInterval")
    protected Duration selfTestInterval;

    /**
     * Gets the value of the detectorType property.
     * 
     * @return
     *     possible object is
     *     {@link EntityILref }
     *     
     */
    public EntityILref getDetectorType() {
        return detectorType;
    }

    /**
     * Sets the value of the detectorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityILref }
     *     
     */
    public void setDetectorType(EntityILref value) {
        this.detectorType = value;
    }

    /**
     * Gets the value of the affectsRouteSignalling property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAffectsRouteSignalling() {
        return affectsRouteSignalling;
    }

    /**
     * Sets the value of the affectsRouteSignalling property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAffectsRouteSignalling(Boolean value) {
        this.affectsRouteSignalling = value;
    }

    /**
     * Gets the value of the allowsSingleOverride property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowsSingleOverride() {
        return allowsSingleOverride;
    }

    /**
     * Sets the value of the allowsSingleOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowsSingleOverride(Boolean value) {
        this.allowsSingleOverride = value;
    }

    /**
     * Gets the value of the allowsPermanentOverride property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowsPermanentOverride() {
        return allowsPermanentOverride;
    }

    /**
     * Sets the value of the allowsPermanentOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowsPermanentOverride(Boolean value) {
        this.allowsPermanentOverride = value;
    }

    /**
     * Gets the value of the hasTriggeredSelfTest property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasTriggeredSelfTest() {
        return hasTriggeredSelfTest;
    }

    /**
     * Sets the value of the hasTriggeredSelfTest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasTriggeredSelfTest(Boolean value) {
        this.hasTriggeredSelfTest = value;
    }

    /**
     * Gets the value of the selfTestToleranceTime property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getSelfTestToleranceTime() {
        return selfTestToleranceTime;
    }

    /**
     * Sets the value of the selfTestToleranceTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setSelfTestToleranceTime(Duration value) {
        this.selfTestToleranceTime = value;
    }

    /**
     * Gets the value of the selfTestInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getSelfTestInterval() {
        return selfTestInterval;
    }

    /**
     * Sets the value of the selfTestInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setSelfTestInterval(Duration value) {
        this.selfTestInterval = value;
    }

}
