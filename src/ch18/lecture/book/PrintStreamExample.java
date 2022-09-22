package ch18.lecture.book;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamExample {
	public static void main(String[] args) {
		try(
		FileOutputStream fos = new FileOutputStream("C:\\Users\\user\\Desktop\\output\\output14.txt");
		PrintStream ps =new PrintStream(fos);) {
		ps.println("프린터 보조 스트림");
				ps.print("마치 ");
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
}
