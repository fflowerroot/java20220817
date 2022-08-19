package ch06.book;

public class SingletonExample {
	public static void main(String[] args) {
		Singleton o1 = new Singleton();
		
		Singleton o1 = Singleton.geInstance();
		Singleton o2 = Singleton.geInstance();
		
		if(o1 == o2) {
			System.out.println("");
		}
				
	}
}
