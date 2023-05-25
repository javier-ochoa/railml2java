//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.05.25 at 11:54:17 AM EEST 
//


package railml;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MaxTrainCurrent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaxTrainCurrent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="maxCurrent" type="{https://www.railml.org/schemas/3.2}tCurrentAmpere" /&gt;
 *       &lt;attribute name="trainType" type="{https://www.railml.org/schemas/3.2}tOperationalTrainType" /&gt;
 *       &lt;attribute name="operationType" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="validFor" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaxTrainCurrent")
public class MaxTrainCurrent {

    @XmlAttribute(name = "maxCurrent")
    protected BigDecimal maxCurrent;
    @XmlAttribute(name = "trainType")
    protected TOperationalTrainType trainType;
    @XmlAttribute(name = "operationType")
    protected Integer operationType;
    @XmlAttribute(name = "validFor")
    protected Integer validFor;

    /**
     * Gets the value of the maxCurrent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxCurrent() {
        return maxCurrent;
    }

    /**
     * Sets the value of the maxCurrent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxCurrent(BigDecimal value) {
        this.maxCurrent = value;
    }

    /**
     * Gets the value of the trainType property.
     * 
     * @return
     *     possible object is
     *     {@link TOperationalTrainType }
     *     
     */
    public TOperationalTrainType getTrainType() {
        return trainType;
    }

    /**
     * Sets the value of the trainType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TOperationalTrainType }
     *     
     */
    public void setTrainType(TOperationalTrainType value) {
        this.trainType = value;
    }

    /**
     * Gets the value of the operationType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOperationType() {
        return operationType;
    }

    /**
     * Sets the value of the operationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOperationType(Integer value) {
        this.operationType = value;
    }

    /**
     * Gets the value of the validFor property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getValidFor() {
        return validFor;
    }

    /**
     * Sets the value of the validFor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setValidFor(Integer value) {
        this.validFor = value;
    }

}
