package com.etwebservice.util;

import java.util.List;

import com.etwebservice.domain.Contact;
import com.etwebservice.domain.Employ;
import com.etwebservice.domain.FirstPage;
import com.etwebservice.domain.Introduction;
import com.etwebservice.domain.News;
import com.etwebservice.domain.Service;
import com.etwebservice.domain.Team;
import com.google.gson.Gson;

public class Json {
	public static String flistToJson(List<FirstPage> firstList){
		Gson gson = new Gson();	
		String json= gson.toJson(firstList);
		return json;		
	}
	
	public static String IntroductionToJson(Introduction intro){
		Gson gson = new Gson();	
		String json=gson.toJson(intro);
		return json;			
	}
	
	public static String introlistToJson(List<Introduction> introList){
		Gson gson = new Gson();	
		String json= gson.toJson(introList);
		return json;		
	}
	
	public static String newslistToJson(List<News> newslist){
		Gson gson = new Gson();	
		String json= gson.toJson(newslist);
		return json;
	}
	
	public static String teamlistToJson(List<Team> teamlist){
		Gson gson = new Gson();	
		String json= gson.toJson(teamlist);
		return json;
	}
	
	public static String servicelistToJson(List<Service> servicelist){
		Gson gson = new Gson();	
		String json= gson.toJson(servicelist);
		return json;
	}
	
	public static String contactlistToJson(List<Contact> contactlist){
		Gson gson = new Gson();	
		String json= gson.toJson(contactlist);
		return json;
	}
	
	public static String employlistToJson(List<Employ> employlist){
		Gson gson = new Gson();	
		String json= gson.toJson(employlist);
		return json;		
	}
}
