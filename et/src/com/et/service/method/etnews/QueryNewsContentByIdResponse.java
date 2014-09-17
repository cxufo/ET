package com.et.service.method.etnews;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.et.service.javabean.News;

/**
 * <p>
 * Java class for queryNewsContentByIdResponse complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="queryNewsContentByIdResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://service.webservice.etwebservice.com/}news" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "queryNewsContentByIdResponse", propOrder = { "_return" })
public class QueryNewsContentByIdResponse {

	@XmlElement(name = "return")
	protected News _return;

	/**
	 * Gets the value of the return property.
	 * 
	 * @return possible object is {@link News }
	 * 
	 */
	public News getReturn() {
		return _return;
	}

	/**
	 * Sets the value of the return property.
	 * 
	 * @param value
	 *            allowed object is {@link News }
	 * 
	 */
	public void setReturn(News value) {
		this._return = value;
	}

}
