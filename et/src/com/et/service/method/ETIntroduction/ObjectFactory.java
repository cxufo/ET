package com.et.service.method.ETIntroduction;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import com.et.service.javabean.Introduction;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the com.et.service.javabean package.
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

	private final static QName _GetAllIntroduction_QNAME = new QName(
			"http://service.webservice.etwebservice.com/", "getAllIntroduction");
	private final static QName _DeleteIntro_QNAME = new QName(
			"http://service.webservice.etwebservice.com/", "deleteIntro");
	private final static QName _InsertIntroResponse_QNAME = new QName(
			"http://service.webservice.etwebservice.com/",
			"insertIntroResponse");
	private final static QName _UpdateIntro_QNAME = new QName(
			"http://service.webservice.etwebservice.com/", "updateIntro");
	private final static QName _InsertIntro_QNAME = new QName(
			"http://service.webservice.etwebservice.com/", "insertIntro");
	private final static QName _GetAllIntroductionResponse_QNAME = new QName(
			"http://service.webservice.etwebservice.com/",
			"getAllIntroductionResponse");
	private final static QName _GetIntroIdNameImage_QNAME = new QName(
			"http://service.webservice.etwebservice.com/",
			"getIntroIdNameImage");
	private final static QName _UpdateIntroResponse_QNAME = new QName(
			"http://service.webservice.etwebservice.com/",
			"updateIntroResponse");
	private final static QName _DeleteIntroResponse_QNAME = new QName(
			"http://service.webservice.etwebservice.com/",
			"deleteIntroResponse");
	private final static QName _GetIntroIdNameImageResponse_QNAME = new QName(
			"http://service.webservice.etwebservice.com/",
			"getIntroIdNameImageResponse");
	private final static QName _GetIntroductionByNameResponse_QNAME = new QName(
			"http://service.webservice.etwebservice.com/",
			"getIntroductionByNameResponse");
	private final static QName _GetIntroductionByIdResponse_QNAME = new QName(
			"http://service.webservice.etwebservice.com/",
			"getIntroductionByIdResponse");
	private final static QName _GetIntroductionByName_QNAME = new QName(
			"http://service.webservice.etwebservice.com/",
			"getIntroductionByName");
	private final static QName _GetIntroductionById_QNAME = new QName(
			"http://service.webservice.etwebservice.com/",
			"getIntroductionById");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package: com.et.service.javabean
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link GetIntroIdNameImageResponse }
	 * 
	 */
	public GetIntroIdNameImageResponse createGetIntroIdNameImageResponse() {
		return new GetIntroIdNameImageResponse();
	}

	/**
	 * Create an instance of {@link InsertIntro }
	 * 
	 */
	public InsertIntro createInsertIntro() {
		return new InsertIntro();
	}

	/**
	 * Create an instance of {@link UpdateIntro }
	 * 
	 */
	public UpdateIntro createUpdateIntro() {
		return new UpdateIntro();
	}

	/**
	 * Create an instance of {@link GetIntroductionById }
	 * 
	 */
	public GetIntroductionById createGetIntroductionById() {
		return new GetIntroductionById();
	}

	/**
	 * Create an instance of {@link GetIntroductionByIdResponse }
	 * 
	 */
	public GetIntroductionByIdResponse createGetIntroductionByIdResponse() {
		return new GetIntroductionByIdResponse();
	}

	/**
	 * Create an instance of {@link GetIntroIdNameImage }
	 * 
	 */
	public GetIntroIdNameImage createGetIntroIdNameImage() {
		return new GetIntroIdNameImage();
	}

	/**
	 * Create an instance of {@link GetIntroductionByNameResponse }
	 * 
	 */
	public GetIntroductionByNameResponse createGetIntroductionByNameResponse() {
		return new GetIntroductionByNameResponse();
	}

	/**
	 * Create an instance of {@link GetIntroductionByName }
	 * 
	 */
	public GetIntroductionByName createGetIntroductionByName() {
		return new GetIntroductionByName();
	}

	/**
	 * Create an instance of {@link DeleteIntro }
	 * 
	 */
	public DeleteIntro createDeleteIntro() {
		return new DeleteIntro();
	}

	/**
	 * Create an instance of {@link Introduction }
	 * 
	 */
	public Introduction createIntroduction() {
		return new Introduction();
	}

	/**
	 * Create an instance of {@link DeleteIntroResponse }
	 * 
	 */
	public DeleteIntroResponse createDeleteIntroResponse() {
		return new DeleteIntroResponse();
	}

	/**
	 * Create an instance of {@link GetAllIntroductionResponse }
	 * 
	 */
	public GetAllIntroductionResponse createGetAllIntroductionResponse() {
		return new GetAllIntroductionResponse();
	}

	/**
	 * Create an instance of {@link GetAllIntroduction }
	 * 
	 */
	public GetAllIntroduction createGetAllIntroduction() {
		return new GetAllIntroduction();
	}

	/**
	 * Create an instance of {@link UpdateIntroResponse }
	 * 
	 */
	public UpdateIntroResponse createUpdateIntroResponse() {
		return new UpdateIntroResponse();
	}

	/**
	 * Create an instance of {@link InsertIntroResponse }
	 * 
	 */
	public InsertIntroResponse createInsertIntroResponse() {
		return new InsertIntroResponse();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GetAllIntroduction }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "getAllIntroduction")
	public JAXBElement<GetAllIntroduction> createGetAllIntroduction(
			GetAllIntroduction value) {
		return new JAXBElement<GetAllIntroduction>(_GetAllIntroduction_QNAME,
				GetAllIntroduction.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link DeleteIntro }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "deleteIntro")
	public JAXBElement<DeleteIntro> createDeleteIntro(DeleteIntro value) {
		return new JAXBElement<DeleteIntro>(_DeleteIntro_QNAME,
				DeleteIntro.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link InsertIntroResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "insertIntroResponse")
	public JAXBElement<InsertIntroResponse> createInsertIntroResponse(
			InsertIntroResponse value) {
		return new JAXBElement<InsertIntroResponse>(_InsertIntroResponse_QNAME,
				InsertIntroResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link UpdateIntro }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "updateIntro")
	public JAXBElement<UpdateIntro> createUpdateIntro(UpdateIntro value) {
		return new JAXBElement<UpdateIntro>(_UpdateIntro_QNAME,
				UpdateIntro.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link InsertIntro }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "insertIntro")
	public JAXBElement<InsertIntro> createInsertIntro(InsertIntro value) {
		return new JAXBElement<InsertIntro>(_InsertIntro_QNAME,
				InsertIntro.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GetAllIntroductionResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "getAllIntroductionResponse")
	public JAXBElement<GetAllIntroductionResponse> createGetAllIntroductionResponse(
			GetAllIntroductionResponse value) {
		return new JAXBElement<GetAllIntroductionResponse>(
				_GetAllIntroductionResponse_QNAME,
				GetAllIntroductionResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GetIntroIdNameImage }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "getIntroIdNameImage")
	public JAXBElement<GetIntroIdNameImage> createGetIntroIdNameImage(
			GetIntroIdNameImage value) {
		return new JAXBElement<GetIntroIdNameImage>(_GetIntroIdNameImage_QNAME,
				GetIntroIdNameImage.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link UpdateIntroResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "updateIntroResponse")
	public JAXBElement<UpdateIntroResponse> createUpdateIntroResponse(
			UpdateIntroResponse value) {
		return new JAXBElement<UpdateIntroResponse>(_UpdateIntroResponse_QNAME,
				UpdateIntroResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link DeleteIntroResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "deleteIntroResponse")
	public JAXBElement<DeleteIntroResponse> createDeleteIntroResponse(
			DeleteIntroResponse value) {
		return new JAXBElement<DeleteIntroResponse>(_DeleteIntroResponse_QNAME,
				DeleteIntroResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GetIntroIdNameImageResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "getIntroIdNameImageResponse")
	public JAXBElement<GetIntroIdNameImageResponse> createGetIntroIdNameImageResponse(
			GetIntroIdNameImageResponse value) {
		return new JAXBElement<GetIntroIdNameImageResponse>(
				_GetIntroIdNameImageResponse_QNAME,
				GetIntroIdNameImageResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GetIntroductionByNameResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "getIntroductionByNameResponse")
	public JAXBElement<GetIntroductionByNameResponse> createGetIntroductionByNameResponse(
			GetIntroductionByNameResponse value) {
		return new JAXBElement<GetIntroductionByNameResponse>(
				_GetIntroductionByNameResponse_QNAME,
				GetIntroductionByNameResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GetIntroductionByIdResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "getIntroductionByIdResponse")
	public JAXBElement<GetIntroductionByIdResponse> createGetIntroductionByIdResponse(
			GetIntroductionByIdResponse value) {
		return new JAXBElement<GetIntroductionByIdResponse>(
				_GetIntroductionByIdResponse_QNAME,
				GetIntroductionByIdResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GetIntroductionByName }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "getIntroductionByName")
	public JAXBElement<GetIntroductionByName> createGetIntroductionByName(
			GetIntroductionByName value) {
		return new JAXBElement<GetIntroductionByName>(
				_GetIntroductionByName_QNAME, GetIntroductionByName.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GetIntroductionById }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "getIntroductionById")
	public JAXBElement<GetIntroductionById> createGetIntroductionById(
			GetIntroductionById value) {
		return new JAXBElement<GetIntroductionById>(_GetIntroductionById_QNAME,
				GetIntroductionById.class, null, value);
	}

}
