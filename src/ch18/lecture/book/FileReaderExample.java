package ch18.lecture.book;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderExample {
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("src/ch18/lecture/p4reader/C03Reader.java");
		int readCharNo;
		char[] cbuf = new char[100];
		// file내용을 콘솔에 출력하기----
		while ((readCharNo = fr.read(cbuf)) != -1) {
			String data = new String(cbuf, 0, readCharNo);
			System.out.println(data);
		}
		fr.close();
	}
}
