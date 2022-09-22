package exercise_fflowerroot.baekjoon;

import java.util.Scanner;

public class n10952 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		while (true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
	
//			if(a != 0 || b != 0) {
//				System.out.println(a + b);				
//			}
			if(a==0&&b==0) {
				break;
			}
			System.out.println(a + b);	
		}

	}
}
//import java.util.Scanner;
//
//public class Main {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int T, A, B;
//		T = sc.nextInt();
//		
//		for (int i = 0; i < T; i++) {
//			A = sc.nextInt();
//			B = sc.nextInt();
//			System.out.println(A + B);
//		}
//	}
//}
