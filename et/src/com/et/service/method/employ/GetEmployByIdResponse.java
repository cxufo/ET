package com.et.service.method.employ;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.et.service.javabean.Employ;

/**
 * <p>
 * Java class for getEmployByIdResponse complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="getEmployByIdResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://service.webservice.etwebservice.com/}employ" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getEmployByIdResponse", propOrder = { "_return" })
public class GetEmployByIdResponse {

	@XmlElement(name = "return")
	protected Employ _return;

	/**
	 * Gets the value of the return property.
	 * 
	 * @return possible object is {@link Employ }
	 * 
	 */
	public Employ getReturn() {
		return _return;
	}

	/**
	 * Sets the value of the return property.
	 * 
	 * @param value
	 *            allowed object is {@link Employ }
	 * 
	 */
	public void setReturn(Employ value) {
		this._return = value;
	}

}
