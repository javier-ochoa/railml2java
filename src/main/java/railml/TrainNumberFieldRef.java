//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.05.25 at 11:54:17 AM EEST 
//


package railml;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrainNumberFieldRef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrainNumberFieldRef"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="refersToTrainNumberField" use="required" type="{https://www.railml.org/schemas/3.2}tRef" /&gt;
 *       &lt;attribute name="refersToTrackElement" type="{https://www.railml.org/schemas/3.2}tRef" /&gt;
 *       &lt;attribute name="relationToTrackElement" use="required" type="{https://www.railml.org/schemas/3.2}tStackRelation" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrainNumberFieldRef")
public class TrainNumberFieldRef {

    @XmlAttribute(name = "refersToTrainNumberField", required = true)
    protected String refersToTrainNumberField;
    @XmlAttribute(name = "refersToTrackElement")
    protected String refersToTrackElement;
    @XmlAttribute(name = "relationToTrackElement", required = true)
    protected TStackRelation relationToTrackElement;

    /**
     * Gets the value of the refersToTrainNumberField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefersToTrainNumberField() {
        return refersToTrainNumberField;
    }

    /**
     * Sets the value of the refersToTrainNumberField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefersToTrainNumberField(String value) {
        this.refersToTrainNumberField = value;
    }

    /**
     * Gets the value of the refersToTrackElement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefersToTrackElement() {
        return refersToTrackElement;
    }

    /**
     * Sets the value of the refersToTrackElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefersToTrackElement(String value) {
        this.refersToTrackElement = value;
    }

    /**
     * Gets the value of the relationToTrackElement property.
     * 
     * @return
     *     possible object is
     *     {@link TStackRelation }
     *     
     */
    public TStackRelation getRelationToTrackElement() {
        return relationToTrackElement;
    }

    /**
     * Sets the value of the relationToTrackElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link TStackRelation }
     *     
     */
    public void setRelationToTrackElement(TStackRelation value) {
        this.relationToTrackElement = value;
    }

}
