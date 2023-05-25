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
 * <p>Java class for tGenericResetStrategyList.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="tGenericResetStrategyList"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="conditionalReset"/&gt;
 *     &lt;enumeration value="procedure"/&gt;
 *     &lt;enumeration value="sweepRunWithConfirmation"/&gt;
 *     &lt;enumeration value="sweepRunWithoutConfirmation"/&gt;
 *     &lt;enumeration value="unconditionalReset"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "tGenericResetStrategyList")
@XmlEnum
public enum TGenericResetStrategyList {

    @XmlEnumValue("conditionalReset")
    CONDITIONAL_RESET("conditionalReset"),
    @XmlEnumValue("procedure")
    PROCEDURE("procedure"),
    @XmlEnumValue("sweepRunWithConfirmation")
    SWEEP_RUN_WITH_CONFIRMATION("sweepRunWithConfirmation"),
    @XmlEnumValue("sweepRunWithoutConfirmation")
    SWEEP_RUN_WITHOUT_CONFIRMATION("sweepRunWithoutConfirmation"),
    @XmlEnumValue("unconditionalReset")
    UNCONDITIONAL_RESET("unconditionalReset");
    private final String value;

    TGenericResetStrategyList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TGenericResetStrategyList fromValue(String v) {
        for (TGenericResetStrategyList c: TGenericResetStrategyList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
