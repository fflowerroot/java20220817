package ch04.lecture.p02method;

public class C01Method {
	public static void main(String[] args) {

		method2();
		C01Method.method2();

		C01Method m = new C01Method();
		m.method3();
	}

	static void method2() {
	}

	void method3() {
	}
}
