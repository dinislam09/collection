package com.map;

public class B {
	private  String first;
	private String last;
	private String adr;
	private String city ;
	private String state;
	private String zip;
	
	public B(String first, String last, String adr, String city, String state, String zip) {
		this.first = first;
		this.last = last;
		this.adr = adr;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	public String getFirst() {
		return first;
	}
	public void setFirst(String first) {
		this.first = first;
	}
	public String getLast() {
		return last;
	}
	public void setLast(String last) {
		this.last = last;
	}
	public String getAdr() {
		return adr;
	}
	public void setAdr(String adr) {
		this.adr = adr;
	}
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
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
		
		

}
