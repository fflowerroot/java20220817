package ch13.lecture.p04genericMethod;

public class C01Method {
	public static void main(String[] args) {
		C01Method.<String>m1("s");
//		<String>m1("s");
		m1("s");
	}
	public static <T>void m1(T t){
		
	}
	public static void m(Object o) {
		
	}
	public static void m(String s) {
		
	}
	public static void m(Integer i) {
		
	}
}
