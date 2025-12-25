package com.tnsif.intro.encapsulation;

public class Customer {
   private String cname;
   private int accno;
   private double bal;
 
public void setName(String cname) {
	   this.cname=cname;
   }
public String getName() {
	return cname;
}
 public void setAccno(int accno)
 {
	 this.accno=accno;
 }
 public int getAccno() {
	 return accno;
 }
 public void setBal(double bal) {
	 this.bal=bal;
 }
 public double getBal() {
	 return bal;
 }
}
