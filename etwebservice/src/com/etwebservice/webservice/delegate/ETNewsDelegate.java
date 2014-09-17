package com.etwebservice.webservice.delegate;

import com.etwebservice.dao.NewsDao;
import com.etwebservice.domain.News;
import com.etwebservice.util.Json;
import com.etwebservice.webservice.service.ETNews;

@javax.jws.WebService(targetNamespace = "http://service.webservice.etwebservice.com/", serviceName = "ETNewsService", portName = "ETNewsPort", wsdlLocation = "WEB-INF/wsdl/ETNewsService.wsdl")
public class ETNewsDelegate {

	com.etwebservice.webservice.service.ETNews eTNews = new com.etwebservice.webservice.service.ETNews();

	public Boolean insertNews(News news) {
		return eTNews.insertNews(news);
	}

	public Boolean deleteNews(News news) {
		return eTNews.deleteNews(news);
	}

	public Boolean updateTitle(int id, String title, String time) {
		return eTNews.updateTitle(id, title, time);
	}

	public Boolean updateNewsContent(int id, String newsContent, String time) {
		return eTNews.updateNewsContent(id, newsContent, time);
	}

	public String queryTitle(int currentpage, int pagesize) {
		return eTNews.queryTitle(currentpage, pagesize);
	}

	public News queryNewsContentByTitle(String title) {
		return eTNews.queryNewsContentByTitle(title);
	}

	public News queryNewsContentById(int id) {
		return eTNews.queryNewsContentById(id);
	}

}