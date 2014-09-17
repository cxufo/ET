package com.etwebservice.webservice.service;

import com.etwebservice.dao.ContactDao;
import com.etwebservice.domain.Contact;
import com.etwebservice.util.Json;

public class ETContact {
	/**
	 * 增加联系人
	 * @param contact 联系人
	 * @return
	 */
   public Boolean insertContact(Contact contact){
	   ContactDao dao = new ContactDao();
	   Boolean isSucessful = dao.Insert(contact);
	   return isSucessful;
   }
   
   /**
    * 更新联系方式 不想更新的属性设为空null
    * @param contact
    * @return 返回更新是否成功
    */
   public Boolean update(Contact contact){
	   ContactDao dao = new ContactDao();
	   Boolean isSucessful = dao.Update(contact);
	   return isSucessful;
   }
   
   /**
    * 获取联系方式
    * @return
    */
   public String getContact(){
	   ContactDao dao = new ContactDao();
	   String contact = Json.contactlistToJson(dao.Query(1, 1));
	   return contact;
   }
}
