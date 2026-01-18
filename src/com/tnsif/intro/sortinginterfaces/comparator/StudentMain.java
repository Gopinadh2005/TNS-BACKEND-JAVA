package com.tnsif.intro.sortinginterfaces.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class StudentMain {

	public static void main(String[] args) {
		List<Student> l=new ArrayList<>();
		Student s1=new Student(104,"Sriram");
		Student s2=new Student(107,"Seetha");
		Student s3=new Student(109,"Radha");
		Student s4=new Student(103,"Vasudhev");
		Student s5=new Student(101,"Hanuman");
		Student s6=new Student(100,"Narasimha");
		l.add(s1);l.add(s2);l.add(s3);l.add(s4);l.add(s5);l.add(s6);
		System.out.println("Before sorting student ids...");
		for(Student student:l) {
			System.out.println(student.getSid()+" ---->"+student.getSname());
		}
		Collections.sort(l,new SortIds());
		System.out.println("After sorting student ids...");
		for(Student students:l) {
			System.out.println(students.getSid()+" ----> "+students.getSname());
		}
		System.out.println("Before sorting student names...");
		for(Student student:l) {
			System.out.println(student.getSid()+" ---->"+student.getSname());
		}
		Collections.sort(l,new SortNames());
		System.out.println("After sorting student names...");
		for(Student students:l) {
			System.out.println(students.getSid()+" ---->"+students.getSname());
		}
	}
}

