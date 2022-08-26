package ch05.book;

import java.util.Arrays;

public class ArrayInArrayExample {
	public static void main(String[] args) {
		int[][] ms = new int[2][3];
		for (int i = 0; i < ms.length; i++) {
			for (int k = 0; k < ms[i].length; k++) {
				System.out.println(ms[i][k]);
			}
		}
		System.out.println(Arrays.toString(ms));
		System.out.println(Arrays.toString(ms[0]));
		System.out.println(Arrays.toString(ms[1]));
		System.out.println(Arrays.deepToString(ms));
		
	}
}
