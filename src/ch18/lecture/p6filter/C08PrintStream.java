package ch18.lecture.p6filter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class C08PrintStream {
	public static void main(String[] args)  {
		String name="C:\\Users\\user\\Desktop\\output\\output14.txt";
		try (
		FileOutputStream fis = new FileOutputStream(name);
		PrintStream ps= new PrintStream(fis);){
			ps.write(97);
			ps.print(false);
			ps.print(97);
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
}
