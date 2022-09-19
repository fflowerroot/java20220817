package ch16.lecture.p02.stream;

import java.util.stream.Stream;

public class C04IntermediateOperation {
	public static void main(String[] args) {
		// 중간 연산
		System.out.println(Stream.of(1, 2, 3, 4, 5, 6).limit(2).max((x, y) -> x - y).get()); // 중간연산 limit()은 스트림을 리턴함.
																								// max()는 최종연산
		System.out.println(Stream.of(1, 2, 3, 4, 5, 6)
				.limit(2)
				.min((x, y) -> x - y)
				.get());

		System.out.println(Stream.of(1, 2, 3, 4, 5, 6)
				.skip(2)
				.max((x, y) -> x - y)
				.get());

		System.out.println(Stream.of(1, 2, 3, 4, 5, 6)
				.filter((e) -> e % 2 == 0)
				.reduce((x, y) -> x + y)
				.get());

		System.out.println(Stream.of(1, 2, 3, 4, 5, 6)
				.filter((e) -> e % 2 == 1)
				.reduce((x, y) -> x + y)
				.get());
		
		System.out.println(Stream.of(1, 1, 2, 3, 4, 5, 6)
				.distinct()
				.reduce((x, y) -> x + y)
				.get());
		
		
		
		

	}
}

















