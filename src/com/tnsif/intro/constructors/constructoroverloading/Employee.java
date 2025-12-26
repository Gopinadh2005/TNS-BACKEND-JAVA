package com.tnsif.intro.constructors.constructoroverloading;

public class Employee {
	
	Employee(){
		System.out.println("=== 0-Parameter Construcor ===");
		System.out.println("Ready To Display Employee Information ");
	}
	Employee(String empName){
		System.out.println("=== 1-Parameter Constructor ===");
		System.out.println("Employee name = "+empName);
	}
	Employee(String empName,int empId){
		System.out.println("=== 2-Parameters Constructor ===");
		System.out.println("Employee name = "+empName);
		System.out.println("Employee id = "+empId);
	}
	Employee(String empName,int empId,double empSal){
		System.out.println("=== 3-Parameters Constructor ===");
		System.out.println("Employee name = "+empName);
		System.out.println("Employee id = "+empId);
		System.out.println("Employee salary = "+empSal);
	}
	Employee(String empName,int empId,double empSal,String empAddr){
		System.out.println("=== 4-Parameters Constructor ===");
		System.out.println("Employee name = "+empName);
		System.out.println("Employee id = "+empId);
		System.out.println("Employee salary = "+empSal);
		System.out.println("Employee address = "+empAddr);
	}
}
