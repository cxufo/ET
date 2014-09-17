package com.etwebservice.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.etwebservice.dboperator.DBoperator;
import com.etwebservice.domain.Introduction;
import com.etwebservice.domain.News;
import com.etwebservice.domain.Service;
import com.etwebservice.domain.Team;
import com.etwebservice.util.HibernateUtil;

public class IntroductionDao extends DBoperator<Introduction>{

	
	@Override
	public Boolean Insert(Introduction t) {
		// TODO Auto-generated method stub
		Session session=HibernateUtil.getSession();
		Transaction trans = null;
		try{
			trans=session.beginTransaction();
			session.save(t);
			trans.commit();
		}catch(Exception ex){
			System.out.println("����IntroductionDao��Insert(Introduction t)�����������ʧ��");
			ex.printStackTrace();
			return false;
		}finally{
			session.close();
		}
		return true;
	}

	@Override
	public Boolean Update(Introduction t) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSession();
		Transaction trans = null;
		try {
			trans = session.beginTransaction();
			Introduction intro = (Introduction) session.get(Introduction.class,
					new Integer(t.getIntroId()));
			if (null != t.getDetail())
				intro.setDetail(t.getDetail());
			if (null != t.getImage())
				intro.setImage(t.getImage());
			if (null != t.getIntroItem())
				intro.setIntroItem(t.getIntroItem());
			session.update(intro);
			trans.commit();
		} catch (Exception ex) {
			System.out.println("����IntroductionDao��Update(Introduction t)����ʧ��");
			ex.printStackTrace();
			return false;
		} finally {
			session.close();
		}
		return true;
	}

	@Override
	public Boolean Delete(Introduction t) {
		// TODO Auto-generated method stub
		Session session=HibernateUtil.getSession();
		try{
			Introduction introduction=(Introduction) session.get(News.class, new Integer(t.getIntroId()));
			Transaction trans = session.beginTransaction();
			session.delete(introduction);
			trans.commit();
		}catch(Exception ex){
			System.out.println("����IntroductionDao��Delete(Introduction t)����ɾ������ʧ��");
			ex.printStackTrace();
			return false;
		}finally{
			session.close();
		}
		return true;
	}

	@Override
	public Introduction QueryById(int id) {
		// TODO Auto-generated method stub
		
		Session session = HibernateUtil.getSession();
		Transaction trans = null;
		Introduction intro = null;
		List<?> list = null;
		String hql = "from Introduction intro where intro.introId=:id";
		try {
			trans = session.beginTransaction();
			Query query = session.createQuery(hql);
			query.setInteger("id", id);
			list = query.list();
			trans.commit();
		} catch (Exception ex) {
			System.out.println("����IntroductionDao��QueryById(int id)������ѯʧ��");
			ex.printStackTrace();
			return null;
		} finally {
			if (list != null) {
				for (int i = 0; i < list.size(); i++) {
					intro = (Introduction) list.get(i);
				}
			} else {
				System.out.println("����IntroductionDao��QueryById(int id)û��id=" + id
						+ "�ļ�¼");
			}

		}
		return intro;
		
	}

	@Override
	public Introduction QueryByName(String name) {
		// TODO Auto-generated method stub
		Session session=HibernateUtil.getSession();
		Transaction trans = null;
		Introduction intro = null;
		List<?>list = null;
		String hql="from Introduction intro where intro.introItem=:name";
		try{
			trans=session.beginTransaction();
			Query query = session.createQuery(hql);
			query.setString("name", name);
			list = query.list();
			trans.commit();
		}catch(Exception ex){
			System.out.println("����IntroductionDao��QueryByName(String name)������ѯʧ��");
			ex.printStackTrace();
			return null;
		}finally{
			if(list!=null){
				for(int i=0;i<list.size();i++){
					intro = (Introduction) list.get(i);
				}
			}else{
				System.out.println("����IntroductionDao��QueryByName(String name)û��name="+name+"�ļ�¼");
			}

		}
		return intro;
	}

	@Override
	public List<Introduction> Query(int currentpage, int pagesize) {
		// TODO Auto-generated method stub
		int firstResult = (currentpage - 1) * pagesize;
		Session session=HibernateUtil.getSession();
		Transaction trans = null;
		Introduction intro = null;
		List<?>list = null;
		List<Introduction> introlist= new ArrayList<Introduction>();
		String hql="from Introduction intro";
		try{
			trans=session.beginTransaction();
			Query query = session.createQuery(hql);
			query.setFirstResult(firstResult);
			query.setMaxResults(pagesize);
			list = query.list();
			trans.commit();
		}catch(Exception ex){
			System.out.println("����IntroductionDao��Query()������ѯʧ��");
			ex.printStackTrace();
			return null;
		}finally{
			if(list!=null){
				for(int i=0;i<list.size();i++){
					intro = (Introduction) list.get(i);
					introlist.add(intro);
				}
			}else{
				System.out.println("û���ҵ����ݿ��еļ�¼");
			}
		}
		return introlist;
	}
	
	public List<Introduction> QueryPart(int currentpage, int pagesize) {
		// TODO Auto-generated method stub
		int firstResult = (currentpage - 1) * pagesize;
		Session session=HibernateUtil.getSession();
		Transaction trans = null;
		Introduction intro = null;
		List<?>list = null;
		List<Introduction> introlist= new ArrayList<Introduction>();
		String hql="select intro.introId,intro.introItem,intro.image from Introduction intro";
		try{
			trans=session.beginTransaction();
			Query query = session.createQuery(hql);
			query.setFirstResult(firstResult);
			query.setMaxResults(pagesize);
			list = query.list();
			trans.commit();
		}catch(Exception ex){
			System.out.println("����IntroductionDao��Query()������ѯʧ��");
			ex.printStackTrace();
			return null;
		}finally{
			if(list!=null){
				for(int i=0;i<list.size();i++){
					Object[] obj = (Object[])list.get(i);
					intro  = new Introduction();
					intro.setIntroId((int)obj[0]);
					intro.setIntroItem(obj[1].toString());
					intro.setImage(obj[2].toString());
					System.out.println((int)obj[0]);
					introlist.add(intro);
				}
			}else{
				System.out.println("û���ҵ����ݿ��еļ�¼");
			}
		}
		return introlist;
	}

}
