package ch05.lecture.p02reference;

import java.util.Arrays;

public class C09Reference {
	public static void main(String[] args) {
		int[][] a = { { 1 }, { 2, 3 }, { 4, 5, 6 } };
		System.out.println(Arrays.deepToString(a));
		int[][] b = a;
		a[0][0] = 1111;
		System.out.println(b[0][0]);
		a[0] = new int[] { 222, 333 };   // ********* 참조형 a[0]에 새로운 주소를 저장해줬지만,
										 // 			b에는 상위주소인 a의 주소가 저장되어있기 때문에			
									     //  			  당연히 b에 저장된 주소에도 새로운 주소가 저장됨(즉 같은 객체 가리킴).	
		System.out.println(b[0][0]); // *** 222
	}
}
