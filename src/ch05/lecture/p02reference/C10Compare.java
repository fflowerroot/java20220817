package ch05.lecture.p02reference;

import java.util.*;

public class C10Compare {
	public static void main(String[] args) {
		int[] c = new int[] { 1, 2, 3 };
		int[] d = new int[] { 1, 2, 3 };
		int[] e = { 1, 2, 3 };
		int[] f = { 1, 2, 3 }; // 배열 최초선언시 new type[]생략가능
		System.out.println(c == d);
		// new 생성자로 생성한 객체는 서로 다른 주소를 갖는다.
		boolean r = e.equals(f);
		System.out.println(r);
		boolean r2 = Arrays.equals(c, d);
		System.out.println(r2);
	}
}
