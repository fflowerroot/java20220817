package ch08.lecture.p01interface;

import java.io.Serializable;

public class C02Interface {
	public static void main(String[] args) {
		//
		String s = "maverick";
		Object o1 = s;
		Serializable o2 = s;
		CharSequence o3 = s;
		Comparable<String> o4 = s;  
		
		System.out.println(s instanceof Object);
		System.out.println(s instanceof Serializable);
		System.out.println(s instanceof CharSequence);
	//	System.out.println(s instanceof Comparable<String>);
		System.out.println(s instanceof Comparable<?>);
		
		System.out.println(o1 instanceof Object); // true
		System.out.println(o1 instanceof Serializable); // true
		System.out.println(o1 instanceof CharSequence); // true
		System.out.println(o1 instanceof Comparable<?>); // true
	}
}
