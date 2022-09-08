package ch11.book.p459_Class클래스;

import ch08.book.p367_368_필드의_다형성.Car;

public class ClassExample {
	public static void main(String[] args) {
		Car c = new Car();
		Class cl1 = c.getClass();
		System.out.println(cl1.getName() + ", " + cl1.getSimpleName() + ", " + cl1.getPackage().getName());

	}
}
