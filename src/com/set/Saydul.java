package com.set;

import java.util.Comparator;

public class Saydul implements Comparator<Saydul> {
	private String empId;
	private String empName;
	private String salary;
	private String  position;
	
	
	public Saydul(String empId, String empName, String salary, String position) {

		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.position = position;
	}


	public String getEmpId() {
		return empId;
	}


	public void setEmpId(String empId) {
		this.empId = empId;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public String getSalary() {
		return salary;
	}


	public void setSalary(String salary) {
		this.salary = salary;
	}


	public String getPosition() {
		return position;
	}


	public void setPosition(String position) {
		this.position = position;
	}


	@Override
	public int compare(Saydul arg0, Saydul arg1) {
		String x=arg0.empId;
		String y=arg1.empId;
		String x1=arg0.empName;
		String y1=arg1.empName;
		String x2=arg0.position;
		String y2=arg1.position;
		return 0;
	}




}


