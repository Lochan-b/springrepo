package com.cdac;

public class Address {
		private String city;  
		private String state;  
		private String country;
		public String getCity() {
		return city;
		}
		
		public void setCity(String city) {
			this.city = city;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		public Address(String city, String state, String country) {
			super();
			this.city = city;
			this.state = state;
			this.country = country;
		}  
		
		
		public void show()
		{
			System.out.println("city="+city+"state="+state+"country="+country);
		}
		
		public String toString()
		{
			return("city= "+ city +" state= "+ state +" country= "+country);
			
			
		}
		}



