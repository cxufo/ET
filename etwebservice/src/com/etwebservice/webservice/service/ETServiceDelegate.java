package com.etwebservice.webservice.service;

import com.etwebservice.dao.ServiceDao;
import com.etwebservice.domain.Service;
import com.etwebservice.util.Json;

@javax.jws.WebService(targetNamespace = "http://service.webservice.etwebservice.com/", serviceName = "ETServiceService", portName = "ETServicePort", wsdlLocation = "WEB-INF/wsdl/ETServiceService.wsdl")
public class ETServiceDelegate {

	com.etwebservice.webservice.service.ETService eTService = new com.etwebservice.webservice.service.ETService();

	public Boolean insertService(Service service) {
		return eTService.insertService(service);
	}

	public Boolean deleteService(Service service) {
		return eTService.deleteService(service);
	}

	public Boolean updateServiceImage(int id, String path) {
		return eTService.updateServiceImage(id, path);
	}

	public Boolean updateServiceDetail(int id, String detail) {
		return eTService.updateServiceDetail(id, detail);
	}

	public Boolean updateServiceName(int id, String name) {
		return eTService.updateServiceName(id, name);
	}

	public Boolean updateService(Service service) {
		return eTService.updateService(service);
	}

	public String getService(int currentpage, int pagesize) {
		return eTService.getService(currentpage, pagesize);
	}

	public String getServiceAll(int currentpage, int pagesize) {
		return eTService.getServiceAll(currentpage, pagesize);
	}

	public Service getServiceById(int id) {
		return eTService.getServiceById(id);
	}

	public Service getServiceByName(String name) {
		return eTService.getServiceByName(name);
	}

}