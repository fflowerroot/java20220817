package ch18.lecture.p4reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class C01Reader {
	public static void main(String[] args) throws Exception {
		String fileName = "src/ch18/lecture/p4reader/C01Reader.java";
		Reader rd = new FileReader(fileName);
		// 주요 메서드 : read
		// read() : 한 문자 읽고 int로 리턴
		int i1=rd.read();
		int i2=rd.read();
		
		System.out.println((char)i1);
		rd.close();
	}
}
