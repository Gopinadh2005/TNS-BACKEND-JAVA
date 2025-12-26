package com.tnsif.intro.inheritance.HierarchicalInheritance;

public class HierarchyInherit {
	public void display() {
		System.out.println("Parent class display method..");
	}
}
class Child1 extends HierarchyInherit{
	public void show() {
		System.out.println("Child1 class show method..");
	}
}
class Child2 extends HierarchyInherit{
	public void show() {
		System.out.println("Child2 class show method..");
	}
}class Child3 extends HierarchyInherit{
	public void show() {
		System.out.println("Child1 class show method..");
	}
}
