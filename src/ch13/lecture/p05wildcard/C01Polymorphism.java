package ch13.lecture.p05wildcard;

import java.util.ArrayList;

public class C01Polymorphism {
	public static void main(String[] args) {
		ArrayList<String> l1 = new ArrayList<String>();
		ArrayList<Object> l2=l1; //Type mismatch: cannot convert from ArrayList<String> to ArrayList<Object>
		
		l2.add(new Object());  
	}
}
