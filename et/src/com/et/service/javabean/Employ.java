package com.et.service.javabean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for employ complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="employ">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="adress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="count" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="detail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="educational" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="employId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="job" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "employ", propOrder = { "adress", "count", "date", "detail",
		"educational", "employId", "job" })
public class Employ {

	protected String adress;
	protected int count;
	protected String date;
	protected String detail;
	protected String educational;
	protected int employId;
	protected String job;

	/**
	 * Gets the value of the adress property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAdress() {
		return adress;
	}

	/**
	 * Sets the value of the adress property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAdress(String value) {
		this.adress = value;
	}

	/**
	 * Gets the value of the count property.
	 * 
	 */
	public int getCount() {
		return count;
	}

	/**
	 * Sets the value of the count property.
	 * 
	 */
	public void setCount(int value) {
		this.count = value;
	}

	/**
	 * Gets the value of the date property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDate() {
		return date;
	}

	/**
	 * Sets the value of the date property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDate(String value) {
		this.date = value;
	}

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
	 * Gets the value of the educational property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEducational() {
		return educational;
	}

	/**
	 * Sets the value of the educational property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setEducational(String value) {
		this.educational = value;
	}

	/**
	 * Gets the value of the employId property.
	 * 
	 */
	public int getEmployId() {
		return employId;
	}

	/**
	 * Sets the value of the employId property.
	 * 
	 */
	public void setEmployId(int value) {
		this.employId = value;
	}

	/**
	 * Gets the value of the job property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getJob() {
		return job;
	}

	/**
	 * Sets the value of the job property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setJob(String value) {
		this.job = value;
	}

}
