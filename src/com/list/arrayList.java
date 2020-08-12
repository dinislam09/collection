package com.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class arrayList {

		public static void main(String[] args) {
		arrayprint(array());
		print(List());
		
	
		
		ArrayList a1=new ArrayList();
		a1.add("Bangladesh");
		a1.add(0, "hello");
		
		
		Iterator<String>a2=a1.iterator();
		while(a2.hasNext()) {
			String a3=a2.next();
			//System.out.println(a3);
		}
		
		//Object frome pactic
	 	
	 	Pactic p1=new Pactic("Robin",25,"tester");
		Pactic p2=new Pactic("Sydul",33,"QA");
		Pactic p3=new Pactic("Shubo",30,"Depo");
		
		ArrayList<Pactic> m=new ArrayList<Pactic>();
			m.add(p1);
			m.add(p2);
			m.add(p3);
			

		Iterator<Pactic>n=m.iterator();
			while(n.hasNext()) {
				Pactic n1=n.next();
			//	System.out.println(n1.name);
			//	System.out.println(n1.age);
			//	System.out.println(n1.department);
		
			}
			
			
			
			LinkedList<Employe>b1=new LinkedList<Employe>();   //from Employe class
				
				b1.add(new Employe("Robin","23456","robin@2020.com","Tester","110000"));
				b1.add(new Employe("Sydul","23450","sydul@2020.com","QA","112000"));
				b1.add(new Employe("Shovo","23451","shovo@2020.com","Dev","150000"));
				b1.add(new Employe("Alamin","23453","alamin@2020.com","Tester","110000"));
				b1.add(new Employe("manik","23457","manik@2020.com","QA","115000"));
			
			for(Employe st:b1 ) {
				System.out.println("\nName: "+st.getName()+"\nID: "+st.getId()+"\nEmail: "+st.getEmail()+
				"\nPosition "+ ""+st.getPosition()+"\nSalary: "+st.getSalary());
				
			}
			
			
			
			
			
		}       
	
	
	public static ArrayList array() {
		ArrayList al=new ArrayList();
		
			al.add("Md");
			al.add("Din");
			al.add(2, "islam");
			
		return al;
	}
	
 	public static void arrayprint(ArrayList array) {
		for(Object p:array) {
		//	System.out.println(p);
		}
	}     

 	public static LinkedList List() {
 		LinkedList l=new LinkedList();
 		
 		l.add("Hi everyone");
 		l.addFirst("Hellow");
 		l.addLast("Thank You for join us");
 		l.add(1, "OSA");
 		
 		return l;
 		
 	}
 	
 	public static void print(LinkedList List) {
 		for(Object c:List) {
 		//	System.out.println(c);
 		}
 	}
 	
 	
 	
 		
	
 	
 	
 	
}
