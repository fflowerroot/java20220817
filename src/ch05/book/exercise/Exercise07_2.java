package ch05.book.exercise;

public class Exercise07_2 {
	public static void main(String[] args) {
		int max = 0;
		int[] array = { 1, 5, 3, 8, 2 };
		// int min=array[0];
		int min = Integer.MAX_VALUE;

		for (int i : array) {
			if (i > max) {
				max = i;
			}
		}
		System.out.println(max);

		for (int i : array) {
//			if (i < min) {
//				min = i;
//			}
			min = i < min ? i : min;
		}
		System.out.println(min);
	}
}
