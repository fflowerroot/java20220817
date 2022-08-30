package ch07.book.p314_317;

public class Car {
	// field
	Tire fL = new Tire("fl", 6);
	Tire fR = new Tire("fR", 2);
	Tire bL = new Tire("bl", 2);
	Tire bR = new Tire("bR", 4);

	// counstructor

	// method
	int run() {
		System.out.println("Car is running.");
		if(fL.roll() == false) {stop(); return 1;}
		if(fR.roll() == false) {stop(); return 2;}
		if(bL.roll() == false) {stop(); return 3;}
		if(bR.roll() == false) {stop(); return 4;}
		return 0;
	}
	

	void stop() {
		System.out.println("Car is stopping.");
	}
}
