package exercise_fflowerroot.baekjoon;

import java.util.Scanner;

public class N2884_알람_시계 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();

		m = m >= 45 ? m - 45 : 60 + m - 45;
		h = m >= 45 && h > 0 ? h : h > 0 ? h - 1 : 23;
		System.out.println(h + " " + m);
	}
}

//import java.util.Scanner;
//
//public class N2884_알람_시계 {
//	public static void main(String[] args) {
//    
//		Scanner in = new Scanner(System.in);
//		
//		int H = in.nextInt(); // 시
//		int M = in.nextInt(); // 분
//		in.close();
//		
//		if(M < 45) {
//			H--;		// 시(hour) 1 감소
//			M= 60 - (45 - M); 	// 분(min) 감소
//			if(H < 0) {
//				H = 23;
//			}
//			System.out.println(H + " " + M);
//		}
//		else {
//			System.out.println(H + " " + (M - 45));
//		}
//	}
//}