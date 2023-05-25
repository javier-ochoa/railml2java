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
import jakarta.xml.bind.annotation.XmlType;


/**
 * The derailer or trap switch is an infrastructure element that either allows or disallows train passage. A derailer typically operates on one rail only; trap switch (points) have similar effect using both rails to literally derail the train for protection purpose. 
 * Derailers that are locally and manually controlled are obviously not within the scope of an interlocking as the dispatcher will typically prevent trains from derailing by blocking signals leading towards such a device
 * 
 * <p>Java class for DerailerIL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DerailerIL"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.railml.org/schemas/3.2}MovableElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="lockedTrack" type="{https://www.railml.org/schemas/3.2}EntityILref" maxOccurs="2" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="preferredPosition" type="{https://www.railml.org/schemas/3.2}tDerailingPosition" /&gt;
 *       &lt;anyAttribute namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DerailerIL", propOrder = {
    "lockedTrack"
})
public class DerailerIL
    extends MovableElement
{

    protected List<EntityILref> lockedTrack;
    @XmlAttribute(name = "preferredPosition")
    protected TDerailingPosition preferredPosition;

    /**
     * Gets the value of the lockedTrack property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the lockedTrack property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLockedTrack().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityILref }
     * 
     * 
     */
    public List<EntityILref> getLockedTrack() {
        if (lockedTrack == null) {
            lockedTrack = new ArrayList<EntityILref>();
        }
        return this.lockedTrack;
    }

    /**
     * Gets the value of the preferredPosition property.
     * 
     * @return
     *     possible object is
     *     {@link TDerailingPosition }
     *     
     */
    public TDerailingPosition getPreferredPosition() {
        return preferredPosition;
    }

    /**
     * Sets the value of the preferredPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link TDerailingPosition }
     *     
     */
    public void setPreferredPosition(TDerailingPosition value) {
        this.preferredPosition = value;
    }

}
