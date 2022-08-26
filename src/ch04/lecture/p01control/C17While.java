package ch04.lecture.p01control;

import java.util.Scanner;

public class C17While {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("주사위 맞추기 \n번호를 입력하세요(1~6)");
		int i= scanner.nextInt();

		int d = (int) (Math.random() * 6) + 1;
		
		
		while(d != i) {
			i= scanner.nextInt();
		}
		System.out.println("It's correct!");

	}
}
