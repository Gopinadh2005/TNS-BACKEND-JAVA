package com.tnsif.intro.abstraction.abstractkeyword;

public class ShapeDemo {

	public static void main(String[] args) {
		Rectangle r=new Rectangle(10,5);
		r.calcArea();
		r.display();
		Square s=new Square(7);
		s.calcArea();
		s.display();
	}

}
