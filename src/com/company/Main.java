package com.company;

public class Main {

    public static void main(String[] args) {
	Rectangle rect1 = new Rectangle(4.23);
	Rectangle rect2 = new Rectangle(23.0, 45.6);
	Rectangle rect3 = new Rectangle(23.0, 45.6);

	Rectangle.printRectanglesCount();
	Rectangle.printClassName(true);
	Rectangle.printClassName(false);

//	rect1.printArea();
//	rect2.printArea();
//	rect3.printArea();
//
//	System.out.println();
//
//	rect1.printRectangleKind();
//	rect2.printRectangleKind();
//	rect3.printRectangleKind();
//
//	System.out.println();
//
//	System.out.println(rect1.isTheSameRectangle(rect2));
//	System.out.println(rect1.isTheSameRectangle(rect3));
//	System.out.println(rect2.isTheSameRectangle(rect3));

    }
}
