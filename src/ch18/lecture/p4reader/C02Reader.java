//한글 a1aa한  . 
package ch18.lecture.p4reader;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.Reader;

public class C02Reader {
	public static void main(String[] args) throws Exception {
		String fileName = "src/ch18/lecture/p4reader/C02Reader.java";	
		InputStream is = new FileInputStream(fileName);
		
		int r1 = is.read();
		int r2 = is.read();
		int r3 = is.read();
		System.out.println((char)r3);
		System.out.println(r3);
		System.out.println((char)237);
		
		Reader rd = new FileReader(fileName);
		int i1=rd.read();
		int i2=rd.read();
		int i3=rd.read();
		
		System.out.println((char)i1);
		System.out.println((char)i2);
		System.out.println((char)i3);
		
	}
}
