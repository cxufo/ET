package com.et.service.method.ETIntroduction;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import com.et.service.javabean.Introduction;

/**
 * <p>
 * Java class for updateIntro complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="updateIntro">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://service.webservice.etwebservice.com/}introduction" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateIntro", propOrder = { "arg0" })
public class UpdateIntro {

	protected Introduction arg0;

	/**
	 * Gets the value of the arg0 property.
	 * 
	 * @return possible object is {@link Introduction }
	 * 
	 */
	public Introduction getArg0() {
		return arg0;
	}

	/**
	 * Sets the value of the arg0 property.
	 * 
	 * @param value
	 *            allowed object is {@link Introduction }
	 * 
	 */
	public void setArg0(Introduction value) {
		this.arg0 = value;
	}

}
