package com.trg.coll;
import java.util.TreeSet;

public class TreeSetMain {

	public static void main(String[] args) {
		
		TreeSet<String> tree = new TreeSet<String>(); //sorted Set according to Unicode/alphabetically
		System.out.println(tree.size());
		
		//adding String type object in list
		tree.add("stuti");
		System.out.println(tree.size());
		
		tree.add("neeti");
		tree.add("neeti"); //duplicates are not allowed in Set
		tree.add("pankaj");
		tree.add("kamesh");
		//traversing a List
		for(String name:tree) {
			System.out.println(name);
		
	}
		//search
		System.out.println(tree.contains("Kamesh"));
		
	}
}