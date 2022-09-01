package ch08.book.exercise.q3;
// 인터페이스의 메서드는 모두 public abstract이기 때문에 생략가능하다.
// 추상클래스  vs  구현클래스
// 추상클래스/인터페이스는 주로 매개변수로 활용되나봐?
// 필드의 다형성 & 매개변수의 다형성
                                                      
public class SoundableExample {
	private static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());
	}
}
class Cat implements Soundable{

	@Override
	public String sound() {
		return "야옹 ..";
	}
	
}
class Dog implements Soundable{

	@Override
	public String sound() {
		return "멍멍..";
	}
	
}
