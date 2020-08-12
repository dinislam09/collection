package com.set;

import java.util.ArrayList;
import java.util.TreeSet;

public class TreesetDemo {
	
	public static void main(String[] args) {
		//a();
		
		TreeSet<Saydul> ts=new TreeSet<Saydul>();
		
		Saydul s1=new Saydul("100", "md Azizul Hoque","90000","Qa");
		Saydul s2=new Saydul("101", "Md Robin Khan","110000","Dev");
		Saydul s3=new Saydul("102", "Md Din Islam","85000","Qa Tester");
		Saydul s4=new Saydul("103", "Iqbal Hossain","90000","qa eng");
		Saydul s5=new Saydul("104", "Jahid Hassan","105000","Dev");
		
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		ts.add(s5);
		
		for (Saydul employee : ts) {
			System.out.println("\nEmpId :"+employee.getEmpId()+"\nName : "+employee.getEmpName()
		+"\nSalary :"+employee.getSalary()+"\nPosition :"+employee.getPosition()+"\n");
		
		}
		
		
		
		
		
		
		
		
	}
	
	public static void a() {
		ArrayList<String>batch1=new ArrayList<String>();
			batch1.add("A");
			batch1.add("B");
			batch1.add("C");
			batch1.add("D");
			
		ArrayList<String>batch2=new ArrayList<String>();
			batch2.add("AA");
			batch2.add("BB");
			batch2.add("CC");
			batch2.add("DD");	
			
		ArrayList<ArrayList<String>>Student=new ArrayList<ArrayList<String>>();
			Student.add(batch1);
			Student.add(batch2);
			
			for (ArrayList<String> arrayList : Student) {
				//System.out.println(arrayList);
				for(String b:arrayList) {
					System.out.println(b);
				}
			}
			
	}

	
	
	
}
