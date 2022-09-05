package ch04.lecture.p01control;

import java.util.Scanner;

public class C15Scanner_t {
	public static void main(String[] args) {
		String src = "hello my javascript";
		Scanner scanner = new Scanner(src);
//		
//		String t1 = scanner.next();
//		System.out.println(t1);
//		
//		String t2 = scanner.next();
//		System.out.println(t2);
//		
//		String t3 = scanner.next();
//		System.out.println(t3);
		
		
		String src2 = "123 456 789";
		scanner = new Scanner(src2); 
		// 참조변수 scanner(?) 앞에 Scanner도 없는데..new를 왜 붙였지?? >> 이미 선언된 변수에 인스턴스 새로 생성해서 넣을 수 있음.
		
		String t4 = scanner.next();
		System.out.println(t4);
//		System.out.println(t4 * 2); // x
		 
//		int i1 = Integer.valueOf(t4);
//		System.out.println(i1);
//		
//		System.out.println(i1 * 2);
		
		int i2 = scanner.nextInt();
		System.out.println(i2);
		int i3 = scanner.nextInt();
		System.out.println(i3);
		
		String src3 = "hello world\nhello java\nhello spring"; // \n : new line
		System.out.println(src3);
		
		scanner = new Scanner(src3);
		
		String line1 = scanner.nextLine();
		System.out.println(line1);
		
	//	String line2 = scanner.nextLine();
	//	System.out.println(line2);
		
		String line3 = scanner.nextLine();
		System.out.println(line3);
		
		System.out.println("사용자 입력 받기");
		scanner = new Scanner(System.in);
		
		String input1 = scanner.next();
		
		System.out.println("입력한 첫번째 토큰 : " + input1);
		
		int input2 = scanner.nextInt();
		
		System.out.println("입력한 두번째 토큰 (정수) : " + input2);
		
		scanner.nextLine(); //이거 안쓰니까 input3에 엔터가 저장됨..
		String input3 = scanner.nextLine();
		System.out.println("입력한 한줄 : " + input3);
	}
}