package com.map;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class HomeWork {
	
	
	
	public static Map<String,String> fileread() throws IOException{
		
		Map<String,String> test=new HashMap<String,String>();
		
		File f = new File("C:\\Users\\shihab\\Desktop\\pac.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		
		String st;
		while((st=br.readLine())!=null) {
		
			String[] s=st.split(",");
			System.out.println("\n");
			System.out.println("Name: "+s[0]);
			System.out.println("Email: "+s[1]);
			System.out.println("Salary: "+s[2]);
			System.out.println("Phone: "+s[3]);
		
	
		}
		return test;
			
		
	
	
	
	}		
}
