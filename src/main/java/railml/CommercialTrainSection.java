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
 * <p>Java class for CommercialTrainSection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommercialTrainSection"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.railml.org/schemas/3.2}tElementWithID"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="range" type="{https://www.railml.org/schemas/3.2}Range" minOccurs="0"/&gt;
 *         &lt;element name="isCancelled" type="{https://www.railml.org/schemas/3.2}CancellationInfo" minOccurs="0"/&gt;
 *         &lt;element name="isOnRequest" type="{https://www.railml.org/schemas/3.2}IsOnRequest" minOccurs="0"/&gt;
 *         &lt;element name="transportServiceRef" type="{https://www.railml.org/schemas/3.2}TransportServiceReference" minOccurs="0"/&gt;
 *         &lt;element name="categoryRefs" type="{https://www.railml.org/schemas/3.2}CategoryRefs" minOccurs="0"/&gt;
 *         &lt;element name="additionalStopInfos" type="{https://www.railml.org/schemas/3.2}AdditionalStopInfos" minOccurs="0"/&gt;
 *         &lt;element name="passengerFacilities" type="{https://www.railml.org/schemas/3.2}PassengerFacilities" minOccurs="0"/&gt;
 *         &lt;element name="freightFacilities" type="{https://www.railml.org/schemas/3.2}FreightFacilities" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{https://www.railml.org/schemas/3.2}TypeOfTrain"/&gt;
 *       &lt;attribute name="ordererRef" type="{https://www.railml.org/schemas/3.2}tRef" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommercialTrainSection", propOrder = {
    "range",
    "isCancelled",
    "isOnRequest",
    "transportServiceRef",
    "categoryRefs",
    "additionalStopInfos",
    "passengerFacilities",
    "freightFacilities"
})
public class CommercialTrainSection
    extends TElementWithID
{

    protected Range range;
    protected CancellationInfo isCancelled;
    protected IsOnRequest isOnRequest;
    protected TransportServiceReference transportServiceRef;
    protected CategoryRefs categoryRefs;
    protected AdditionalStopInfos additionalStopInfos;
    protected PassengerFacilities passengerFacilities;
    protected FreightFacilities freightFacilities;
    @XmlAttribute(name = "ordererRef")
    protected String ordererRef;
    @XmlAttribute(name = "trainType")
    protected String trainType;
    @XmlAttribute(name = "isPublic")
    protected Boolean isPublic;
    @XmlAttribute(name = "isEmpty")
    protected Boolean isEmpty;

    /**
     * Gets the value of the range property.
     * 
     * @return
     *     possible object is
     *     {@link Range }
     *     
     */
    public Range getRange() {
        return range;
    }

    /**
     * Sets the value of the range property.
     * 
     * @param value
     *     allowed object is
     *     {@link Range }
     *     
     */
    public void setRange(Range value) {
        this.range = value;
    }

    /**
     * Gets the value of the isCancelled property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationInfo }
     *     
     */
    public CancellationInfo getIsCancelled() {
        return isCancelled;
    }

    /**
     * Sets the value of the isCancelled property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationInfo }
     *     
     */
    public void setIsCancelled(CancellationInfo value) {
        this.isCancelled = value;
    }

    /**
     * Gets the value of the isOnRequest property.
     * 
     * @return
     *     possible object is
     *     {@link IsOnRequest }
     *     
     */
    public IsOnRequest getIsOnRequest() {
        return isOnRequest;
    }

    /**
     * Sets the value of the isOnRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsOnRequest }
     *     
     */
    public void setIsOnRequest(IsOnRequest value) {
        this.isOnRequest = value;
    }

    /**
     * Gets the value of the transportServiceRef property.
     * 
     * @return
     *     possible object is
     *     {@link TransportServiceReference }
     *     
     */
    public TransportServiceReference getTransportServiceRef() {
        return transportServiceRef;
    }

    /**
     * Sets the value of the transportServiceRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportServiceReference }
     *     
     */
    public void setTransportServiceRef(TransportServiceReference value) {
        this.transportServiceRef = value;
    }

    /**
     * Gets the value of the categoryRefs property.
     * 
     * @return
     *     possible object is
     *     {@link CategoryRefs }
     *     
     */
    public CategoryRefs getCategoryRefs() {
        return categoryRefs;
    }

    /**
     * Sets the value of the categoryRefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryRefs }
     *     
     */
    public void setCategoryRefs(CategoryRefs value) {
        this.categoryRefs = value;
    }

    /**
     * Gets the value of the additionalStopInfos property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalStopInfos }
     *     
     */
    public AdditionalStopInfos getAdditionalStopInfos() {
        return additionalStopInfos;
    }

    /**
     * Sets the value of the additionalStopInfos property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalStopInfos }
     *     
     */
    public void setAdditionalStopInfos(AdditionalStopInfos value) {
        this.additionalStopInfos = value;
    }

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
     * Gets the value of the ordererRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdererRef() {
        return ordererRef;
    }

    /**
     * Sets the value of the ordererRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdererRef(String value) {
        this.ordererRef = value;
    }

    /**
     * Gets the value of the trainType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrainType() {
        return trainType;
    }

    /**
     * Sets the value of the trainType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrainType(String value) {
        this.trainType = value;
    }

    /**
     * Gets the value of the isPublic property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPublic() {
        return isPublic;
    }

    /**
     * Sets the value of the isPublic property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPublic(Boolean value) {
        this.isPublic = value;
    }

    /**
     * Gets the value of the isEmpty property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsEmpty() {
        return isEmpty;
    }

    /**
     * Sets the value of the isEmpty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEmpty(Boolean value) {
        this.isEmpty = value;
    }

}
