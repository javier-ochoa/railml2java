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
 * <p>Java class for tTrackType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="tTrackType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="mainTrack"/&gt;
 *     &lt;enumeration value="secondaryTrack"/&gt;
 *     &lt;enumeration value="sidingTrack"/&gt;
 *     &lt;enumeration value="connectingTrack"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "tTrackType")
@XmlEnum
public enum TTrackType {


    /**
     * CH: Hauptgleis (signalisiertes Gleis)
     * CZ: Hlavní kolej
     * DE: durchgehendes Hauptgleis
     * NL: Hoofdspoorweg
     * NO: hovedspor
     * 
     */
    @XmlEnumValue("mainTrack")
    MAIN_TRACK("mainTrack"),

    /**
     * CZ: Spojovací kolej
     * DE: nicht-durchgehendes Hauptgleis
     * NL: Lokaalspoorweg
     * NO: øvrige
     * 
     */
    @XmlEnumValue("secondaryTrack")
    SECONDARY_TRACK("secondaryTrack"),

    /**
     * CH: Nebengleis (nicht-signalisiertes Gleis)
     * CZ: Manipulacní koleje
     * DE: Nebengleis
     * NL: Raccordement
     * NO: Sidespor
     * 
     */
    @XmlEnumValue("sidingTrack")
    SIDING_TRACK("sidingTrack"),

    /**
     * CZ: Kolejová spojka
     * DE: Gleisverbindung
     * NO: øvrige
     * 
     */
    @XmlEnumValue("connectingTrack")
    CONNECTING_TRACK("connectingTrack");
    private final String value;

    TTrackType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TTrackType fromValue(String v) {
        for (TTrackType c: TTrackType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
