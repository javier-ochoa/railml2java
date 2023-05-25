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
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Revision complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Revision"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.railml.org/schemas/3.2}tElementWithIDandName"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="approvedBy" type="{https://www.railml.org/schemas/3.2}DoneBy" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="revisedBy" type="{https://www.railml.org/schemas/3.2}DoneBy" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="checkedBy" type="{https://www.railml.org/schemas/3.2}DoneBy" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="objectsRevised" type="{https://www.railml.org/schemas/3.2}ObjectsRevised" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="initialProjectRef" type="{https://www.railml.org/schemas/3.2}tGenericRef" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Revision", propOrder = {
    "approvedBy",
    "revisedBy",
    "checkedBy",
    "objectsRevised"
})
public class Revision
    extends TElementWithIDandName
{

    protected List<DoneBy> approvedBy;
    protected List<DoneBy> revisedBy;
    protected List<DoneBy> checkedBy;
    protected ObjectsRevised objectsRevised;
    @XmlAttribute(name = "initialProjectRef")
    @XmlIDREF
    protected Object initialProjectRef;

    /**
     * Gets the value of the approvedBy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the approvedBy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApprovedBy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DoneBy }
     * 
     * 
     */
    public List<DoneBy> getApprovedBy() {
        if (approvedBy == null) {
            approvedBy = new ArrayList<DoneBy>();
        }
        return this.approvedBy;
    }

    /**
     * Gets the value of the revisedBy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the revisedBy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRevisedBy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DoneBy }
     * 
     * 
     */
    public List<DoneBy> getRevisedBy() {
        if (revisedBy == null) {
            revisedBy = new ArrayList<DoneBy>();
        }
        return this.revisedBy;
    }

    /**
     * Gets the value of the checkedBy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the checkedBy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCheckedBy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DoneBy }
     * 
     * 
     */
    public List<DoneBy> getCheckedBy() {
        if (checkedBy == null) {
            checkedBy = new ArrayList<DoneBy>();
        }
        return this.checkedBy;
    }

    /**
     * Gets the value of the objectsRevised property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectsRevised }
     *     
     */
    public ObjectsRevised getObjectsRevised() {
        return objectsRevised;
    }

    /**
     * Sets the value of the objectsRevised property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectsRevised }
     *     
     */
    public void setObjectsRevised(ObjectsRevised value) {
        this.objectsRevised = value;
    }

    /**
     * Gets the value of the initialProjectRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getInitialProjectRef() {
        return initialProjectRef;
    }

    /**
     * Sets the value of the initialProjectRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setInitialProjectRef(Object value) {
        this.initialProjectRef = value;
    }

}
