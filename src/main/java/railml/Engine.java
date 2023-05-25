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
 * The main data of the traction system of the vehicle. The data are only valid per powerMode, which also includes the electrificationSystem. If there is more than one engine element per vehicle the powerMode must be set.
 * 
 * <p>Java class for Engine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Engine"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.railml.org/schemas/3.2}BasicEntityRS"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="powerMode" type="{https://www.railml.org/schemas/3.2}TractionMode" minOccurs="0"/&gt;
 *         &lt;element name="tractiveEffort" type="{https://www.railml.org/schemas/3.2}Curve" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="tractivePower" type="{https://www.railml.org/schemas/3.2}tPowerWatt" /&gt;
 *       &lt;anyAttribute namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Engine", propOrder = {
    "powerMode",
    "tractiveEffort"
})
public class Engine
    extends BasicEntityRS
{

    protected TractionMode powerMode;
    protected Curve tractiveEffort;
    @XmlAttribute(name = "tractivePower")
    protected BigDecimal tractivePower;

    /**
     * Gets the value of the powerMode property.
     * 
     * @return
     *     possible object is
     *     {@link TractionMode }
     *     
     */
    public TractionMode getPowerMode() {
        return powerMode;
    }

    /**
     * Sets the value of the powerMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TractionMode }
     *     
     */
    public void setPowerMode(TractionMode value) {
        this.powerMode = value;
    }

    /**
     * Gets the value of the tractiveEffort property.
     * 
     * @return
     *     possible object is
     *     {@link Curve }
     *     
     */
    public Curve getTractiveEffort() {
        return tractiveEffort;
    }

    /**
     * Sets the value of the tractiveEffort property.
     * 
     * @param value
     *     allowed object is
     *     {@link Curve }
     *     
     */
    public void setTractiveEffort(Curve value) {
        this.tractiveEffort = value;
    }

    /**
     * Gets the value of the tractivePower property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTractivePower() {
        return tractivePower;
    }

    /**
     * Sets the value of the tractivePower property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTractivePower(BigDecimal value) {
        this.tractivePower = value;
    }

}
