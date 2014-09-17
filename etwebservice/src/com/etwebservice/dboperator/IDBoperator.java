package com.etwebservice.dboperator;

import java.util.List;

public interface IDBoperator<T> {
	public Boolean Insert(T t);
	public Boolean Insert(List<T> t);
	
	public Boolean Delete(T t);
	
	public Boolean Update(T t);
	public Boolean Update(List<T> t);
	public Boolean UpdateImage(T t);
	public T QueryById(int id);
	public T QueryByName(String name);
	public List<T> Query(int currentpage,int pagesize);
	
	
}
