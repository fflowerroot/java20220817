package ch18.lecture.p1inputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class C03InputStream {
	public static void main(String[] args) throws Exception {
		String path = "src/ch18/lecture/p1inputStream/C03InputStream.java";
		InputStream is = new FileInputStream(path);
		
		byte[] b=new byte[100];
		int len1 = is.read(b);  // 매개변수에 입력값이 없으면 is(함수를사용한객체)를 읽음?
		int len2 = is.read(b);
		int len3 = is.read(b);
		int len4 = is.read(b);
		int len5 = is.read(b);
		int len6 = is.read(b);
		int len7 = is.read(b);
		int len8 = is.read(b);
		
		System.out.println(len1);
		System.out.println(len7);
		System.out.println(len8);
		System.out.println(is.read(b));
		is.close();
	}
}
