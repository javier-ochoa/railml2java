//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.05.25 at 11:54:17 AM EEST 
//


package railml;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeometricPositioningSystems complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeometricPositioningSystems"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="geometricPositioningSystem" type="{https://www.railml.org/schemas/3.2}RTM_GeometricPositioningSystem" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeometricPositioningSystems", propOrder = {
    "geometricPositioningSystem"
})
public class GeometricPositioningSystems {

    @XmlElement(required = true)
    protected List<RTMGeometricPositioningSystem> geometricPositioningSystem;

    /**
     * Gets the value of the geometricPositioningSystem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the geometricPositioningSystem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeometricPositioningSystem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RTMGeometricPositioningSystem }
     * 
     * 
     */
    public List<RTMGeometricPositioningSystem> getGeometricPositioningSystem() {
        if (geometricPositioningSystem == null) {
            geometricPositioningSystem = new ArrayList<RTMGeometricPositioningSystem>();
        }
        return this.geometricPositioningSystem;
    }

}
