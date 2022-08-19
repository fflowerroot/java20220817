package ch06.book;

public class Singleton {
	private static Singleton singleton = new Singleton();
	
	private Singleton() {}
	
	static Singleton geInstance() {
		return singleton; 
	}
	
}
