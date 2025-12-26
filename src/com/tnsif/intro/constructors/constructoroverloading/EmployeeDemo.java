package com.tnsif.intro.constructors.constructoroverloading;

public class EmployeeDemo {

	public static void main(String[] args) {
		
		Employee e0=new Employee();
		Employee e1=new Employee("Ram");
		Employee e2=new Employee("Seetha",7267);
		Employee e3=new Employee("Radha",7268,70000);
		Employee e4=new Employee("Krishna",7269,90000,"Brindavanam");
	}

}
