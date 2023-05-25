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
import jakarta.xml.bind.annotation.XmlType;


/**
 * A special movable bridge (undercrossing) which is used for railway traffic passing a waterway underneath the railway line in normal position but allows for temporarily being moved out of the way of the vessels. It is then not passable by trains.
 * The normal position is locked and supervised by interlocking system. The other control of the bridge is outside the interlocking system.
 * 
 * <p>Java class for MovableBridge complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MovableBridge"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.railml.org/schemas/3.2}LogicalDevice"&gt;
 *       &lt;sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="technicalOpenTime" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
 *       &lt;attribute name="technicalClosingTime" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
 *       &lt;attribute name="typicalNonPassableTime" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
 *       &lt;anyAttribute namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MovableBridge")
public class MovableBridge
    extends LogicalDevice
{

    @XmlAttribute(name = "technicalOpenTime")
    protected Duration technicalOpenTime;
    @XmlAttribute(name = "technicalClosingTime")
    protected Duration technicalClosingTime;
    @XmlAttribute(name = "typicalNonPassableTime")
    protected Duration typicalNonPassableTime;

    /**
     * Gets the value of the technicalOpenTime property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTechnicalOpenTime() {
        return technicalOpenTime;
    }

    /**
     * Sets the value of the technicalOpenTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTechnicalOpenTime(Duration value) {
        this.technicalOpenTime = value;
    }

    /**
     * Gets the value of the technicalClosingTime property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTechnicalClosingTime() {
        return technicalClosingTime;
    }

    /**
     * Sets the value of the technicalClosingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTechnicalClosingTime(Duration value) {
        this.technicalClosingTime = value;
    }

    /**
     * Gets the value of the typicalNonPassableTime property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTypicalNonPassableTime() {
        return typicalNonPassableTime;
    }

    /**
     * Sets the value of the typicalNonPassableTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTypicalNonPassableTime(Duration value) {
        this.typicalNonPassableTime = value;
    }

}
