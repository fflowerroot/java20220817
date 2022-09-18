package exercise_fflowerroot.js.p584_ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

public class VectorEx1 {
	public static void main(String[] args) {
		Vector v = new Vector<>(5);
		v.add("1");
		v.add("2");
		v.add("3");
		print(v);

		v.trimToSize();
		System.out.println("trimToSize------------------");
		print(v);

		v.ensureCapacity(6);
		System.out.println("ensureCapaciry----------------");
		print(v);

		v.setSize(7); // Vector는 용량이 부족할 경우 기존의 두배 크기로 자동 증가한다.
		System.out.println("setSize--------------------");
		print(v);

		v.clear();
		System.out.println("clear----------------------");
		print(v);

		Collection l = new ArrayList<>();
		Collection l2 = new HashSet<>();
		
		System.out.println(l.contains(l2));
	}

	public static void print(Vector v) {
		System.out.println(v);
		System.out.println("size : " + v.size());
		System.out.println("capacity : " + v.capacity());

	}
}
//interface aa{
//	
//}
//class aa{//The type aa is already defined
//	
//}
