package com.etwebservice.util;

import java.util.List;








import com.etwebservice.domain.FirstPage;
import com.etwebservice.domain.Introduction;
import com.etwebservice.domain.News;
import com.etwebservice.webservice.service.ETIntroduction;
import com.etwebservice.webservice.service.ETNews;
import com.etwebservice.webservice.service.ETService;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Team team = new Team();
//		team.setMemberId(3);
//		team.setName("fdfdsa");
//		team.setDetail("dsafds");
//		team.setImage("fdsfdsa");
//		team.setJob("frtyh");
//		TeamDao teamdao = new TeamDao();
		//teamdao.Delete(team);
//		teamdao.Insert(team);
	//	System.out.println(teamdao.QueryByName("cxzhao").getDetail());
//		teamdao.Update(team);
//		System.out.println(teamdao.QueryById(1).getDetail());
//		List<Team>list = teamdao.Query(1,1);
//		for(Team t:list){
//			System.out.println(t.getDetail());
//		}
		
		//--------news--------------
//		NewsDao newsdao = new NewsDao();
//		News news = new News();		
//		news.setNewsId(4);
//		news.setNewsTitle("kkkkkkkkkk");
//		news.setNewsContent("jjjjjjjjjjjjjjjjjjj");
//		news.setNewsTime("2014-9-15");

//		newsdao.Insert(news);
//		newsdao.Delete(news);
//		newsdao.Update(news);
//		List<News> nlist=newsdao.Query(1, 5);
//		for(News n:nlist){
//			System.out.println(n.getNewsId()+" "+n.getNewsTitle()+" "+n.getNewsContent()+" "+n.getNewsTime());
//		}
//		News n=newsdao.QueryByName("kkkkkkkkkk");
//		News n=newsdao.QueryById(4);
//		System.out.println(n.getNewsContent());
		
//		FirstPageImage fps = new FirstPageImage();
//		Boolean is=fps.updateImage(new FirstPage(2,"dddd"));
//		System.out.println(is);
//		ETIntroduction etintro = new ETIntroduction();
		//etintro.insertIntro(new Introduction(1,"���ֵȼ����ѷ�","���Ѵ�ɳ��","�����ټ�������������"));
	//	System.out.println(etintro.getIntroductionByName("���ֵȼ����ѷ�"));
//		System.out.println(etintro.updateIntro(new Introduction(1,"dfg",null,null)));
//		ETNews etnews = new ETNews();
//		etnews.insertNews(new News(1,"�����ķ�����������","fdsafdsa","2014-5-9"));
//		etnews.insertNews(new News(1,"f�������˷ѾͶ�����","fdsafdsa","2014-5-9"));
//		etnews.insertNews(new News(1,"���䶼�������ѵ�����","fdsafdsa","2014-5-9"));
//		System.out.println(etnews.updateNewsContent(5, "��Ŵ�", "2014-5-9"));
//		System.out.println(etnews.queryNewsContentByTitle("���䶼�������ѵ�����").getNewsContent());
//		System.out.println(etnews.deleteNews(new News(1,null,null,null)));
		ETService ets = new ETService();
		ets.updateServiceDetail(2, "ddddd");
	}

}
