package com.etwebservice.webservice.service;

import com.etwebservice.dao.TeamDao;
import com.etwebservice.domain.Team;
import com.etwebservice.util.Json;

public class ETTeam {
	/**
	 * �����Ŷӳ�Ա
	 * @param team �Ŷӳ�Ա����
	 * @return �����Ƿ�ɹ�
	 */
	public Boolean insertTeamMember(Team team) {
		TeamDao dao = new TeamDao();
		Boolean isSucessful = dao.Insert(team);
		return isSucessful;
	}
	/**
	 * ɾ���Ŷӳ�Ա
	 * @param team �Ŷӳ�Ա����
	 * @return �����Ƿ�ɹ�
	 */
	public Boolean deleteTeamMember(Team team){
		TeamDao dao = new TeamDao();
		Boolean isSucessful = dao.Delete(team);
		return isSucessful;
	}
	
	/**
	 * �����Ŷӳ�Ա��ͼƬ
	 * @param path ͼƬ·��
	 * @return �����Ƿ�ɹ�����
	 */
	public Boolean updateImage(int id,String path){
		TeamDao dao = new TeamDao();
		Boolean isSucessful = dao.Update(new Team(id,null,null,null,null,path));
		return isSucessful;		
	}
	
	/**
	 * �����Ŷӳ�Ա��ְ��
	 * @param id
	 * @param job
	 * @return
	 */
	public Boolean updateTeamJob(int id,String job){
		TeamDao dao = new TeamDao();
		Boolean isSucessful = dao.Update(new Team(id,null,null,job,null,null));
		return isSucessful;	
	}
	/**
	 * �����Ŷӳ�Ա��ǩ��
	 * @param id
	 * @param sign
	 * @return
	 */
	public Boolean updateTeamSign(int id,String sign){
		TeamDao dao = new TeamDao();
		Boolean isSucessful = dao.Update(new Team(id,null,sign,null,null,null));
		return isSucessful;	
	}
	
	/**
	 * �����Ŷӳ�Ա����ϸ����
	 * @param id
	 * @param detail
	 * @return
	 */
	public Boolean updateTeamDetail(int id,String detail){
		TeamDao dao = new TeamDao();
		Boolean isSucessful = dao.Update(new Team(id,null,null,null,detail,null));
		return isSucessful;	
	}
	
	/**
	 * �����Ŷӳ�Ա������
	 * @param id
	 * @param name
	 * @return
	 */
	public Boolean updateTeamName(int id,String name){
		TeamDao dao = new TeamDao();
		Boolean isSucessful = dao.Update(new Team(id,name,null,null,null,null));
		return isSucessful;	
	}
	
	/**
	 * �����Ŷӳ�Ա��������Ϣ
	 * @param team
	 * @return
	 */
	public Boolean updateTeam(Team team){
		TeamDao dao = new TeamDao();
		Boolean isSucessful = dao.Update(team);
		return isSucessful;	
	}
	/**
	 * ��ѯ�Ŷӳ�Ա�Ĳ�����Ϣ��û�в�ѯ��������ϸ����
	 * @param currentpage ��ǰҳ
	 * @param pagesize ÿһҳ��ʾ��������
	 * @return ���ز�ѯ�������ݵ�json��ʽ����
	 */
	public String getTeam(int currentpage, int pagesize){
		TeamDao dao = new TeamDao();
		String teams = Json.teamlistToJson(dao.Query(currentpage, pagesize));
		return teams;
	}
	
	/**
	 * ��ѯ�Ŷӳ�Ա��������Ϣ
	 * @param currentpage ��ǰҳ
	 * @param pagesize ÿһҳ��ʾ����������
	 * @return ���ز�ѯ�������ݵ�json��ʽ����
	 */
	public String getTeamAllinfo(int currentpage, int pagesize){
		TeamDao dao = new TeamDao();
		String teams = Json.teamlistToJson(dao.QueryAll(currentpage, pagesize));
		return teams;
	}
	
	/**
	 * ����Id��ѯ�Ŷӳ�Ա����Ϣ
	 * @param id
	 * @return �Ŷӳ�Ա��������Ϣ
	 */
	public Team getTeamById(int id){
		TeamDao dao = new TeamDao();
		Team team=dao.QueryById(id);
		return team;
	}
	/**
	 * �����Ŷӳ�Ա��������ѯ��Ա��������Ϣ
	 * @param name �Ŷӳ�Ա
	 * @return ���س�Ա����
	 */
	public Team getTeamByName(String name){
		TeamDao dao = new TeamDao();
		Team team=dao.QueryByName(name);
		return team;
	}
}
