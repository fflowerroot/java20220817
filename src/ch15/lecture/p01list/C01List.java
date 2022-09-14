package ch15.lecture.p01list;

import java.util.ArrayList;
import java.util.List;

public class C01List {
	public static void main(String[] args) {
		// List  :  순서가 있음
		
//		List<String> l1 = new List<>(); //Cannot instantiate the type List
		List<String> l1 = new ArrayList<>();
		
		l1.add("a");
		l1.add("b");
		
		l1.get(0);
		System.out.println(l1.get(0));
		
		System.out.println(l1.size());
		System.out.println(l1.get(l1.size()-1));
		
	}
}
