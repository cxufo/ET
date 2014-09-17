package com.etwebservice.webservice.service;

import com.etwebservice.dao.TeamDao;
import com.etwebservice.domain.Team;
import com.etwebservice.util.Json;

@javax.jws.WebService(targetNamespace = "http://service.webservice.etwebservice.com/", serviceName = "ETTeamService", portName = "ETTeamPort", wsdlLocation = "WEB-INF/wsdl/ETTeamService.wsdl")
public class ETTeamDelegate {

	com.etwebservice.webservice.service.ETTeam eTTeam = new com.etwebservice.webservice.service.ETTeam();

	public Boolean insertTeamMember(Team team) {
		return eTTeam.insertTeamMember(team);
	}

	public Boolean deleteTeamMember(Team team) {
		return eTTeam.deleteTeamMember(team);
	}

	public Boolean updateImage(int id, String path) {
		return eTTeam.updateImage(id, path);
	}

	public Boolean updateTeamJob(int id, String job) {
		return eTTeam.updateTeamJob(id, job);
	}

	public Boolean updateTeamSign(int id, String sign) {
		return eTTeam.updateTeamSign(id, sign);
	}

	public Boolean updateTeamDetail(int id, String detail) {
		return eTTeam.updateTeamDetail(id, detail);
	}

	public Boolean updateTeamName(int id, String name) {
		return eTTeam.updateTeamName(id, name);
	}

	public Boolean updateTeam(Team team) {
		return eTTeam.updateTeam(team);
	}

	public String getTeam(int currentpage, int pagesize) {
		return eTTeam.getTeam(currentpage, pagesize);
	}

	public String getTeamAllinfo(int currentpage, int pagesize) {
		return eTTeam.getTeamAllinfo(currentpage, pagesize);
	}

	public Team getTeamById(int id) {
		return eTTeam.getTeamById(id);
	}

	public Team getTeamByName(String name) {
		return eTTeam.getTeamByName(name);
	}

}