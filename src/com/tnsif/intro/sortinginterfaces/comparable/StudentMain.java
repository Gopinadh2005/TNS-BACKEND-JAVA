package com.tnsif.intro.sortinginterfaces.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentMain {

	public static void main(String[] args) {
		List<Student> l=new ArrayList<>();
		Student Student=new Student(110,"Gopi");
		Student s1=new Student(104,"Sriram");
		Student s2=new Student(107,"Seetha");
		Student s3=new Student(109,"Radha");
		Student s4=new Student(103,"Vasudhev");
		Student s5=new Student(101,"Hanuman");
		Student s6=new Student(100,"Narasimha");
		l.add(s1);l.add(s2);l.add(s3);l.add(s4);l.add(s5);l.add(s6);
		System.out.println("Before sorting student id : ");
		for(Student S:l) {
			System.out.println(S.getSid()+" "+S.getSname());
		}
		Collections.sort(l);
		System.out.println("After sorting student id : ");
		for(Student S:l) {
			System.out.println(S.getSid()+" "+S.getSname());
		}
	}

}
