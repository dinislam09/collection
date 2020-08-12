package com.set;

import java.util.HashSet;

public class RunnerB {
	
	public static void main(String[] args) {
		
		HashSet<B> h=new HashSet<B>();
		
		h.add(new B("Sydul","IT","01","3456783446","120000"));
		h.add(new B("Robin","IT","02","6462383446","110000"));
		h.add(new B("Shuvo","IT","03","9173456723","115000"));
		h.add(new B("Alamin","IT","04","3472984546","112000"));
		
		for (B b : h) {
			System.out.println("\nName: "+b.getName()+"\nDep: "+b.getDep()+"\nID: "+
		b.getId()+"\nPhone: "+b.getPhone()+"\nSalary: "+b.getSalary());
			
			
		}
		
	}

}
