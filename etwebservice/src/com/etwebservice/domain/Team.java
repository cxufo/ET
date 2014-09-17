package com.etwebservice.domain;

public class Team {
	
	private int memberId;
	private String name;
	private String job;
	private String sign;
	private String detail;
	private String image;	
	public Team(){
	}
	
	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public Team(int memberId,String name,String sign,String job,String detail,String image){
		this.memberId=memberId;
		this.name=name;
		this.job=job;
		this.detail=detail;
		this.image=image;
		this.sign=sign;
	}
	
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
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
