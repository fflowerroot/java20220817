package ch18.lecture.p5writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class C03Writer {
	public static void main(String[] args) throws Exception {
		String fileName = "C:\\Users\\user\\Desktop\\output\\output7.txt";
		Writer wr = new FileWriter(fileName);
		char[] buf = {'a','b','c','d','e','f','가'};
		wr.write(buf,0,3);
		wr.write(buf,2,4);
		wr.close();
	}
}
