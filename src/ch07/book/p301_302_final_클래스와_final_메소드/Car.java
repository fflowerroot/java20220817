package ch07.book.p301_302_final_클래스와_final_메소드;

public class Car {
	public int speed;
	
	public void speedUp() {
		speed += 1;
	}
	public final void stop() {
		System.out.println("Stop..");
		speed = 0;
	}
}
