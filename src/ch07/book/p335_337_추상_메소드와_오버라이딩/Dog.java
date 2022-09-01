package ch07.book.p335_337_추상_메소드와_오버라이딩;

public class Dog extends Animal{
	public Dog() {
		this.kind = "mammalia";
	}
	@Override
	public void sound() {
		System.out.println("mung mung..");		
	}
}
