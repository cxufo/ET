package com.etwebservice.webservice.service;

import com.etwebservice.dao.ContactDao;
import com.etwebservice.domain.Contact;
import com.etwebservice.util.Json;

@javax.jws.WebService(targetNamespace = "http://service.webservice.etwebservice.com/", serviceName = "ETContactService", portName = "ETContactPort", wsdlLocation = "WEB-INF/wsdl/ETContactService.wsdl")
public class ETContactDelegate {

	com.etwebservice.webservice.service.ETContact eTContact = new com.etwebservice.webservice.service.ETContact();

	public Boolean insertContact(Contact contact) {
		return eTContact.insertContact(contact);
	}

	public Boolean update(Contact contact) {
		return eTContact.update(contact);
	}

	public String getContact() {
		return eTContact.getContact();
	}

}