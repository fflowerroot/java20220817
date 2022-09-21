package ch18.lecture.book;

import java.io.BufferedReader;
import java.io.FileReader;

public class AddLineNumberExample {
	public static void main(String[] args) throws Exception {
		String name = "src/ch18/lecture/p6filter/C03BufferdeOutputStream.java";
		FileReader fr = new FileReader(name);
		BufferedReader br = new BufferedReader(fr);
		
		String line = null;
		int i=1;
		while ((line = br.readLine()) != null) {
			System.out.print(i+". ");
			System.out.println(line);
			i++;
		}
		
		br.close();
		fr.close();
	}
}
