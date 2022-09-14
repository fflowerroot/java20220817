package ch15.book.p725_Array_List;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		l.add("Java");
//		l.add(2,"JDBC");
		l.add(1,"JDBC");
		l.add(0,"JDBC");
		l.add("Servlet/JSP");
		l.add(2,"Database");
//		l.add(0, null);
		l.add("iBATIS");

		int size = l.size();
		System.out.println("size : " + size);
		System.out.println();

		String skill = l.get(2);
		System.out.println("2 : " + skill);
		System.out.println();

		for (int i = 0; i < l.size(); i++) {
			String s = l.get(i);
			System.out.println(i + " : " + s);
		}
		System.out.println();

		l.remove(2);
		l.remove(2);
		l.remove("iBATIS");

		for (int i = 0; i < l.size(); i++) {
			String s = l.get(i);
			System.out.println(i + " : " + s);

		}
	}
}
