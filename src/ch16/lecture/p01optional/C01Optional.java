package ch16.lecture.p01optional;

import java.util.Optional;

public class C01Optional {
	public static void main(String[] args) {
		Optional<String> o1 = Optional.empty();
		Optional<String> o2 = Optional.of("java");
		System.out.println(o1.isEmpty());
		System.out.println(o2.isEmpty());
		System.out.println(o1.isPresent());
		System.out.println(o2.isPresent());
		
		System.out.println(o2.get());
//		System.out.println(o1.get());
		System.out.println(o1.orElse("empty string"));
		System.out.println(o2.orElse("empty string"));
	
		
	}
}
