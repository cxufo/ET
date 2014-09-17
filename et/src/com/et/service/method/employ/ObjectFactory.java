package com.et.service.method.employ;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import com.et.service.javabean.Employ;

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

	private final static QName _GetEmployByIdResponse_QNAME = new QName(
			"http://service.webservice.etwebservice.com/",
			"getEmployByIdResponse");
	private final static QName _GetEmployAll_QNAME = new QName(
			"http://service.webservice.etwebservice.com/", "getEmployAll");
	private final static QName _InsertEmploy_QNAME = new QName(
			"http://service.webservice.etwebservice.com/", "insertEmploy");
	private final static QName _DeleteEmploy_QNAME = new QName(
			"http://service.webservice.etwebservice.com/", "deleteEmploy");
	private final static QName _DeleteEmployResponse_QNAME = new QName(
			"http://service.webservice.etwebservice.com/",
			"deleteEmployResponse");
	private final static QName _GetEmploy_QNAME = new QName(
			"http://service.webservice.etwebservice.com/", "getEmploy");
	private final static QName _UpdateEmploy_QNAME = new QName(
			"http://service.webservice.etwebservice.com/", "updateEmploy");
	private final static QName _UpdateEmployResponse_QNAME = new QName(
			"http://service.webservice.etwebservice.com/",
			"updateEmployResponse");
	private final static QName _InsertEmployResponse_QNAME = new QName(
			"http://service.webservice.etwebservice.com/",
			"insertEmployResponse");
	private final static QName _GetEmployResponse_QNAME = new QName(
			"http://service.webservice.etwebservice.com/", "getEmployResponse");
	private final static QName _GetEmployAllResponse_QNAME = new QName(
			"http://service.webservice.etwebservice.com/",
			"getEmployAllResponse");
	private final static QName _GetEmployById_QNAME = new QName(
			"http://service.webservice.etwebservice.com/", "getEmployById");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package: com.et.service.api
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link DeleteEmployResponse }
	 * 
	 */
	public DeleteEmployResponse createDeleteEmployResponse() {
		return new DeleteEmployResponse();
	}

	/**
	 * Create an instance of {@link GetEmployByIdResponse }
	 * 
	 */
	public GetEmployByIdResponse createGetEmployByIdResponse() {
		return new GetEmployByIdResponse();
	}

	/**
	 * Create an instance of {@link GetEmployResponse }
	 * 
	 */
	public GetEmployResponse createGetEmployResponse() {
		return new GetEmployResponse();
	}

	/**
	 * Create an instance of {@link GetEmployAll }
	 * 
	 */
	public GetEmployAll createGetEmployAll() {
		return new GetEmployAll();
	}

	/**
	 * Create an instance of {@link InsertEmployResponse }
	 * 
	 */
	public InsertEmployResponse createInsertEmployResponse() {
		return new InsertEmployResponse();
	}

	/**
	 * Create an instance of {@link UpdateEmployResponse }
	 * 
	 */
	public UpdateEmployResponse createUpdateEmployResponse() {
		return new UpdateEmployResponse();
	}

	/**
	 * Create an instance of {@link GetEmploy }
	 * 
	 */
	public GetEmploy createGetEmploy() {
		return new GetEmploy();
	}

	/**
	 * Create an instance of {@link DeleteEmploy }
	 * 
	 */
	public DeleteEmploy createDeleteEmploy() {
		return new DeleteEmploy();
	}

	/**
	 * Create an instance of {@link InsertEmploy }
	 * 
	 */
	public InsertEmploy createInsertEmploy() {
		return new InsertEmploy();
	}

	/**
	 * Create an instance of {@link GetEmployAllResponse }
	 * 
	 */
	public GetEmployAllResponse createGetEmployAllResponse() {
		return new GetEmployAllResponse();
	}

	/**
	 * Create an instance of {@link UpdateEmploy }
	 * 
	 */
	public UpdateEmploy createUpdateEmploy() {
		return new UpdateEmploy();
	}

	/**
	 * Create an instance of {@link Employ }
	 * 
	 */
	public Employ createEmploy() {
		return new Employ();
	}

	/**
	 * Create an instance of {@link GetEmployById }
	 * 
	 */
	public GetEmployById createGetEmployById() {
		return new GetEmployById();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GetEmployByIdResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "getEmployByIdResponse")
	public JAXBElement<GetEmployByIdResponse> createGetEmployByIdResponse(
			GetEmployByIdResponse value) {
		return new JAXBElement<GetEmployByIdResponse>(
				_GetEmployByIdResponse_QNAME, GetEmployByIdResponse.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link GetEmployAll }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "getEmployAll")
	public JAXBElement<GetEmployAll> createGetEmployAll(GetEmployAll value) {
		return new JAXBElement<GetEmployAll>(_GetEmployAll_QNAME,
				GetEmployAll.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link InsertEmploy }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "insertEmploy")
	public JAXBElement<InsertEmploy> createInsertEmploy(InsertEmploy value) {
		return new JAXBElement<InsertEmploy>(_InsertEmploy_QNAME,
				InsertEmploy.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link DeleteEmploy }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "deleteEmploy")
	public JAXBElement<DeleteEmploy> createDeleteEmploy(DeleteEmploy value) {
		return new JAXBElement<DeleteEmploy>(_DeleteEmploy_QNAME,
				DeleteEmploy.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link DeleteEmployResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "deleteEmployResponse")
	public JAXBElement<DeleteEmployResponse> createDeleteEmployResponse(
			DeleteEmployResponse value) {
		return new JAXBElement<DeleteEmployResponse>(
				_DeleteEmployResponse_QNAME, DeleteEmployResponse.class, null,
				value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link GetEmploy }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "getEmploy")
	public JAXBElement<GetEmploy> createGetEmploy(GetEmploy value) {
		return new JAXBElement<GetEmploy>(_GetEmploy_QNAME, GetEmploy.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link UpdateEmploy }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "updateEmploy")
	public JAXBElement<UpdateEmploy> createUpdateEmploy(UpdateEmploy value) {
		return new JAXBElement<UpdateEmploy>(_UpdateEmploy_QNAME,
				UpdateEmploy.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link UpdateEmployResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "updateEmployResponse")
	public JAXBElement<UpdateEmployResponse> createUpdateEmployResponse(
			UpdateEmployResponse value) {
		return new JAXBElement<UpdateEmployResponse>(
				_UpdateEmployResponse_QNAME, UpdateEmployResponse.class, null,
				value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link InsertEmployResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "insertEmployResponse")
	public JAXBElement<InsertEmployResponse> createInsertEmployResponse(
			InsertEmployResponse value) {
		return new JAXBElement<InsertEmployResponse>(
				_InsertEmployResponse_QNAME, InsertEmployResponse.class, null,
				value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GetEmployResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "getEmployResponse")
	public JAXBElement<GetEmployResponse> createGetEmployResponse(
			GetEmployResponse value) {
		return new JAXBElement<GetEmployResponse>(_GetEmployResponse_QNAME,
				GetEmployResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GetEmployAllResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "getEmployAllResponse")
	public JAXBElement<GetEmployAllResponse> createGetEmployAllResponse(
			GetEmployAllResponse value) {
		return new JAXBElement<GetEmployAllResponse>(
				_GetEmployAllResponse_QNAME, GetEmployAllResponse.class, null,
				value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link GetEmployById }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "getEmployById")
	public JAXBElement<GetEmployById> createGetEmployById(GetEmployById value) {
		return new JAXBElement<GetEmployById>(_GetEmployById_QNAME,
				GetEmployById.class, null, value);
	}

}
