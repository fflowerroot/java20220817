package ch11.lecture.p01object;

public class C04Hashcode {
	public static void main(String[] args) {
		Object o1 = new Object();
		Object o2 = new Object();
	
		int h1 = o1.hashCode();
		int h2 = o2.hashCode();
		
		System.out.println(h1);
		System.out.println(h1);
		
		Object o3 = new Book(99);
		Object o4 = new Book(99);
		
		System.out.println(o3.hashCode());
		System.out.println(o4.hashCode());
		
	}
}
