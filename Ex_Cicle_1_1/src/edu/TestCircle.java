package edu;

public class TestCircle {

	public static void main(String[] args) {
		
		TheCircleClass c1 = new TheCircleClass();
		System.out.println("The circle has radius of " + c1.getRadius() + " and area of " + c1.getArea());
		TheCircleClass c2 = new TheCircleClass(2.0);
		System.out.println("The circle has radius of " + c2.getRadius() + " and area of " + c2.getArea());
	}

}
