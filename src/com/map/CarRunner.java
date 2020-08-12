package com.map;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CarRunner {
	
	
	public static void main(String[] args) throws IOException {
		car1();
		car2();
		
	}
	static Map<Integer,car> h = new HashMap<Integer,car>();
	public static void car1() throws IOException {
		File f=new File("C:\\Users\\shihab\\Desktop\\cars.txt");
		BufferedReader br=new BufferedReader(new FileReader(f));
		
		String s;
		while((s=br.readLine())!=null){
			
			String[]s1=s.split(",");
			 int i =1;
			h.put(i, new car(s1[0],s1[1],s1[2],s1[3],s1[4],s1[5],s1[6],s1[7],s1[8]));
			
			i++;
		}
	}

public static void car2() {
	for(Map.Entry<Integer,car> m:h.entrySet()) {
		System.out.println("\n"+m.getKey()+" "+m.getValue().getCar()+" "+m.getValue().getMPG()+
				" "+m.getValue().getCylinders()+" "+m.getValue().getDisplacement()
				+" "+m.getValue().getHorsepower()+" "+m.getValue().getWeight()+" "+
				m.getValue().getModel()+" "+m.getValue().getOrigin());
	}
}	
	
	
}
