package ch07.book.p332_333_추상_클래스_선언;

abstract public class Phone {
	String owner;
	public Phone(String owner) {
		this.owner = owner;
	}
	public void turnOn() {
		System.out.println("On..");
	}
	public void turnOff() {
		System.out.println("Off..");
	}

}
