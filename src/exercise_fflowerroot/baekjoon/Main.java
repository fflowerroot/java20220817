package exercise_fflowerroot.baekjoon;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt(), ii = sc.nextInt();

		if (i > ii) {
			System.out.println(">");
		} else if (i < ii) {
			System.out.println("<");
		} else {
			System.out.println("==");
		}
	}
}
