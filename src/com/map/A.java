package com.map;

import java.util.HashMap;
import java.util.Map;

public class A {
	public static void main(String[] args) {
	/*	Map<Integer,String> m=new HashMap<Integer,String>();
		m.put(1, "AAA");
		m.put(2, "BBB");
		m.put(3, "CCC");
		m.put(4, "DDD");
		
		System.out.println(m.get(2)); */
		
		Map<String,String> map=new HashMap<String,String>();
		map.put("A", "AAA");
		map.put("B", "BBB");
		map.put("C", "CCC");
		map.put("D", "DDD");
		for(Map.Entry<String, String> enty: map.entrySet())
		//String value = enty.getValue("");
		System.out.println();
		
		
		
	}
	
	

}
