package com.etwebservice.webservice.service;

import com.etwebservice.dao.NewsDao;
import com.etwebservice.domain.News;
import com.etwebservice.util.Json;

public class ETNews {
	/**
	 * ��������
	 * @param news ���Ŷ���
	 * @return �Ƿ�ɹ�
	 */
	public Boolean insertNews(News news){
		NewsDao dao=new NewsDao();
		Boolean isSucessful=dao.Insert(news);
		return isSucessful;
	}
	
	/**
	 * ɾ�����Ŷ�̬
	 * @param news ���Ŷ���
	 * @return �Ƿ�ɹ�
	 */
	public Boolean deleteNews(News news){
		NewsDao dao=new NewsDao();
		Boolean isSucessful=dao.Delete(news);
		return isSucessful;
	}
	
	/**
	 * �������ű���
	 * @param id ����ID
	 * @param title ���ű���
	 * @param time ����ʱ��
	 * @return �Ƿ�ɹ�
	 */
	public Boolean updateTitle(int id,String title,String time){
		NewsDao dao=new NewsDao();
		Boolean isSucessful=dao.Update(new News(id,title,null,time));
		return isSucessful;
	}
	
	/**
	 * ������������
	 * @param id ����ID
	 * @param newsContent ��������
	 * @param time ����ʱ��
	 * @return �Ƿ�ɹ�
	 */
	public Boolean updateNewsContent(int id,String newsContent,String time){
		NewsDao dao=new NewsDao();
		Boolean isSucessful=dao.Update(new News(id,null,newsContent,time));
		return isSucessful;
	}
	
	/**
	 * ��ҳ��ѯ���Ŷ�̬
	 * @param currentpage ��ǰҳ
	 * @param pagesize ҳ���С
	 * @return json��ʽ�����ű�ţ����⣬ʱ�䡣
	 */
	public String queryTitle(int currentpage,int pagesize){
		NewsDao dao=new NewsDao();
		String titles = Json.newslistToJson(dao.Query(currentpage, pagesize));
		return titles;
	}
	
	/**
	 * �������ű����ѯ��������
	 * @param title ���ű���
	 * @return �������Ŷ�������ֻ��������ֵ��������������Ϊ��
	 */
	public News queryNewsContentByTitle(String title){
		NewsDao dao=new NewsDao();
		return dao.QueryByName(title);		
	}
	
	/**
	 * ����Id��ѯ��ѯ����
	 * @param id ���ű��
	 * @return �������Ŷ�������ֻ��������ֵ��������������Ϊ��
	 */
	public News queryNewsContentById(int id){
		NewsDao dao=new NewsDao();
		return dao.QueryById(id);	
	}
}
