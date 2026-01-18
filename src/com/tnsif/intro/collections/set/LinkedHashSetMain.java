package com.tnsif.intro.collections.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetMain {

	public static void main(String[] args) {
		LinkedHashSet l=new LinkedHashSet();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(20);
		l.add(40);
		System.out.println(l);
		l.remove(20);
		System.out.println(l);
		System.out.println("Iterating...");
		Iterator itr=l.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
