package ch04.lecture.p01control;

import java.util.Scanner;

public class C15Scanner {
	public static void main(String[] args) {

		String scr = "hi world!";
		Scanner scanner = new Scanner(scr);
		String s1 = scanner.next();
		String s2 = scanner.next();

		System.out.println(s1);
		System.out.println(s2);

		String scr2 = "123 456 789";
		scanner = new Scanner(scr2);
		int s3 = scanner.nextInt(scr2);
		int i = Integer.valueOf(s3);

		String src3 = "hello wrld\nheollo java\nhellow spring";

		scanner = new Scanner(src3);

		scanner = new Scanner(System.in);

		String input1 = scanner.next();

	}
}
