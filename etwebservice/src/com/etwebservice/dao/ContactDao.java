package com.etwebservice.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.etwebservice.dboperator.DBoperator;
import com.etwebservice.domain.Contact;
import com.etwebservice.domain.Introduction;
import com.etwebservice.domain.News;
import com.etwebservice.util.HibernateUtil;

public class ContactDao extends DBoperator<Contact>{

	@Override
	public Boolean Insert(Contact t) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
		try {
			session.save(t);
			trans.commit();
		} catch (Exception e) {
			System.out.println("调用ContactDao的Insert(Contact t)方法插入失败");
			e.printStackTrace();
			return false;
		} finally {
			session.close();
		}
		return true;
	}

	@Override
	public Boolean Update(Contact t) {
		// TODO Auto-generated method stub
		SessionFactory sessionfactory = HibernateUtil.getSessionFactory();
		Session session = sessionfactory.openSession();
		Transaction trans = null;
		try {
			trans = session.beginTransaction();
			Contact contact = (Contact) session.get(Contact.class,
					new Integer(t.getContactId()));
			if (null != t.getAdress())
				contact.setAdress(t.getAdress());;
			if (null != t.getEmail())
				contact.setEmail(t.getEmail());
			if (null != t.getFax())
				contact.setFax(t.getFax());
			if (null != t.getQq())
				contact.setQq(t.getQq());
			if (null != t.getPhoneNumber())
				contact.setPhoneNumber(t.getPhoneNumber());;
			session.update(contact);
			trans.commit();
		} catch (Exception ex) {
			System.out.println("调用ContactDao的Update(Contact t)更新失败");
			ex.printStackTrace();
			return false;
		} finally {
			session.close();
		}
		return true;
	}


	@Override
	public List<Contact> Query(int currentpage, int pagesize) {
		// TODO Auto-generated method stub
		int firstResult = (currentpage - 1) * pagesize;
		Session session=HibernateUtil.getSession();
		Transaction trans = null;
		Contact contact = null;
		List<?>list = null;
		List<Contact> contactlist= new ArrayList<Contact>();
		String hql="from Contact contact";
		try{
			trans=session.beginTransaction();
			Query query = session.createQuery(hql);
			query.setFirstResult(firstResult);
			query.setMaxResults(pagesize);
			list = query.list();
			trans.commit();
		}catch(Exception ex){
			System.out.println("调用ContactDao的Query(int currentpage, int pagesize)方法查询失败");
			ex.printStackTrace();
			return null;
		}finally{
			if(list!=null){
				for(int i=0;i<list.size();i++){
					contact = (Contact) list.get(i);
					contactlist.add(contact);
				}
			}else{
				System.out.println("没有找到数据库中的记录");
			}
		}
		return contactlist;
	}

	@Override
	public Boolean Delete(Contact t) {
		// TODO Auto-generated method stub
		Session session=HibernateUtil.getSession();
		try{
			Contact contact=(Contact) session.get(Contact.class, new Integer(t.getContactId()));
			Transaction trans = session.beginTransaction();
			session.delete(contact);
			trans.commit();
		}catch(Exception ex){
			System.out.println("调用ContactDao的Delete(Contact t)方法删除失败");
			ex.printStackTrace();
			return false;
		}finally{
			session.close();
		}
		return true;
	}

}
