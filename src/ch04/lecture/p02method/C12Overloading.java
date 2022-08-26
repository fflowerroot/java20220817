package ch04.lecture.p02method;

public class C12Overloading {
	public static void main(String[] args) {
		double a = half(5.0);
		System.out.println(a);
		double b = half(4);
		System.out.println(b);
	}

	private static double half(double d) {

		return d / 2;
	}

	private static double half(int d) {

		return d / 2;
	}
}
