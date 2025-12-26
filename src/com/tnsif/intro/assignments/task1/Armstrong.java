package com.tnsif.intro.assignments.task1;
import java.util.Scanner;
public class Armstrong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num=sc.nextInt();
		int temp=num;
		int count=0;
		while(temp>0) {
			int rem=temp%10;
			count++;
			temp=temp/10;
		}
		int sum=0;
		temp=num;
		while(temp>0) {
			int rem=temp%10;
			sum=(int) (sum+Math.pow(rem,count));
			temp=temp/10;
		}
		if(num==sum)
			System.out.println(num+" is Armstrong number..");
		else
			System.out.println(num+" is not a Armstrong number..");
	}

}
