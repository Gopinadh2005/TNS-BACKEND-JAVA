package com.tnsif.intro.inheritance.multilevelinheritance;

public class MultiLevelInherit {
	public void display() {
		System.out.println("Parent class display method..");
	}
}
class Intermediate extends MultiLevelInherit{
	public void show() {
		System.out.println("Intermediate class show method..");
	}
}
class Child extends Intermediate{
	public void print() {
		System.out.println("Child class print method..");
	}
}
