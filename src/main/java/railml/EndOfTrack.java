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
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The "End of Track" is used for the interlocking system to mark a functional limit. It might be a physical end or just a end of supervision for the interlocking system.
 * 
 * <p>Java class for EndOfTrack complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EndOfTrack"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.railml.org/schemas/3.2}TrackAsset"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="refersTo" type="{https://www.railml.org/schemas/3.2}EntityILref"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="realisation" use="required" type="{https://www.railml.org/schemas/3.2}EndOfTrackTypeList" /&gt;
 *       &lt;anyAttribute namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EndOfTrack", propOrder = {
    "refersTo"
})
public class EndOfTrack
    extends TrackAsset
{

    @XmlElement(required = true)
    protected EntityILref refersTo;
    @XmlAttribute(name = "realisation", required = true)
    protected EndOfTrackTypeList realisation;

    /**
     * Gets the value of the refersTo property.
     * 
     * @return
     *     possible object is
     *     {@link EntityILref }
     *     
     */
    public EntityILref getRefersTo() {
        return refersTo;
    }

    /**
     * Sets the value of the refersTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityILref }
     *     
     */
    public void setRefersTo(EntityILref value) {
        this.refersTo = value;
    }

    /**
     * Gets the value of the realisation property.
     * 
     * @return
     *     possible object is
     *     {@link EndOfTrackTypeList }
     *     
     */
    public EndOfTrackTypeList getRealisation() {
        return realisation;
    }

    /**
     * Sets the value of the realisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndOfTrackTypeList }
     *     
     */
    public void setRealisation(EndOfTrackTypeList value) {
        this.realisation = value;
    }

}
