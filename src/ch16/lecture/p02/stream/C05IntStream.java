package ch16.lecture.p02.stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class C05IntStream {
	public static void main(String[] args) {
		System.out.println(IntStream.of(1,2,3,4,5)
			.sum());
		
		System.out.println(Arrays.stream(new int [] {1,2,3}));
		
		System.out.println(IntStream.range(1, 11));
//		Stream s= IntStream.range(1, 11); // Type mismatch: cannot convert from IntStream to Stream
		IntStream is=IntStream.range(1, 11);
		
		System.out.println(IntStream.rangeClosed(1, 10)
				.sum());
		
		IntStream.generate(()->1)
			.limit(10)
			.forEach(e->System.out.println(e)); 
		
		IntStream.generate(()->(int)(Math.random()*45+1))
			.limit(10)
			.forEach((e)->System.out.println(e));
	
	}
}
