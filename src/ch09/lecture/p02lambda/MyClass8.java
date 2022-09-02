package ch09.lecture.p02lambda;

import java.util.Arrays;
//  functional interface : 추상메서드가 1개인 인터페이스 
//                         람다로 작성가능 

public class MyClass8 {
	public static void main(String[] args) {
		int[] a1 = new int[10];
		System.out.println(Arrays.toString(a1));
		Arrays.setAll(a1, i -> i);
		System.out.println(Arrays.toString(a1));
		Arrays.setAll(a1, i -> i + 1);
		System.out.println(Arrays.toString(a1));
		Arrays.setAll(a1, i -> i * 2);
		System.out.println(Arrays.toString(a1));
		Arrays.setAll(a1, i -> 10-i);
		System.out.println(Arrays.toString(a1));
		Arrays.setAll(a1, i -> 9-i);
		System.out.println(Arrays.toString(a1));
	}
}
