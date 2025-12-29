package com.tnsif.intro.polymorphism.overriding;

public class Overriding {
	public void show() {
		System.out.println("parent class show method.");
	}
}
class Demo extends Overriding{
	public void show() {
		System.out.println("child class show method.");
	}
}
