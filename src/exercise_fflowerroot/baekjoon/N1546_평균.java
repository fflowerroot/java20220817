package exercise_fflowerroot.baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class N1546_평균 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int[]scores = new int[n];
		
		int[]a = new int[3];
		for(int i =0; i<a.length;i++) {
			a[i]=i;
		}
		for(int j : a) {    // ;;;;;;;;;;;; 향상된  for문은 일반적인 for문과 달리 배열이나 컬렉션에 저장된 요소들을 읽어오는 용도로만 사용할 수 있다. 
			j=1; 
			System.out.println(a[0]+","+a[1]+","+a[2]);
		}
		System.out.println(Arrays.toString(a));
		System.out.println(a);
			
		
	}
}
