package com.etwebservice.webservice.service;

import com.etwebservice.dao.IntroductionDao;
import com.etwebservice.domain.Introduction;
import com.etwebservice.util.Json;

public class ETIntroduction {
	/**
	 * ���������Ϣ
	 * @param intro ����
	 * @return ����ɹ��򷴻�true,����false��
	 */
	public Boolean insertIntro(Introduction intro){	
		IntroductionDao dao = new IntroductionDao();
		Boolean isSucessful=dao.Insert(intro);
		return isSucessful;	
	}

	/**
	 * ���ø÷���ɾ�����ܣ������Ƿ�ɾ���ɹ�
	 * @param intro
	 * @return
	 */
	public Boolean deleteIntro(Introduction intro){
		IntroductionDao dao = new IntroductionDao();
		Boolean isSucessful=dao.Delete(intro);
		return isSucessful;	
	}
	
	/**
	 * ���ø÷������½���
	 * @param intro
	 * @return
	 */
	public Boolean updateIntro(Introduction intro){
		IntroductionDao dao = new IntroductionDao();
		Boolean isSucessful=dao.Update(intro);
		return isSucessful;	
	}
	/**
	 * ����id��ѯ
	 * @param id ���Id
	 * @return ���ܵ�ȫ����Ϣ
	 */
	public String getIntroductionById(int id) {
		IntroductionDao dao = new IntroductionDao();
		String intro = Json.IntroductionToJson(dao.QueryById(id));
		return intro;
	}
	
    /**
     * ���ݽ�������ѯ���
     * @param name ������
     * @return ���ܵ�ȫ����Ϣ��
     */
	public String getIntroductionByName(String name){
		IntroductionDao dao = new IntroductionDao();
		String intro = Json.IntroductionToJson(dao.QueryByName(name));
		return intro;
		
	}
	
	/**
	 * ���� 
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
	 * ���ø÷�����ѯ���ص��ǽ��ܵ�ID����Ŀ��ͼƬ
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
