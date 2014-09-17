package com.et.service.method.etnews;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import com.et.service.javabean.News;

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

	private final static QName _InsertNewsResponse_QNAME = new QName(
			"http://service.webservice.etwebservice.com/", "insertNewsResponse");
	private final static QName _QueryNewsContentById_QNAME = new QName(
			"http://service.webservice.etwebservice.com/",
			"queryNewsContentById");
	private final static QName _QueryTitle_QNAME = new QName(
			"http://service.webservice.etwebservice.com/", "queryTitle");
	private final static QName _DeleteNewsResponse_QNAME = new QName(
			"http://service.webservice.etwebservice.com/", "deleteNewsResponse");
	private final static QName _DeleteNews_QNAME = new QName(
			"http://service.webservice.etwebservice.com/", "deleteNews");
	private final static QName _QueryNewsContentByTitleResponse_QNAME = new QName(
			"http://service.webservice.etwebservice.com/",
			"queryNewsContentByTitleResponse");
	private final static QName _InsertNews_QNAME = new QName(
			"http://service.webservice.etwebservice.com/", "insertNews");
	private final static QName _QueryTitleResponse_QNAME = new QName(
			"http://service.webservice.etwebservice.com/", "queryTitleResponse");
	private final static QName _UpdateTitleResponse_QNAME = new QName(
			"http://service.webservice.etwebservice.com/",
			"updateTitleResponse");
	private final static QName _UpdateTitle_QNAME = new QName(
			"http://service.webservice.etwebservice.com/", "updateTitle");
	private final static QName _QueryNewsContentByTitle_QNAME = new QName(
			"http://service.webservice.etwebservice.com/",
			"queryNewsContentByTitle");
	private final static QName _QueryNewsContentByIdResponse_QNAME = new QName(
			"http://service.webservice.etwebservice.com/",
			"queryNewsContentByIdResponse");
	private final static QName _UpdateNewsContent_QNAME = new QName(
			"http://service.webservice.etwebservice.com/", "updateNewsContent");
	private final static QName _UpdateNewsContentResponse_QNAME = new QName(
			"http://service.webservice.etwebservice.com/",
			"updateNewsContentResponse");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package: com.et.service.api
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link QueryNewsContentByTitleResponse }
	 * 
	 */
	public QueryNewsContentByTitleResponse createQueryNewsContentByTitleResponse() {
		return new QueryNewsContentByTitleResponse();
	}

	/**
	 * Create an instance of {@link UpdateNewsContentResponse }
	 * 
	 */
	public UpdateNewsContentResponse createUpdateNewsContentResponse() {
		return new UpdateNewsContentResponse();
	}

	/**
	 * Create an instance of {@link DeleteNews }
	 * 
	 */
	public DeleteNews createDeleteNews() {
		return new DeleteNews();
	}

	/**
	 * Create an instance of {@link InsertNews }
	 * 
	 */
	public InsertNews createInsertNews() {
		return new InsertNews();
	}

	/**
	 * Create an instance of {@link QueryNewsContentById }
	 * 
	 */
	public QueryNewsContentById createQueryNewsContentById() {
		return new QueryNewsContentById();
	}

	/**
	 * Create an instance of {@link UpdateTitleResponse }
	 * 
	 */
	public UpdateTitleResponse createUpdateTitleResponse() {
		return new UpdateTitleResponse();
	}

	/**
	 * Create an instance of {@link QueryNewsContentByTitle }
	 * 
	 */
	public QueryNewsContentByTitle createQueryNewsContentByTitle() {
		return new QueryNewsContentByTitle();
	}

	/**
	 * Create an instance of {@link DeleteNewsResponse }
	 * 
	 */
	public DeleteNewsResponse createDeleteNewsResponse() {
		return new DeleteNewsResponse();
	}

	/**
	 * Create an instance of {@link QueryTitleResponse }
	 * 
	 */
	public QueryTitleResponse createQueryTitleResponse() {
		return new QueryTitleResponse();
	}

	/**
	 * Create an instance of {@link UpdateTitle }
	 * 
	 */
	public UpdateTitle createUpdateTitle() {
		return new UpdateTitle();
	}

	/**
	 * Create an instance of {@link QueryNewsContentByIdResponse }
	 * 
	 */
	public QueryNewsContentByIdResponse createQueryNewsContentByIdResponse() {
		return new QueryNewsContentByIdResponse();
	}

	/**
	 * Create an instance of {@link UpdateNewsContent }
	 * 
	 */
	public UpdateNewsContent createUpdateNewsContent() {
		return new UpdateNewsContent();
	}

	/**
	 * Create an instance of {@link News }
	 * 
	 */
	public News createNews() {
		return new News();
	}

	/**
	 * Create an instance of {@link InsertNewsResponse }
	 * 
	 */
	public InsertNewsResponse createInsertNewsResponse() {
		return new InsertNewsResponse();
	}

	/**
	 * Create an instance of {@link QueryTitle }
	 * 
	 */
	public QueryTitle createQueryTitle() {
		return new QueryTitle();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link InsertNewsResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "insertNewsResponse")
	public JAXBElement<InsertNewsResponse> createInsertNewsResponse(
			InsertNewsResponse value) {
		return new JAXBElement<InsertNewsResponse>(_InsertNewsResponse_QNAME,
				InsertNewsResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link QueryNewsContentById }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "queryNewsContentById")
	public JAXBElement<QueryNewsContentById> createQueryNewsContentById(
			QueryNewsContentById value) {
		return new JAXBElement<QueryNewsContentById>(
				_QueryNewsContentById_QNAME, QueryNewsContentById.class, null,
				value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link QueryTitle }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "queryTitle")
	public JAXBElement<QueryTitle> createQueryTitle(QueryTitle value) {
		return new JAXBElement<QueryTitle>(_QueryTitle_QNAME, QueryTitle.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link DeleteNewsResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "deleteNewsResponse")
	public JAXBElement<DeleteNewsResponse> createDeleteNewsResponse(
			DeleteNewsResponse value) {
		return new JAXBElement<DeleteNewsResponse>(_DeleteNewsResponse_QNAME,
				DeleteNewsResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link DeleteNews }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "deleteNews")
	public JAXBElement<DeleteNews> createDeleteNews(DeleteNews value) {
		return new JAXBElement<DeleteNews>(_DeleteNews_QNAME, DeleteNews.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link QueryNewsContentByTitleResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "queryNewsContentByTitleResponse")
	public JAXBElement<QueryNewsContentByTitleResponse> createQueryNewsContentByTitleResponse(
			QueryNewsContentByTitleResponse value) {
		return new JAXBElement<QueryNewsContentByTitleResponse>(
				_QueryNewsContentByTitleResponse_QNAME,
				QueryNewsContentByTitleResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link InsertNews }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "insertNews")
	public JAXBElement<InsertNews> createInsertNews(InsertNews value) {
		return new JAXBElement<InsertNews>(_InsertNews_QNAME, InsertNews.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link QueryTitleResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "queryTitleResponse")
	public JAXBElement<QueryTitleResponse> createQueryTitleResponse(
			QueryTitleResponse value) {
		return new JAXBElement<QueryTitleResponse>(_QueryTitleResponse_QNAME,
				QueryTitleResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link UpdateTitleResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "updateTitleResponse")
	public JAXBElement<UpdateTitleResponse> createUpdateTitleResponse(
			UpdateTitleResponse value) {
		return new JAXBElement<UpdateTitleResponse>(_UpdateTitleResponse_QNAME,
				UpdateTitleResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link UpdateTitle }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "updateTitle")
	public JAXBElement<UpdateTitle> createUpdateTitle(UpdateTitle value) {
		return new JAXBElement<UpdateTitle>(_UpdateTitle_QNAME,
				UpdateTitle.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link QueryNewsContentByTitle }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "queryNewsContentByTitle")
	public JAXBElement<QueryNewsContentByTitle> createQueryNewsContentByTitle(
			QueryNewsContentByTitle value) {
		return new JAXBElement<QueryNewsContentByTitle>(
				_QueryNewsContentByTitle_QNAME, QueryNewsContentByTitle.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link QueryNewsContentByIdResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "queryNewsContentByIdResponse")
	public JAXBElement<QueryNewsContentByIdResponse> createQueryNewsContentByIdResponse(
			QueryNewsContentByIdResponse value) {
		return new JAXBElement<QueryNewsContentByIdResponse>(
				_QueryNewsContentByIdResponse_QNAME,
				QueryNewsContentByIdResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link UpdateNewsContent }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "updateNewsContent")
	public JAXBElement<UpdateNewsContent> createUpdateNewsContent(
			UpdateNewsContent value) {
		return new JAXBElement<UpdateNewsContent>(_UpdateNewsContent_QNAME,
				UpdateNewsContent.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link UpdateNewsContentResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "updateNewsContentResponse")
	public JAXBElement<UpdateNewsContentResponse> createUpdateNewsContentResponse(
			UpdateNewsContentResponse value) {
		return new JAXBElement<UpdateNewsContentResponse>(
				_UpdateNewsContentResponse_QNAME,
				UpdateNewsContentResponse.class, null, value);
	}

}
