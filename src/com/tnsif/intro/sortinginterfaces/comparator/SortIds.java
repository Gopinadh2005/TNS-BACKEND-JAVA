package com.tnsif.intro.sortinginterfaces.comparator;

import java.util.Comparator;

public class SortIds implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Student s1=(Student)o1;
		Student s2=(Student)o2;
		return s1.getSid()-s2.getSid();
	}
	
}
