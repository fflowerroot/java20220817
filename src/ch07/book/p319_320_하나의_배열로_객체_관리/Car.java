package ch07.book.p319_320_하나의_배열로_객체_관리;

import ch07.book.p314_317_필드의다형성.Tire;

public class Car { 	
	Tire[] tires = {
			new Tire("fL", 6),
			new Tire("fR", 3),
			new Tire("bL", 3),
			new Tire("bR", 4)
	};
	
	int run() {
		System.out.println("Car is running....");
		for(int i = 0 ; i < tires.length; i++) {
			if(tires[i].roll()==false) {
				stop();
				return(i+1);	
			}
		}
		return 0;
	}

	void stop() {
		System.out.println("Car is stopping....");
	}
}
