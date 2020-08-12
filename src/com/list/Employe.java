package com.list;

public class Employe {
	
	private String name;
	private String id;
	private String email;
	private String position;
	private String salary;
	
	
	public Employe(String name,String id,String email,String position,String salary) {
		this.name=name;
		this.id=id;
		this.email=email;
		this.position=position;
		this.salary=salary;
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPosition() {
		return position;
	}


	public void setPosition(String position) {
		this.position = position;
	}


	public String getSalary() {
		return salary;
	}


	public void setSalary(String salary) {
		this.salary = salary;
	}

}
