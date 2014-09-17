package com.etwebservice.webservice.service;

import com.etwebservice.dao.ServiceDao;
import com.etwebservice.domain.Service;
import com.etwebservice.util.Json;

public class ETService {
	/**
	 * ��ӷ���
	 * @param service �������
	 * @return �Ƿ�ɹ����
	 */
	public Boolean insertService(Service service) {
		ServiceDao dao = new ServiceDao();
		Boolean isSucessful = dao.Insert(service);
		return isSucessful;
	}
	
	/**
	 * ɾ������
	 * @param service
	 * @return �Ƿ�ɹ�ɾ��
	 */
	public Boolean deleteService(Service service){
		ServiceDao dao = new ServiceDao();
		Boolean isSucessful = dao.Delete(service);
		return isSucessful;
	}
	
	/**
	 * ���·����ͼƬ
	 * @param id ����Id
	 * @param path ͼƬ·��
	 * @return �����Ƿ�ɹ�����ͼƬ
	 */
	public Boolean updateServiceImage(int id,String path){
		ServiceDao dao = new ServiceDao();
		Boolean isSucessful = dao.Update(new Service(id,null,null,path));
		return isSucessful;
	}
	
	/**
	 * ���·������ϸ����
	 * @param id ����Id
	 * @param detail ������ϸ����
	 * @return �����Ƿ�ɹ����·������顣
	 */
	public Boolean updateServiceDetail(int id,String detail){
		ServiceDao dao = new ServiceDao();
		Boolean isSucessful = dao.Update(new Service(id,null,detail,null));
		return isSucessful;
	}
	
	
	/**
	 * ���·��������
	 * @param id ����ID
	 * @param name ��������
	 * @return �����Ƿ�ɹ����·������ơ�
	 */
	public Boolean updateServiceName(int id,String name){
		ServiceDao dao = new ServiceDao();
		Boolean isSucessful = dao.Update(new Service(id,name,null,null));
		return isSucessful;
	}
	/**
	 * ������������
	 * @param service
	 * @return
	 */
	public Boolean updateService(Service service){
		ServiceDao dao = new ServiceDao();
		Boolean isSucessful = dao.Update(service);
		return isSucessful;
	}
	
	/**
	 * ��ҳ��ѯ������Ϣ
	 * @param currentpage
	 * @param pagesize
	 * @return ���ط���ÿһ������Ĳ�����Ϣ��Id����������ͼƬ
	 */
	public String getService(int currentpage,int pagesize){
		ServiceDao dao = new ServiceDao();
		String services = Json.servicelistToJson(dao.Query(currentpage, pagesize));
		return services;		
	}
	
	/**
	 * ��ҳ��ѯ������Ϣ
	 * @param currentpage
	 * @param pagesize
	 * @return ���ط���ÿһ�������������Ϣ
	 */
	public String getServiceAll(int currentpage,int pagesize){
		ServiceDao dao = new ServiceDao();
		String services = Json.servicelistToJson(dao.QueryAll(currentpage, pagesize));
		return services;
	}
	/**
	 * ���ݷ���Id��ѯ������Ϣ
	 * @param id ����Id
	 * @return ������Ϣ�Ķ���
	 */
	public Service getServiceById(int id){
		ServiceDao dao = new ServiceDao();
		Service service = dao.QueryById(id);
		return service;
	}
	
	/**
	 * ���ݷ������Ʋ�ѯ����
	 * @param name ��������
	 * @return ������Ϣ�Ķ���
	 */
	public Service getServiceByName(String name){
		ServiceDao dao = new ServiceDao();
		Service service = dao.QueryByName(name);
		return service;
	}
	
}
