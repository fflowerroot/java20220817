package ch08.book.p367_368_필드의_다형성;

public class Car {
	Tire frontLeftTire = new HankookTire();
	Tire frontRightTire = new HankookTire();
	Tire BackLftTire = new HankookTire();
	Tire BackRightTire = new HankookTire();
	
	
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		BackLftTire.roll();
		BackRightTire.roll();
	}
}
