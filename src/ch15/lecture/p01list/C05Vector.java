package ch15.lecture.p01list;

import java.util.List;
import java.util.Vector;

public class C05Vector {
	// Vector   vs   ArrayList   .. 차이점은?
	
	public static void main(String[] args) {
		List<String> l = new Vector<>();
		l.add(0,"a");
		l.add("a");
		l.remove(0);
		
	}
}
