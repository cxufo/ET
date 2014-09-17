package com.etwebservice.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.etwebservice.dboperator.DBoperator;
import com.etwebservice.domain.Team;
import com.etwebservice.util.HibernateUtil;

public class TeamDao extends DBoperator<Team> {

	public TeamDao() {

	}

	@Override
	public Boolean Insert(Team t) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
		try {
			session.save(t);
			trans.commit();
		} catch (Exception e) {
			System.out.println("调用TeamDao的Insert(Team t)方法插入失败");
			e.printStackTrace();
			return false;
		} finally {
			session.close();
		}
		return true;
	}

	@Override
	public Boolean Delete(Team t) {
		// TODO Auto-generated method stub
		SessionFactory sessionfactctory = HibernateUtil.getSessionFactory();
		Session session = sessionfactctory.openSession();
		Transaction trans = null;
		String hql = "delete Team team where team.memberId=:Id";
		try {
			trans = session.beginTransaction();
			Query query = session.createQuery(hql);
			query.setInteger("Id", t.getMemberId());
			query.executeUpdate();
			trans.commit();
		} catch (Exception ex) {
			System.out.println("调用TeamDao的Delete(Team t)删除失败");
			ex.printStackTrace();
			return false;
		} finally {
			session.close();
		}
		return true;
	}

	@Override
	public Boolean Update(Team t) {
		// TODO Auto-generated method stub
		SessionFactory sessionfactory = HibernateUtil.getSessionFactory();
		Session session = sessionfactory.openSession();
		Transaction trans = null;
		try {
			trans = session.beginTransaction();
			Team team = (Team) session.get(Team.class,
					new Integer(t.getMemberId()));
			if (null != t.getName())
				team.setName(t.getName());
			if (null != t.getDetail())
				team.setDetail(t.getDetail());
			if (null != t.getJob())
				team.setJob(t.getJob());
			if(null!=t.getImage())
				team.setImage(t.getImage());
			if(null!=t.getSign())
				team.setSign(t.getSign());
			session.update(team);
			trans.commit();
		} catch (Exception ex) {
			System.out.println("调用TeamDao的Update(Team t)更新失败");
			ex.printStackTrace();
			return false;
		} finally {
			session.close();
		}
		return true;
	}

	@Override
	public Team QueryById(int id) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSession();
		Transaction trans = null;
		Team team = null;
		List<?> list = null;
		String hql = "from Team team where team.memberId=:id";
		try {
			trans = session.beginTransaction();
			Query query = session.createQuery(hql);
			query.setInteger("id", id);
			list = query.list();
			trans.commit();
		} catch (Exception ex) {
			System.out.println("调用TeamDao的QueryById(int id)方法查询失败");
			ex.printStackTrace();
			return null;
		} finally {
			if (list != null) {
				for (int i = 0; i < list.size(); i++) {
					team = (Team) list.get(i);
				}
			} else {
				System.out.println("调用TeamDao的QueryById(int id)没有id=" + id
						+ "的记录");
			}

		}
		return team;
	}

	@Override
	public Team QueryByName(String name) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSession();
		Transaction trans = null;
		Team team = null;
		List<?> list = null;
		String hql = "from Team team where team.name=:name";
		try {
			trans = session.beginTransaction();
			Query query = session.createQuery(hql);
			query.setString("name", name);
			list = query.list();
			trans.commit();
		} catch (Exception ex) {
			System.out.println("调用TeamDao的QueryByName(String name)方法查询失败");
			ex.printStackTrace();
			return null;
		} finally {
			if (list != null) {
				for (int i = 0; i < list.size(); i++) {
					team = (Team) list.get(i);
					System.out.println(team.getName());
				}
			} else {
				System.out.println("调用TeamDao的QueryByName(String name)没有name="
						+ name + "的记录");
			}

		}
		return team;
	}

	@Override
	public List<Team> Query(int currentpage, int pagesize) {
		// TODO Auto-generated method stub
		int firstResult = (currentpage - 1) * pagesize;
		Session session = HibernateUtil.getSession();
		Transaction trans = null;
		Team team = null;
		List<?> list = null;
		List<Team> teamlist = new ArrayList<Team>();
		String hql = "select team.memberId,team.name,team.sign,team.job,team.image from Team team";
		try {
			trans = session.beginTransaction();
			Query query = session.createQuery(hql);
			query.setFirstResult(firstResult);
			query.setMaxResults(pagesize);
			list = query.list();
			trans.commit();
		} catch (Exception ex) {
			System.out.println("调用TeamDao的QueryAll()方法查询失败");
			ex.printStackTrace();
			return null;
		} finally {
			if (list != null) {
				for (int i = 0; i < list.size(); i++) {
					team = new Team();
					Object [] obj = (Object[])list.get(i);
					team.setMemberId((int)obj[0]);
					team.setName(obj[1].toString());
					team.setSign(obj[2].toString());
					team.setJob(obj[3].toString());
					team.setImage(obj[4].toString());
					teamlist.add(team);
				}
			} else {
				System.out.println("没有找到数据库中的记录");
			}
		}
		return teamlist;
	}
	
	
	public List<Team> QueryAll(int currentpage, int pagesize) {
		// TODO Auto-generated method stub
		int firstResult = (currentpage - 1) * pagesize;
		Session session = HibernateUtil.getSession();
		Transaction trans = null;
		Team team = null;
		List<?> list = null;
		List<Team> teamlist = new ArrayList<Team>();
		String hql = "from Team team";
		try {
			trans = session.beginTransaction();
			Query query = session.createQuery(hql);
			query.setFirstResult(firstResult);
			query.setMaxResults(pagesize);
			list = query.list();
			trans.commit();
		} catch (Exception ex) {
			System.out.println("调用TeamDao的QueryAll()方法查询失败");
			ex.printStackTrace();
			return null;
		} finally {
			if (list != null) {
				for (int i = 0; i < list.size(); i++) {
					team = (Team) list.get(i);
					teamlist.add(team);
				}
			} else {
				System.out.println("没有找到数据库中的记录");
			}
		}
		return teamlist;
	}

}
