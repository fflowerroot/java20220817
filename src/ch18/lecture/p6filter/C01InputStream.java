package ch18.lecture.p6filter;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class C01InputStream {
	public static void main(String[] args) throws Exception { // 스트림을 다른 스트림으로 감쌀 수 있다.
		String name= "src/ch18/lecture/p6filter/C01InputStreamReader.java";
		FileInputStream fis = getFileInputStream(name);
		Reader rd = new InputStreamReader(fis);
		int c1= fis.read();
		int c2= fis.read();
		int c3= fis.read();
		System.out.println((char)c3);
	}
	private static FileInputStream getFileInputStream(String fileName) throws Exception {
		return new FileInputStream(fileName);
	}
	
}
