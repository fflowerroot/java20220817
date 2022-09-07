package ch11.book.p496_String메소드;

import java.io.IOException;
//api 보고 해석하는 능력 기르기

public class KeyboardToStringExample {
	public static void main(String[] args) throws IOException {
		byte[] bytes = new byte[100];

		System.out.print("input : "); // out은 모니터, in은 키보드.
		int readByteNo = System.in.read(bytes);

		String s = new String(bytes, 0, readByteNo - 2); // 왜 -2를 썼지?? >> carriage return과 line feed가 각각 1바이트씩임. \r \n
		System.out.println(s);

//		String ss ="1234";
//		System.out.println(ss.charAt(ss.length()-1));
//		
//		System.out.println(ss.charAt(ss.length()-1));
//			
	}
}
