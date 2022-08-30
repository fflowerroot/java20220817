package ch06.book;

public class A {
	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("s");
	
	public A(boolean a) {}
	A(int a){}
	private A(String a) {}
}
