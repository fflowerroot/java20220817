package ch18.lecture.p6filter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class C03BufferdeOutputStream {
	public static void main(String[] args) throws Exception{
		
		// 그냥 output stream 사용
		normalStream();
		bufferedStrem();
	}

	private static void bufferedStrem() {
		// TODO Auto-generated method stub
		
	}

	private static void normalStream() throws FileNotFoundException, IOException {
		String path= "C:\\Users\\user\\Desktop\\output\\output10.txt";
		FileOutputStream fos = new FileOutputStream(path);
		for(int i=0; i<1024*1024*10;i++) {
			fos.write(97);
		}
		fos.close();
	}
}
