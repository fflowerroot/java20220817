package ch05.book;

public class ArrayLengthExample {
	public static void main(String[] args) {

		int[] scores = { 83, 90, 87 };
		double avg = (double) sum(scores) / scores.length;
		System.out.println(sum(scores));
		System.out.println(avg);
		System.out.println(avg(scores));
	}

	static int sum(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}

	static double avg(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum / (double) a.length;
	}
}
