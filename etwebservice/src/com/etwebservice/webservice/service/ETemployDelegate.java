package com.etwebservice.webservice.service;

import com.etwebservice.dao.EmployDao;
import com.etwebservice.domain.Employ;
import com.etwebservice.util.Json;

@javax.jws.WebService(targetNamespace = "http://service.webservice.etwebservice.com/", serviceName = "ETemployService", portName = "ETemployPort", wsdlLocation = "WEB-INF/wsdl/ETemployService.wsdl")
public class ETemployDelegate {

	com.etwebservice.webservice.service.ETemploy eTemploy = new com.etwebservice.webservice.service.ETemploy();

	public Boolean insertEmploy(Employ employ) {
		return eTemploy.insertEmploy(employ);
	}

	public Boolean deleteEmploy(Employ employ) {
		return eTemploy.deleteEmploy(employ);
	}

	public Boolean updateEmploy(Employ employ) {
		return eTemploy.updateEmploy(employ);
	}

	public String getEmploy(int currentpage, int pagesize) {
		return eTemploy.getEmploy(currentpage, pagesize);
	}

	public Employ getEmployById(int id) {
		return eTemploy.getEmployById(id);
	}

	public String getEmployAll(int currentpage, int pagesize) {
		return eTemploy.getEmployAll(currentpage, pagesize);
	}

}