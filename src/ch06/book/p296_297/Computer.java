package ch06.book.p296_297;

public class Computer extends Calculator{
	@Override
	double areaCircle(double rr) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI *rr *rr;
	}
}
