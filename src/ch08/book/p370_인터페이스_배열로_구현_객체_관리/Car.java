package ch08.book.p370_인터페이스_배열로_구현_객체_관리;

import ch08.book.p367_368_필드의_다형성.HankookTire;
import ch08.book.p367_368_필드의_다형성.Tire;

public class Car {
	Tire[] tires = {
			new HankookTire(),
			new HankookTire(),
			new HankookTire(),
			new HankookTire()	
	};
	void run() {
		for(Tire tires: tires) {
			tires.roll();
		}
	}
}
