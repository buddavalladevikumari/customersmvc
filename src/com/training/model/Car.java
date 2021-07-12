package com.training.model;



public class Car implements Comparable<Car> {

	private int carnumber;
	private String model;
	private int year_of_manufacturer;
	private int kilometers_travelled;
	private String owner_name;
	private String status;
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(int carnumber, String model, int year_of_manufacturer, int kilometers_travelled, String owner_name,
			String status) {
		super();
		this.carnumber = carnumber;
		this.model = model;
		this.year_of_manufacturer = year_of_manufacturer;
		this.kilometers_travelled = kilometers_travelled;
		this.owner_name = owner_name;
		this.status = status;
	}
	public int getCarnumber() {
		return carnumber;
	}
	public void setCarnumber(int carnumber) {
		this.carnumber = carnumber;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear_of_manufacturer() {
		return year_of_manufacturer;
	}
	public void setYear_of_manufacturer(int year_of_manufacturer) {
		this.year_of_manufacturer = year_of_manufacturer;
	}
	public int getKilometers_travelled() {
		return kilometers_travelled;
	}
	public void setKilometers_travelled(int kilometers_travelled) {
		this.kilometers_travelled = kilometers_travelled;
	}
	public String getOwner_name() {
		return owner_name;
	}
	public void setOwner_name(String owner_name) {
		this.owner_name = owner_name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Customer [carnumber=" + carnumber + ", model=" + model + ", year_of_manufacturer="
				+ year_of_manufacturer + ", kilometers_travelled=" + kilometers_travelled + ", owner_name=" + owner_name
				+ ", status=" + status + "]";
	}
	
	@Override
	public int compareTo(Car o) {
		// TODO Auto-generated method stub
		return 0;
	}
//	@Override
//	public int compareTo(Car o) {
//		// TODO Auto-generated method stub
//		return 0;
	}

