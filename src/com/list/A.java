package com.list;

public class A {
	
	private String name;
	private String dep;
	private String id;
	private String email;
	private String salary;
	
	public A(String name,String dep,String id,String email,String salary) {
		this.name=name;
		this.dep=dep;
		this.id=id;
		this.email=email;
		this.salary=salary;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDep() {
		return dep;
	}

	public void setDep(String dep) {
		this.dep = dep;
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

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

}
