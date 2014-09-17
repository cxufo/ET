package com.etwebservice.webservice.service;

import com.etwebservice.dao.EmployDao;
import com.etwebservice.domain.Employ;
import com.etwebservice.util.Json;

public class ETemploy {
    /**
     * 添加招聘信息
     * @param employ
     * @return
     */
	public Boolean insertEmploy(Employ employ) {
		EmployDao dao = new EmployDao();
		Boolean isSucessful = dao.Insert(employ);
		return isSucessful;
	}
	
	/**
	 * 删除招娉信息
	 * @param employ
	 * @return
	 */
	public Boolean deleteEmploy(Employ employ){
		EmployDao dao = new EmployDao();
		Boolean isSucessful = dao.Delete(employ);
		return isSucessful;
	}
	
	/**
	 * 修改招娉信息
	 * @param employ 不修改的属性设为null，不更改的人数设置为0
	 * @return
	 */
	public Boolean updateEmploy(Employ employ){
		EmployDao dao = new EmployDao();
		Boolean isSucessful = dao.Update(employ);
		return isSucessful;
	}
	
	/**
	 * 查询招娉信息，不查询其详细介绍
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
	 * 根据Id查询招娉信息
	 * @param id
	 * @return
	 */
	public Employ getEmployById(int id){
		EmployDao dao = new EmployDao();
		Employ employ=dao.QueryById(id);
		return employ;
	}
	/**
	 * 查询每一条招聘信息的全部数据
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
