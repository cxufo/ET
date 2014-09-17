package com.etwebservice.webservice.service;

import com.etwebservice.dao.ContactDao;
import com.etwebservice.domain.Contact;
import com.etwebservice.util.Json;

public class ETContact {
	/**
	 * ������ϵ��
	 * @param contact ��ϵ��
	 * @return
	 */
   public Boolean insertContact(Contact contact){
	   ContactDao dao = new ContactDao();
	   Boolean isSucessful = dao.Insert(contact);
	   return isSucessful;
   }
   
   /**
    * ������ϵ��ʽ ������µ�������Ϊ��null
    * @param contact
    * @return ���ظ����Ƿ�ɹ�
    */
   public Boolean update(Contact contact){
	   ContactDao dao = new ContactDao();
	   Boolean isSucessful = dao.Update(contact);
	   return isSucessful;
   }
   
   /**
    * ��ȡ��ϵ��ʽ
    * @return
    */
   public String getContact(){
	   ContactDao dao = new ContactDao();
	   String contact = Json.contactlistToJson(dao.Query(1, 1));
	   return contact;
   }
}
