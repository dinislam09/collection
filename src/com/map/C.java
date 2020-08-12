package com.map;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class C {
	
	static int j =1;
	public static void main(String[] args) throws IOException {
    readFile();
    print();

	}
	static Map<Integer,B> h = new HashMap<Integer,B>();

	public  static void readFile() throws IOException{

		File f = new File ("C:\\Users\\shihab\\Desktop\\Cvs 22");
		BufferedReader b = new BufferedReader(new FileReader(f));
		 	
			String n;
			while ((n=b.readLine())!=null) {
				
				String g[] = n.split(",");
				h.put(j, new B(g[0],g[1],g[2],g[3],g[4],g[5]));
   j++;

			}
			
			
			
			
		//	b.close();
		}
	
	public static void print() {
		for (Map.Entry<Integer, B> k : h.entrySet()) {
			//System.out.println(k.getKey()+" " + k.getValue().getZip() );
			
		/*	System.out.println(k.getKey() + " "+ k.getValue().getFirst()+ " " +
			k.getValue().getLast() + " "+ k.getValue().getAdr()+ " "+ 
			k.getValue().getCity()+ " "+ k.getValue().getState()+ " "+
			k.getValue().getZip());    */
			
			
			System.out.println(k.getValue().getFirst());
		}
	}
}


