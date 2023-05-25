//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.05.25 at 11:54:17 AM EEST 
//


package railml;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InterruptionReason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="InterruptionReason"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CausesOfOtherIM"/&gt;
 *     &lt;enumeration value="CausesOfOtherRU"/&gt;
 *     &lt;enumeration value="CivilEngineeringCauses"/&gt;
 *     &lt;enumeration value="CommercialCauses"/&gt;
 *     &lt;enumeration value="ExternalCauses"/&gt;
 *     &lt;enumeration value="InfrastructureInstallations"/&gt;
 *     &lt;enumeration value="OperationalPlanning"/&gt;
 *     &lt;enumeration value="Rollingstock"/&gt;
 *     &lt;enumeration value="SecondaryCauses"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InterruptionReason")
@XmlEnum
public enum InterruptionReason {

    @XmlEnumValue("CausesOfOtherIM")
    CAUSES_OF_OTHER_IM("CausesOfOtherIM"),
    @XmlEnumValue("CausesOfOtherRU")
    CAUSES_OF_OTHER_RU("CausesOfOtherRU"),
    @XmlEnumValue("CivilEngineeringCauses")
    CIVIL_ENGINEERING_CAUSES("CivilEngineeringCauses"),
    @XmlEnumValue("CommercialCauses")
    COMMERCIAL_CAUSES("CommercialCauses"),
    @XmlEnumValue("ExternalCauses")
    EXTERNAL_CAUSES("ExternalCauses"),
    @XmlEnumValue("InfrastructureInstallations")
    INFRASTRUCTURE_INSTALLATIONS("InfrastructureInstallations"),
    @XmlEnumValue("OperationalPlanning")
    OPERATIONAL_PLANNING("OperationalPlanning"),
    @XmlEnumValue("Rollingstock")
    ROLLINGSTOCK("Rollingstock"),
    @XmlEnumValue("SecondaryCauses")
    SECONDARY_CAUSES("SecondaryCauses");
    private final String value;

    InterruptionReason(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InterruptionReason fromValue(String v) {
        for (InterruptionReason c: InterruptionReason.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
