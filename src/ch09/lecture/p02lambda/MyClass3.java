package ch09.lecture.p02lambda;

public class MyClass3 {
	public static void main(String[] args) {
		MyInterface3 o1 = (String s) -> {System.out.println(s);}; (String s, int i)->{};

		MyInterface3 o2 = s -> System.out.println(s+s);
		
		
		
		o1.m("ggg..");
		o2.m("ggg..");
		
	}
}

interface MyInterface3{
	void m(String s);
	void m2(String s, int i);
}
