package com.trg.coll;
import java.util.ArrayList;

public class ListMain {
	public static void main(String[] args) {
		
		//creating an object 'list' of wrapper class ArrayList implementing List methods and superclass collections interface
        //<Wrapper Class> objvar of Wrapper Class =new <Wrapper Class> --> initiate obj
		ArrayList<String> list=new ArrayList<String>();
		System.out.println(list.size());
		
		//adding String type object in list
		list.add("stuti");
		System.out.println(list.size());
		
		list.add("neeti");
		list.add("neeti"); //duplicates are allowed in List
		
		//traversing a List
		for(String name:list) {
			System.out.println(name);
		}
		
		System.out.println(list.get(1));
		//get () method to access individual elements of list obj
		list.add(3,"Kamesh");
		System.out.println(list);
		
		//replace 2nd element
		list.set(1, "Pankaj");
		System.out.println(list);
		
		//remove 4th element
		list.remove(3);
		System.out.println(list);
		
		//search
		System.out.println(list.contains("Kamesh"));
		
		ArrayList<Student> stdList = new ArrayList<Student>();
		Student st = new Student(100,"bob",45.5f);
		stdList.add(st); //creating obj of non primitive dtype Wrapper class
		System.out.println(stdList);
		
		// to check an object st and its attributes in stdList variable of Student class, pass the object to be checked for in contains method
		System.out.println(stdList.contains(st));
		
		// adding a new object in Student class stdlist
		Student s = new Student(101,"max",55.5f);
		stdList.add(1,s);
		System.out.println(stdList);
		
		// removing an object from Student class stdList 
		stdList.remove(s);
		System.out.println(stdList);
		
		//replace an element
		stdList.set(0,s);
		System.out.println(stdList);
	}
}
