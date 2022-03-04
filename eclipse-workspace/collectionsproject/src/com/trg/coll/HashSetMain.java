package com.trg.coll;
import java.util.HashSet;

public class HashSetMain {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		System.out.println(set.size());
		
		//adding String type object in list
		set.add("stuti");
		System.out.println(set.size());
		
		set.add("neeti");
		set.add("neeti"); //duplicates are not allowed in Set
		set.add("pankaj");
		set.add("kamesh");
		
		//traversing a List
		for(String name:set) {
			System.out.println(name);
		
	}
		//search
		System.out.println(set.contains("Kamesh"));
		
	}
	
}

