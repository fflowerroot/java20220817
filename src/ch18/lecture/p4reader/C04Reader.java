package ch18.lecture.p4reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class C04Reader {
	public static void main(String[] args) throws Exception {
		String fileName = "src/ch18/lecture/p4reader/C03Reader.java";	
		Reader  fr = new FileReader(fileName);
		
		// read(char[]) : char배열에 읽은 문자를 채우고 읽은 문자 갯수를 리턴
		char[] buffer = new char[300];
		int len1 = fr.read(buffer);
		int len2 = fr.read(buffer);
		System.out.println(len1);
		System.out.println(len2);
		
		String s4= new String(buffer);
		System.out.println();
		fr.close();
	}
}
