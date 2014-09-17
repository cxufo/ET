package com.et.service.javabean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for introduction complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="introduction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="detail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="image" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="introId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="introItem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "introduction", propOrder = { "detail", "image", "introId",
		"introItem" })
public class Introduction {

	protected String detail;
	protected String image;
	protected int introId;
	protected String introItem;

	/**
	 * Gets the value of the detail property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDetail() {
		return detail;
	}

	/**
	 * Sets the value of the detail property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDetail(String value) {
		this.detail = value;
	}

	/**
	 * Gets the value of the image property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getImage() {
		return image;
	}

	/**
	 * Sets the value of the image property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setImage(String value) {
		this.image = value;
	}

	/**
	 * Gets the value of the introId property.
	 * 
	 */
	public int getIntroId() {
		return introId;
	}

	/**
	 * Sets the value of the introId property.
	 * 
	 */
	public void setIntroId(int value) {
		this.introId = value;
	}

	/**
	 * Gets the value of the introItem property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getIntroItem() {
		return introItem;
	}

	/**
	 * Sets the value of the introItem property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setIntroItem(String value) {
		this.introItem = value;
	}

}
