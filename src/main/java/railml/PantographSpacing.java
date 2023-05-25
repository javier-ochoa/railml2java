//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.05.25 at 11:54:17 AM EEST 
//


package railml;

import java.math.BigDecimal;
import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PantographSpacing complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PantographSpacing"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="numberPantographsRaised" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="spacingPantographsRaised" type="{https://www.railml.org/schemas/3.2}tLengthM" /&gt;
 *       &lt;attribute name="speed4PantographSpacing" type="{https://www.railml.org/schemas/3.2}tSpeedKmPerHour" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PantographSpacing")
public class PantographSpacing {

    @XmlAttribute(name = "numberPantographsRaised")
    protected BigInteger numberPantographsRaised;
    @XmlAttribute(name = "spacingPantographsRaised")
    protected BigDecimal spacingPantographsRaised;
    @XmlAttribute(name = "speed4PantographSpacing")
    protected BigDecimal speed4PantographSpacing;

    /**
     * Gets the value of the numberPantographsRaised property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberPantographsRaised() {
        return numberPantographsRaised;
    }

    /**
     * Sets the value of the numberPantographsRaised property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberPantographsRaised(BigInteger value) {
        this.numberPantographsRaised = value;
    }

    /**
     * Gets the value of the spacingPantographsRaised property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSpacingPantographsRaised() {
        return spacingPantographsRaised;
    }

    /**
     * Sets the value of the spacingPantographsRaised property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSpacingPantographsRaised(BigDecimal value) {
        this.spacingPantographsRaised = value;
    }

    /**
     * Gets the value of the speed4PantographSpacing property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSpeed4PantographSpacing() {
        return speed4PantographSpacing;
    }

    /**
     * Sets the value of the speed4PantographSpacing property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSpeed4PantographSpacing(BigDecimal value) {
        this.speed4PantographSpacing = value;
    }

}
