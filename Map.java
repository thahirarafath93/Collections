package com.code;

import java.util.HashMap;
import java.util.Hashtable;
public class Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashMap<String, Integer> students = new HashMap<>();
		//Map students=new HashMap<K, V>();
		students.put("Thahir",88);
		students.put("Tr",90);
		students.put("Th",77);
		students.put("Tha",89);
		students.put("Thahir1",92);
		
		
		for(String key:students.keySet())
		
		
		System.out.println(key +" : "+students.get(key));
//	
//	Hashtable<String, Integer> students= new Hashtable<>();
//	students.put("Thahir",88);
//	students.put("Tr",90);
//	students.put("Th",77);
//	students.put("Tha",89);
//	students.put("Thahir1",92);
//	
//	
//	for(String key:students.keySet())
//	
//	
//	System.out.println(key +" : "+students.get(key));
//
//	
	}

}
