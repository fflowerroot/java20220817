package exercise_fflowerroot.baekjoon;

import java.util.Scanner;

public class N3003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		sc = new Scanner(input);
		int k = sc.nextInt();
		int k2 = sc.nextInt();
		int k3 = sc.nextInt();
		int k4 = sc.nextInt();
		int k5 = sc.nextInt();
		int k6 = sc.nextInt();
		
		System.out.println((1-k)+" "+(1-k2) + " "+(2-k3) + " "+(2-k4) + " "+(2-k5) + " "+(8-k2) + " " );
		
//		체스는 총 16개의 피스를 사용하며, 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개로 구성되어 있다.
	}
	
	
}
