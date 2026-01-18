package com.tnsif.intro.sortinginterfaces.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntegerArrayList {

	public static void main(String[] args) {
		List<Integer> l=new ArrayList<>();
		l.add(40);
		l.add(10);
		l.add(50);
		l.add(30);
		l.add(20);
		System.out.println("Before sorting : "+l);
		Collections.sort(l);
		System.out.println("After sorting : "+l);
	}

}
