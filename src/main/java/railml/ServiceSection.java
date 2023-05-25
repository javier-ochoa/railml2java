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
 * <p>Java class for ServiceSection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceSection"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.railml.org/schemas/3.2}FunctionalInfrastructureEntity"&gt;
 *       &lt;sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{https://www.railml.org/schemas/3.2}aServiceSection"/&gt;
 *       &lt;attribute name="belongsToParent" type="{https://www.railml.org/schemas/3.2}tRef" /&gt;
 *       &lt;anyAttribute namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceSection")
public class ServiceSection
    extends FunctionalInfrastructureEntity
{

    @XmlAttribute(name = "belongsToParent")
    protected String belongsToParent;
    @XmlAttribute(name = "allowsRollingstockCleaning")
    protected Boolean allowsRollingstockCleaning;
    @XmlAttribute(name = "allowsRollingstockFueling")
    protected Boolean allowsRollingstockFueling;
    @XmlAttribute(name = "allowsRollingstockLoading")
    protected Boolean allowsRollingstockLoading;
    @XmlAttribute(name = "allowsRollingstockMaintenance")
    protected Boolean allowsRollingstockMaintenance;
    @XmlAttribute(name = "allowsRollingstockParking")
    protected Boolean allowsRollingstockParking;
    @XmlAttribute(name = "allowsRollingstockPreheating")
    protected Boolean allowsRollingstockPreheating;
    @XmlAttribute(name = "hasRamp")
    protected Boolean hasRamp;
    @XmlAttribute(name = "allowsRollingstockToiletDischarge")
    protected Boolean allowsRollingstockToiletDischarge;
    @XmlAttribute(name = "allowsRollingstockWaterRestocking")
    protected Boolean allowsRollingstockWaterRestocking;
    @XmlAttribute(name = "allowsRollingstockSandRestocking")
    protected Boolean allowsRollingstockSandRestocking;
    @XmlAttribute(name = "hasElectricSupply")
    protected Boolean hasElectricSupply;
    @XmlAttribute(name = "allowsInfrastructureMaintenance")
    protected Boolean allowsInfrastructureMaintenance;
    @XmlAttribute(name = "allowsCleaning")
    protected Boolean allowsCleaning;
    @XmlAttribute(name = "allowsFueling")
    protected Boolean allowsFueling;
    @XmlAttribute(name = "allowsLoading")
    protected Boolean allowsLoading;
    @XmlAttribute(name = "allowsMaintenance")
    protected Boolean allowsMaintenance;
    @XmlAttribute(name = "allowsParking")
    protected Boolean allowsParking;
    @XmlAttribute(name = "allowsPreheating")
    protected Boolean allowsPreheating;
    @XmlAttribute(name = "allowsSandRestocking")
    protected Boolean allowsSandRestocking;
    @XmlAttribute(name = "allowsToiletDischarge")
    protected Boolean allowsToiletDischarge;
    @XmlAttribute(name = "allowsWaterRestocking")
    protected Boolean allowsWaterRestocking;

    /**
     * Gets the value of the belongsToParent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBelongsToParent() {
        return belongsToParent;
    }

    /**
     * Sets the value of the belongsToParent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBelongsToParent(String value) {
        this.belongsToParent = value;
    }

    /**
     * Gets the value of the allowsRollingstockCleaning property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowsRollingstockCleaning() {
        return allowsRollingstockCleaning;
    }

    /**
     * Sets the value of the allowsRollingstockCleaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowsRollingstockCleaning(Boolean value) {
        this.allowsRollingstockCleaning = value;
    }

    /**
     * Gets the value of the allowsRollingstockFueling property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowsRollingstockFueling() {
        return allowsRollingstockFueling;
    }

    /**
     * Sets the value of the allowsRollingstockFueling property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowsRollingstockFueling(Boolean value) {
        this.allowsRollingstockFueling = value;
    }

    /**
     * Gets the value of the allowsRollingstockLoading property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowsRollingstockLoading() {
        return allowsRollingstockLoading;
    }

    /**
     * Sets the value of the allowsRollingstockLoading property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowsRollingstockLoading(Boolean value) {
        this.allowsRollingstockLoading = value;
    }

    /**
     * Gets the value of the allowsRollingstockMaintenance property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowsRollingstockMaintenance() {
        return allowsRollingstockMaintenance;
    }

    /**
     * Sets the value of the allowsRollingstockMaintenance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowsRollingstockMaintenance(Boolean value) {
        this.allowsRollingstockMaintenance = value;
    }

    /**
     * Gets the value of the allowsRollingstockParking property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowsRollingstockParking() {
        return allowsRollingstockParking;
    }

    /**
     * Sets the value of the allowsRollingstockParking property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowsRollingstockParking(Boolean value) {
        this.allowsRollingstockParking = value;
    }

    /**
     * Gets the value of the allowsRollingstockPreheating property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowsRollingstockPreheating() {
        return allowsRollingstockPreheating;
    }

    /**
     * Sets the value of the allowsRollingstockPreheating property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowsRollingstockPreheating(Boolean value) {
        this.allowsRollingstockPreheating = value;
    }

    /**
     * Gets the value of the hasRamp property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasRamp() {
        return hasRamp;
    }

    /**
     * Sets the value of the hasRamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasRamp(Boolean value) {
        this.hasRamp = value;
    }

    /**
     * Gets the value of the allowsRollingstockToiletDischarge property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowsRollingstockToiletDischarge() {
        return allowsRollingstockToiletDischarge;
    }

    /**
     * Sets the value of the allowsRollingstockToiletDischarge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowsRollingstockToiletDischarge(Boolean value) {
        this.allowsRollingstockToiletDischarge = value;
    }

    /**
     * Gets the value of the allowsRollingstockWaterRestocking property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowsRollingstockWaterRestocking() {
        return allowsRollingstockWaterRestocking;
    }

    /**
     * Sets the value of the allowsRollingstockWaterRestocking property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowsRollingstockWaterRestocking(Boolean value) {
        this.allowsRollingstockWaterRestocking = value;
    }

    /**
     * Gets the value of the allowsRollingstockSandRestocking property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowsRollingstockSandRestocking() {
        return allowsRollingstockSandRestocking;
    }

    /**
     * Sets the value of the allowsRollingstockSandRestocking property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowsRollingstockSandRestocking(Boolean value) {
        this.allowsRollingstockSandRestocking = value;
    }

    /**
     * Gets the value of the hasElectricSupply property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasElectricSupply() {
        return hasElectricSupply;
    }

    /**
     * Sets the value of the hasElectricSupply property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasElectricSupply(Boolean value) {
        this.hasElectricSupply = value;
    }

    /**
     * Gets the value of the allowsInfrastructureMaintenance property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowsInfrastructureMaintenance() {
        return allowsInfrastructureMaintenance;
    }

    /**
     * Sets the value of the allowsInfrastructureMaintenance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowsInfrastructureMaintenance(Boolean value) {
        this.allowsInfrastructureMaintenance = value;
    }

    /**
     * Gets the value of the allowsCleaning property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowsCleaning() {
        return allowsCleaning;
    }

    /**
     * Sets the value of the allowsCleaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowsCleaning(Boolean value) {
        this.allowsCleaning = value;
    }

    /**
     * Gets the value of the allowsFueling property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowsFueling() {
        return allowsFueling;
    }

    /**
     * Sets the value of the allowsFueling property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowsFueling(Boolean value) {
        this.allowsFueling = value;
    }

    /**
     * Gets the value of the allowsLoading property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowsLoading() {
        return allowsLoading;
    }

    /**
     * Sets the value of the allowsLoading property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowsLoading(Boolean value) {
        this.allowsLoading = value;
    }

    /**
     * Gets the value of the allowsMaintenance property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowsMaintenance() {
        return allowsMaintenance;
    }

    /**
     * Sets the value of the allowsMaintenance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowsMaintenance(Boolean value) {
        this.allowsMaintenance = value;
    }

    /**
     * Gets the value of the allowsParking property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowsParking() {
        return allowsParking;
    }

    /**
     * Sets the value of the allowsParking property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowsParking(Boolean value) {
        this.allowsParking = value;
    }

    /**
     * Gets the value of the allowsPreheating property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowsPreheating() {
        return allowsPreheating;
    }

    /**
     * Sets the value of the allowsPreheating property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowsPreheating(Boolean value) {
        this.allowsPreheating = value;
    }

    /**
     * Gets the value of the allowsSandRestocking property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowsSandRestocking() {
        return allowsSandRestocking;
    }

    /**
     * Sets the value of the allowsSandRestocking property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowsSandRestocking(Boolean value) {
        this.allowsSandRestocking = value;
    }

    /**
     * Gets the value of the allowsToiletDischarge property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowsToiletDischarge() {
        return allowsToiletDischarge;
    }

    /**
     * Sets the value of the allowsToiletDischarge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowsToiletDischarge(Boolean value) {
        this.allowsToiletDischarge = value;
    }

    /**
     * Gets the value of the allowsWaterRestocking property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowsWaterRestocking() {
        return allowsWaterRestocking;
    }

    /**
     * Sets the value of the allowsWaterRestocking property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowsWaterRestocking(Boolean value) {
        this.allowsWaterRestocking = value;
    }

}
