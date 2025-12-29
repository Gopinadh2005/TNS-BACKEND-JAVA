package com.tnsif.intro.assignments.task2;

public class TypeConversion {

	public static void main(String[] args) {
		
		//Implicit type casting(widening)
		byte a=10;
		char ch='g';
		
		short b = a;     // byte -> short
        int c = b;       // short -> int
        int c1 = ch;     // char -> int (Unicode value)
        long d = c;      // int -> long
        float f = d;     // long -> float
        double db = f;   // float -> double
        
        System.out.println("==== Widening =======");
		System.out.println("byte a= "+a);    //10
		System.out.println("char ch= "+ch);	 //g
		System.out.println("short b= "+b);	 //10
		System.out.println("int c= "+c);	 //10
		System.out.println("int c1= "+c1);   //103 (based on Unicode)
		System.out.println("long d= "+d);	 //10
		System.out.println("float f= "+f);	 //10.0
		System.out.println("double db= "+db); //10.0
		
		// Explicit type casting (Narrowing)
        double dl = 25.75;
        float fl = (float) dl;   // double -> float
        long l = (long) fl;      // float -> long
        int i = (int) l;        // long -> int
        short s = (short) i;    // int -> short
        byte by = (byte) s;      // short -> byte
        char ca = (char) i;     // int -> char (Unicode value)

        System.out.println("==== Narrowing =======");
        System.out.println("double dl = " + dl);   // 25.75
        System.out.println("float fl = " + fl);      // 25.75
        System.out.println("long l = " + l);       // 25
        System.out.println("int i = " + i);        // 25
        System.out.println("short s = " + s);      // 25
        System.out.println("byte by = " + by);       // 25
        System.out.println("char ca = " + ca);     // Unicode character for 25
	}

}
