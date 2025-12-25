package com.tnsif.intro.encapsulation;

public class Bank {

	public static void main(String[] args) {
		
		Customer c=new Customer();
		c.setName("Gopinadh");
		c.setAccno(7777);
		c.setBal(100000);
		System.out.println("Customer name = "+c.getName());
		System.out.println("Account number = "+c.getAccno());
		System.out.println("Balance = "+c.getBal());
	}

}
