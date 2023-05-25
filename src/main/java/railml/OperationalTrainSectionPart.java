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
 * <p>Java class for OperationalTrainSectionPart complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperationalTrainSectionPart"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.railml.org/schemas/3.2}tElementWithID"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="isOnRequest" type="{https://www.railml.org/schemas/3.2}IsOnRequest" minOccurs="0"/&gt;
 *         &lt;element name="additionalStopInfos" type="{https://www.railml.org/schemas/3.2}AdditionalStopInfos" minOccurs="0"/&gt;
 *         &lt;element name="formationInformation" type="{https://www.railml.org/schemas/3.2}FormationInformation" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{https://www.railml.org/schemas/3.2}TypeOfTrain"/&gt;
 *       &lt;attribute name="next" type="{https://www.railml.org/schemas/3.2}tRef" /&gt;
 *       &lt;attribute name="categoryRef" type="{https://www.railml.org/schemas/3.2}tRef" /&gt;
 *       &lt;attribute name="operatorRef" type="{https://www.railml.org/schemas/3.2}tRef" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperationalTrainSectionPart", propOrder = {
    "isOnRequest",
    "additionalStopInfos",
    "formationInformation"
})
public class OperationalTrainSectionPart
    extends TElementWithID
{

    protected IsOnRequest isOnRequest;
    protected AdditionalStopInfos additionalStopInfos;
    protected FormationInformation formationInformation;
    @XmlAttribute(name = "next")
    protected String next;
    @XmlAttribute(name = "categoryRef")
    protected String categoryRef;
    @XmlAttribute(name = "operatorRef")
    protected String operatorRef;
    @XmlAttribute(name = "trainType")
    protected String trainType;
    @XmlAttribute(name = "isPublic")
    protected Boolean isPublic;
    @XmlAttribute(name = "isEmpty")
    protected Boolean isEmpty;

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
     * Gets the value of the formationInformation property.
     * 
     * @return
     *     possible object is
     *     {@link FormationInformation }
     *     
     */
    public FormationInformation getFormationInformation() {
        return formationInformation;
    }

    /**
     * Sets the value of the formationInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormationInformation }
     *     
     */
    public void setFormationInformation(FormationInformation value) {
        this.formationInformation = value;
    }

    /**
     * Gets the value of the next property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNext() {
        return next;
    }

    /**
     * Sets the value of the next property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNext(String value) {
        this.next = value;
    }

    /**
     * Gets the value of the categoryRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryRef() {
        return categoryRef;
    }

    /**
     * Sets the value of the categoryRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryRef(String value) {
        this.categoryRef = value;
    }

    /**
     * Gets the value of the operatorRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatorRef() {
        return operatorRef;
    }

    /**
     * Sets the value of the operatorRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatorRef(String value) {
        this.operatorRef = value;
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
