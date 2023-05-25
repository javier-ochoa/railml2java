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
 * The danger point defines the position beyond the exit signal up to where a train is likely to be safe.
 * Designed for ETCS modelling.
 * 
 * <p>Java class for DangerPoint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DangerPoint"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.railml.org/schemas/3.2}RouteObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="lastSupervisedSectionBeforeDangerPoint" type="{https://www.railml.org/schemas/3.2}EntityILref" minOccurs="0"/&gt;
 *         &lt;element name="situatedAtTrackAsset" type="{https://www.railml.org/schemas/3.2}EntityILref" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="distance" type="{https://www.railml.org/schemas/3.2}tLengthM" /&gt;
 *       &lt;attribute name="releaseSpeed" type="{https://www.railml.org/schemas/3.2}tSpeedKmPerHour" /&gt;
 *       &lt;anyAttribute namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DangerPoint", propOrder = {
    "lastSupervisedSectionBeforeDangerPoint",
    "situatedAtTrackAsset"
})
public class DangerPoint
    extends RouteObject
{

    protected EntityILref lastSupervisedSectionBeforeDangerPoint;
    protected EntityILref situatedAtTrackAsset;
    @XmlAttribute(name = "distance")
    protected BigDecimal distance;
    @XmlAttribute(name = "releaseSpeed")
    protected BigDecimal releaseSpeed;

    /**
     * Gets the value of the lastSupervisedSectionBeforeDangerPoint property.
     * 
     * @return
     *     possible object is
     *     {@link EntityILref }
     *     
     */
    public EntityILref getLastSupervisedSectionBeforeDangerPoint() {
        return lastSupervisedSectionBeforeDangerPoint;
    }

    /**
     * Sets the value of the lastSupervisedSectionBeforeDangerPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityILref }
     *     
     */
    public void setLastSupervisedSectionBeforeDangerPoint(EntityILref value) {
        this.lastSupervisedSectionBeforeDangerPoint = value;
    }

    /**
     * Gets the value of the situatedAtTrackAsset property.
     * 
     * @return
     *     possible object is
     *     {@link EntityILref }
     *     
     */
    public EntityILref getSituatedAtTrackAsset() {
        return situatedAtTrackAsset;
    }

    /**
     * Sets the value of the situatedAtTrackAsset property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityILref }
     *     
     */
    public void setSituatedAtTrackAsset(EntityILref value) {
        this.situatedAtTrackAsset = value;
    }

    /**
     * Gets the value of the distance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDistance() {
        return distance;
    }

    /**
     * Sets the value of the distance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDistance(BigDecimal value) {
        this.distance = value;
    }

    /**
     * Gets the value of the releaseSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReleaseSpeed() {
        return releaseSpeed;
    }

    /**
     * Sets the value of the releaseSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReleaseSpeed(BigDecimal value) {
        this.releaseSpeed = value;
    }

}
