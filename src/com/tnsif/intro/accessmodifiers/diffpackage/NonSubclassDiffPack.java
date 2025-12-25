package com.tnsif.intro.accessmodifiers.diffpackage;

import com.tnsif.intro.accessmodifiers.samepackage.AccessModifiers;

public class NonSubclassDiffPack {
	public void display() {
        System.out.println("===Non subclass in different package===");
        AccessModifiers am=new AccessModifiers();
        System.out.println("(public) d = "+am.d);
		}
}
