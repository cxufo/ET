package com.et.service.method.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import com.et.service.javabean.Service;

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

	private final static QName _UpdateServiceDetailResponse_QNAME = new QName(
			"http://service.webservice.etwebservice.com/",
			"updateServiceDetailResponse");
	private final static QName _UpdateService_QNAME = new QName(
			"http://service.webservice.etwebservice.com/", "updateService");
	private final static QName _UpdateServiceNameResponse_QNAME = new QName(
			"http://service.webservice.etwebservice.com/",
			"updateServiceNameResponse");
	private final static QName _UpdateServiceName_QNAME = new QName(
			"http://service.webservice.etwebservice.com/", "updateServiceName");
	private final static QName _GetServiceById_QNAME = new QName(
			"http://service.webservice.etwebservice.com/", "getServiceById");
	private final static QName _DeleteService_QNAME = new QName(
			"http://service.webservice.etwebservice.com/", "deleteService");
	private final static QName _GetService_QNAME = new QName(
			"http://service.webservice.etwebservice.com/", "getService");
	private final static QName _GetServiceByNameResponse_QNAME = new QName(
			"http://service.webservice.etwebservice.com/",
			"getServiceByNameResponse");
	private final static QName _UpdateServiceImageResponse_QNAME = new QName(
			"http://service.webservice.etwebservice.com/",
			"updateServiceImageResponse");
	private final static QName _InsertService_QNAME = new QName(
			"http://service.webservice.etwebservice.com/", "insertService");
	private final static QName _GetServiceAll_QNAME = new QName(
			"http://service.webservice.etwebservice.com/", "getServiceAll");
	private final static QName _GetServiceAllResponse_QNAME = new QName(
			"http://service.webservice.etwebservice.com/",
			"getServiceAllResponse");
	private final static QName _GetServiceResponse_QNAME = new QName(
			"http://service.webservice.etwebservice.com/", "getServiceResponse");
	private final static QName _InsertServiceResponse_QNAME = new QName(
			"http://service.webservice.etwebservice.com/",
			"insertServiceResponse");
	private final static QName _GetServiceByIdResponse_QNAME = new QName(
			"http://service.webservice.etwebservice.com/",
			"getServiceByIdResponse");
	private final static QName _GetServiceByName_QNAME = new QName(
			"http://service.webservice.etwebservice.com/", "getServiceByName");
	private final static QName _UpdateServiceDetail_QNAME = new QName(
			"http://service.webservice.etwebservice.com/",
			"updateServiceDetail");
	private final static QName _UpdateServiceResponse_QNAME = new QName(
			"http://service.webservice.etwebservice.com/",
			"updateServiceResponse");
	private final static QName _UpdateServiceImage_QNAME = new QName(
			"http://service.webservice.etwebservice.com/", "updateServiceImage");
	private final static QName _DeleteServiceResponse_QNAME = new QName(
			"http://service.webservice.etwebservice.com/",
			"deleteServiceResponse");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package: com.et.service.api
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link UpdateServiceName }
	 * 
	 */
	public UpdateServiceName createUpdateServiceName() {
		return new UpdateServiceName();
	}

	/**
	 * Create an instance of {@link UpdateServiceNameResponse }
	 * 
	 */
	public UpdateServiceNameResponse createUpdateServiceNameResponse() {
		return new UpdateServiceNameResponse();
	}

	/**
	 * Create an instance of {@link DeleteService }
	 * 
	 */
	public DeleteService createDeleteService() {
		return new DeleteService();
	}

	/**
	 * Create an instance of {@link UpdateServiceDetail }
	 * 
	 */
	public UpdateServiceDetail createUpdateServiceDetail() {
		return new UpdateServiceDetail();
	}

	/**
	 * Create an instance of {@link GetServiceByNameResponse }
	 * 
	 */
	public GetServiceByNameResponse createGetServiceByNameResponse() {
		return new GetServiceByNameResponse();
	}

	/**
	 * Create an instance of {@link UpdateServiceImage }
	 * 
	 */
	public UpdateServiceImage createUpdateServiceImage() {
		return new UpdateServiceImage();
	}

	/**
	 * Create an instance of {@link Service }
	 * 
	 */
	public Service createService() {
		return new Service();
	}

	/**
	 * Create an instance of {@link GetService }
	 * 
	 */
	public GetService createGetService() {
		return new GetService();
	}

	/**
	 * Create an instance of {@link DeleteServiceResponse }
	 * 
	 */
	public DeleteServiceResponse createDeleteServiceResponse() {
		return new DeleteServiceResponse();
	}

	/**
	 * Create an instance of {@link GetServiceResponse }
	 * 
	 */
	public GetServiceResponse createGetServiceResponse() {
		return new GetServiceResponse();
	}

	/**
	 * Create an instance of {@link UpdateService }
	 * 
	 */
	public UpdateService createUpdateService() {
		return new UpdateService();
	}

	/**
	 * Create an instance of {@link GetServiceByName }
	 * 
	 */
	public GetServiceByName createGetServiceByName() {
		return new GetServiceByName();
	}

	/**
	 * Create an instance of {@link UpdateServiceDetailResponse }
	 * 
	 */
	public UpdateServiceDetailResponse createUpdateServiceDetailResponse() {
		return new UpdateServiceDetailResponse();
	}

	/**
	 * Create an instance of {@link GetServiceAll }
	 * 
	 */
	public GetServiceAll createGetServiceAll() {
		return new GetServiceAll();
	}

	/**
	 * Create an instance of {@link GetServiceByIdResponse }
	 * 
	 */
	public GetServiceByIdResponse createGetServiceByIdResponse() {
		return new GetServiceByIdResponse();
	}

	/**
	 * Create an instance of {@link InsertService }
	 * 
	 */
	public InsertService createInsertService() {
		return new InsertService();
	}

	/**
	 * Create an instance of {@link GetServiceById }
	 * 
	 */
	public GetServiceById createGetServiceById() {
		return new GetServiceById();
	}

	/**
	 * Create an instance of {@link UpdateServiceImageResponse }
	 * 
	 */
	public UpdateServiceImageResponse createUpdateServiceImageResponse() {
		return new UpdateServiceImageResponse();
	}

	/**
	 * Create an instance of {@link InsertServiceResponse }
	 * 
	 */
	public InsertServiceResponse createInsertServiceResponse() {
		return new InsertServiceResponse();
	}

	/**
	 * Create an instance of {@link UpdateServiceResponse }
	 * 
	 */
	public UpdateServiceResponse createUpdateServiceResponse() {
		return new UpdateServiceResponse();
	}

	/**
	 * Create an instance of {@link GetServiceAllResponse }
	 * 
	 */
	public GetServiceAllResponse createGetServiceAllResponse() {
		return new GetServiceAllResponse();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link UpdateServiceDetailResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "updateServiceDetailResponse")
	public JAXBElement<UpdateServiceDetailResponse> createUpdateServiceDetailResponse(
			UpdateServiceDetailResponse value) {
		return new JAXBElement<UpdateServiceDetailResponse>(
				_UpdateServiceDetailResponse_QNAME,
				UpdateServiceDetailResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link UpdateService }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "updateService")
	public JAXBElement<UpdateService> createUpdateService(UpdateService value) {
		return new JAXBElement<UpdateService>(_UpdateService_QNAME,
				UpdateService.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link UpdateServiceNameResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "updateServiceNameResponse")
	public JAXBElement<UpdateServiceNameResponse> createUpdateServiceNameResponse(
			UpdateServiceNameResponse value) {
		return new JAXBElement<UpdateServiceNameResponse>(
				_UpdateServiceNameResponse_QNAME,
				UpdateServiceNameResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link UpdateServiceName }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "updateServiceName")
	public JAXBElement<UpdateServiceName> createUpdateServiceName(
			UpdateServiceName value) {
		return new JAXBElement<UpdateServiceName>(_UpdateServiceName_QNAME,
				UpdateServiceName.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link GetServiceById }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "getServiceById")
	public JAXBElement<GetServiceById> createGetServiceById(GetServiceById value) {
		return new JAXBElement<GetServiceById>(_GetServiceById_QNAME,
				GetServiceById.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link DeleteService }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "deleteService")
	public JAXBElement<DeleteService> createDeleteService(DeleteService value) {
		return new JAXBElement<DeleteService>(_DeleteService_QNAME,
				DeleteService.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link GetService }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "getService")
	public JAXBElement<GetService> createGetService(GetService value) {
		return new JAXBElement<GetService>(_GetService_QNAME, GetService.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GetServiceByNameResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "getServiceByNameResponse")
	public JAXBElement<GetServiceByNameResponse> createGetServiceByNameResponse(
			GetServiceByNameResponse value) {
		return new JAXBElement<GetServiceByNameResponse>(
				_GetServiceByNameResponse_QNAME,
				GetServiceByNameResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link UpdateServiceImageResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "updateServiceImageResponse")
	public JAXBElement<UpdateServiceImageResponse> createUpdateServiceImageResponse(
			UpdateServiceImageResponse value) {
		return new JAXBElement<UpdateServiceImageResponse>(
				_UpdateServiceImageResponse_QNAME,
				UpdateServiceImageResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link InsertService }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "insertService")
	public JAXBElement<InsertService> createInsertService(InsertService value) {
		return new JAXBElement<InsertService>(_InsertService_QNAME,
				InsertService.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link GetServiceAll }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "getServiceAll")
	public JAXBElement<GetServiceAll> createGetServiceAll(GetServiceAll value) {
		return new JAXBElement<GetServiceAll>(_GetServiceAll_QNAME,
				GetServiceAll.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GetServiceAllResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "getServiceAllResponse")
	public JAXBElement<GetServiceAllResponse> createGetServiceAllResponse(
			GetServiceAllResponse value) {
		return new JAXBElement<GetServiceAllResponse>(
				_GetServiceAllResponse_QNAME, GetServiceAllResponse.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GetServiceResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "getServiceResponse")
	public JAXBElement<GetServiceResponse> createGetServiceResponse(
			GetServiceResponse value) {
		return new JAXBElement<GetServiceResponse>(_GetServiceResponse_QNAME,
				GetServiceResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link InsertServiceResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "insertServiceResponse")
	public JAXBElement<InsertServiceResponse> createInsertServiceResponse(
			InsertServiceResponse value) {
		return new JAXBElement<InsertServiceResponse>(
				_InsertServiceResponse_QNAME, InsertServiceResponse.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GetServiceByIdResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "getServiceByIdResponse")
	public JAXBElement<GetServiceByIdResponse> createGetServiceByIdResponse(
			GetServiceByIdResponse value) {
		return new JAXBElement<GetServiceByIdResponse>(
				_GetServiceByIdResponse_QNAME, GetServiceByIdResponse.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GetServiceByName }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "getServiceByName")
	public JAXBElement<GetServiceByName> createGetServiceByName(
			GetServiceByName value) {
		return new JAXBElement<GetServiceByName>(_GetServiceByName_QNAME,
				GetServiceByName.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link UpdateServiceDetail }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "updateServiceDetail")
	public JAXBElement<UpdateServiceDetail> createUpdateServiceDetail(
			UpdateServiceDetail value) {
		return new JAXBElement<UpdateServiceDetail>(_UpdateServiceDetail_QNAME,
				UpdateServiceDetail.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link UpdateServiceResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "updateServiceResponse")
	public JAXBElement<UpdateServiceResponse> createUpdateServiceResponse(
			UpdateServiceResponse value) {
		return new JAXBElement<UpdateServiceResponse>(
				_UpdateServiceResponse_QNAME, UpdateServiceResponse.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link UpdateServiceImage }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "updateServiceImage")
	public JAXBElement<UpdateServiceImage> createUpdateServiceImage(
			UpdateServiceImage value) {
		return new JAXBElement<UpdateServiceImage>(_UpdateServiceImage_QNAME,
				UpdateServiceImage.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link DeleteServiceResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "deleteServiceResponse")
	public JAXBElement<DeleteServiceResponse> createDeleteServiceResponse(
			DeleteServiceResponse value) {
		return new JAXBElement<DeleteServiceResponse>(
				_DeleteServiceResponse_QNAME, DeleteServiceResponse.class,
				null, value);
	}

}
