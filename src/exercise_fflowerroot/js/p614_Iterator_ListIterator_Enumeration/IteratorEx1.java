package exercise_fflowerroot.js.p614_Iterator_ListIterator_Enumeration;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx1 {
	public static void main(String[] args) {
		ArrayList l = new ArrayList<>();
		l.add(1);
		l.add(2);
		l.add("3");
		Iterator it = l.iterator();
		while(it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
		}
		 
	}
}
