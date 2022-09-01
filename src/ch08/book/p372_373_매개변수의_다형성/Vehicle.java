package ch08.book.p372_373_매개변수의_다형성;

public interface Vehicle {
	public abstract void run();
	void run3(); 
	
	public static void run2() {
		System.out.println("Vehicle interface의 static run2()...");
	}
	
}
