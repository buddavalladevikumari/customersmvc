package com.training.daos;
import java.util.ArrayList;
import java.util.List;


import com.training.ifaces.Crudrepository;
import com.training.model.Car;

import java.sql.*;

public  class Carrepository implements Crudrepository<Car> {
	private Connection con;
	
	@Override
	public int add(Car t) throws SQLException{
	 String sqlAdd = "insert into Customer values(?,?,?,?,?)";
	 PreparedStatement pstmt = con.prepareStatement(sqlAdd);
	 pstmt.setInt(1, t.getCarnumber());
	 pstmt.setString(2, t.getModel());
	 pstmt.setInt(3, t.getYear_of_manufacturer());

	 pstmt.setString(5, t.getOwner_name());
	 pstmt.setString(6, t.getStatus()); 
	 
	int rowAdded = pstmt.executeUpdate();
	 return rowAdded;

}
	public Carrepository(Connection con) {
		super();
		this.con=con;
		
	}
	@Override
	public List<Car> findAll() throws SQLException {
		// TODO Auto-generated method stub
	
	 List<Car> custList = new ArrayList<>();
	 String sql = "select * from Customer";
	 PreparedStatement pstmt = con.prepareStatement(sql);
	 ResultSet rs = pstmt.executeQuery();
	 while(rs.next()) {
		 int carnumber = rs.getInt("carnumber");
		 String model = rs.getString("model");
		 int year_of_manufacturer = rs.getInt("year_of_manufacturer"); 
		 int  kilometers_travelled = rs.getInt(" kilometers_travelled");
		 String owner_name = rs.getString("owner_name");
		 String status = rs.getString("status");
		 
		 custList.add(new Car( carnumber,model,year_of_manufacturer, kilometers_travelled,owner_name,status));
	 }
	 return custList;	 
}
	 public Connection getcon() {
		 return con;
}
	 public void setcon(Connection con) {
		 this.con = con;	 
	 }
//	 @Override
//	 public Customer findById(int key) throws SQLException{
//		 return null;
//	 }
//	
//	@Override
//	 public boolean remove(int key) throws SQLException {
//		  return false;
//		 
//	 }
//	@Override
//	public boolean remove(int key) throws SQLException {
//		// TODO Auto-generated method stub
//		return false;
//	}

	 
}
