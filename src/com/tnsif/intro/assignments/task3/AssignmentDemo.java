package com.tnsif.intro.assignments.task3;

public class AssignmentDemo {
	public static void main(String[] args) {
		char[] arr={'T','E','A','M',' ','W','O','R','K'};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==' ') {
				System.out.println();
			}else {
				System.out.print(arr[i]);
			}
		}System.out.println();
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i]==' ') {
				System.out.println();
			}else {
				System.out.print(arr[i]);
			}
		}
	}
}

