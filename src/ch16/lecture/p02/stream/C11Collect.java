package ch16.lecture.p02.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class C11Collect {
	public static void main(String[] args) {
		// collect 메서드 			//그래서 이게 뭐하는거라고?
		//		: 종료연산
		// 		  스트림에있는 원소들을 지정된 컨테이너에 수집하는 일을 함
		//		parameter1: 원소가 들어갈 컨테이너
		//		parameter2: 켄테이너에 원소를 넣는 일
		//		parameter3: 컨테이너 병합(merge)
		
		List<Integer> l1 =	IntStream.range(1, 100)
			.filter(e->e%2==0)
			.collect(()->new ArrayList<>(),(c,e)->c.add(e), (c1,c2)->c1.addAll(c2));
//			<Object> Object java.util.stream.IntStream.collect(Supplier<Object> supplier, ObjIntConsumer<Object> accumulator, BiConsumer<Object, Object> combiner)
			
		System.out.println(l1);
			
	}
}
