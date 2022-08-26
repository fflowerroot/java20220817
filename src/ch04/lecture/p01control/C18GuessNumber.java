package ch04.lecture.p01control;

import java.util.Scanner;
// import 단축키	:	ctrl + shift + o
public class C18GuessNumber {
	public static void main(String[] args) {
		int c = (int) (Math.random() * 100 + 1);
		System.out.println(c);

		System.out.println("숫자를 입력하세요.(1~100)");
		Scanner scanner = new Scanner(System.in);
		int u = scanner.nextInt();

		while (c != u) {
			u = scanner.nextInt();
		}
		System.out.println("It is correct!");
//----------------------------------------------------------			
		while (true) {
			System.out.println("숫자를 입력하세요.(1~100)");
			scanner = new Scanner(System.in);
			u = scanner.nextInt();
			if (c == u) {
				System.out.println("It is correct!");
				break;
			} else {
				System.out.println("It is wrong.");
			}
		}
//----------------------------------------------------------		
		do {
			System.out.println("숫자를 입력하세요.(1~100)");
	//		scanner = new Scanner(System.in); 
			u = scanner.nextInt();
		}while(c!=u);
		System.out.println("It is wrong.");
			
		System.out.println("It is correct!");
		}
	}



