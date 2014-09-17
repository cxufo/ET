package com.etwebservice.domain;

public class Service {
	private int serviceId;
	private String serviceName;
	private String detail;
	private String image;

	public Service() {

	}

	public Service(int serviceId, String serviceName, String detail,
			String image) {
		this.serviceId = serviceId;
		this.serviceName = serviceName;
		this.detail = detail;
		this.image = image;
	}

	public int getServiceId() {
		return serviceId;
	}

	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

}
