//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.05.25 at 11:54:17 AM EEST 
//


package railml;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BaliseGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaliseGroup"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.railml.org/schemas/3.2}FunctionalInfrastructureEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="applicationType" type="{https://www.railml.org/schemas/3.2}BaliseGroupApplicationType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="connectedWithInfrastructureElement" type="{https://www.railml.org/schemas/3.2}BaliseGroupConnection" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="functionalType" type="{https://www.railml.org/schemas/3.2}BaliseGroupFunctionalType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="isEurobaliseGroup" type="{https://www.railml.org/schemas/3.2}BaliseGroupEurobalise" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="mileageDirection" type="{https://www.railml.org/schemas/3.2}tMileageDirection" /&gt;
 *       &lt;attribute name="coverage" type="{https://www.railml.org/schemas/3.2}tBaliseGroupCoverage" /&gt;
 *       &lt;attribute name="numberOfBalisesInGroup" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;anyAttribute namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaliseGroup", propOrder = {
    "applicationType",
    "connectedWithInfrastructureElement",
    "functionalType",
    "isEurobaliseGroup"
})
public class BaliseGroup
    extends FunctionalInfrastructureEntity
{

    @XmlElement(required = true)
    protected List<BaliseGroupApplicationType> applicationType;
    protected List<BaliseGroupConnection> connectedWithInfrastructureElement;
    protected List<BaliseGroupFunctionalType> functionalType;
    protected BaliseGroupEurobalise isEurobaliseGroup;
    @XmlAttribute(name = "mileageDirection")
    protected TMileageDirection mileageDirection;
    @XmlAttribute(name = "coverage")
    protected TBaliseGroupCoverage coverage;
    @XmlAttribute(name = "numberOfBalisesInGroup")
    protected BigInteger numberOfBalisesInGroup;

    /**
     * Gets the value of the applicationType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the applicationType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicationType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BaliseGroupApplicationType }
     * 
     * 
     */
    public List<BaliseGroupApplicationType> getApplicationType() {
        if (applicationType == null) {
            applicationType = new ArrayList<BaliseGroupApplicationType>();
        }
        return this.applicationType;
    }

    /**
     * Gets the value of the connectedWithInfrastructureElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the connectedWithInfrastructureElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnectedWithInfrastructureElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BaliseGroupConnection }
     * 
     * 
     */
    public List<BaliseGroupConnection> getConnectedWithInfrastructureElement() {
        if (connectedWithInfrastructureElement == null) {
            connectedWithInfrastructureElement = new ArrayList<BaliseGroupConnection>();
        }
        return this.connectedWithInfrastructureElement;
    }

    /**
     * Gets the value of the functionalType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the functionalType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFunctionalType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BaliseGroupFunctionalType }
     * 
     * 
     */
    public List<BaliseGroupFunctionalType> getFunctionalType() {
        if (functionalType == null) {
            functionalType = new ArrayList<BaliseGroupFunctionalType>();
        }
        return this.functionalType;
    }

    /**
     * Gets the value of the isEurobaliseGroup property.
     * 
     * @return
     *     possible object is
     *     {@link BaliseGroupEurobalise }
     *     
     */
    public BaliseGroupEurobalise getIsEurobaliseGroup() {
        return isEurobaliseGroup;
    }

    /**
     * Sets the value of the isEurobaliseGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaliseGroupEurobalise }
     *     
     */
    public void setIsEurobaliseGroup(BaliseGroupEurobalise value) {
        this.isEurobaliseGroup = value;
    }

    /**
     * Gets the value of the mileageDirection property.
     * 
     * @return
     *     possible object is
     *     {@link TMileageDirection }
     *     
     */
    public TMileageDirection getMileageDirection() {
        return mileageDirection;
    }

    /**
     * Sets the value of the mileageDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link TMileageDirection }
     *     
     */
    public void setMileageDirection(TMileageDirection value) {
        this.mileageDirection = value;
    }

    /**
     * Gets the value of the coverage property.
     * 
     * @return
     *     possible object is
     *     {@link TBaliseGroupCoverage }
     *     
     */
    public TBaliseGroupCoverage getCoverage() {
        return coverage;
    }

    /**
     * Sets the value of the coverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link TBaliseGroupCoverage }
     *     
     */
    public void setCoverage(TBaliseGroupCoverage value) {
        this.coverage = value;
    }

    /**
     * Gets the value of the numberOfBalisesInGroup property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfBalisesInGroup() {
        return numberOfBalisesInGroup;
    }

    /**
     * Sets the value of the numberOfBalisesInGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfBalisesInGroup(BigInteger value) {
        this.numberOfBalisesInGroup = value;
    }

}
