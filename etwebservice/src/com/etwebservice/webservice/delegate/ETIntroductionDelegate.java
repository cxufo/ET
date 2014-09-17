package com.etwebservice.webservice.delegate;

import com.etwebservice.dao.IntroductionDao;
import com.etwebservice.domain.Introduction;
import com.etwebservice.util.Json;
import com.etwebservice.webservice.service.ETIntroduction;

@javax.jws.WebService(targetNamespace = "http://service.webservice.etwebservice.com/", serviceName = "ETIntroductionService", portName = "ETIntroductionPort", wsdlLocation = "WEB-INF/wsdl/ETIntroductionService.wsdl")
public class ETIntroductionDelegate {

	com.etwebservice.webservice.service.ETIntroduction eTIntroduction = new com.etwebservice.webservice.service.ETIntroduction();

	public Boolean insertIntro(Introduction intro) {
		return eTIntroduction.insertIntro(intro);
	}

	public Boolean deleteIntro(Introduction intro) {
		return eTIntroduction.deleteIntro(intro);
	}

	public Boolean updateIntro(Introduction intro) {
		return eTIntroduction.updateIntro(intro);
	}

	public String getIntroductionById(int id) {
		return eTIntroduction.getIntroductionById(id);
	}

	public String getIntroductionByName(String name) {
		return eTIntroduction.getIntroductionByName(name);
	}

	public String getAllIntroduction(int currentpage, int pagesize) {
		return eTIntroduction.getAllIntroduction(currentpage, pagesize);
	}

	public String getIntroIdNameImage(int currentpage, int pagesize) {
		return eTIntroduction.getIntroIdNameImage(currentpage, pagesize);
	}

}