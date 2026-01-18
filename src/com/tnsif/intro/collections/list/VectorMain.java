package com.tnsif.intro.collections.list;

import java.util.Enumeration;
import java.util.Vector;

public class VectorMain {

	public static void main(String[] args) {
		Vector<Integer> v=new Vector<>();
		v.addElement(10);
		v.add(30);
		v.add(2,20);
		v.add(40);
		v.addFirst(0);
		v.addLast(60);
		System.out.println(v);
		System.out.println(v.capacity());
		System.out.println(v.size());
		v.removeElement(10);
		System.out.println(v);
		v.removeElementAt(2);
		System.out.println(v);
		System.out.println(v.get(1));
		System.out.println(v.getFirst());
		System.out.println(v.getLast());
		System.out.println("Iterating...");
		Enumeration e=v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}

}
