package com.etwebservice.webservice.service;

import com.etwebservice.dao.EmployDao;
import com.etwebservice.domain.Employ;
import com.etwebservice.util.Json;

public class ETemploy {
    /**
     * �����Ƹ��Ϣ
     * @param employ
     * @return
     */
	public Boolean insertEmploy(Employ employ) {
		EmployDao dao = new EmployDao();
		Boolean isSucessful = dao.Insert(employ);
		return isSucessful;
	}
	
	/**
	 * ɾ�������Ϣ
	 * @param employ
	 * @return
	 */
	public Boolean deleteEmploy(Employ employ){
		EmployDao dao = new EmployDao();
		Boolean isSucessful = dao.Delete(employ);
		return isSucessful;
	}
	
	/**
	 * �޸������Ϣ
	 * @param employ ���޸ĵ�������Ϊnull�������ĵ���������Ϊ0
	 * @return
	 */
	public Boolean updateEmploy(Employ employ){
		EmployDao dao = new EmployDao();
		Boolean isSucessful = dao.Update(employ);
		return isSucessful;
	}
	
	/**
	 * ��ѯ�����Ϣ������ѯ����ϸ����
	 * @param currentpage
	 * @param pagesize
	 * @return
	 */
	public String getEmploy(int currentpage,int pagesize){
		EmployDao dao = new EmployDao();
		String employ = Json.employlistToJson(dao.Query(currentpage, pagesize));
		return employ;
	}
	
	/**
	 * ����Id��ѯ�����Ϣ
	 * @param id
	 * @return
	 */
	public Employ getEmployById(int id){
		EmployDao dao = new EmployDao();
		Employ employ=dao.QueryById(id);
		return employ;
	}
	/**
	 * ��ѯÿһ����Ƹ��Ϣ��ȫ������
	 * @param currentpage
	 * @param pagesize
	 * @return
	 */
    public String getEmployAll(int currentpage,int pagesize){
    	EmployDao dao = new EmployDao();
		String employ = Json.employlistToJson(dao.Query(currentpage, pagesize));
		return employ;
    }
	
}
