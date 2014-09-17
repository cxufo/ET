package com.et.service.javabean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for news complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="news">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="newsContent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newsId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="newsTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newsTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "news", propOrder = { "newsContent", "newsId", "newsTime",
		"newsTitle" })
public class News {

	protected String newsContent;
	protected int newsId;
	protected String newsTime;
	protected String newsTitle;

	/**
	 * Gets the value of the newsContent property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNewsContent() {
		return newsContent;
	}

	/**
	 * Sets the value of the newsContent property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setNewsContent(String value) {
		this.newsContent = value;
	}

	/**
	 * Gets the value of the newsId property.
	 * 
	 */
	public int getNewsId() {
		return newsId;
	}

	/**
	 * Sets the value of the newsId property.
	 * 
	 */
	public void setNewsId(int value) {
		this.newsId = value;
	}

	/**
	 * Gets the value of the newsTime property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNewsTime() {
		return newsTime;
	}

	/**
	 * Sets the value of the newsTime property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setNewsTime(String value) {
		this.newsTime = value;
	}

	/**
	 * Gets the value of the newsTitle property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNewsTitle() {
		return newsTitle;
	}

	/**
	 * Sets the value of the newsTitle property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setNewsTitle(String value) {
		this.newsTitle = value;
	}

}
