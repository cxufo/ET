package com.et.service.javabean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for team complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="team">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="detail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="image" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="job" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="memberId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "team", propOrder = { "detail", "image", "job", "memberId",
		"name", "sign" })
public class Team {

	protected String detail;
	protected String image;
	protected String job;
	protected int memberId;
	protected String name;
	protected String sign;

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

	/**
	 * Gets the value of the memberId property.
	 * 
	 */
	public int getMemberId() {
		return memberId;
	}

	/**
	 * Sets the value of the memberId property.
	 * 
	 */
	public void setMemberId(int value) {
		this.memberId = value;
	}

	/**
	 * Gets the value of the name property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the value of the name property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setName(String value) {
		this.name = value;
	}

	/**
	 * Gets the value of the sign property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSign() {
		return sign;
	}

	/**
	 * Sets the value of the sign property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSign(String value) {
		this.sign = value;
	}

}
