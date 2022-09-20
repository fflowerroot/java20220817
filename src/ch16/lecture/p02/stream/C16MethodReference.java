package ch16.lecture.p02.stream;

import java.util.stream.IntStream;

public class C16MethodReference {
	public static void main(String[] args) {
		int max = IntStream.of(1, 2, 3, 4, 1).boxed().max((x, y) -> x.compareTo(y)).get();
		System.out.println(max);

		max = IntStream.of(1, 2, 3, 4, 1).boxed().max(Integer::compareTo).get();
		System.out.println(max);
		
		max= IntStrema.of(1,2,3,1).max()
		
	}
}
