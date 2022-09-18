package exercise_fflowerroot.js.p584_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx1 {
	public static void main(String[] args) {
		ArrayList l1 = new ArrayList<>(10);
		// ArrayList.add(Object e)----
		l1.add(new Integer(5));
		l1.add(4);
		l1.add(2);
		l1.add(0);
		l1.add(1);
		l1.add(3);

		ArrayList l2 = new ArrayList<>(l1.subList(1, 4));
		print(l1, l2);

		Collections.sort(l1);
		Collections.sort(l2);
		print(l1, l2);
		System.out.println(l1.containsAll(l2));
		l2.add("b");
		l2.add("c");
		l2.add(3, "a");
		print(l1, l2);

		l2.set(3, "aa");
		print(l1, l2);
		System.out.println("-----------------");

		System.out.println(l1.retainAll(l2));
		print(l1, l2);
		System.out.println("-----------------");

		for (int i = l2.size() - 1; i != -1; i--) {
			if (l1.contains(l2.get(i)))
				l2.remove(i);
		}
		print(l1, l2);

	}

	private static void print(ArrayList l1, ArrayList l2) {
		// TODO Auto-generated method stub
		System.out.println(l1);
		System.out.println(l2);

	}
}
