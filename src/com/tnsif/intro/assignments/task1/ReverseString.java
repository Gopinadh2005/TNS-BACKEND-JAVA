package com.tnsif.intro.assignments.task1;
import java.util.Scanner;
public class ReverseString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str=sc.next();
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println("Reverse of string is : "+rev);
	}

}
