package ch04.lecture.p02method;

public class C06Parameter {
	public static void main(String[] args) {
		sum(1, 10);
		System.out.println(sum(1, 10));

	}

	static int sum(int a, int b) {
		int s = 0;
		for (int i = a; i <= b; i++) {
			s += i;
		}
		return s;
	}
}
