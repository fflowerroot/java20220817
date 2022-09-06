package exercise_fflowerroot.baekjoon;

import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();

		if (x * y > 0) {
			if (x > 0) {
				System.out.println(1);
			} else {
				System.out.println(3);
			}
		} else {
			if (x < 0) {
				System.out.println(2);
			} else {
				System.out.println(4);
			}
		}
	}
}

//윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.