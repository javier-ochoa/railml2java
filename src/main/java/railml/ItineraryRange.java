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
 * <p>Java class for ItineraryRange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItineraryRange"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="baseItineraryRef" use="required" type="{https://www.railml.org/schemas/3.2}tRef" /&gt;
 *       &lt;attribute name="offset" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
 *       &lt;attribute name="start" type="{https://www.railml.org/schemas/3.2}tRef" /&gt;
 *       &lt;attribute name="end" type="{https://www.railml.org/schemas/3.2}tRef" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItineraryRange")
public class ItineraryRange {

    @XmlAttribute(name = "baseItineraryRef", required = true)
    protected String baseItineraryRef;
    @XmlAttribute(name = "offset")
    protected Duration offset;
    @XmlAttribute(name = "start")
    protected String start;
    @XmlAttribute(name = "end")
    protected String end;

    /**
     * Gets the value of the baseItineraryRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseItineraryRef() {
        return baseItineraryRef;
    }

    /**
     * Sets the value of the baseItineraryRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseItineraryRef(String value) {
        this.baseItineraryRef = value;
    }

    /**
     * Gets the value of the offset property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getOffset() {
        return offset;
    }

    /**
     * Sets the value of the offset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setOffset(Duration value) {
        this.offset = value;
    }

    /**
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStart(String value) {
        this.start = value;
    }

    /**
     * Gets the value of the end property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnd() {
        return end;
    }

    /**
     * Sets the value of the end property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnd(String value) {
        this.end = value;
    }

}
