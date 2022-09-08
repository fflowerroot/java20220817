package ch06.book.p269_어노테이션;

public class Service {
	@PrintAnnotation
	public void m1() {
		System.out.println("1...");
	}
	@PrintAnnotation
	public void m2() {
		System.out.println("2...");
		
	}
	@PrintAnnotation(value = "#", number =20)
	public void m3() {
		System.out.println("3...");
	}
	
}
