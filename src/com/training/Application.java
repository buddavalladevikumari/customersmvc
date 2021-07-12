package com.training;
import java.util.*;

import com.training.daos.Customerrepository;

import com.training.model.Customer;

import com.training.utility.Dbconnection;
import java.sql.*;


public class Application {

	public static void main(String[] args) {
		Connection con = Dbconnection.getOracleConnection();
	Customerrepository dao = new Customerrepository(con);  
		
			int ch=1;
		
		try {
			
			if(ch==1) {
				
				dao.add(new Customer(5676,"hundhai",2017,8765,"naga","sold"));
				dao.add(new Customer(7677,"maruthi",2018,7000,"devi","unsold"));
				dao.add(new Customer(5676,"hundhai",2017,8765,"naga","unsold"));
				
			}
			if(ch==2) {
				List<Customer> list = dao.findAll();
				for(Customer eachCar:list){
					System.out.println(eachCar);
				}	
				
			}
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
}

