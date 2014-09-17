package com.et.service.method.etteam;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import com.et.service.javabean.Team;

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

	private final static QName _UpdateTeamDetailResponse_QNAME = new QName(
			"http://service.webservice.etwebservice.com/",
			"updateTeamDetailResponse");
	private final static QName _GetTeamResponse_QNAME = new QName(
			"http://service.webservice.etwebservice.com/", "getTeamResponse");
	private final static QName _InsertTeamMember_QNAME = new QName(
			"http://service.webservice.etwebservice.com/", "insertTeamMember");
	private final static QName _GetTeamById_QNAME = new QName(
			"http://service.webservice.etwebservice.com/", "getTeamById");
	private final static QName _UpdateTeamResponse_QNAME = new QName(
			"http://service.webservice.etwebservice.com/", "updateTeamResponse");
	private final static QName _DeleteTeamMember_QNAME = new QName(
			"http://service.webservice.etwebservice.com/", "deleteTeamMember");
	private final static QName _UpdateImage_QNAME = new QName(
			"http://service.webservice.etwebservice.com/", "updateImage");
	private final static QName _UpdateTeamSign_QNAME = new QName(
			"http://service.webservice.etwebservice.com/", "updateTeamSign");
	private final static QName _UpdateTeamSignResponse_QNAME = new QName(
			"http://service.webservice.etwebservice.com/",
			"updateTeamSignResponse");
	private final static QName _GetTeamAllinfo_QNAME = new QName(
			"http://service.webservice.etwebservice.com/", "getTeamAllinfo");
	private final static QName _GetTeamAllinfoResponse_QNAME = new QName(
			"http://service.webservice.etwebservice.com/",
			"getTeamAllinfoResponse");
	private final static QName _UpdateTeamJob_QNAME = new QName(
			"http://service.webservice.etwebservice.com/", "updateTeamJob");
	private final static QName _GetTeam_QNAME = new QName(
			"http://service.webservice.etwebservice.com/", "getTeam");
	private final static QName _GetTeamByNameResponse_QNAME = new QName(
			"http://service.webservice.etwebservice.com/",
			"getTeamByNameResponse");
	private final static QName _GetTeamByName_QNAME = new QName(
			"http://service.webservice.etwebservice.com/", "getTeamByName");
	private final static QName _UpdateTeamDetail_QNAME = new QName(
			"http://service.webservice.etwebservice.com/", "updateTeamDetail");
	private final static QName _InsertTeamMemberResponse_QNAME = new QName(
			"http://service.webservice.etwebservice.com/",
			"insertTeamMemberResponse");
	private final static QName _DeleteTeamMemberResponse_QNAME = new QName(
			"http://service.webservice.etwebservice.com/",
			"deleteTeamMemberResponse");
	private final static QName _UpdateImageResponse_QNAME = new QName(
			"http://service.webservice.etwebservice.com/",
			"updateImageResponse");
	private final static QName _GetTeamByIdResponse_QNAME = new QName(
			"http://service.webservice.etwebservice.com/",
			"getTeamByIdResponse");
	private final static QName _UpdateTeamNameResponse_QNAME = new QName(
			"http://service.webservice.etwebservice.com/",
			"updateTeamNameResponse");
	private final static QName _UpdateTeamJobResponse_QNAME = new QName(
			"http://service.webservice.etwebservice.com/",
			"updateTeamJobResponse");
	private final static QName _UpdateTeam_QNAME = new QName(
			"http://service.webservice.etwebservice.com/", "updateTeam");
	private final static QName _UpdateTeamName_QNAME = new QName(
			"http://service.webservice.etwebservice.com/", "updateTeamName");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package: com.et.service.api
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link Team }
	 * 
	 */
	public Team createTeam() {
		return new Team();
	}

	/**
	 * Create an instance of {@link DeleteTeamMemberResponse }
	 * 
	 */
	public DeleteTeamMemberResponse createDeleteTeamMemberResponse() {
		return new DeleteTeamMemberResponse();
	}

	/**
	 * Create an instance of {@link UpdateTeamName }
	 * 
	 */
	public UpdateTeamName createUpdateTeamName() {
		return new UpdateTeamName();
	}

	/**
	 * Create an instance of {@link UpdateTeamDetail }
	 * 
	 */
	public UpdateTeamDetail createUpdateTeamDetail() {
		return new UpdateTeamDetail();
	}

	/**
	 * Create an instance of {@link UpdateTeam }
	 * 
	 */
	public UpdateTeam createUpdateTeam() {
		return new UpdateTeam();
	}

	/**
	 * Create an instance of {@link GetTeamByName }
	 * 
	 */
	public GetTeamByName createGetTeamByName() {
		return new GetTeamByName();
	}

	/**
	 * Create an instance of {@link InsertTeamMember }
	 * 
	 */
	public InsertTeamMember createInsertTeamMember() {
		return new InsertTeamMember();
	}

	/**
	 * Create an instance of {@link GetTeam }
	 * 
	 */
	public GetTeam createGetTeam() {
		return new GetTeam();
	}

	/**
	 * Create an instance of {@link GetTeamById }
	 * 
	 */
	public GetTeamById createGetTeamById() {
		return new GetTeamById();
	}

	/**
	 * Create an instance of {@link GetTeamByNameResponse }
	 * 
	 */
	public GetTeamByNameResponse createGetTeamByNameResponse() {
		return new GetTeamByNameResponse();
	}

	/**
	 * Create an instance of {@link UpdateImage }
	 * 
	 */
	public UpdateImage createUpdateImage() {
		return new UpdateImage();
	}

	/**
	 * Create an instance of {@link UpdateImageResponse }
	 * 
	 */
	public UpdateImageResponse createUpdateImageResponse() {
		return new UpdateImageResponse();
	}

	/**
	 * Create an instance of {@link UpdateTeamDetailResponse }
	 * 
	 */
	public UpdateTeamDetailResponse createUpdateTeamDetailResponse() {
		return new UpdateTeamDetailResponse();
	}

	/**
	 * Create an instance of {@link GetTeamAllinfo }
	 * 
	 */
	public GetTeamAllinfo createGetTeamAllinfo() {
		return new GetTeamAllinfo();
	}

	/**
	 * Create an instance of {@link UpdateTeamSign }
	 * 
	 */
	public UpdateTeamSign createUpdateTeamSign() {
		return new UpdateTeamSign();
	}

	/**
	 * Create an instance of {@link UpdateTeamResponse }
	 * 
	 */
	public UpdateTeamResponse createUpdateTeamResponse() {
		return new UpdateTeamResponse();
	}

	/**
	 * Create an instance of {@link UpdateTeamJob }
	 * 
	 */
	public UpdateTeamJob createUpdateTeamJob() {
		return new UpdateTeamJob();
	}

	/**
	 * Create an instance of {@link UpdateTeamJobResponse }
	 * 
	 */
	public UpdateTeamJobResponse createUpdateTeamJobResponse() {
		return new UpdateTeamJobResponse();
	}

	/**
	 * Create an instance of {@link DeleteTeamMember }
	 * 
	 */
	public DeleteTeamMember createDeleteTeamMember() {
		return new DeleteTeamMember();
	}

	/**
	 * Create an instance of {@link GetTeamByIdResponse }
	 * 
	 */
	public GetTeamByIdResponse createGetTeamByIdResponse() {
		return new GetTeamByIdResponse();
	}

	/**
	 * Create an instance of {@link UpdateTeamSignResponse }
	 * 
	 */
	public UpdateTeamSignResponse createUpdateTeamSignResponse() {
		return new UpdateTeamSignResponse();
	}

	/**
	 * Create an instance of {@link InsertTeamMemberResponse }
	 * 
	 */
	public InsertTeamMemberResponse createInsertTeamMemberResponse() {
		return new InsertTeamMemberResponse();
	}

	/**
	 * Create an instance of {@link GetTeamResponse }
	 * 
	 */
	public GetTeamResponse createGetTeamResponse() {
		return new GetTeamResponse();
	}

	/**
	 * Create an instance of {@link GetTeamAllinfoResponse }
	 * 
	 */
	public GetTeamAllinfoResponse createGetTeamAllinfoResponse() {
		return new GetTeamAllinfoResponse();
	}

	/**
	 * Create an instance of {@link UpdateTeamNameResponse }
	 * 
	 */
	public UpdateTeamNameResponse createUpdateTeamNameResponse() {
		return new UpdateTeamNameResponse();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link UpdateTeamDetailResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "updateTeamDetailResponse")
	public JAXBElement<UpdateTeamDetailResponse> createUpdateTeamDetailResponse(
			UpdateTeamDetailResponse value) {
		return new JAXBElement<UpdateTeamDetailResponse>(
				_UpdateTeamDetailResponse_QNAME,
				UpdateTeamDetailResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link GetTeamResponse }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "getTeamResponse")
	public JAXBElement<GetTeamResponse> createGetTeamResponse(
			GetTeamResponse value) {
		return new JAXBElement<GetTeamResponse>(_GetTeamResponse_QNAME,
				GetTeamResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link InsertTeamMember }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "insertTeamMember")
	public JAXBElement<InsertTeamMember> createInsertTeamMember(
			InsertTeamMember value) {
		return new JAXBElement<InsertTeamMember>(_InsertTeamMember_QNAME,
				InsertTeamMember.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link GetTeamById }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "getTeamById")
	public JAXBElement<GetTeamById> createGetTeamById(GetTeamById value) {
		return new JAXBElement<GetTeamById>(_GetTeamById_QNAME,
				GetTeamById.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link UpdateTeamResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "updateTeamResponse")
	public JAXBElement<UpdateTeamResponse> createUpdateTeamResponse(
			UpdateTeamResponse value) {
		return new JAXBElement<UpdateTeamResponse>(_UpdateTeamResponse_QNAME,
				UpdateTeamResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link DeleteTeamMember }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "deleteTeamMember")
	public JAXBElement<DeleteTeamMember> createDeleteTeamMember(
			DeleteTeamMember value) {
		return new JAXBElement<DeleteTeamMember>(_DeleteTeamMember_QNAME,
				DeleteTeamMember.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link UpdateImage }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "updateImage")
	public JAXBElement<UpdateImage> createUpdateImage(UpdateImage value) {
		return new JAXBElement<UpdateImage>(_UpdateImage_QNAME,
				UpdateImage.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link UpdateTeamSign }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "updateTeamSign")
	public JAXBElement<UpdateTeamSign> createUpdateTeamSign(UpdateTeamSign value) {
		return new JAXBElement<UpdateTeamSign>(_UpdateTeamSign_QNAME,
				UpdateTeamSign.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link UpdateTeamSignResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "updateTeamSignResponse")
	public JAXBElement<UpdateTeamSignResponse> createUpdateTeamSignResponse(
			UpdateTeamSignResponse value) {
		return new JAXBElement<UpdateTeamSignResponse>(
				_UpdateTeamSignResponse_QNAME, UpdateTeamSignResponse.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link GetTeamAllinfo }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "getTeamAllinfo")
	public JAXBElement<GetTeamAllinfo> createGetTeamAllinfo(GetTeamAllinfo value) {
		return new JAXBElement<GetTeamAllinfo>(_GetTeamAllinfo_QNAME,
				GetTeamAllinfo.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GetTeamAllinfoResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "getTeamAllinfoResponse")
	public JAXBElement<GetTeamAllinfoResponse> createGetTeamAllinfoResponse(
			GetTeamAllinfoResponse value) {
		return new JAXBElement<GetTeamAllinfoResponse>(
				_GetTeamAllinfoResponse_QNAME, GetTeamAllinfoResponse.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link UpdateTeamJob }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "updateTeamJob")
	public JAXBElement<UpdateTeamJob> createUpdateTeamJob(UpdateTeamJob value) {
		return new JAXBElement<UpdateTeamJob>(_UpdateTeamJob_QNAME,
				UpdateTeamJob.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link GetTeam }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "getTeam")
	public JAXBElement<GetTeam> createGetTeam(GetTeam value) {
		return new JAXBElement<GetTeam>(_GetTeam_QNAME, GetTeam.class, null,
				value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GetTeamByNameResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "getTeamByNameResponse")
	public JAXBElement<GetTeamByNameResponse> createGetTeamByNameResponse(
			GetTeamByNameResponse value) {
		return new JAXBElement<GetTeamByNameResponse>(
				_GetTeamByNameResponse_QNAME, GetTeamByNameResponse.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link GetTeamByName }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "getTeamByName")
	public JAXBElement<GetTeamByName> createGetTeamByName(GetTeamByName value) {
		return new JAXBElement<GetTeamByName>(_GetTeamByName_QNAME,
				GetTeamByName.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link UpdateTeamDetail }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "updateTeamDetail")
	public JAXBElement<UpdateTeamDetail> createUpdateTeamDetail(
			UpdateTeamDetail value) {
		return new JAXBElement<UpdateTeamDetail>(_UpdateTeamDetail_QNAME,
				UpdateTeamDetail.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link InsertTeamMemberResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "insertTeamMemberResponse")
	public JAXBElement<InsertTeamMemberResponse> createInsertTeamMemberResponse(
			InsertTeamMemberResponse value) {
		return new JAXBElement<InsertTeamMemberResponse>(
				_InsertTeamMemberResponse_QNAME,
				InsertTeamMemberResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link DeleteTeamMemberResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "deleteTeamMemberResponse")
	public JAXBElement<DeleteTeamMemberResponse> createDeleteTeamMemberResponse(
			DeleteTeamMemberResponse value) {
		return new JAXBElement<DeleteTeamMemberResponse>(
				_DeleteTeamMemberResponse_QNAME,
				DeleteTeamMemberResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link UpdateImageResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "updateImageResponse")
	public JAXBElement<UpdateImageResponse> createUpdateImageResponse(
			UpdateImageResponse value) {
		return new JAXBElement<UpdateImageResponse>(_UpdateImageResponse_QNAME,
				UpdateImageResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GetTeamByIdResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "getTeamByIdResponse")
	public JAXBElement<GetTeamByIdResponse> createGetTeamByIdResponse(
			GetTeamByIdResponse value) {
		return new JAXBElement<GetTeamByIdResponse>(_GetTeamByIdResponse_QNAME,
				GetTeamByIdResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link UpdateTeamNameResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "updateTeamNameResponse")
	public JAXBElement<UpdateTeamNameResponse> createUpdateTeamNameResponse(
			UpdateTeamNameResponse value) {
		return new JAXBElement<UpdateTeamNameResponse>(
				_UpdateTeamNameResponse_QNAME, UpdateTeamNameResponse.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link UpdateTeamJobResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "updateTeamJobResponse")
	public JAXBElement<UpdateTeamJobResponse> createUpdateTeamJobResponse(
			UpdateTeamJobResponse value) {
		return new JAXBElement<UpdateTeamJobResponse>(
				_UpdateTeamJobResponse_QNAME, UpdateTeamJobResponse.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link UpdateTeam }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "updateTeam")
	public JAXBElement<UpdateTeam> createUpdateTeam(UpdateTeam value) {
		return new JAXBElement<UpdateTeam>(_UpdateTeam_QNAME, UpdateTeam.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link UpdateTeamName }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "updateTeamName")
	public JAXBElement<UpdateTeamName> createUpdateTeamName(UpdateTeamName value) {
		return new JAXBElement<UpdateTeamName>(_UpdateTeamName_QNAME,
				UpdateTeamName.class, null, value);
	}

}
