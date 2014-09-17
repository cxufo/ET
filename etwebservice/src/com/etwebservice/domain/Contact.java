package com.etwebservice.domain;

public class Contact {
	private int contactId;
	private String phoneNumber;
	private String qq;
	private String adress;
	private String fax;
	private String email;

	public Contact() {
	}

	public Contact(int contactId, String phoneNumber, String qq, String adress,
			String fax, String email) {
		this.contactId = contactId;
		this.phoneNumber = phoneNumber;
		this.qq = qq;
		this.adress = adress;
		this.fax = fax;
		this.email = email;
	}

	public int getContactId() {
		return contactId;
	}

	public void setContactId(int contactId) {
		this.contactId = contactId;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
