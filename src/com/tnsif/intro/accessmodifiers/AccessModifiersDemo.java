package com.tnsif.intro.accessmodifiers;

import com.tnsif.intro.accessmodifiers.diffpackage.NonSubclassDiffPack;
import com.tnsif.intro.accessmodifiers.diffpackage.SubclassDiffPack;
import com.tnsif.intro.accessmodifiers.samepackage.NonSubClass;
import com.tnsif.intro.accessmodifiers.samepackage.SubClass;

public class AccessModifiersDemo {

	public static void main(String[] args) {
		SubClass sc=new SubClass();
		sc.display();
		NonSubClass nsc=new NonSubClass();
		nsc.display();
		SubclassDiffPack scd=new SubclassDiffPack();
		scd.display();
		NonSubclassDiffPack nscd=new NonSubclassDiffPack();
		nscd.display();

	}

}
