package com.cdac;

public class Employee {
	
	int id;
	String name;
	Address a;
	 
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Employee(int id) {
		super();
		this.id = id;
	}
	public Employee(String name) {
		super();
		this.name = name;
	}
	
	public void displayInfo(){
		//System.out.println("Hello: "+name+a1.getCity()+a1.getCountry()+a1.getState());
		System.out.println("id="+id+"---Name "+name+"  Address_details "+a.toString());
		
	}
	public Employee(int id, String name, Address a1) {
		super();
		this.id = id;
		this.name = name;
		this.a = a1;
	}
	

}
