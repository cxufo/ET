package com.et.service.api;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import com.et.service.javabean.Employ;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.1.3-hudson-390-
 * Generated source version: 2.0
 * 
 */
@WebService(name = "ETemployDelegate", targetNamespace = "http://service.webservice.etwebservice.com/")
public interface ETemployDelegate {

	/**
	 * 
	 * @param arg0
	 * @return returns java.lang.Boolean
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "deleteEmploy", targetNamespace = "http://service.webservice.etwebservice.com/", className = "com.et.service.api.DeleteEmploy")
	@ResponseWrapper(localName = "deleteEmployResponse", targetNamespace = "http://service.webservice.etwebservice.com/", className = "com.et.service.api.DeleteEmployResponse")
	public Boolean deleteEmploy(
			@WebParam(name = "arg0", targetNamespace = "") Employ arg0);

	/**
	 * 
	 * @param arg0
	 * @return returns java.lang.Boolean
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "insertEmploy", targetNamespace = "http://service.webservice.etwebservice.com/", className = "com.et.service.api.InsertEmploy")
	@ResponseWrapper(localName = "insertEmployResponse", targetNamespace = "http://service.webservice.etwebservice.com/", className = "com.et.service.api.InsertEmployResponse")
	public Boolean insertEmploy(
			@WebParam(name = "arg0", targetNamespace = "") Employ arg0);

	/**
	 * 
	 * @param arg0
	 * @return returns java.lang.Boolean
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "updateEmploy", targetNamespace = "http://service.webservice.etwebservice.com/", className = "com.et.service.api.UpdateEmploy")
	@ResponseWrapper(localName = "updateEmployResponse", targetNamespace = "http://service.webservice.etwebservice.com/", className = "com.et.service.api.UpdateEmployResponse")
	public Boolean updateEmploy(
			@WebParam(name = "arg0", targetNamespace = "") Employ arg0);

	/**
	 * 
	 * @param arg1
	 * @param arg0
	 * @return returns java.lang.String
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "getEmploy", targetNamespace = "http://service.webservice.etwebservice.com/", className = "com.et.service.api.GetEmploy")
	@ResponseWrapper(localName = "getEmployResponse", targetNamespace = "http://service.webservice.etwebservice.com/", className = "com.et.service.api.GetEmployResponse")
	public String getEmploy(
			@WebParam(name = "arg0", targetNamespace = "") int arg0,
			@WebParam(name = "arg1", targetNamespace = "") int arg1);

	/**
	 * 
	 * @param arg0
	 * @return returns com.et.service.api.Employ
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "getEmployById", targetNamespace = "http://service.webservice.etwebservice.com/", className = "com.et.service.api.GetEmployById")
	@ResponseWrapper(localName = "getEmployByIdResponse", targetNamespace = "http://service.webservice.etwebservice.com/", className = "com.et.service.api.GetEmployByIdResponse")
	public Employ getEmployById(
			@WebParam(name = "arg0", targetNamespace = "") int arg0);

	/**
	 * 
	 * @param arg1
	 * @param arg0
	 * @return returns java.lang.String
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "getEmployAll", targetNamespace = "http://service.webservice.etwebservice.com/", className = "com.et.service.api.GetEmployAll")
	@ResponseWrapper(localName = "getEmployAllResponse", targetNamespace = "http://service.webservice.etwebservice.com/", className = "com.et.service.api.GetEmployAllResponse")
	public String getEmployAll(
			@WebParam(name = "arg0", targetNamespace = "") int arg0,
			@WebParam(name = "arg1", targetNamespace = "") int arg1);

}
