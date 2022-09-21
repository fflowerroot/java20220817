package ch18.lecture.p3exception;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class C01Exception {
	public static void main(String[] args) throws IOException { //여기서 던지는 예외는 IOException클래스파일?에서 받음. ?
		String name = "C:\\Users\\user\\Desktop\\output\\output5.txt";
		OutputStream os = new FileOutputStream(name);
		os.write(99);// 만약 exception 발생시 아래 close코드 실행되지 못함 /  throws IOException 으로 처리하는 것은 안전하지 못함.
		os.write(88);
		
		os.close();
	}
}
