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
 * <p>Java class for ExternalReferenceTrain complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExternalReferenceTrain"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="externalTrainNumber" type="{https://www.railml.org/schemas/3.2}ExternalTrainNumber"/&gt;
 *           &lt;element name="tafTapTsiId" type="{https://www.railml.org/schemas/3.2}TafTapTsiId"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExternalReferenceTrain", propOrder = {
    "externalTrainNumber",
    "tafTapTsiId"
})
public class ExternalReferenceTrain {

    protected ExternalTrainNumber externalTrainNumber;
    protected TafTapTsiId tafTapTsiId;

    /**
     * Gets the value of the externalTrainNumber property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalTrainNumber }
     *     
     */
    public ExternalTrainNumber getExternalTrainNumber() {
        return externalTrainNumber;
    }

    /**
     * Sets the value of the externalTrainNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalTrainNumber }
     *     
     */
    public void setExternalTrainNumber(ExternalTrainNumber value) {
        this.externalTrainNumber = value;
    }

    /**
     * Gets the value of the tafTapTsiId property.
     * 
     * @return
     *     possible object is
     *     {@link TafTapTsiId }
     *     
     */
    public TafTapTsiId getTafTapTsiId() {
        return tafTapTsiId;
    }

    /**
     * Sets the value of the tafTapTsiId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TafTapTsiId }
     *     
     */
    public void setTafTapTsiId(TafTapTsiId value) {
        this.tafTapTsiId = value;
    }

}
