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
 * <p>Java class for tIxlTechnologyTypeList.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="tIxlTechnologyTypeList"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="digital"/&gt;
 *     &lt;enumeration value="electromechanical"/&gt;
 *     &lt;enumeration value="electronic"/&gt;
 *     &lt;enumeration value="manual"/&gt;
 *     &lt;enumeration value="mechanical"/&gt;
 *     &lt;enumeration value="relay"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "tIxlTechnologyTypeList")
@XmlEnum
public enum TIxlTechnologyTypeList {

    @XmlEnumValue("digital")
    DIGITAL("digital"),
    @XmlEnumValue("electromechanical")
    ELECTROMECHANICAL("electromechanical"),
    @XmlEnumValue("electronic")
    ELECTRONIC("electronic"),
    @XmlEnumValue("manual")
    MANUAL("manual"),
    @XmlEnumValue("mechanical")
    MECHANICAL("mechanical"),
    @XmlEnumValue("relay")
    RELAY("relay");
    private final String value;

    TIxlTechnologyTypeList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TIxlTechnologyTypeList fromValue(String v) {
        for (TIxlTechnologyTypeList c: TIxlTechnologyTypeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
