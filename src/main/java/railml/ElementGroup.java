//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.05.25 at 11:54:17 AM EEST 
//


package railml;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * For operational purpose of the interlocking some elements are grouped together. This allows e.g. commanding them with only one command.
 * 
 * <p>Java class for ElementGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElementGroup"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.railml.org/schemas/3.2}TrackAsset"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="groupType" type="{https://www.railml.org/schemas/3.2}EntityILref"/&gt;
 *         &lt;element name="refersToMember" type="{https://www.railml.org/schemas/3.2}EntityILref" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="hasStationIndicator" type="{https://www.railml.org/schemas/3.2}EntityILref" minOccurs="0"/&gt;
 *         &lt;element name="refersToInfrastructureElement" type="{https://www.railml.org/schemas/3.2}EntityILref" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
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
@XmlType(name = "ElementGroup", propOrder = {
    "groupType",
    "refersToMember",
    "hasStationIndicator",
    "refersToInfrastructureElement"
})
public class ElementGroup
    extends TrackAsset
{

    @XmlElement(required = true)
    protected EntityILref groupType;
    protected List<EntityILref> refersToMember;
    protected EntityILref hasStationIndicator;
    protected List<EntityILref> refersToInfrastructureElement;
    @XmlAttribute(name = "belongsToParent")
    protected String belongsToParent;

    /**
     * Gets the value of the groupType property.
     * 
     * @return
     *     possible object is
     *     {@link EntityILref }
     *     
     */
    public EntityILref getGroupType() {
        return groupType;
    }

    /**
     * Sets the value of the groupType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityILref }
     *     
     */
    public void setGroupType(EntityILref value) {
        this.groupType = value;
    }

    /**
     * Gets the value of the refersToMember property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the refersToMember property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefersToMember().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityILref }
     * 
     * 
     */
    public List<EntityILref> getRefersToMember() {
        if (refersToMember == null) {
            refersToMember = new ArrayList<EntityILref>();
        }
        return this.refersToMember;
    }

    /**
     * Gets the value of the hasStationIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link EntityILref }
     *     
     */
    public EntityILref getHasStationIndicator() {
        return hasStationIndicator;
    }

    /**
     * Sets the value of the hasStationIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityILref }
     *     
     */
    public void setHasStationIndicator(EntityILref value) {
        this.hasStationIndicator = value;
    }

    /**
     * Gets the value of the refersToInfrastructureElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the refersToInfrastructureElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefersToInfrastructureElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityILref }
     * 
     * 
     */
    public List<EntityILref> getRefersToInfrastructureElement() {
        if (refersToInfrastructureElement == null) {
            refersToInfrastructureElement = new ArrayList<EntityILref>();
        }
        return this.refersToInfrastructureElement;
    }

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

}
