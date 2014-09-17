package com.et.util;

import com.et.service.api.ETContactDelegate;
import com.et.service.api.ETContactService;
import com.et.service.api.ETNewsDelegate;
import com.et.service.api.ETNewsService;
import com.et.service.api.ETServiceDelegate;
import com.et.service.api.ETServiceService;
import com.et.service.api.ETTeamDelegate;
import com.et.service.api.ETTeamService;
import com.et.service.api.ETemployDelegate;
import com.et.service.api.ETemployService;
import com.et.service.api.FirstPageImageDelegate;
import com.et.service.api.FirstPageImageService;
import com.et.service.javabean.Contact;
import com.et.service.javabean.Employ;
import com.et.service.javabean.FirstPage;
import com.et.service.javabean.Service;
import com.et.service.javabean.Team;


public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		FirstPageImageDelegate first = new FirstPageImageService().getFirstPageImagePort();
//		FirstPage firstpage = new FirstPage();
//		firstpage.setFImage("sssssssss");
//		firstpage.setFimageId(1);
//		System.out.println(first.insertImage(firstpage));	
		
//		ETNewsDelegate etnews = new ETNewsService().getETNewsPort();
//		etnews.updateNewsContent(20, "rer", "rw");
		
//		ETTeamDelegate etteam = new ETTeamService().getETTeamPort();
//		Team team = new Team();
//		team.setMemberId(1);
//		team.setImage("fdfds");
//		team.setJob("废话多撒开了房间的拉萨");
//		team.setName("严学友");
//		team.setSign("谁有我牛逼");
//		team.setDetail("腹地欧萨ufiodsafdosiafdsaofidjsaoifjdsaio");
//		etteam.insertTeamMember(team);
//		etteam.updateImage(1, "fdfds");
//		etteam.deleteTeamMember(team);
//		etteam.updateTeamDetail(1, "jjfjdsafdsa");
//		System.out.println(etteam.getTeamById(2).getDetail());
//		System.out.println(etteam.getTeam(1, 3));
//		System.out.println(etteam.getTeamAllinfo(1, 3));
//		
//		ETContactDelegate etc = new ETContactService().getETContactPort();
//		Contact contact = new Contact();
//		contact.setContactId(1);
//		contact.setEmail("1587894@qq.com");
//		contact.setAdress("贵");
//		contact.setFax("38762");
//		contact.setPhoneNumber("18285115");
//		contact.setQq("1586345");
//		etc.update(contact);
//		System.out.println(etc.getContact());
		
//		ETemployDelegate ete = new ETemployService().getETemployPort();
//		Employ employ = new Employ();
//		for(int i=0;i<10;i++){
//			employ.setAdress("放大后睡觉啊咖啡或打开撒饭"+i);
//			employ.setCount(i);
//			employ.setDate("2014-9-"+i);
//			employ.setDetail("fdsafjdklsajfldsahfdsa 大佛萨菲就对了撒范德萨");
//			employ.setEducational("本科");
//			employ.setJob("程序员");
//			employ.setEmployId(i);
//			ete.insertEmploy(employ);
//		}
//		employ.setEmployId(1);
//		ete.deleteEmploy(employ);
//		employ.setCount(6);
//		ete.updateEmploy(employ);
//		System.out.println(ete.getEmploy(1, 5));
//		System.out.println(ete.getEmployById(5).getDetail());
//		
//		ETServiceDelegate ets =new ETServiceService().getETServicePort();
//		Service service  = new Service();
//		service.setServiceId(4);
//		ets.updateServiceDetail(4, "fdsafdsafdsaf");
//		ets.updateServiceImage(1, "3456");
//		for(int i=0;i<5;i++){
//			service.setServiceId(i);
//			service.setServiceName("服务"+i);
//			service.setDetail("还会发大会范德萨"+i);
//			service.setImage("iii"+i);
//			ets.insertService(service);
//		}
//			System.out.println(ets.getServiceAll(1, 2));
//			System.out.println(ets.getServiceById(5).getImage());
//			System.out.println(ets.getServiceByName("服务3").getDetail());
//		ets.deleteService(service);
	}

}
