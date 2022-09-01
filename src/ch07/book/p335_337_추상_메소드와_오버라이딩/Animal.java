package ch07.book.p335_337_추상_메소드와_오버라이딩;

public abstract class Animal {
	public String kind;
	public void breathe() {
		System.out.println("breathe..");
	}
	public abstract void sound();
}
