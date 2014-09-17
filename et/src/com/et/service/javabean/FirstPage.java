package com.et.service.javabean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for firstPage complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="firstPage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fimageId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fImage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "firstPage", propOrder = { "fimageId", "fImage" })
public class FirstPage {

	protected int fimageId;
	protected String fImage;

	/**
	 * Gets the value of the fimageId property.
	 * 
	 */
	public int getFimageId() {
		return fimageId;
	}

	/**
	 * Sets the value of the fimageId property.
	 * 
	 */
	public void setFimageId(int value) {
		this.fimageId = value;
	}

	/**
	 * Gets the value of the fImage property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFImage() {
		return fImage;
	}

	/**
	 * Sets the value of the fImage property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFImage(String value) {
		this.fImage = value;
	}

}
