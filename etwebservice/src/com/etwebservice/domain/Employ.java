package com.etwebservice.domain;

public class Employ {
private int employId;
private String job;
private String educational;
private String adress;
private String date;
private int count;
private String detail;

public Employ(){
	
}

public Employ(int employId,String job,String educational,String adress,
		String date,int count,String detail
		){
	this.employId=employId;
	this.job=job;
	this.educational=educational;
	this.adress=adress;
	this.date=date;
	this.count=count;
	this.detail=detail;
}
public int getEmployId() {
	return employId;
}

public void setEmployId(int employId) {
	this.employId = employId;
}

public String getJob() {
	return job;
}

public void setJob(String job) {
	this.job = job;
}
public String getEducational() {
	return educational;
}
public void setEducational(String educational) {
	this.educational = educational;
}
public String getAdress() {
	return adress;
}
public void setAdress(String adress) {
	this.adress = adress;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public int getCount() {
	return count;
}
public void setCount(int count) {
	this.count = count;
}
public String getDetail() {
	return detail;
}
public void setDetail(String detail) {
	this.detail = detail;
}

}
