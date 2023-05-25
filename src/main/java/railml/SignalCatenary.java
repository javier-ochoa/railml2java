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
 * <p>Java class for SignalCatenary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SignalCatenary"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.railml.org/schemas/3.2}SignalX"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="refersToElectrificationSection" type="{https://www.railml.org/schemas/3.2}tElementWithIDref" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="type" type="{https://www.railml.org/schemas/3.2}tSignalCatenaryType" /&gt;
 *       &lt;anyAttribute namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignalCatenary", propOrder = {
    "refersToElectrificationSection"
})
public class SignalCatenary
    extends SignalX
{

    protected TElementWithIDref refersToElectrificationSection;
    @XmlAttribute(name = "type")
    protected TSignalCatenaryType type;

    /**
     * Gets the value of the refersToElectrificationSection property.
     * 
     * @return
     *     possible object is
     *     {@link TElementWithIDref }
     *     
     */
    public TElementWithIDref getRefersToElectrificationSection() {
        return refersToElectrificationSection;
    }

    /**
     * Sets the value of the refersToElectrificationSection property.
     * 
     * @param value
     *     allowed object is
     *     {@link TElementWithIDref }
     *     
     */
    public void setRefersToElectrificationSection(TElementWithIDref value) {
        this.refersToElectrificationSection = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link TSignalCatenaryType }
     *     
     */
    public TSignalCatenaryType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link TSignalCatenaryType }
     *     
     */
    public void setType(TSignalCatenaryType value) {
        this.type = value;
    }

}
