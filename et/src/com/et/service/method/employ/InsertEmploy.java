package com.et.service.method.employ;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import com.et.service.javabean.Employ;

/**
 * <p>
 * Java class for insertEmploy complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="insertEmploy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://service.webservice.etwebservice.com/}employ" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insertEmploy", propOrder = { "arg0" })
public class InsertEmploy {

	protected Employ arg0;

	/**
	 * Gets the value of the arg0 property.
	 * 
	 * @return possible object is {@link Employ }
	 * 
	 */
	public Employ getArg0() {
		return arg0;
	}

	/**
	 * Sets the value of the arg0 property.
	 * 
	 * @param value
	 *            allowed object is {@link Employ }
	 * 
	 */
	public void setArg0(Employ value) {
		this.arg0 = value;
	}

}
