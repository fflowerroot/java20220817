package ch08.book.p370_인터페이스_배열로_구현_객체_관리;

import ch08.book.p367_368_필드의_다형성.KumhoTire;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.run();
		System.out.println();
		
		myCar.tires[1] = new KumhoTire();
		myCar.tires[2] = new KumhoTire();
		
		myCar.run();
	}
}