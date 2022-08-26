package ch06.book.p232.copy;

public class CaculatorExample {
	public static void main(String[] args) {
		Calculator myCal = new Calculator();
		
		double r1 = myCal.areaRectangle(11);
		double r2= myCal.areaRectangle(11, 22);
		System.out.println(r1);
		System.out.println(r2);
	}
}
