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
 * <p>Java class for OperatingDayValidity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperatingDayValidity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.railml.org/schemas/3.2}WeekDayPeriod"&gt;
 *       &lt;sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="timetableScenarioRef" type="{https://www.railml.org/schemas/3.2}tRef" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperatingDayValidity")
public class OperatingDayValidity
    extends WeekDayPeriod
{

    @XmlAttribute(name = "timetableScenarioRef")
    protected String timetableScenarioRef;

    /**
     * Gets the value of the timetableScenarioRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimetableScenarioRef() {
        return timetableScenarioRef;
    }

    /**
     * Sets the value of the timetableScenarioRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimetableScenarioRef(String value) {
        this.timetableScenarioRef = value;
    }

}
