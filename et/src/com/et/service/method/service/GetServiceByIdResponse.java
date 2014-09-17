package com.et.service.method.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.et.service.javabean.Service;

/**
 * <p>
 * Java class for getServiceByIdResponse complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="getServiceByIdResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://service.webservice.etwebservice.com/}service" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getServiceByIdResponse", propOrder = { "_return" })
public class GetServiceByIdResponse {

	@XmlElement(name = "return")
	protected Service _return;

	/**
	 * Gets the value of the return property.
	 * 
	 * @return possible object is {@link Service }
	 * 
	 */
	public Service getReturn() {
		return _return;
	}

	/**
	 * Sets the value of the return property.
	 * 
	 * @param value
	 *            allowed object is {@link Service }
	 * 
	 */
	public void setReturn(Service value) {
		this._return = value;
	}

}
