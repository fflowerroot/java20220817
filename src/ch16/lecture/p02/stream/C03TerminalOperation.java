package ch16.lecture.p02.stream;

import java.util.Optional;
import java.util.stream.Stream;

public class C03TerminalOperation {
	public static void main(String[] args) {
		Stream<String> s1=Stream.of("iron","panther","widow");
		s1.forEach((e)->System.out.println(e));
		
		Stream<String> s2=Stream.of("iron","panther","widow");
		Optional op1=s2.reduce((a,b)->a+", "+b);
		System.out.println(op1.get());
	}
}
