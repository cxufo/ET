package com.etwebservice.webservice.service;

import java.util.List;

import com.etwebservice.dao.FirstPageDao;
import com.etwebservice.domain.FirstPage;
import com.etwebservice.util.Json;

@javax.jws.WebService(targetNamespace = "http://service.webservice.etwebservice.com/", serviceName = "FirstPageImageService", portName = "FirstPageImagePort", wsdlLocation = "WEB-INF/wsdl/FirstPageImageService.wsdl")
public class FirstPageImageDelegate {

	com.etwebservice.webservice.service.FirstPageImage firstPageImage = new com.etwebservice.webservice.service.FirstPageImage();

	public String getImages(int currentpage, int pagesize) {
		return firstPageImage.getImages(currentpage, pagesize);
	}

	public Boolean deleteImage(int id) {
		return firstPageImage.deleteImage(id);
	}

	public Boolean insertImage(FirstPage firstPage) {
		return firstPageImage.insertImage(firstPage);
	}

	public Boolean updateImage(FirstPage firstPage) {
		return firstPageImage.updateImage(firstPage);
	}

}