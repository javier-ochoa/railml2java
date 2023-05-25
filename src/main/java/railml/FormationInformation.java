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
 * <p>Java class for FormationInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FormationInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="passengerFacilities" type="{https://www.railml.org/schemas/3.2}PassengerFacilities" minOccurs="0"/&gt;
 *         &lt;element name="freightFacilities" type="{https://www.railml.org/schemas/3.2}FreightFacilities" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="formationRef" type="{https://www.railml.org/schemas/3.2}tRef" /&gt;
 *       &lt;attribute name="orientationReversed" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormationInformation", propOrder = {
    "passengerFacilities",
    "freightFacilities"
})
public class FormationInformation {

    protected PassengerFacilities passengerFacilities;
    protected FreightFacilities freightFacilities;
    @XmlAttribute(name = "formationRef")
    protected String formationRef;
    @XmlAttribute(name = "orientationReversed")
    protected Boolean orientationReversed;

    /**
     * Gets the value of the passengerFacilities property.
     * 
     * @return
     *     possible object is
     *     {@link PassengerFacilities }
     *     
     */
    public PassengerFacilities getPassengerFacilities() {
        return passengerFacilities;
    }

    /**
     * Sets the value of the passengerFacilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerFacilities }
     *     
     */
    public void setPassengerFacilities(PassengerFacilities value) {
        this.passengerFacilities = value;
    }

    /**
     * Gets the value of the freightFacilities property.
     * 
     * @return
     *     possible object is
     *     {@link FreightFacilities }
     *     
     */
    public FreightFacilities getFreightFacilities() {
        return freightFacilities;
    }

    /**
     * Sets the value of the freightFacilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreightFacilities }
     *     
     */
    public void setFreightFacilities(FreightFacilities value) {
        this.freightFacilities = value;
    }

    /**
     * Gets the value of the formationRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormationRef() {
        return formationRef;
    }

    /**
     * Sets the value of the formationRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormationRef(String value) {
        this.formationRef = value;
    }

    /**
     * Gets the value of the orientationReversed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isOrientationReversed() {
        if (orientationReversed == null) {
            return false;
        } else {
            return orientationReversed;
        }
    }

    /**
     * Sets the value of the orientationReversed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrientationReversed(Boolean value) {
        this.orientationReversed = value;
    }

}
