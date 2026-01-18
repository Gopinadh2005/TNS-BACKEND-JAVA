package com.tnsif.intro.sortinginterfaces.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringArrayList {

	public static void main(String[] args) {
		List<String> l=new ArrayList<>();
		l.add("Gopi");
		l.add("Rama");
		l.add("Narasimha");
		l.add("Radha");
		l.add("Kanna");
		l.add("Seetha");
		System.out.println("Before sorting : "+l);
		Collections.sort(l);
		System.out.println("After sorting : "+l);
	}

}
