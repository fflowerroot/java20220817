package ch13.lecture.p01generic;

import java.util.ArrayList;

public class C05Generic {
	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<String>(); // type parameter에 기본타입은 넣을 수 없음
		System.out.println(l.get(0));
		
		ArrayList<Integer> l2 = new ArrayList<Integer>();
//		l2.add("3");
		l2.add(3);
	}
}
