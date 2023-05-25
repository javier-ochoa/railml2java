//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.05.25 at 11:54:17 AM EEST 
//


package railml;

import javax.xml.datatype.Duration;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The train detector and/or TVD section(s) that deactivates the level crossing or other barrier. This may be the level crossing tracks, e.g. km 12.809/2, that would appear on signalling plans.
 * 
 * <p>Java class for BarrierDeactivator complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BarrierDeactivator"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.railml.org/schemas/3.2}BasicEntityIL"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tvdDetectorRef" type="{https://www.railml.org/schemas/3.2}EntityILref"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="delay" use="required" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
 *       &lt;anyAttribute namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BarrierDeactivator", propOrder = {
    "tvdDetectorRef"
})
public class BarrierDeactivator
    extends BasicEntityIL
{

    @XmlElement(required = true)
    protected EntityILref tvdDetectorRef;
    @XmlAttribute(name = "delay", required = true)
    protected Duration delay;

    /**
     * Gets the value of the tvdDetectorRef property.
     * 
     * @return
     *     possible object is
     *     {@link EntityILref }
     *     
     */
    public EntityILref getTvdDetectorRef() {
        return tvdDetectorRef;
    }

    /**
     * Sets the value of the tvdDetectorRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityILref }
     *     
     */
    public void setTvdDetectorRef(EntityILref value) {
        this.tvdDetectorRef = value;
    }

    /**
     * Gets the value of the delay property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDelay() {
        return delay;
    }

    /**
     * Sets the value of the delay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDelay(Duration value) {
        this.delay = value;
    }

}
