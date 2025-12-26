package com.tnsif.intro.constructors.parameterizedconstructor;

public class Student {
	
	String sname;
	int roll_no;
	
	Student(String sname,int roll_no){
		this.sname=sname;
		this.roll_no=roll_no;
		System.out.println("=== Parameterized Constructor ===");
		System.out.println("Student name = "+sname);
		System.out.println("Roll number = "+roll_no);
	}
}
