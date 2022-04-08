package com.cdac;

public class Student {
	
	String age;
	
	//Address a1;
	
	/*public Address getA1() {
		return a1;
	}*/

	/*public void setA1(Address a1) {
		this.a1 = a1;
	}*/

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public Student()
	{
		
	}
	
	public Student(String name)
	{
		this.sname=name;
	}
/*public Student(Address a1, String name) {
		super();
		this.a1 = a1;
		this.name = name;
	}*/
private String sname;



public String getSname() {
	return sname;
}

public void setSname(String sname) {
	this.sname = sname;
}

public void displayInfo(){
	//System.out.println("Hello: "+name+a1.getCity()+a1.getCountry()+a1.getState());
	
	System.out.println("Hello:sname "+sname+"age="+age);
	
}


}
