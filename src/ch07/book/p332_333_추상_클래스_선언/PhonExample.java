package ch07.book.p332_333_추상_클래스_선언;

public class PhonExample {
	public static void main(String[] args) {
		
//		Phone phone = new Phone();  //Cannot instantiate the type Phone 
		
		SmartPhone smartPhone = new SmartPhone("Seo");
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
	}
}
