package ch04.book.exercise;

import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args) {
		boolean run = true;

//		int 예금액 = 100000;
//		int withdraw = 10000;
		int balance = 1000000000;

		while (run) {
			System.out.println("---------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------------");
			System.out.print("선택 > ");
			Scanner scanner = new Scanner(System.in);
			int u = scanner.nextInt();
			
			if (u == 1) {
				System.out.print("예금액>");
				u = scanner.nextInt();
				balance += u;
				

			} else if (u == 2) {
				System.out.print("출금액 > ");
				u = scanner.nextInt();
				balance -= u;
				
				
			} else if (u == 3) {
				System.out.println("balance : " + balance);
			
			} else if (u == 4) {
				System.out.println("프로그램 종료");
				//break;
				run=false;
			} else {
				System.out.println("올바른 값을 입력해주세요(1~4)");
				System.out.println();
			}
		}
		

	}
}
