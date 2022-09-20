package ch16.lecture.p02.stream;

import java.util.stream.IntStream;

public class C10Parallel {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		double avg1 = IntStream.range(1, Integer.MAX_VALUE)
				.filter((n) -> n % 2 == 0)//IntStream java.util.stream.IntStream.filter(IntPredicate predicate)
										 // IntPredicate의 추상메서드- boolean m(int? i) 를 오버라이딩	
				.average()
				.getAsDouble();
		System.out.println(avg1);
		long end = System.currentTimeMillis();
		System.out.println("순차스트림 작업시간 : " + (end - start) + "ms");
		double avg2 = IntStream.range(1, Integer.MAX_VALUE)
				.parallel()
				.filter((n) -> n % 2 == 0)
				.average()
				.getAsDouble();
		System.out.println(avg2);
		long end2 = System.currentTimeMillis();
		System.out.println("병렬스트림 작업시갖 : " + (end2 - end) + "ms");
	}
}
