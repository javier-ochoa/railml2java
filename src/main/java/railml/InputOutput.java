//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.05.25 at 11:54:17 AM EEST 
//


package railml;

import java.math.BigInteger;
import javax.xml.datatype.Duration;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The detailed list of input or output information (closed=1=active, open=0=inactive)
 * 
 * <p>Java class for InputOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InputOutput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.railml.org/schemas/3.2}BasicEntityIL"&gt;
 *       &lt;sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="bitNumber" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *       &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="normalState" type="{https://www.railml.org/schemas/3.2}tContactState" /&gt;
 *       &lt;attribute name="pulseDuration" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
 *       &lt;anyAttribute namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InputOutput")
public class InputOutput
    extends BasicEntityIL
{

    @XmlAttribute(name = "bitNumber")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger bitNumber;
    @XmlAttribute(name = "description")
    protected String description;
    @XmlAttribute(name = "normalState")
    protected TContactState normalState;
    @XmlAttribute(name = "pulseDuration")
    protected Duration pulseDuration;

    /**
     * Gets the value of the bitNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBitNumber() {
        return bitNumber;
    }

    /**
     * Sets the value of the bitNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBitNumber(BigInteger value) {
        this.bitNumber = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the normalState property.
     * 
     * @return
     *     possible object is
     *     {@link TContactState }
     *     
     */
    public TContactState getNormalState() {
        return normalState;
    }

    /**
     * Sets the value of the normalState property.
     * 
     * @param value
     *     allowed object is
     *     {@link TContactState }
     *     
     */
    public void setNormalState(TContactState value) {
        this.normalState = value;
    }

    /**
     * Gets the value of the pulseDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getPulseDuration() {
        return pulseDuration;
    }

    /**
     * Sets the value of the pulseDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setPulseDuration(Duration value) {
        this.pulseDuration = value;
    }

}
