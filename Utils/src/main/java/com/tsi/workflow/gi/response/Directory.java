//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.28 at 02:51:03 PM IST 
//

package com.tsi.workflow.gi.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "hostOrIP", "userID", "path" })
@XmlRootElement(name = "Directory")
public class Directory {

    @XmlElement(name = "HostOrIP", required = true)
    protected String hostOrIP;
    @XmlElement(name = "UserID", required = true)
    protected String userID;
    @XmlElement(name = "Path", required = true)
    protected String path;

    /**
     * Gets the value of the hostOrIP property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getHostOrIP() {
	return hostOrIP;
    }

    /**
     * Sets the value of the hostOrIP property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setHostOrIP(String value) {
	this.hostOrIP = value;
    }

    /**
     * Gets the value of the userID property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getUserID() {
	return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setUserID(String value) {
	this.userID = value;
    }

    /**
     * Gets the value of the path property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getPath() {
	return path;
    }

    /**
     * Sets the value of the path property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setPath(String value) {
	this.path = value;
    }

}