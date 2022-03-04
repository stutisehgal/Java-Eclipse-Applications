package com.trg.coll;

import java.util.HashSet;

public class HashSetMain2 {

	HashSet<Student> set = new HashSet<Student>();
	
	set.add(new Student(100,"bob",45.5f));
	set.add(new Student(101,"max",55.5f));
	set.add(new Student(100,"jenny",45.5f));

	static boolean check(HashSet set,int studentId) {
		Student s = new Student(studentId,"",0);
		if(set.contains(s)) {
			return true;
		}
		else
			return false;
	}
}
