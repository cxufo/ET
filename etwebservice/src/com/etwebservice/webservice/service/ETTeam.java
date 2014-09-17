package com.etwebservice.webservice.service;

import com.etwebservice.dao.TeamDao;
import com.etwebservice.domain.Team;
import com.etwebservice.util.Json;

public class ETTeam {
	/**
	 * 插入团队成员
	 * @param team 团队成员对象
	 * @return 返回是否成功
	 */
	public Boolean insertTeamMember(Team team) {
		TeamDao dao = new TeamDao();
		Boolean isSucessful = dao.Insert(team);
		return isSucessful;
	}
	/**
	 * 删除团队成员
	 * @param team 团队成员对象
	 * @return 返回是否成功
	 */
	public Boolean deleteTeamMember(Team team){
		TeamDao dao = new TeamDao();
		Boolean isSucessful = dao.Delete(team);
		return isSucessful;
	}
	
	/**
	 * 更新团队成员的图片
	 * @param path 图片路径
	 * @return 返回是否成功更新
	 */
	public Boolean updateImage(int id,String path){
		TeamDao dao = new TeamDao();
		Boolean isSucessful = dao.Update(new Team(id,null,null,null,null,path));
		return isSucessful;		
	}
	
	/**
	 * 更新团队成员的职务
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
	 * 更新团队成员的签名
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
	 * 更新团队成员的详细介绍
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
	 * 跟新团队成员的姓名
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
	 * 更新团队成员的所有信息
	 * @param team
	 * @return
	 */
	public Boolean updateTeam(Team team){
		TeamDao dao = new TeamDao();
		Boolean isSucessful = dao.Update(team);
		return isSucessful;	
	}
	/**
	 * 查询团队成员的部分信息，没有查询到的是详细介绍
	 * @param currentpage 当前页
	 * @param pagesize 每一页显示的数据数
	 * @return 返回查询到的数据的json格式数据
	 */
	public String getTeam(int currentpage, int pagesize){
		TeamDao dao = new TeamDao();
		String teams = Json.teamlistToJson(dao.Query(currentpage, pagesize));
		return teams;
	}
	
	/**
	 * 查询团队成员的所有信息
	 * @param currentpage 当前页
	 * @param pagesize 每一页显示的数据数。
	 * @return 返回查询到的数据的json格式数据
	 */
	public String getTeamAllinfo(int currentpage, int pagesize){
		TeamDao dao = new TeamDao();
		String teams = Json.teamlistToJson(dao.QueryAll(currentpage, pagesize));
		return teams;
	}
	
	/**
	 * 根据Id查询团队成员的信息
	 * @param id
	 * @return 团队成员的所有信息
	 */
	public Team getTeamById(int id){
		TeamDao dao = new TeamDao();
		Team team=dao.QueryById(id);
		return team;
	}
	/**
	 * 根据团队成员的姓名查询成员的所有信息
	 * @param name 团队成员
	 * @return 返回成员对象
	 */
	public Team getTeamByName(String name){
		TeamDao dao = new TeamDao();
		Team team=dao.QueryByName(name);
		return team;
	}
}
