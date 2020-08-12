package com.map;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Runner {
	
	public static void main(String[] args) throws IOException {
		
		Map<String,String> h=HomeWork.fileread();
		
			
			for (Entry<String, String> s : h.entrySet()) {
				
				System.out.println(s);
			
				
				
			}
				
	} 
	

}
