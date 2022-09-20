package ch16.lecture.p02.stream;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class C20Collect {
	public static void main(String[] args) {
		String res=IntStream.of(1,2,4,1)
				.boxed()  // int를 Stream<Integer>로 
				.map(String::valueOf) // Stream<Integer>은 collect 못쓰나봄 그래서 String으로 매핑.
				.collect(Collectors.joining(", "));
		
		System.out.println(res);
	}
}
