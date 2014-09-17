package com.et.service.method.contact;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import com.et.service.javabean.Contact;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the com.et.service.api package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

	private final static QName _UpdateResponse_QNAME = new QName(
			"http://service.webservice.etwebservice.com/", "updateResponse");
	private final static QName _Update_QNAME = new QName(
			"http://service.webservice.etwebservice.com/", "update");
	private final static QName _InsertContact_QNAME = new QName(
			"http://service.webservice.etwebservice.com/", "insertContact");
	private final static QName _GetContactResponse_QNAME = new QName(
			"http://service.webservice.etwebservice.com/", "getContactResponse");
	private final static QName _InsertContactResponse_QNAME = new QName(
			"http://service.webservice.etwebservice.com/",
			"insertContactResponse");
	private final static QName _GetContact_QNAME = new QName(
			"http://service.webservice.etwebservice.com/", "getContact");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package: com.et.service.api
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link GetContact }
	 * 
	 */
	public GetContact createGetContact() {
		return new GetContact();
	}

	/**
	 * Create an instance of {@link Update }
	 * 
	 */
	public Update createUpdate() {
		return new Update();
	}

	/**
	 * Create an instance of {@link InsertContact }
	 * 
	 */
	public InsertContact createInsertContact() {
		return new InsertContact();
	}

	/**
	 * Create an instance of {@link InsertContactResponse }
	 * 
	 */
	public InsertContactResponse createInsertContactResponse() {
		return new InsertContactResponse();
	}

	/**
	 * Create an instance of {@link Contact }
	 * 
	 */
	public Contact createContact() {
		return new Contact();
	}

	/**
	 * Create an instance of {@link UpdateResponse }
	 * 
	 */
	public UpdateResponse createUpdateResponse() {
		return new UpdateResponse();
	}

	/**
	 * Create an instance of {@link GetContactResponse }
	 * 
	 */
	public GetContactResponse createGetContactResponse() {
		return new GetContactResponse();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link UpdateResponse }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "updateResponse")
	public JAXBElement<UpdateResponse> createUpdateResponse(UpdateResponse value) {
		return new JAXBElement<UpdateResponse>(_UpdateResponse_QNAME,
				UpdateResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Update }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "update")
	public JAXBElement<Update> createUpdate(Update value) {
		return new JAXBElement<Update>(_Update_QNAME, Update.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link InsertContact }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "insertContact")
	public JAXBElement<InsertContact> createInsertContact(InsertContact value) {
		return new JAXBElement<InsertContact>(_InsertContact_QNAME,
				InsertContact.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GetContactResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "getContactResponse")
	public JAXBElement<GetContactResponse> createGetContactResponse(
			GetContactResponse value) {
		return new JAXBElement<GetContactResponse>(_GetContactResponse_QNAME,
				GetContactResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link InsertContactResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "insertContactResponse")
	public JAXBElement<InsertContactResponse> createInsertContactResponse(
			InsertContactResponse value) {
		return new JAXBElement<InsertContactResponse>(
				_InsertContactResponse_QNAME, InsertContactResponse.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link GetContact }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "getContact")
	public JAXBElement<GetContact> createGetContact(GetContact value) {
		return new JAXBElement<GetContact>(_GetContact_QNAME, GetContact.class,
				null, value);
	}

}
