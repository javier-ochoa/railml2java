//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.05.25 at 11:54:17 AM EEST 
//


package railml;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeometryPoint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeometryPoint"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.railml.org/schemas/3.2}GeometryEntity"&gt;
 *       &lt;sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="radius" type="{https://www.railml.org/schemas/3.2}tLengthM" /&gt;
 *       &lt;attribute name="gradient" type="{https://www.railml.org/schemas/3.2}tGradientPerMille" /&gt;
 *       &lt;attribute name="azimuth" type="{https://www.railml.org/schemas/3.2}tAngleDeg" /&gt;
 *       &lt;anyAttribute namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeometryPoint")
public class GeometryPoint
    extends GeometryEntity
{

    @XmlAttribute(name = "radius")
    protected BigDecimal radius;
    @XmlAttribute(name = "gradient")
    protected BigDecimal gradient;
    @XmlAttribute(name = "azimuth")
    protected BigDecimal azimuth;

    /**
     * Gets the value of the radius property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRadius() {
        return radius;
    }

    /**
     * Sets the value of the radius property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRadius(BigDecimal value) {
        this.radius = value;
    }

    /**
     * Gets the value of the gradient property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGradient() {
        return gradient;
    }

    /**
     * Sets the value of the gradient property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGradient(BigDecimal value) {
        this.gradient = value;
    }

    /**
     * Gets the value of the azimuth property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAzimuth() {
        return azimuth;
    }

    /**
     * Sets the value of the azimuth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAzimuth(BigDecimal value) {
        this.azimuth = value;
    }

}
