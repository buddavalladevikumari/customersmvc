package com.training.ifaces;
import java.sql.SQLException;
import java.util.*;



public interface Crudrepository<T> {
	public int add(T t) throws SQLException;
	public List<T>findAll() throws SQLException;
	
//	public T findById(int key)throws SQLException;
//	public boolean remove(int key) throws SQLException;
//	


}
