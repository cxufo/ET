package com.et.service.method.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import com.et.service.javabean.Service;

/**
 * <p>
 * Java class for deleteService complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="deleteService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://service.webservice.etwebservice.com/}service" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteService", propOrder = { "arg0" })
public class DeleteService {

	protected Service arg0;

	/**
	 * Gets the value of the arg0 property.
	 * 
	 * @return possible object is {@link Service }
	 * 
	 */
	public Service getArg0() {
		return arg0;
	}

	/**
	 * Sets the value of the arg0 property.
	 * 
	 * @param value
	 *            allowed object is {@link Service }
	 * 
	 */
	public void setArg0(Service value) {
		this.arg0 = value;
	}

}
