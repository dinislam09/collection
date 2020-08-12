package com.list;

import java.util.Iterator;
import java.util.LinkedList;

public class ArrayLinked {
	
	public static void main(String[]args) {
	LinkedList al=new LinkedList();
	
		al.add("Well to Bangladesh");
		al.addFirst("Hi");
		al.addLast("Thank You");
		al.add(3, "hello");
		al.remove("hello");
		Object a=al.get(1);
		//System.out.println(a);
	
		for(Object p:al) {
			//System.out.println(p);
			
		}
		
		for (int i=0;i<al.size();i++) {
			//System.out.println(al.get(i));
		}
		
		Iterator<String> i=al.iterator();
		while(i.hasNext()) {
			String q=i.next();
			System.out.println(q);
		}
		}
	
	
	
	
	
	
}
