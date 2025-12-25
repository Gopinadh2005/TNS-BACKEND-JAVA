package com.tnsif.intro.accessmodifiers.samepackage;

public class NonSubClass {

	public void display() {
        System.out.println("===Non subclass in same package===");
        AccessModifiers am=new AccessModifiers();
        System.out.println("(default) b = "+am.b);
        System.out.println("(protected) c = "+am.c);
        System.out.println("(public) d = "+am.d);
		}
}
