package com.tnsif.intro.inheritance.singleinheritance;

public class SingleInherit {
     public void display() {
    	 System.out.println("Parent class display method..");
     }
}
class Child extends SingleInherit{
	public void print() {
		System.out.println("Child class print method..");
	}
}
