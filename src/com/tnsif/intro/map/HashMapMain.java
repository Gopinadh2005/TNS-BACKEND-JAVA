package com.tnsif.intro.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapMain {

	public static void main(String[] args) {
	
		HashMap<Integer,String> h=new HashMap<>();
		h.put(101, "Gopi");
		h.put(102,"Sriram");
		h.put(103, "Seetha");
		h.put(104, "Vasudev srikrishna");
		h.put(105, "Radha");
		System.out.println(h);
		System.out.println(h.get(102));
		h.remove(101);
		System.out.println(h);
		System.out.println(h.containsKey(103));
		System.out.println(h.containsValue("Sriram"));
		System.out.println(h.isEmpty());
		for (Map.Entry<Integer, String> entry : h.entrySet()) {
			if(entry.getKey()==104) {
		    	entry.setValue("Kanna");
		    }
		    System.out.println(entry.getKey() + " " + entry.getValue());
		}
		System.out.println(h);
	}

}
