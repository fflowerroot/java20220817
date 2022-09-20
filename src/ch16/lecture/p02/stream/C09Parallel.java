package ch16.lecture.p02.stream;

import java.util.List;

public class C09Parallel { // data가 많을 경우 병렬스트림 사용하면 성능이 좋아짐
	public static void main(String[] args) {
		List<String> l = 	List.of("d","a","b","c");
		l.parallelStream()
			.forEach((e)->System.out.println(e));

		l.parallelStream()
			.forEachOrdered((e)->System.out.println(e));
	}
}
