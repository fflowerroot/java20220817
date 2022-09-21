package ch18.lecture.p2outputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class C01OutputStrema {
	public static void main(String[] args) throws IOException {
		// OutputStream : 바이트 단위로 출력하는 스트림
		// 주요메서드 : write
		String name = "C:\\Users\\user\\Desktop\\output\\output1.txt";
		OutputStream os = new FileOutputStream(name);
		// write() : 한 바이트 출력
		
		os.write(0);
		os.write(127);
		os.write(-128);
		//3총 3바이트를 썼는데, 문자입력은 아니라서 파일크기만 3바이트가 됨?
		
//		os.write("1");//he method write(int) in the type OutputStream is not applicable for the arguments (String)
		os.close();
		
		
	}
}
