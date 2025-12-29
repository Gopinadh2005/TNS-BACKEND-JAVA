package com.tnsif.intro.polymorphism.overloading;

public class Overloading {
	public void show() {
		System.out.println("No parameter method");
	}
	public void show(int a,float b) {
		System.out.println("int a="+a+" float b="+b);
	}
	public void show(float b,int a,double d) {
		System.out.println("float b="+b+" int a="+a+" double d="+d);
	}
	
}
