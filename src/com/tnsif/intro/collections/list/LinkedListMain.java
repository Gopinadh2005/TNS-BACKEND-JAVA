package com.tnsif.intro.collections.list;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListMain {

	public static void main(String[] args) {
		List<Integer> l=new LinkedList<>();
		l.addFirst(10);
		l.add(20);
		l.add(1,30);
		l.add(40);
		l.add(50);
		l.addLast(0);
		l.add(60);
		System.out.println(l);
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		System.out.println(l.get(3));
		l.removeFirst();
		System.out.println(l);
		l.removeLast();
		System.out.println(l);
		System.out.println(l.size());
		l.set(1, 10);
		System.out.println(l);
		System.out.println("Iterating..");
		ListIterator itr=l.listIterator();
		System.out.println("Forward iteraring.");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Backward iteraring.");
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
	}

}
