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
 * <p>Java class for tBaliseGroupCoverage.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="tBaliseGroupCoverage"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="both"/&gt;
 *     &lt;enumeration value="none"/&gt;
 *     &lt;enumeration value="physical"/&gt;
 *     &lt;enumeration value="virtual"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "tBaliseGroupCoverage")
@XmlEnum
public enum TBaliseGroupCoverage {

    @XmlEnumValue("both")
    BOTH("both"),
    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("physical")
    PHYSICAL("physical"),
    @XmlEnumValue("virtual")
    VIRTUAL("virtual");
    private final String value;

    TBaliseGroupCoverage(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TBaliseGroupCoverage fromValue(String v) {
        for (TBaliseGroupCoverage c: TBaliseGroupCoverage.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
