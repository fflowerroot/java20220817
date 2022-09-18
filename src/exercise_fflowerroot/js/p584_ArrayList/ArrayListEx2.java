package exercise_fflowerroot.js.p584_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx2 {
	public static void main(String[] args) {
		final int LIMIT = 10;
		String source = "0123456789abcdefghijABCDEFGHIJ!@#$%^&*()zzz";
		int length = source.length();
		List l = new ArrayList<>(length / LIMIT + 10);

		for (int i = 0; i < length; i += LIMIT) {
			if (i + LIMIT < length) {
				l.add(source.substring(i, i + LIMIT));
				System.out.println(i+" ; "+l);
			} else {
				l.add(source.substring(i));//i부터 끝까지!
				System.out.println(i+" :: "+l);
			}
		}
		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
		}
	}
}
