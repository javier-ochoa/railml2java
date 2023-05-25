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
 * Instance of a virtual logical object used for indication of route status on HMI
 * 
 * <p>Java class for RouteStatusIndicator complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RouteStatusIndicator"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.railml.org/schemas/3.2}IndicatingObject"&gt;
 *       &lt;sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="positionInRoute" type="{https://www.railml.org/schemas/3.2}tIndicatorPositionList" /&gt;
 *       &lt;anyAttribute namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouteStatusIndicator")
public class RouteStatusIndicator
    extends IndicatingObject
{

    @XmlAttribute(name = "positionInRoute")
    protected TIndicatorPositionList positionInRoute;

    /**
     * Gets the value of the positionInRoute property.
     * 
     * @return
     *     possible object is
     *     {@link TIndicatorPositionList }
     *     
     */
    public TIndicatorPositionList getPositionInRoute() {
        return positionInRoute;
    }

    /**
     * Sets the value of the positionInRoute property.
     * 
     * @param value
     *     allowed object is
     *     {@link TIndicatorPositionList }
     *     
     */
    public void setPositionInRoute(TIndicatorPositionList value) {
        this.positionInRoute = value;
    }

}
