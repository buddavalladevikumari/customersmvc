package com.training.utility;
import java.sql.*;
public class  Dbconnection {
	public static Connection getOracleConnection() {
	Connection con = null;
	
	try {
		con=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XEPDB1","hr","hr");
	} 
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return con;
}
public static void main(String[] args)
{
	System.out.println(Dbconnection.getOracleConnection());
}
}
