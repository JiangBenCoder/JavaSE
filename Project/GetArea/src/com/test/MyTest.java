package com.test;

class Circle {
	private Integer r = 0;
	public Circle(Integer r) {
		// TODO Auto-generated constructor stub
		this.r  = r;
	}
	public Double getArea() {
		return r * r * Math.PI;
	}
}



public class MyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle c = new Circle(10);
		System.out.println(c.getArea());
	}

}
