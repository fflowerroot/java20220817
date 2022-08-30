package ch06.book;

public class Car2Example {
	public static void main(String[] args) {
		Car2 c = new Car2("sonata");
	//	System.out.println(c.setSpeed(44));
		c.setSpeed(44);
		System.out.println(c.speed);
		
		c.run();
		
		String s;
	//	System.out.println(s);
	}
}
