package ch16.lecture.p02.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class C21GroupingBy {
	public static void main(String[] args) {
		Map<String,List<Integer>> map = 
		IntStream.of(1,2,2,1).boxed().collect(Collectors.groupingBy((e)->(e%2==0)?"even":"odd"));
	}
}
