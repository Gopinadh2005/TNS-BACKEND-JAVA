package com.tnsif.intro.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListMain {

	public static void main(String[] args) {
	ArrayList l=new ArrayList();
	List ll=new ArrayList();
	ll.add(1);
	ll.add(2);
	ll.add("Gopi");
	l.add(10);
	l.add(20.5);
	l.add(10.34f);
	l.add(null);
	l.add("Gopi");
	l.add('g');
	System.out.println(l);
	System.out.println(l.contains("Gopi"));
	System.out.println(l.containsAll(ll));
	System.out.println(l.size());
	l.addAll(ll);
	System.out.println(l);
	System.out.println(ll);
	l.remove(2);
	System.out.println(l);
	l.removeAll(ll);
	System.out.println(l);
	System.out.println(l.get(2));
	l.set(2, "Gopi");
	System.out.println(l);
	Iterator itr=l.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	}

}
