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
 * <p>Java class for tLineOperationMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="tLineOperationMode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DE:DB:408"/&gt;
 *     &lt;enumeration value="DE:DB:436"/&gt;
 *     &lt;enumeration value="DE:DB:437"/&gt;
 *     &lt;enumeration value="DE:DB:438"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "tLineOperationMode")
@XmlEnum
public enum TLineOperationMode {

    @XmlEnumValue("DE:DB:408")
    DE_DB_408("DE:DB:408"),
    @XmlEnumValue("DE:DB:436")
    DE_DB_436("DE:DB:436"),
    @XmlEnumValue("DE:DB:437")
    DE_DB_437("DE:DB:437"),
    @XmlEnumValue("DE:DB:438")
    DE_DB_438("DE:DB:438");
    private final String value;

    TLineOperationMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TLineOperationMode fromValue(String v) {
        for (TLineOperationMode c: TLineOperationMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
