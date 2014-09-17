package com.etwebservice.domain;

public class News {
	
private int newsId;
private String newsTitle;
private String newsContent;
private String newsTime;

public News(){}

public News(int newsId,String newsTitle,String newsContent,String newsTime){
	this.newsId=newsId;
	this.newsTitle=newsTitle;
	this.newsContent=newsContent;
	this.newsTime=newsTime;
}

public int getNewsId() {
	return newsId;
}

public void setNewsId(int newsId) {
	this.newsId = newsId;
}

public String getNewsTitle() {
	return newsTitle;
}

public void setNewsTitle(String newsTitle) {
	this.newsTitle = newsTitle;
}

public String getNewsContent() {
	return newsContent;
}

public void setNewsContent(String newsContent) {
	this.newsContent = newsContent;
}

public String getNewsTime() {
	return newsTime;
}

public void setNewsTime(String newsTime) {
	this.newsTime = newsTime;
}

}
