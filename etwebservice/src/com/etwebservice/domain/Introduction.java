package com.etwebservice.domain;

public class Introduction {
	private int introId;
	private String introItem;
	private String detail;
	private String image;

	public Introduction() {
	}

	public Introduction(int introId, String introItem, String detail,
			String image) {
		this.introId = introId;
		this.introItem = introItem;
		this.detail = detail;
		this.image = image;
	}

	public int getIntroId() {
		return introId;
	}

	public void setIntroId(int introId) {
		this.introId = introId;
	}

	public String getIntroItem() {
		return introItem;
	}

	public void setIntroItem(String introItem) {
		this.introItem = introItem;
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
