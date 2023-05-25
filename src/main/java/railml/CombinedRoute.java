//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.05.25 at 11:54:17 AM EEST 
//


package railml;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * CombinedRoute is a concatenation of single routes providing a continuous path for traffic movement which the interlocking can activate by one action.
 * As routeSequence it is a list of routes describing the train path trough a network.
 * 
 * <p>Java class for CombinedRoute complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CombinedRoute"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.railml.org/schemas/3.2}RouteObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="comboEntry" type="{https://www.railml.org/schemas/3.2}EntityILref"/&gt;
 *         &lt;element name="comboExit" type="{https://www.railml.org/schemas/3.2}EntityILref"/&gt;
 *         &lt;element name="containsRoute" type="{https://www.railml.org/schemas/3.2}EntityILref" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="priorityRank" type="{https://www.railml.org/schemas/3.2}tPriority" /&gt;
 *       &lt;anyAttribute namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CombinedRoute", propOrder = {
    "comboEntry",
    "comboExit",
    "containsRoute"
})
public class CombinedRoute
    extends RouteObject
{

    @XmlElement(required = true)
    protected EntityILref comboEntry;
    @XmlElement(required = true)
    protected EntityILref comboExit;
    @XmlElement(required = true)
    protected List<EntityILref> containsRoute;
    @XmlAttribute(name = "priorityRank")
    protected BigInteger priorityRank;

    /**
     * Gets the value of the comboEntry property.
     * 
     * @return
     *     possible object is
     *     {@link EntityILref }
     *     
     */
    public EntityILref getComboEntry() {
        return comboEntry;
    }

    /**
     * Sets the value of the comboEntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityILref }
     *     
     */
    public void setComboEntry(EntityILref value) {
        this.comboEntry = value;
    }

    /**
     * Gets the value of the comboExit property.
     * 
     * @return
     *     possible object is
     *     {@link EntityILref }
     *     
     */
    public EntityILref getComboExit() {
        return comboExit;
    }

    /**
     * Sets the value of the comboExit property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityILref }
     *     
     */
    public void setComboExit(EntityILref value) {
        this.comboExit = value;
    }

    /**
     * Gets the value of the containsRoute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the containsRoute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContainsRoute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityILref }
     * 
     * 
     */
    public List<EntityILref> getContainsRoute() {
        if (containsRoute == null) {
            containsRoute = new ArrayList<EntityILref>();
        }
        return this.containsRoute;
    }

    /**
     * Gets the value of the priorityRank property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPriorityRank() {
        return priorityRank;
    }

    /**
     * Sets the value of the priorityRank property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPriorityRank(BigInteger value) {
        this.priorityRank = value;
    }

}
