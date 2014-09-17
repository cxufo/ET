package com.etwebservice.webservice.service;

import java.util.List;

import com.etwebservice.dao.FirstPageDao;
import com.etwebservice.domain.FirstPage;
import com.etwebservice.util.Json;
public class FirstPageImage {
	/*
	 * 获得首页需要显示的图片，返回值是json格式的数组。
	 */
	public String getImages(int currentpage,int pagesize){
	    String images = null;
	    FirstPageDao dao = new FirstPageDao();
	    List<com.etwebservice.domain.FirstPage> list = dao.Query(currentpage, pagesize);
	    images=Json.flistToJson(list);
		return 	images;	
	} 
	
	public Boolean deleteImage(int id){
		FirstPageDao dao = new FirstPageDao();
	    Boolean isSucessful=dao.Delete(new FirstPage(id,null));	
		return isSucessful;		
	}
	
	public Boolean insertImage(FirstPage firstPage){
		FirstPageDao dao = new FirstPageDao();
		Boolean isSucessful = dao.Insert(firstPage);
		return isSucessful;
	}
	
	public Boolean updateImage(FirstPage firstPage){
		FirstPageDao dao = new FirstPageDao();
		Boolean isSucessful = dao.Update(firstPage);
		return isSucessful;
	}
}
