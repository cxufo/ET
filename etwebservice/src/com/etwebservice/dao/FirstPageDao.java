package com.etwebservice.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.etwebservice.dboperator.DBoperator;
import com.etwebservice.domain.FirstPage;
import com.etwebservice.domain.News;
import com.etwebservice.domain.Service;
import com.etwebservice.util.HibernateUtil;

public class FirstPageDao extends DBoperator<FirstPage>{

	@Override
	public Boolean Insert(FirstPage t) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
		try {
			session.save(t);
			trans.commit();
		} catch (Exception e) {
			System.out.println("����FirstPageDao��Insert(FirstPage t)��������ʧ��");
			e.printStackTrace();
			return false;
		} finally {
			session.close();
		}
		return true;
	}

	@Override
	public Boolean Update(FirstPage t) {
		// TODO Auto-generated method stub
		SessionFactory sessionfactory = HibernateUtil.getSessionFactory();
		Session session = sessionfactory.openSession();
		Transaction trans = null;
		try {
			trans = session.beginTransaction();
			FirstPage first = (FirstPage) session.get(FirstPage.class,
					new Integer(t.getFimageId()));
			if(null!=t.getfImage())
				first.setfImage(t.getfImage());
			else
				System.out.println("û�л�ȡ��ͼƬ��Ϣ");
			trans.commit();
		} catch (Exception ex) {
			System.out.println("����FirstPageDao��Update(FirstPage t)����ʧ��");
			ex.printStackTrace();
			return false;
		} finally {
			session.close();
		}
		return true;
	}

	@Override
	public List<FirstPage> Query(int currentpage, int pagesize) {
		// TODO Auto-generated method stub
		int firstResult = (currentpage - 1) * pagesize;
		Session session=HibernateUtil.getSession();
		Transaction trans = null;
		FirstPage first = null;
		List<?>list = null;
		List<FirstPage> firstlist= new ArrayList<FirstPage>();
		String hql="from FirstPage firstimage";
		try{
			trans=session.beginTransaction();
			Query query = session.createQuery(hql);
			query.setFirstResult(firstResult);
			query.setMaxResults(pagesize);
			list = query.list();
			trans.commit();
		}catch(Exception ex){
			System.out.println("����FirstPageDao��Query(int currentpage, int pagesize)������ѯʧ��");
			ex.printStackTrace();
			return null;
		}finally{
			if(list!=null){
				for(int i=0;i<list.size();i++){
					first = (FirstPage) list.get(i);
					firstlist.add(first);
				}
			}else{
				System.out.println("û���ҵ����ݿ��еļ�¼");
			}
		}
		return firstlist;
	}

	@Override
	public Boolean Delete(FirstPage t) {
		// TODO Auto-generated method stub
		Session session=HibernateUtil.getSession();
		try{
			FirstPage first=(FirstPage) session.get(FirstPage.class, new Integer(t.getFimageId()));
			Transaction trans = session.beginTransaction();
			session.delete(first);
			trans.commit();
		}catch(Exception ex){
			System.out.println("����FirstPageDao��Delete(FirstPage t)����ɾ����ҳͼƬʧ��");
			ex.printStackTrace();
			return false;
		}finally{
			session.close();
		}
		return true;
	}

}
