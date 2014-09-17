package com.etwebservice.webservice.service;

import com.etwebservice.dao.ServiceDao;
import com.etwebservice.domain.Service;
import com.etwebservice.util.Json;

public class ETService {
	/**
	 * 添加服务
	 * @param service 服务对象
	 * @return 是否成功添加
	 */
	public Boolean insertService(Service service) {
		ServiceDao dao = new ServiceDao();
		Boolean isSucessful = dao.Insert(service);
		return isSucessful;
	}
	
	/**
	 * 删除服务
	 * @param service
	 * @return 是否成功删除
	 */
	public Boolean deleteService(Service service){
		ServiceDao dao = new ServiceDao();
		Boolean isSucessful = dao.Delete(service);
		return isSucessful;
	}
	
	/**
	 * 更新服务的图片
	 * @param id 服务Id
	 * @param path 图片路径
	 * @return 返回是否成功更新图片
	 */
	public Boolean updateServiceImage(int id,String path){
		ServiceDao dao = new ServiceDao();
		Boolean isSucessful = dao.Update(new Service(id,null,null,path));
		return isSucessful;
	}
	
	/**
	 * 更新服务的详细介绍
	 * @param id 服务Id
	 * @param detail 服务详细介绍
	 * @return 返回是否成功更新服务详情。
	 */
	public Boolean updateServiceDetail(int id,String detail){
		ServiceDao dao = new ServiceDao();
		Boolean isSucessful = dao.Update(new Service(id,null,detail,null));
		return isSucessful;
	}
	
	
	/**
	 * 更新服务的名称
	 * @param id 服务ID
	 * @param name 服务名称
	 * @return 返回是否成功更新服务名称。
	 */
	public Boolean updateServiceName(int id,String name){
		ServiceDao dao = new ServiceDao();
		Boolean isSucessful = dao.Update(new Service(id,name,null,null));
		return isSucessful;
	}
	/**
	 * 更新整个服务
	 * @param service
	 * @return
	 */
	public Boolean updateService(Service service){
		ServiceDao dao = new ServiceDao();
		Boolean isSucessful = dao.Update(service);
		return isSucessful;
	}
	
	/**
	 * 分页查询服务信息
	 * @param currentpage
	 * @param pagesize
	 * @return 返回服务每一个服务的部分信息，Id，服务名、图片
	 */
	public String getService(int currentpage,int pagesize){
		ServiceDao dao = new ServiceDao();
		String services = Json.servicelistToJson(dao.Query(currentpage, pagesize));
		return services;		
	}
	
	/**
	 * 分页查询服务信息
	 * @param currentpage
	 * @param pagesize
	 * @return 返回服务每一个服务的手游信息
	 */
	public String getServiceAll(int currentpage,int pagesize){
		ServiceDao dao = new ServiceDao();
		String services = Json.servicelistToJson(dao.QueryAll(currentpage, pagesize));
		return services;
	}
	/**
	 * 根据服务Id查询服务信息
	 * @param id 服务Id
	 * @return 服务信息的对象
	 */
	public Service getServiceById(int id){
		ServiceDao dao = new ServiceDao();
		Service service = dao.QueryById(id);
		return service;
	}
	
	/**
	 * 根据服务名称查询服务
	 * @param name 服务名称
	 * @return 服务信息的对象
	 */
	public Service getServiceByName(String name){
		ServiceDao dao = new ServiceDao();
		Service service = dao.QueryByName(name);
		return service;
	}
	
}
