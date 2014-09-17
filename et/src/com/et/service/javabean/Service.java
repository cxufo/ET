package com.et.service.javabean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for service complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="service">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="detail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="image" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="serviceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "service", propOrder = { "detail", "image", "serviceId",
		"serviceName" })
public class Service {

	protected String detail;
	protected String image;
	protected int serviceId;
	protected String serviceName;

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
	 * Gets the value of the serviceId property.
	 * 
	 */
	public int getServiceId() {
		return serviceId;
	}

	/**
	 * Sets the value of the serviceId property.
	 * 
	 */
	public void setServiceId(int value) {
		this.serviceId = value;
	}

	/**
	 * Gets the value of the serviceName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getServiceName() {
		return serviceName;
	}

	/**
	 * Sets the value of the serviceName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setServiceName(String value) {
		this.serviceName = value;
	}

}
