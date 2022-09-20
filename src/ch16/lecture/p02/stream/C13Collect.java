package ch16.lecture.p02.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class C13Collect {
	public static void main(String[] args) {
		List l1 = IntStream.range(1, 100)
			.boxed()
			.collect(Collectors.toList());
		System.out.println(l1);
	}
}
