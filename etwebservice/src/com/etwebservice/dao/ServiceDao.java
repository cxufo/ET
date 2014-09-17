package com.etwebservice.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.etwebservice.dboperator.DBoperator;
import com.etwebservice.domain.Service;
import com.etwebservice.domain.Team;
import com.etwebservice.util.HibernateUtil;

public class ServiceDao extends DBoperator<Service>{

	
	@Override
	public Boolean Insert(Service t) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
		try {
			session.save(t);
			trans.commit();
		} catch (Exception e) {
			System.out.println("����ServiceDao��Insert(Service t)��������ʧ��");
			e.printStackTrace();
			return false;
		} finally {
			session.close();
		}
		return true;
	}

	@Override
	public Boolean Delete(Service t) {
		// TODO Auto-generated method stub
		SessionFactory sessionfactctory = HibernateUtil.getSessionFactory();
		Session session = sessionfactctory.openSession();
		Transaction trans = null;
		String hql = "delete Service service where service.serviceId=:Id";
		try {
			trans = session.beginTransaction();
			Query query = session.createQuery(hql);
			query.setInteger("Id", t.getServiceId());
			query.executeUpdate();
			trans.commit();
		} catch (Exception ex) {
			System.out.println("����ServiceDao��Delete(Service t)ɾ��ʧ��");
			ex.printStackTrace();
			return false;
		} finally {
			session.close();
		}
		return true;
	}
	
	@Override
	public Boolean Update(Service t) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSession();
		Transaction trans = null;
		try{
			trans=session.beginTransaction();
			Service service = (Service) session.get(Service.class, t.getServiceId());
			if(null!=t.getDetail()){
				service.setDetail(t.getDetail());
			}
			if(null!=t.getServiceName())
				service.setServiceName(t.getServiceName());
			if(null!=t.getImage())
				service.setImage(t.getImage());
			session.update(service);
			trans.commit();
		}catch(Exception ex){
			System.out.println("����ServiceDao��update(Service t)����ʧ��)");
		}finally{
			session.close();
		}
		return true;
	}

	@Override
	public Service QueryById(int id) {
		// TODO Auto-generated method stub
		Session session=HibernateUtil.getSession();
		Transaction trans = null;
		Service service = null;
		List<?>list = null;
		String hql="from Service service where service.serviceId=:id";
		try{
			trans=session.beginTransaction();
			Query query = session.createQuery(hql);
			query.setInteger("id", id);
			list = query.list();
			trans.commit();
		}catch(Exception ex){
			System.out.println("����ServiceDao��QueryById(int id)������ѯʧ��");
			ex.printStackTrace();
			return null;
		}finally{
			if(list!=null){
				for(int i=0;i<list.size();i++){
					service = (Service) list.get(i);
				}
			}else{
				System.out.println("����ServiceDao��QueryById(int id)û��id="+id+"�ļ�¼");
			}				
			
		}
		return service;
	}

	@Override
	public Service QueryByName(String name) {
		// TODO Auto-generated method stub
		Session session=HibernateUtil.getSession();
		Transaction trans = null;
		Service service = null;
		List<?>list = null;
		String hql="from Service service where service.serviceName=:name";
		try{
			trans=session.beginTransaction();
			Query query = session.createQuery(hql);
			query.setString("name", name);
			list = query.list();
			trans.commit();
		}catch(Exception ex){
			System.out.println("����ServiceDao��QueryByName(String name)������ѯʧ��");
			ex.printStackTrace();
			return null;
		}finally{
			if(list!=null){
				for(int i=0;i<list.size();i++){
					service = (Service) list.get(i);
				}
			}else{
				System.out.println("����ServiceDao��QueryByName(String name)û��name="+name+"�ļ�¼");
			}

		}
		return service;
	}

	@Override
	public List<Service> Query(int currentpage, int pagesize) {
		// TODO Auto-generated method stub
		int firstResult = (currentpage - 1) * pagesize;
		Session session=HibernateUtil.getSession();
		Transaction trans = null;
		Service service = null;
		List<?>list = null;
		List<Service> servicelist= new ArrayList<Service>();
		String hql="select service.serviceId,service.serviceName,service.image from Service service";
		try{
			trans=session.beginTransaction();
			Query query = session.createQuery(hql);
			query.setFirstResult(firstResult);
			query.setMaxResults(pagesize);
			list = query.list();
			trans.commit();
		}catch(Exception ex){
			System.out.println("����ServiceDao��Query(int currentpage, int pagesize)������ѯʧ��");
			ex.printStackTrace();
			return null;
		}finally{
			if(list!=null){
				for(int i=0;i<list.size();i++){
					service = new Service();
					Object []obj=(Object[])list.get(i);
					service.setServiceId((int)obj[0]);
					service.setServiceName(obj[1].toString());
					service.setImage(obj[2].toString());
					servicelist.add(service);
				}
			}else{
				System.out.println("û���ҵ����ݿ��еļ�¼");
			}
		}
		return servicelist;
	}
	
	public List<Service> QueryAll(int currentpage, int pagesize) {
		// TODO Auto-generated method stub
		int firstResult = (currentpage - 1) * pagesize;
		Session session=HibernateUtil.getSession();
		Transaction trans = null;
		Service service = null;
		List<?>list = null;
		List<Service> servicelist= new ArrayList<Service>();
		String hql="from Service service";
		try{
			trans=session.beginTransaction();
			Query query = session.createQuery(hql);
			query.setFirstResult(firstResult);
			query.setMaxResults(pagesize);
			list = query.list();
			trans.commit();
		}catch(Exception ex){
			System.out.println("����ServiceDao��Query(int currentpage, int pagesize)������ѯʧ��");
			ex.printStackTrace();
			return null;
		}finally{
			if(list!=null){
				for(int i=0;i<list.size();i++){
					service = (Service) list.get(i);
					servicelist.add(service);
				}
			}else{
				System.out.println("û���ҵ����ݿ��еļ�¼");
			}
		}
		return servicelist;
	}

}
