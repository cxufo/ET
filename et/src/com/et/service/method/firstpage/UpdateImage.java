package com.et.service.method.firstpage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import com.et.service.javabean.FirstPage;

/**
 * <p>
 * Java class for updateImage complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="updateImage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://service.webservice.etwebservice.com/}firstPage" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateImage", propOrder = { "arg0" })
public class UpdateImage {

	protected FirstPage arg0;

	/**
	 * Gets the value of the arg0 property.
	 * 
	 * @return possible object is {@link FirstPage }
	 * 
	 */
	public FirstPage getArg0() {
		return arg0;
	}

	/**
	 * Sets the value of the arg0 property.
	 * 
	 * @param value
	 *            allowed object is {@link FirstPage }
	 * 
	 */
	public void setArg0(FirstPage value) {
		this.arg0 = value;
	}

}
