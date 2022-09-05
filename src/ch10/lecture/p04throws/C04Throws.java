package ch10.lecture.p04throws;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class C04Throws {
	public static void main(String[] args) throws FileNotFoundException {
		m1();
	}
	private static void m1() throws FileNotFoundException {
		InputStream is = new FileInputStream("");
	}
}
