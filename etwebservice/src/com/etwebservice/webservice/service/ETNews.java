package com.etwebservice.webservice.service;

import com.etwebservice.dao.NewsDao;
import com.etwebservice.domain.News;
import com.etwebservice.util.Json;

public class ETNews {
	/**
	 * 插入新闻
	 * @param news 新闻对象
	 * @return 是否成功
	 */
	public Boolean insertNews(News news){
		NewsDao dao=new NewsDao();
		Boolean isSucessful=dao.Insert(news);
		return isSucessful;
	}
	
	/**
	 * 删除新闻动态
	 * @param news 新闻对象
	 * @return 是否成功
	 */
	public Boolean deleteNews(News news){
		NewsDao dao=new NewsDao();
		Boolean isSucessful=dao.Delete(news);
		return isSucessful;
	}
	
	/**
	 * 更改新闻标题
	 * @param id 新闻ID
	 * @param title 新闻标题
	 * @param time 发布时间
	 * @return 是否成功
	 */
	public Boolean updateTitle(int id,String title,String time){
		NewsDao dao=new NewsDao();
		Boolean isSucessful=dao.Update(new News(id,title,null,time));
		return isSucessful;
	}
	
	/**
	 * 更新新闻内容
	 * @param id 新闻ID
	 * @param newsContent 新闻内容
	 * @param time 更新时间
	 * @return 是否成功
	 */
	public Boolean updateNewsContent(int id,String newsContent,String time){
		NewsDao dao=new NewsDao();
		Boolean isSucessful=dao.Update(new News(id,null,newsContent,time));
		return isSucessful;
	}
	
	/**
	 * 分页查询新闻动态
	 * @param currentpage 当前页
	 * @param pagesize 页面大小
	 * @return json格式的新闻编号，标题，时间。
	 */
	public String queryTitle(int currentpage,int pagesize){
		NewsDao dao=new NewsDao();
		String titles = Json.newslistToJson(dao.Query(currentpage, pagesize));
		return titles;
	}
	
	/**
	 * 根据新闻标题查询新闻内容
	 * @param title 新闻标题
	 * @return 返回新闻对象，其中只有内容有值，其他新闻属性为空
	 */
	public News queryNewsContentByTitle(String title){
		NewsDao dao=new NewsDao();
		return dao.QueryByName(title);		
	}
	
	/**
	 * 根据Id查询查询新闻
	 * @param id 新闻编号
	 * @return 返回新闻对象，其中只有内容有值，其他新闻属性为空
	 */
	public News queryNewsContentById(int id){
		NewsDao dao=new NewsDao();
		return dao.QueryById(id);	
	}
}
