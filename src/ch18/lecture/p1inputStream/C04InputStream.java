package ch18.lecture.p1inputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class C04InputStream {
	public static void main(String[] args) throws Exception {
		String path = "src/ch18/lecture/p1inputStream/C04InputStream.java";
		FileInputStream is = new FileInputStream(path);
		byte[] buffer = new byte[10];
		int cnt = 0;
		while (is.read(buffer) != -1) {
			System.out.println(is.read(buffer)+"bytes씩 일어옴");
			cnt++;
		}
		is.close();
		System.out.println("이 파일은 약 "+cnt*10+"bytes?");
		System.out.println("=======================");
		
		FileInputStream is2 = new FileInputStream(path);
		int i = is2.read();
		System.out.println((char)i); 
		cnt=0; 
		while(is2.read()!=-1) {
			System.out.println("문자: "+ (char)is2.read());
			cnt++;
		} // 왜 제대로 안읽어와지지?
		System.out.println("이 파일은 "+cnt+"bytes?");
		is2.close();
	}
}
