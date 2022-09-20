package ch16.lecture.p02.stream;

import java.util.stream.Stream;

public class C17MethodReference {
	public static void main(String[] args) {
		Stream.of("b","c").forEach(System.out::println);
	}
}
