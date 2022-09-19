package ch16.lecture.p02.stream;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class C08Mapping {
	public static void main(String[] args) {
		//IntStream은 기본타입 스트림. 참조타입스트림으로 변경하는 경우 있어
		
		IntStream.of(1,3,2)
		//.sorted((a,b)->b-a)
		.sorted()
		.forEach((e)->System.out.println(e));

		
		IntStream.of(1,3,2)
			.boxed()
			.sorted((a,b)->b-a)
			.forEach((e)->System.out.println(e));
		
//		String res= IntStream.of(1,3,2)
//		.boxed()
//		.sorted((a,b)->b-a)
//		.map(s->String.valueOf(s));
		
//		forEach((e)->System.out.println(e));   //Type mismatch: cannot convert from void to String

	//	.map(s -> Integer.valueOf(s))
		
		String res1 = IntStream.of(3, 5, 9, 1, 0)
				.boxed()
				.sorted((a, b) -> b - a)
				.map((s) -> String.valueOf(s))
				.collect(Collectors.joining(", "));
		
		System.out.println(res1);
		
		String res = IntStream.of(3, 5, 9, 1, 0)
				.boxed()
				.sorted((a, b) -> b - a)
				.map((e) -> e + "")
				.reduce((s1, s2) -> s1 + ", " + s2)
				.get();
		
		System.out.println(res);
		
	}
}
