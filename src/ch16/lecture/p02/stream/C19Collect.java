package ch16.lecture.p02.stream;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class C19Collect {
	public static void main(String[] args) {
		double avg=IntStream.of(1,2,4,3,1).boxed().collect(Collectors.averagingDouble(Double::valueOf));
		System.out.println(avg);
		
		Long cnt = IntStream.of(1,2,4,2,1,8).filter(C19Collect::even).boxed().collect(Collectors.counting());
		long cnt2 =IntStream.of(1,2,4,2,1,8).filter(C19Collect::even).boxed().count();// long?
		
				
	}
	private static boolean even(int i) {
		return i%2==0;
	}
}
