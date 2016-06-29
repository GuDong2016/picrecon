
package com.ccf.mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for doAllCardReconforPhone complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="doAllCardReconforPhone">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paramdata" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="signdata" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="imgtype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "doAllCardReconforPhone", propOrder = {
    "username",
    "paramdata",
    "signdata",
    "imgtype"
})
public class DoAllCardReconforPhone {

    protected String username;
    protected String paramdata;
    protected String signdata;
    protected String imgtype;

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the paramdata property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParamdata() {
        return paramdata;
    }

    /**
     * Sets the value of the paramdata property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParamdata(String value) {
        this.paramdata = value;
    }

    /**
     * Gets the value of the signdata property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSigndata() {
        return signdata;
    }

    /**
     * Sets the value of the signdata property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSigndata(String value) {
        this.signdata = value;
    }

    /**
     * Gets the value of the imgtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImgtype() {
        return imgtype;
    }

    /**
     * Sets the value of the imgtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImgtype(String value) {
        this.imgtype = value;
    }

}
