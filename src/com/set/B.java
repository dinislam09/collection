package com.set;

public class B {
	
	private String name;
	private String dep;
	private String id;
	private String phone;
	private String salary;
	
	public B(String name,String dep,String id,String phone,String salary) {
		this.name=name;
		this.dep=dep;
		this.id=id;
		this.phone=phone;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

}
