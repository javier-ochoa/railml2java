//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.05.25 at 11:54:17 AM EEST 
//


package railml;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * list of main ETCS variables of the RBC
 * 
 * <p>Java class for EtcsGeneralData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EtcsGeneralData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.railml.org/schemas/3.2}BasicEntityIL"&gt;
 *       &lt;sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="mVersion" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *       &lt;attribute name="nidCountry" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *       &lt;attribute name="nidRBC" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *       &lt;attribute name="nidRadio" type="{https://www.railml.org/schemas/3.2}tHexaString" /&gt;
 *       &lt;attribute name="nidRadioNetwork" type="{https://www.railml.org/schemas/3.2}tHexa6String" /&gt;
 *       &lt;anyAttribute namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EtcsGeneralData")
public class EtcsGeneralData
    extends BasicEntityIL
{

    @XmlAttribute(name = "mVersion")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger mVersion;
    @XmlAttribute(name = "nidCountry")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger nidCountry;
    @XmlAttribute(name = "nidRBC")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger nidRBC;
    @XmlAttribute(name = "nidRadio")
    protected String nidRadio;
    @XmlAttribute(name = "nidRadioNetwork")
    protected String nidRadioNetwork;

    /**
     * Gets the value of the mVersion property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMVersion() {
        return mVersion;
    }

    /**
     * Sets the value of the mVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMVersion(BigInteger value) {
        this.mVersion = value;
    }

    /**
     * Gets the value of the nidCountry property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNidCountry() {
        return nidCountry;
    }

    /**
     * Sets the value of the nidCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNidCountry(BigInteger value) {
        this.nidCountry = value;
    }

    /**
     * Gets the value of the nidRBC property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNidRBC() {
        return nidRBC;
    }

    /**
     * Sets the value of the nidRBC property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNidRBC(BigInteger value) {
        this.nidRBC = value;
    }

    /**
     * Gets the value of the nidRadio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNidRadio() {
        return nidRadio;
    }

    /**
     * Sets the value of the nidRadio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNidRadio(String value) {
        this.nidRadio = value;
    }

    /**
     * Gets the value of the nidRadioNetwork property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNidRadioNetwork() {
        return nidRadioNetwork;
    }

    /**
     * Sets the value of the nidRadioNetwork property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNidRadioNetwork(String value) {
        this.nidRadioNetwork = value;
    }

}
