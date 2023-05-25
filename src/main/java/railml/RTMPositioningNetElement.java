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
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RTM_PositioningNetElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RTM_PositioningNetElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.railml.org/schemas/3.2}RTM_CompositionNetElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="associatedPositioningSystem" type="{https://www.railml.org/schemas/3.2}RTM_AssociatedPositioningSystem" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RTM_PositioningNetElement", propOrder = {
    "associatedPositioningSystem"
})
@XmlSeeAlso({
    RTMLinearNetElement.class,
    RTMNonLinearNetElement.class,
    NetElement.class
})
public class RTMPositioningNetElement
    extends RTMCompositionNetElement
{

    @XmlElement(required = true)
    protected List<RTMAssociatedPositioningSystem> associatedPositioningSystem;

    /**
     * Gets the value of the associatedPositioningSystem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the associatedPositioningSystem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssociatedPositioningSystem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RTMAssociatedPositioningSystem }
     * 
     * 
     */
    public List<RTMAssociatedPositioningSystem> getAssociatedPositioningSystem() {
        if (associatedPositioningSystem == null) {
            associatedPositioningSystem = new ArrayList<RTMAssociatedPositioningSystem>();
        }
        return this.associatedPositioningSystem;
    }

}
