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
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A tuple (signal, aspect). Refers to a signal and an aspect. Used for expressing concepts like signal 1105 shows yellow flashing.
 * 
 * <p>Java class for SignalAndAspect complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SignalAndAspect"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.railml.org/schemas/3.2}AssetAndState"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="refersToSignal" type="{https://www.railml.org/schemas/3.2}EntityILref"/&gt;
 *         &lt;element name="showsAspect" type="{https://www.railml.org/schemas/3.2}EntityILref" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;anyAttribute namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignalAndAspect", propOrder = {
    "refersToSignal",
    "showsAspect"
})
@XmlSeeAlso({
    AspectRelatedBarrierDelay.class
})
public class SignalAndAspect
    extends AssetAndState
{

    @XmlElement(required = true)
    protected EntityILref refersToSignal;
    @XmlElement(required = true)
    protected List<EntityILref> showsAspect;

    /**
     * Gets the value of the refersToSignal property.
     * 
     * @return
     *     possible object is
     *     {@link EntityILref }
     *     
     */
    public EntityILref getRefersToSignal() {
        return refersToSignal;
    }

    /**
     * Sets the value of the refersToSignal property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityILref }
     *     
     */
    public void setRefersToSignal(EntityILref value) {
        this.refersToSignal = value;
    }

    /**
     * Gets the value of the showsAspect property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the showsAspect property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShowsAspect().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityILref }
     * 
     * 
     */
    public List<EntityILref> getShowsAspect() {
        if (showsAspect == null) {
            showsAspect = new ArrayList<EntityILref>();
        }
        return this.showsAspect;
    }

}
