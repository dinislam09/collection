package com.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Vactor {
	
	public static void main(String[] args) {
		
	ArrayList a=new ArrayList();
	LinkedList l=new LinkedList();
	Vector v=new Vector();
	
	a.add("Bangladesh");
	a.add(2020);
	a.add(1, "Pakistan");
	a.remove("Pakistan");
	a.remove(1);
		
	for(Object p:a) {
		//System.out.println(p);
	}
	
	
	l.add("Bangladesh");
	l.addFirst("Hellow");
	l.addLast("Thank you for watching");
	l.add(0, "hi");

	for(Object p:l) {
		System.out.println(p);
	}
	
	
	
	
	
	
	
}
	

	
	
	
	
	
	
}
