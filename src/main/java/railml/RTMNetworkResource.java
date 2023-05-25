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
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RTM_NetworkResource complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RTM_NetworkResource"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.railml.org/schemas/3.2}RTM_NamedResource"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="isValid" type="{https://www.railml.org/schemas/3.2}RTM_Validity" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RTM_NetworkResource", propOrder = {
    "isValid"
})
@XmlSeeAlso({
    RTMNetElement.class,
    RTMRelation.class,
    RTMNetEntity.class
})
public class RTMNetworkResource
    extends RTMNamedResource
{

    protected List<RTMValidity> isValid;

    /**
     * Gets the value of the isValid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the isValid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsValid().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RTMValidity }
     * 
     * 
     */
    public List<RTMValidity> getIsValid() {
        if (isValid == null) {
            isValid = new ArrayList<RTMValidity>();
        }
        return this.isValid;
    }

}
