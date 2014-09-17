package com.etwebservice.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.etwebservice.dboperator.DBoperator;
import com.etwebservice.domain.Employ;
import com.etwebservice.domain.News;
import com.etwebservice.util.HibernateUtil;

public class EmployDao extends DBoperator<Employ>{

	@Override
	public Boolean Insert(Employ employ) {
		// TODO Auto-generated method stub
		Session session=HibernateUtil.getSession();
		Transaction trans = null;
		try{
			trans=session.beginTransaction();
			session.save(employ);
			trans.commit();
		}catch(Exception ex){
			System.out.println("调用EmployDao的Insert(Employ employ)方法插入新闻失败");
			ex.printStackTrace();
			return false;
		}finally{
			session.close();
		}
		return true;
	}

	@Override
	public Boolean Delete(Employ employ) {
		// TODO Auto-generated method stub
		Session session=HibernateUtil.getSession();
		try{
			Employ employs=(Employ) session.get(Employ.class, new Integer(employ.getEmployId()));
			Transaction trans = session.beginTransaction();
			session.delete(employs);
			trans.commit();
		}catch(Exception ex){
			System.out.println("调用EmployDao的Delete(Employ employ)方法删除失败");
			ex.printStackTrace();
			return false;
		}finally{
			session.close();
		}
		return true;
	}
	
	@Override
	public Boolean Update(Employ employ) {
		// TODO Auto-generated method stub
		SessionFactory sessionfactory = HibernateUtil.getSessionFactory();
		Session session = sessionfactory.openSession();
		Transaction trans = null;
		try {
			trans = session.beginTransaction();
			Employ employs = (Employ) session.get(Employ.class,
					new Integer(employ.getEmployId()));
			if (null != employ.getJob())
				employs.setJob(employ.getJob());
			if (null != employ.getEducational())
				employs.setEducational(employ.getEducational());
			if (null != employ.getDetail())
				employs.setDetail(employs.getDetail());
			if(null!=employ.getDate()){
				employs.setDate(employ.getDate());
			}
			if(0!=employ.getCount())
				employs.setCount(employ.getCount());
			session.update(employs);
			trans.commit();
		} catch (Exception ex) {
			System.out.println("调用EmployDao的Update(Employ employ)更新失败");
			ex.printStackTrace();
			return false;
		} finally {
			session.close();
		}
		return true;
	}

	@Override
	public Employ QueryById(int id) {
		// TODO Auto-generated method stub
		Session session=HibernateUtil.getSession();
		Transaction trans = null;
		Employ employ = null;
		List<?>list = null;
		String hql="from Employ employ where employ.employId=:id";
		try{
			trans=session.beginTransaction();
			Query query = session.createQuery(hql);
			query.setInteger("id", id);
			list = query.list();
			trans.commit();
		}catch(Exception ex){
			System.out.println("调用EmployDao的QueryById(int id)方法查询失败");
			ex.printStackTrace();
			return null;
		}finally{
			if(list!=null){
				for(int i=0;i<list.size();i++){
				employ = (Employ) list.get(i);
				}
			}else{
				System.out.println("调用NewsDao的QueryById(int id)没有id="+id+"的记录");
			}				
			
		}
		return employ;
	}


	@Override
	public List<Employ> Query(int currentpage, int pagesize) {
		// TODO Auto-generated method stub
		int firstResult = (currentpage - 1) * pagesize;
		Session session=HibernateUtil.getSession();
		Transaction trans = null;
		Employ employ = null;
		List<?>list = null;
		List<Employ> employlist= new ArrayList<Employ>();
		String hql="select employ.employId,employ.job,employ.educational,employ.adress,employ.date,"
				+ "employ.count from Employ employ";
		try{
			trans=session.beginTransaction();
			Query query = session.createQuery(hql);
			query.setFirstResult(firstResult);
			query.setMaxResults(pagesize);
			list = query.list();
			trans.commit();
		}catch(Exception ex){
			System.out.println("调用EmployDao的Query(int currentpage, int pagesize)方法查询失败");
			ex.printStackTrace();
			return null;
		}finally{
			if(list!=null){
				for(int i=0;i<list.size();i++){
					employ = new Employ();
					Object []obj = (Object[]) list.get(i);
					employ.setEmployId((int)obj[0]);
					employ.setJob(obj[1].toString());
					employ.setEducational(obj[2].toString());
					employ.setAdress(obj[3].toString());
					employ.setDate(obj[4].toString());
					employ.setCount((int)obj[5]);
					employlist.add(employ);
				}
			}else{
				System.out.println("没有找到数据库中的记录");
			}
		}
		return employlist;
	}


	public List<Employ> QueryALL(int currentpage, int pagesize) {
		// TODO Auto-generated method stub
		int firstResult = (currentpage - 1) * pagesize;
		Session session=HibernateUtil.getSession();
		Transaction trans = null;
		Employ employ = null;
		List<?>list = null;
		List<Employ> employlist= new ArrayList<Employ>();
		String hql="from Employ employ";
		try{
			trans=session.beginTransaction();
			Query query = session.createQuery(hql);
			query.setFirstResult(firstResult);
			query.setMaxResults(pagesize);
			list = query.list();
			trans.commit();
		}catch(Exception ex){
			System.out.println("调用EmployDao的Query(int currentpage, int pagesize)方法查询失败");
			ex.printStackTrace();
			return null;
		}finally{
			if(list!=null){
				for(int i=0;i<list.size();i++){
					employ = (Employ) list.get(i);
					employlist.add(employ);
				}
			}else{
				System.out.println("没有找到数据库中的记录");
			}
		}
		return employlist;
	}
}
