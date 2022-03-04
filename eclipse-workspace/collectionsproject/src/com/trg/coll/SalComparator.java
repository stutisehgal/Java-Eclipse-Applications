package com.trg.coll;
import java.util.Comparator;

public class SalComparator implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		if(s1.getMarks()<s2.getMarks())
			return -1;
		if(s1.getMarks()>s2.getMarks())
			return 1;
		return 0;
	}
	

}
