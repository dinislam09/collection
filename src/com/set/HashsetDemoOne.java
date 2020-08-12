package com.set;

public class HashsetDemoOne {
	private String name;
	private String det;
	private String position;
	private String email;
	private String salary;
	
	public HashsetDemoOne(String name,String det,String position,String email,String salary) {
		this.name=name;
		this.det=det;
		this.position=position;
		this.email=email;
		this.salary=salary;
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDet() {
		return det;
	}

	public void setDet(String det) {
		this.det = det;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}
	

}
