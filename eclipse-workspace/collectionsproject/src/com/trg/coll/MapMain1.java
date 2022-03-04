package com.trg.coll;
import java.util.HashMap;
import java.util.Map;

public class MapMain1 {
	public static void main(String[] args) {
		
		HashMap<String,String> city=new HashMap<String,String>();
		city.put("HY", "Hyderabad");
		// put() used to add new key-value pair
		
		city.put("CH", "Chennai");
		city.put("MU", "Mumbai");
		city.put("BG", "Bangalore");
		
		String cities = city.get("PK"); // if key not found, returns null
		
		if(cities==null)
			System.out.println("Not found");
		else
			System.out.println("City Name:"+cities);
		
		city.remove("CH"); //remove entry based on key
		
		for(String c:city.values()) {
			System.out.println(c);
		}
		
		Map<Integer, Student> data= new HashMap<Integer,Student>();
		
		data.put(20, new Student(20,"stuti",95.5f));
		data.put(10, new Student(10,"neeti",99.5f));
		data.put(30, new Student(30,"vani",85.5f));
		
		int id=20;
		Student s = data.get(id);
		
		if(s==null)
			System.out.println("Not found");
		else
			System.out.println(s);
	}

}
