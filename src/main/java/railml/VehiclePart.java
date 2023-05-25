//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.05.25 at 11:54:17 AM EEST 
//


package railml;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A physical part of the vehicle which has its own body. The parts of a vehicle are connected with some kind of coupling and/or articulation. A vehiclePart can be a segment of an articulated vehicle or a car of multiple unit.
 * 
 * <p>Java class for VehiclePart complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehiclePart"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.railml.org/schemas/3.2}EntityRSwithIDandDesignator"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="passengerFacilities" type="{https://www.railml.org/schemas/3.2}PassengerFacilities" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="freightFacilities" type="{https://www.railml.org/schemas/3.2}FreightFacilities" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="partOrder" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *       &lt;attribute name="airTightness" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="emergencyBrakeOverride" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="maximumCantDeficiency" type="{https://www.railml.org/schemas/3.2}tLengthMM" /&gt;
 *       &lt;anyAttribute namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehiclePart", propOrder = {
    "passengerFacilities",
    "freightFacilities"
})
public class VehiclePart
    extends EntityRSwithIDandDesignator
{

    protected List<PassengerFacilities> passengerFacilities;
    protected List<FreightFacilities> freightFacilities;
    @XmlAttribute(name = "partOrder", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger partOrder;
    @XmlAttribute(name = "airTightness")
    protected Boolean airTightness;
    @XmlAttribute(name = "emergencyBrakeOverride")
    protected Boolean emergencyBrakeOverride;
    @XmlAttribute(name = "maximumCantDeficiency")
    protected BigDecimal maximumCantDeficiency;

    /**
     * Gets the value of the passengerFacilities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the passengerFacilities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassengerFacilities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassengerFacilities }
     * 
     * 
     */
    public List<PassengerFacilities> getPassengerFacilities() {
        if (passengerFacilities == null) {
            passengerFacilities = new ArrayList<PassengerFacilities>();
        }
        return this.passengerFacilities;
    }

    /**
     * Gets the value of the freightFacilities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the freightFacilities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFreightFacilities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FreightFacilities }
     * 
     * 
     */
    public List<FreightFacilities> getFreightFacilities() {
        if (freightFacilities == null) {
            freightFacilities = new ArrayList<FreightFacilities>();
        }
        return this.freightFacilities;
    }

    /**
     * Gets the value of the partOrder property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPartOrder() {
        return partOrder;
    }

    /**
     * Sets the value of the partOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPartOrder(BigInteger value) {
        this.partOrder = value;
    }

    /**
     * Gets the value of the airTightness property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAirTightness() {
        return airTightness;
    }

    /**
     * Sets the value of the airTightness property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAirTightness(Boolean value) {
        this.airTightness = value;
    }

    /**
     * Gets the value of the emergencyBrakeOverride property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmergencyBrakeOverride() {
        return emergencyBrakeOverride;
    }

    /**
     * Sets the value of the emergencyBrakeOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmergencyBrakeOverride(Boolean value) {
        this.emergencyBrakeOverride = value;
    }

    /**
     * Gets the value of the maximumCantDeficiency property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumCantDeficiency() {
        return maximumCantDeficiency;
    }

    /**
     * Sets the value of the maximumCantDeficiency property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumCantDeficiency(BigDecimal value) {
        this.maximumCantDeficiency = value;
    }

}
