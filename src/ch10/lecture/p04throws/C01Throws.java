package ch10.lecture.p04throws;

public class C01Throws {
	public static void main(String[] args) throws ClassNotFoundException {
		m1();
	}
	public static void m1() throws ClassNotFoundException {
		Class.forName("java.lang.String");		
	}
}
