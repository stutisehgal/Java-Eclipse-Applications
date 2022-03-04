package com.trg.coll;

import java.util.Comparator;

public class NameComparator implements Comparator {

	@Override
	public int compare(Student s1, Student s2) {
		return s1.getName().compareToIgnoreCase(s2.getName()));
	}

}
