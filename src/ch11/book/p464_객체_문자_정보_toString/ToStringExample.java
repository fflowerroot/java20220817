package ch11.book.p464_객체_문자_정보_toString;

import java.util.Date;

public class ToStringExample {
	public static void main(String[] args) {
		Object o1 = new Object();
		Date o2= new Date();
		
		System.out.println(o1.toString());
		
		// 아래 3개가 같은 역할 
		System.out.println(o2.toString());
		System.out.println(o2); 
		System.out.println(String.valueOf(o2));
		
	}
}
