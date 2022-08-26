package ch05.book;

public class AdvancedForExample {
	public static void main(String[] args) {
		int[] scores = { 90, 80, 80, 60 };
		int sum = 0;
		for (int score : scores) {
			sum += score;
		}
		System.out.println(sum);

		double avg = (double) sum / scores.length;
		System.out.println(avg);
	}

}
