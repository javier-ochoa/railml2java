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
 * <p>Java class for RuntimeReserveType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="RuntimeReserveType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="general"/&gt;
 *     &lt;enumeration value="qualityByInfrastructureManager"/&gt;
 *     &lt;enumeration value="qualityByRailwayUndertaking"/&gt;
 *     &lt;enumeration value="synchronization"/&gt;
 *     &lt;enumeration value="trackworkByInfrastructureManager"/&gt;
 *     &lt;enumeration value="unspecified"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RuntimeReserveType")
@XmlEnum
public enum RuntimeReserveType {


    /**
     * General as defined by UIC 451-1:2000
     * 
     */
    @XmlEnumValue("general")
    GENERAL("general"),
    @XmlEnumValue("qualityByInfrastructureManager")
    QUALITY_BY_INFRASTRUCTURE_MANAGER("qualityByInfrastructureManager"),
    @XmlEnumValue("qualityByRailwayUndertaking")
    QUALITY_BY_RAILWAY_UNDERTAKING("qualityByRailwayUndertaking"),

    /**
     * Used for synchronizing regular schedules (i.e. trains that run repeatedly during the day - once per hour)
     * 
     */
    @XmlEnumValue("synchronization")
    SYNCHRONIZATION("synchronization"),
    @XmlEnumValue("trackworkByInfrastructureManager")
    TRACKWORK_BY_INFRASTRUCTURE_MANAGER("trackworkByInfrastructureManager"),

    /**
     * Can be used if no information about the type of supplement can be provided.
     * 
     */
    @XmlEnumValue("unspecified")
    UNSPECIFIED("unspecified");
    private final String value;

    RuntimeReserveType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RuntimeReserveType fromValue(String v) {
        for (RuntimeReserveType c: RuntimeReserveType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
