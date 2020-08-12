package com.set;

import java.util.HashSet;

public class HashsetDemo {
	public static void main(String[] args) {
		
		HashSet<HashsetDemoOne>h=new HashSet<HashsetDemoOne>();
		
		h.add(new HashsetDemoOne("Shovo","Automation","Dev","shovo@2020.com","150000"));
		h.add(new HashsetDemoOne("Robin","Automation","Tester","robin@2020.com","110000"));
		h.add(new HashsetDemoOne("Sydul","Automation","Dev","sydul@2020.com","150000"));
		h.add(new HashsetDemoOne("Alamin","Automation","Dev","alamin@2020.com","112000"));
		
		for (HashsetDemoOne d : h) {
			System.out.println("\nName: "+d.getName()+"\nDepartment: "+d.getDet()+"\nPosition: "+
		d.getPosition()+"\nEmail: "+d.getEmail()+"\nSalary: "+d.getSalary());
			
		}
		
		
		
	}

}
