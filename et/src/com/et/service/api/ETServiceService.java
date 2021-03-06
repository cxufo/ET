package com.et.service.api;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.1.3-hudson-390-
 * Generated source version: 2.0
 * <p>
 * An example of how this class may be used:
 * 
 * <pre>
 * ETServiceService service = new ETServiceService();
 * ETServiceDelegate portType = service.getETServicePort();
 * portType.getService(...);
 * </pre>
 * 
 * </p>
 * 
 */
@WebServiceClient(name = "ETServiceService", targetNamespace = "http://service.webservice.etwebservice.com/", wsdlLocation = "http://localhost:8080/etwebservice/ETServicePort?wsdl")
public class ETServiceService extends Service {

	private final static URL ETSERVICESERVICE_WSDL_LOCATION;
	private final static Logger logger = Logger
			.getLogger(com.et.service.api.ETServiceService.class.getName());

	static {
		URL url = null;
		try {
			URL baseUrl;
			baseUrl = com.et.service.api.ETServiceService.class
					.getResource(".");
			url = new URL(baseUrl,
					"http://localhost:8080/etwebservice/ETServicePort?wsdl");
		} catch (MalformedURLException e) {
			logger.warning("Failed to create URL for the wsdl Location: 'http://localhost:8080/etwebservice/ETServicePort?wsdl', retrying as a local file");
			logger.warning(e.getMessage());
		}
		ETSERVICESERVICE_WSDL_LOCATION = url;
	}

	public ETServiceService(URL wsdlLocation, QName serviceName) {
		super(wsdlLocation, serviceName);
	}

	public ETServiceService() {
		super(ETSERVICESERVICE_WSDL_LOCATION, new QName(
				"http://service.webservice.etwebservice.com/",
				"ETServiceService"));
	}

	/**
	 * 
	 * @return returns ETServiceDelegate
	 */
	@WebEndpoint(name = "ETServicePort")
	public ETServiceDelegate getETServicePort() {
		return super.getPort(
				new QName("http://service.webservice.etwebservice.com/",
						"ETServicePort"), ETServiceDelegate.class);
	}

}
