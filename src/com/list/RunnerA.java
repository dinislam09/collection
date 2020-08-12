package com.list;

import java.util.Iterator;
import java.util.LinkedList;

public class RunnerA {
	public static void main(String[] args) {
		LinkedList<A> a=new LinkedList<A>();
		a.add(new A("Mosiur","IT","01","mosiur_2020.com","120000"));
		a.add(new A("Arif","IT","02","arif_2020.com","115000"));
		a.add(new A("Rana","IT","03","rana_2020.com","120000"));
		
		
		
	/*	for (A a2 : a) {
			
			System.out.println("\nName: "+a2.getName()+"\nDep: "+a2.getDep()+"\nID: "+a2.getId()
			+"\nEmail: "+a2.getEmail()+"\nSalary: "+a2.getSalary());
			
		}    */
		
		Iterator<A> i=a.iterator();
		while (i.hasNext()) {
			A q=i.next();
			
			System.out.println("\nName: "+q.getName()+"\nDep: "+q.getDep()+"\nID: "+
			q.getId()+"\nEmail: "+q.getEmail()+"\nSalary: "+q.getSalary());
		}
		
		
		
		
	}

}
