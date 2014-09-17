package com.etwebservice.webservice.service;

import com.etwebservice.dao.IntroductionDao;
import com.etwebservice.domain.Introduction;
import com.etwebservice.util.Json;

public class ETIntroduction {
	/**
	 * 插入介绍信息
	 * @param intro 介绍
	 * @return 如果成功则反会true,否则false。
	 */
	public Boolean insertIntro(Introduction intro){	
		IntroductionDao dao = new IntroductionDao();
		Boolean isSucessful=dao.Insert(intro);
		return isSucessful;	
	}

	/**
	 * 调用该方法删除介绍，返回是否删除成功
	 * @param intro
	 * @return
	 */
	public Boolean deleteIntro(Introduction intro){
		IntroductionDao dao = new IntroductionDao();
		Boolean isSucessful=dao.Delete(intro);
		return isSucessful;	
	}
	
	/**
	 * 调用该方法更新介绍
	 * @param intro
	 * @return
	 */
	public Boolean updateIntro(Introduction intro){
		IntroductionDao dao = new IntroductionDao();
		Boolean isSucessful=dao.Update(intro);
		return isSucessful;	
	}
	/**
	 * 根据id查询
	 * @param id 简介Id
	 * @return 介绍的全部信息
	 */
	public String getIntroductionById(int id) {
		IntroductionDao dao = new IntroductionDao();
		String intro = Json.IntroductionToJson(dao.QueryById(id));
		return intro;
	}
	
    /**
     * 根据介绍名查询简介
     * @param name 介绍名
     * @return 介绍的全部信息。
     */
	public String getIntroductionByName(String name){
		IntroductionDao dao = new IntroductionDao();
		String intro = Json.IntroductionToJson(dao.QueryByName(name));
		return intro;
		
	}
	
	/**
	 * 返回 
	 * @param currentpage
	 * @param pagesize
	 * @return
	 */
	public String getAllIntroduction(int currentpage,int pagesize){
		IntroductionDao dao = new IntroductionDao();
		String intro=Json.introlistToJson(dao.Query(currentpage, pagesize));
		return intro;
	}
	
	/**
	 * 调用该方法查询返回的是介绍的ID，项目，图片
	 * @param currentpage
	 * @param pagesize
	 * @return
	 */
	public String getIntroIdNameImage(int currentpage,int pagesize){
		IntroductionDao dao = new IntroductionDao();
		String intro=Json.introlistToJson(dao.QueryPart(currentpage, pagesize));
		return intro;
	}
}
