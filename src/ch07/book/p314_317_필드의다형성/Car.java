package ch07.book.p314_317_필드의다형성;
//필드의 다형성 부분이 어디,어디야 ㅠㅠ......

public class Car {
	// field
	//  Car에 Tire를 4개 속하게 한다.
	//	 이게  field !
	Tire fL = new Tire(6);
	Tire fR = new Tire(2);
	Tire bL = new Tire(2);
	Tire bR = new Tire(4);

	// counstructor

	// method
	// 타이어 4개 점검
	// 총회전가능수-회전수
	int run() {
		System.out.println("Car is running.");
		if(fL.roll() == false) {stop("fL"); return 1;}
		if(fR.roll() == false) {stop("fR"); return 2;}
		if(bL.roll() == false) {stop("bL"); return 3;}
		if(bR.roll() == false) {stop("bR"); return 4;}
		return 0;
	}
	

	void stop(String s) {
		System.out.println("Car is stopping. " + s + " tire puncture");
	}
}
