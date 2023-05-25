//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.05.25 at 11:54:17 AM EEST 
//


package railml;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * This is the top level element for railML3 positioning and coordinate systems model.
 * 
 * <p>Java class for PositioningSystems complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PositioningSystems"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="geometricPositioningSystems" type="{https://www.railml.org/schemas/3.2}GeometricPositioningSystems" minOccurs="0"/&gt;
 *         &lt;element name="linearPositioningSystems" type="{https://www.railml.org/schemas/3.2}LinearPositioningSystems" minOccurs="0"/&gt;
 *         &lt;element name="screenPositioningSystems" type="{https://www.railml.org/schemas/3.2}ScreenPositioningSystems" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PositioningSystems", propOrder = {
    "geometricPositioningSystems",
    "linearPositioningSystems",
    "screenPositioningSystems"
})
public class PositioningSystems {

    protected GeometricPositioningSystems geometricPositioningSystems;
    protected LinearPositioningSystems linearPositioningSystems;
    protected ScreenPositioningSystems screenPositioningSystems;

    /**
     * Gets the value of the geometricPositioningSystems property.
     * 
     * @return
     *     possible object is
     *     {@link GeometricPositioningSystems }
     *     
     */
    public GeometricPositioningSystems getGeometricPositioningSystems() {
        return geometricPositioningSystems;
    }

    /**
     * Sets the value of the geometricPositioningSystems property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeometricPositioningSystems }
     *     
     */
    public void setGeometricPositioningSystems(GeometricPositioningSystems value) {
        this.geometricPositioningSystems = value;
    }

    /**
     * Gets the value of the linearPositioningSystems property.
     * 
     * @return
     *     possible object is
     *     {@link LinearPositioningSystems }
     *     
     */
    public LinearPositioningSystems getLinearPositioningSystems() {
        return linearPositioningSystems;
    }

    /**
     * Sets the value of the linearPositioningSystems property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinearPositioningSystems }
     *     
     */
    public void setLinearPositioningSystems(LinearPositioningSystems value) {
        this.linearPositioningSystems = value;
    }

    /**
     * Gets the value of the screenPositioningSystems property.
     * 
     * @return
     *     possible object is
     *     {@link ScreenPositioningSystems }
     *     
     */
    public ScreenPositioningSystems getScreenPositioningSystems() {
        return screenPositioningSystems;
    }

    /**
     * Sets the value of the screenPositioningSystems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScreenPositioningSystems }
     *     
     */
    public void setScreenPositioningSystems(ScreenPositioningSystems value) {
        this.screenPositioningSystems = value;
    }

}
