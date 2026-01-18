package com.tnsif.intro.collections.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetMain {

	public static void main(String[] args) {
		HashSet<Integer> hs=new HashSet<>();
		hs.add(10);
		hs.add(20);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		System.out.println(hs);
		hs.remove(20);
		System.out.println(hs);
		System.out.println("Iterating...");
		Iterator itr=hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
