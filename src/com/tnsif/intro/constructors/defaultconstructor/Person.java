package com.tnsif.intro.constructors.defaultconstructor;

public class Person {
	String pname="Gopinadh";
	int age=21;
	String clg_name="SriIndu";
	Person(){
		System.out.println("=== Default Constructor ===");
		System.out.println("Person name = "+pname);
		System.out.println("Person age = "+age);
		System.out.println("College name = "+clg_name);
	}
}
