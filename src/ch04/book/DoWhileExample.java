package ch04.book;

import java.util.Scanner;

public class DoWhileExample {
	public static void main(String[] args) {
		
		System.out.println("Please enter your message.");
		System.out.println("If you want to close, Enter 'p'");
		Scanner scanner = new Scanner(System.in);
		String inputString;

		do {
			System.out.print(">");
			inputString = scanner.nextLine();
			System.out.println(inputString);
		} while (!inputString.equals("p"));
		System.out.println();
		System.out.println("End the program.");
	}
}
