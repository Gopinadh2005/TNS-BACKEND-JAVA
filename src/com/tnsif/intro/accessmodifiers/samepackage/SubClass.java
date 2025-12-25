package com.tnsif.intro.accessmodifiers.samepackage;

public class SubClass extends AccessModifiers {

		public void display() {
         System.out.println("===Subclass in same package===");
         System.out.println("(default) b = "+b);
         System.out.println("(protected) c = "+c);
         System.out.println("(public) d = "+d);
		}
}
