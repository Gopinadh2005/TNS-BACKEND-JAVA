package com.tnsif.intro.collections.list;

import java.util.Stack;

public class StackMain {

	public static void main(String[] args) {
		Stack<String> s=new Stack<>();
		s.push("Gopi");
		s.push("Sriram");
		s.push("Seetha");
		s.push("Srikrishna");
		s.push("Radha");
		System.out.println(s);
		System.out.println(s.capacity());
		System.out.println(s.size());
		s.pop();
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s.search("Seetha"));
		System.out.println(s.search("Radha"));
	}

}
