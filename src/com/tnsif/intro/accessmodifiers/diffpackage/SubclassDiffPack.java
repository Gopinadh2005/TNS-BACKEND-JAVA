package com.tnsif.intro.accessmodifiers.diffpackage;

import com.tnsif.intro.accessmodifiers.samepackage.AccessModifiers;

public class SubclassDiffPack extends AccessModifiers{
	public void display() {
        System.out.println("===Subclass in different package===");
        System.out.println("(protected) c = "+c);
        System.out.println("(public) d = "+d);
		}
}
