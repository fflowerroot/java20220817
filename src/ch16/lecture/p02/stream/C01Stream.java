package ch16.lecture.p02.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class C01Stream {
	public static void main(String[] args) {
		// collection의 아이템들을 흘러가면서 소개
		// 중간에 연산 가능,마지막에 연산 가능
		List<String> l = List.of("java", "css", "spring");
		Stream<String> stream1 = l.stream();
		Set<String> s = Set.of("a", "b", "c");
		Stream<String> stream2 = s.stream();
		String[] ss = { "1", "2", "3" };
		Stream<String> stream3 = Arrays.stream(ss);
		Stream<String> stream4 = Stream.of("q", "w");
	}
}
