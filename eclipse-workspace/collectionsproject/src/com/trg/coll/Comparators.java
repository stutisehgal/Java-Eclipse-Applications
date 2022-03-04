package com.trg.coll;
import java.util.ArrayList;
import java.util.Collections;

public class Comparators {
	
	public static void main(String[] args) {
		
		ArrayList<Student> stdList = new ArrayList<Student>();
		
		stdList.add(20, new Student(20,"stuti",95.5f));
		stdList.add(10, new Student(10,"neeti",99.5f));
		stdList.add(30, new Student(30,"vani",85.5f));
		
		Collections.sort(stdList,new NameComparator());
		
		for(Student s:stdList) {
			System.out.println(s);
			
		}
	}
}
