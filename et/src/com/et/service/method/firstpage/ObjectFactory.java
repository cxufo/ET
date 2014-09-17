package com.et.service.method.firstpage;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import com.et.service.javabean.FirstPage;

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

	private final static QName _InsertImageResponse_QNAME = new QName(
			"http://service.webservice.etwebservice.com/",
			"insertImageResponse");
	private final static QName _InsertImage_QNAME = new QName(
			"http://service.webservice.etwebservice.com/", "insertImage");
	private final static QName _UpdateImage_QNAME = new QName(
			"http://service.webservice.etwebservice.com/", "updateImage");
	private final static QName _GetImagesResponse_QNAME = new QName(
			"http://service.webservice.etwebservice.com/", "getImagesResponse");
	private final static QName _DeleteImage_QNAME = new QName(
			"http://service.webservice.etwebservice.com/", "deleteImage");
	private final static QName _GetImages_QNAME = new QName(
			"http://service.webservice.etwebservice.com/", "getImages");
	private final static QName _UpdateImageResponse_QNAME = new QName(
			"http://service.webservice.etwebservice.com/",
			"updateImageResponse");
	private final static QName _DeleteImageResponse_QNAME = new QName(
			"http://service.webservice.etwebservice.com/",
			"deleteImageResponse");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package: com.et.service.api
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link DeleteImage }
	 * 
	 */
	public DeleteImage createDeleteImage() {
		return new DeleteImage();
	}

	/**
	 * Create an instance of {@link DeleteImageResponse }
	 * 
	 */
	public DeleteImageResponse createDeleteImageResponse() {
		return new DeleteImageResponse();
	}

	/**
	 * Create an instance of {@link InsertImage }
	 * 
	 */
	public InsertImage createInsertImage() {
		return new InsertImage();
	}

	/**
	 * Create an instance of {@link InsertImageResponse }
	 * 
	 */
	public InsertImageResponse createInsertImageResponse() {
		return new InsertImageResponse();
	}

	/**
	 * Create an instance of {@link GetImages }
	 * 
	 */
	public GetImages createGetImages() {
		return new GetImages();
	}

	/**
	 * Create an instance of {@link FirstPage }
	 * 
	 */
	public FirstPage createFirstPage() {
		return new FirstPage();
	}

	/**
	 * Create an instance of {@link UpdateImageResponse }
	 * 
	 */
	public UpdateImageResponse createUpdateImageResponse() {
		return new UpdateImageResponse();
	}

	/**
	 * Create an instance of {@link UpdateImage }
	 * 
	 */
	public UpdateImage createUpdateImage() {
		return new UpdateImage();
	}

	/**
	 * Create an instance of {@link GetImagesResponse }
	 * 
	 */
	public GetImagesResponse createGetImagesResponse() {
		return new GetImagesResponse();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link InsertImageResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "insertImageResponse")
	public JAXBElement<InsertImageResponse> createInsertImageResponse(
			InsertImageResponse value) {
		return new JAXBElement<InsertImageResponse>(_InsertImageResponse_QNAME,
				InsertImageResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link InsertImage }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "insertImage")
	public JAXBElement<InsertImage> createInsertImage(InsertImage value) {
		return new JAXBElement<InsertImage>(_InsertImage_QNAME,
				InsertImage.class, null, value);
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
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GetImagesResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "getImagesResponse")
	public JAXBElement<GetImagesResponse> createGetImagesResponse(
			GetImagesResponse value) {
		return new JAXBElement<GetImagesResponse>(_GetImagesResponse_QNAME,
				GetImagesResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link DeleteImage }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "deleteImage")
	public JAXBElement<DeleteImage> createDeleteImage(DeleteImage value) {
		return new JAXBElement<DeleteImage>(_DeleteImage_QNAME,
				DeleteImage.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link GetImages }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "getImages")
	public JAXBElement<GetImages> createGetImages(GetImages value) {
		return new JAXBElement<GetImages>(_GetImages_QNAME, GetImages.class,
				null, value);
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
	 * {@link DeleteImageResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.webservice.etwebservice.com/", name = "deleteImageResponse")
	public JAXBElement<DeleteImageResponse> createDeleteImageResponse(
			DeleteImageResponse value) {
		return new JAXBElement<DeleteImageResponse>(_DeleteImageResponse_QNAME,
				DeleteImageResponse.class, null, value);
	}

}
