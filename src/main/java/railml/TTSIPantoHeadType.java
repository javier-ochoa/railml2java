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
 * <p>Java class for tTSIPantoHeadType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="tTSIPantoHeadType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="none"/&gt;
 *     &lt;enumeration value="tsi1600"/&gt;
 *     &lt;enumeration value="tsi1950"/&gt;
 *     &lt;enumeration value="tsi2000_2260"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "tTSIPantoHeadType")
@XmlEnum
public enum TTSIPantoHeadType {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("tsi1600")
    TSI_1600("tsi1600"),
    @XmlEnumValue("tsi1950")
    TSI_1950("tsi1950"),
    @XmlEnumValue("tsi2000_2260")
    TSI_2000_2260("tsi2000_2260");
    private final String value;

    TTSIPantoHeadType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TTSIPantoHeadType fromValue(String v) {
        for (TTSIPantoHeadType c: TTSIPantoHeadType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
