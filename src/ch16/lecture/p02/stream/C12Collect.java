package ch16.lecture.p02.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class C12Collect {
	public static void main(String[] args) {
		List<Integer> l1=IntStream.range(1, 100)
			.parallel()
			.collect(()-> new ArrayList<>(),(r,e)->r.add(e),(r1,r2)->r1.addAll(r2));
		System.out.println(l1);
	}
}
