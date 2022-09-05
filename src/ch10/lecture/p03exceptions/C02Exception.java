package ch10.lecture.p03exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class C02Exception {
	public static void main(String[] args) {
		// Exception : 일반 예외 ( 컴파일러가 체크함. checked exception)
		// > 예외처리 코드 작성 안하면 컴파일 안됨.

		try {
			FileReader fr = new FileReader("");
		} catch (FileNotFoundException e) {
			System.out.println("catch");
		}
		

		try {
			Class a = Class.forName("");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
			
	}
}

