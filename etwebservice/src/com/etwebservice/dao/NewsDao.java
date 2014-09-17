package com.etwebservice.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.etwebservice.dboperator.DBoperator;
import com.etwebservice.domain.News;
import com.etwebservice.domain.Team;
import com.etwebservice.util.HibernateUtil;

public class NewsDao extends DBoperator<News>{
	
	
    /**
     * 插入新闻动态返回插入是否成功的状态。
     */
	@Override
	public Boolean Insert(News news) {
		// TODO Auto-generated method stub
		Session session=HibernateUtil.getSession();
		Transaction trans = null;
		try{
			trans=session.beginTransaction();
			session.save(news);
			trans.commit();
		}catch(Exception ex){
			System.out.println("调用NewsDao的Insert(News news)方法插入新闻失败");
			ex.printStackTrace();
			return false;
		}finally{
			session.close();
		}
		return true;
	}
	
	

	@Override
	public Boolean Update(News news) {
		// TODO Auto-generated method stub
		SessionFactory sessionfactory = HibernateUtil.getSessionFactory();
		Session session = sessionfactory.openSession();
		Transaction trans = null;
		try {
			trans = session.beginTransaction();
			News etnews = (News) session.get(News.class,
					new Integer(news.getNewsId()));
			if (null != news.getNewsContent())
				etnews.setNewsContent(news.getNewsContent());
			if (null != news.getNewsTime())
				etnews.setNewsTime(news.getNewsTime());
			if (null != news.getNewsTitle())
				etnews.setNewsTitle(news.getNewsTitle());
			session.update(etnews);
			trans.commit();
		} catch (Exception ex) {
			System.out.println("调用NewsDao的Update(News news)更新失败");
			ex.printStackTrace();
			return false;
		} finally {
			session.close();
		}
		return true;
	}



	@Override
	public Boolean Delete(News news) {
		// TODO Auto-generated method stub
		Session session=HibernateUtil.getSession();
		try{
			News etnews=(News) session.get(News.class, new Integer(news.getNewsId()));
			Transaction trans = session.beginTransaction();
			session.delete(etnews);
			trans.commit();
		}catch(Exception ex){
			System.out.println("调用NewsDao的Delete(News news)方法删除新闻失败");
			ex.printStackTrace();
			return false;
		}finally{
			session.close();
		}
		return true;
	}



	@Override
	public News QueryById(int id) {
		// TODO Auto-generated method stub
		Session session=HibernateUtil.getSession();
		Transaction trans = null;
		News news = null;
		List<?>list = null;
		String hql="select news.newsContent from News news where news.newsId=:id";
		try{
			trans=session.beginTransaction();
			Query query = session.createQuery(hql);
			query.setInteger("id", id);
			list = query.list();
			trans.commit();
		}catch(Exception ex){
			System.out.println("调用NewsDao的QueryById(int id)方法查询失败");
			ex.printStackTrace();
			return null;
		}finally{
			if(list!=null){
				for(int i=0;i<list.size();i++){
				String content = (String) list.get(i);
				news=new News();
				news.setNewsContent(content);
				}
			}else{
				System.out.println("调用NewsDao的QueryById(int id)没有id="+id+"的记录");
			}				
			
		}
		return news;
	}

	@Override
	public News QueryByName(String title) {
		// TODO Auto-generated method stub
		Session session=HibernateUtil.getSession();
		Transaction trans = null;
		News news = null;
		List<?>list = null;
		String hql="select news.newsContent from News news where news.newsTitle=:title";
		try{
			trans=session.beginTransaction();
			Query query = session.createQuery(hql);
			query.setString("title", title);
			list = query.list();
			trans.commit();
		}catch(Exception ex){
			System.out.println("调用NewsDao的QueryByName(String title)方法查询失败");
			ex.printStackTrace();
			return null;
		}finally{
			if(list!=null){
				for(int i=0;i<list.size();i++){
					String content = (String) list.get(i);
					news = new News();
					news.setNewsContent(content);
				}
			}else{
				System.out.println("调用NewsDao的QueryByName(String title)没有title="+title+"的记录");
			}

		}
		return news;
	}

	@Override
	public List<News> Query(int currentpage, int pagesize) {
		// TODO Auto-generated method stub
		int firstResult = (currentpage - 1) * pagesize;
		Session session=HibernateUtil.getSession();
		Transaction trans = null;
		News news = null;
		List<?>list = null;
		List<News> newslist= new ArrayList<News>();
		String hql="select news.newsId,news.newsTitle,news.newsTime from News news";
		try{
			trans=session.beginTransaction();
			Query query = session.createQuery(hql);
			query.setFirstResult(firstResult);
			query.setMaxResults(pagesize);
			list = query.list();
			trans.commit();
		}catch(Exception ex){
			System.out.println("调用NewsDao的Query()方法查询失败");
			ex.printStackTrace();
			return null;
		}finally{
			if(list!=null){
				for(int i=0;i<list.size();i++){
					Object[] obj = (Object[]) list.get(i);
					news = new News();
					news.setNewsId((int)obj[0]);
					news.setNewsTitle(obj[1].toString());
					news.setNewsTime(obj[2].toString());
					newslist.add(news);
				}
			}else{
				System.out.println("没有找到数据库中的记录");
			}
		}
		return newslist;
	}

}
