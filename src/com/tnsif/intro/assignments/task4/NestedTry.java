package com.tnsif.intro.assignments.task4;

public class NestedTry {

	public static void main(String[] args) {
		try {
			int a=10;
			int b=0;
			try {
				String s=null;
				try {
					int[] arr= {1,2,3,4};
					System.out.println(arr[3]);
					System.out.println(arr[4]);
				}catch(ArrayIndexOutOfBoundsException e) {
					System.out.println("The Array size is 4.we can't access 5th element.");
				}
				System.out.println(s.length());
			}catch(NullPointerException e) {
				System.out.println("The string value is null.");
			}
			int c=a/b;
		}catch(ArithmeticException e) {
			System.out.println("division by zero is not possible..");
		}

	}

}
