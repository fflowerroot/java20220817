package exercise_fflowerroot.baekjoon;

import java.util.Scanner;

public class N2884_알람_시계 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();

//		m = m >= 45 ? m - 45 : 60 + m - 45;
//		h = m >= 45 && h > 0 ? h : h > 0 ? h - 1 : 23;
//		System.out.println(h + " " + m);
		
		int m2 = m >= 45 ? m - 45 : 60 + m - 45;
		int h2 = m >= 45 && h > 0 ? h : h > 0 ? h - 1 : m>=45? h: 23;
		System.out.println(h2 + " " + m2);

//		m = m >= 45 ? m - 45 : 60 + m - 45;
//		h = m >= 45 && h > 0 ? h : h > 0 ? 22222 : m>=45? 111111: 233333;
//		System.out.println(h + " " + m);
		// ㅜㅠㅠㅠㅠ..... m을 내가 위에서 조정해놓고.. 그 m을 활용해서 식을 세웠으니 ... ㅡㅡ;;
		
		
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
//		int M = in.nextInt(); // 분onsole
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