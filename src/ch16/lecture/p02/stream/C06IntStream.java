package ch16.lecture.p02.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class C06IntStream {
	public static void main(String[] args) {
		Stream.of(1,2,3,4,5,6,7,8,9,10).forEach(e->System.out.println(e)); 
		ArrayList<Integer> l = new ArrayList<>();
//		for(int i:l) {
//			l.add(i);
//		}
		for(int i =1; i<101;i++) {
			l.add(i);
		}
		
		int[] arr=new int[100];
		for(int i =1; i<=100;i++) {
			arr[i-1]=i;
		}
		
		IntStream is= Arrays.stream(arr);
		IntStream is2= Arrays.stream(arr);
		//for문 돌린 Arrays를 IntStream으로 변경했는데...
		//IntStream에 range함수 사용하면 바로 대입가능함
		//IntStream에 웬만한 int관련 함수 다 있으서 바로 쓰면 될듯..
		
		int r1= is.sum();
		System.out.println(r1);
		
		int r2= is2.filter((e)->e%2==1).sum();
		System.out.println(r2);
		
		OptionalDouble o1 = IntStream.of(5,10,20,1,6).average();
		System.out.println(o1);
		
		System.out.println("주사위 5번 던진 결과");
		IntStream.generate(()->(int)(Math.random()*6+1))
		.limit(5)
		.forEach((e)->System.out.println(e));
		
		
		System.out.println("로또번호(1~45) 6개 작은 수 부터 출력(중복없이)");
		IntStream.generate(()->(int)(Math.random()*45+1))
		.limit(6)
		.forEach((e)->l.add(e));
		// 인티져어레이리스트 왜 정렬 안됨?
		
		l.sort(Comparator.naturalOrder());
		System.out.println(l);
		
	
		IntStream.generate(()->(int)(Math.random()*45+1))
//		IntStream.generate((int)(Math.random()*45+1)) // 왜 안됨?		
		.distinct()
		.limit(6)
		.sorted()
		.forEach((e)->System.out.println(e));
		
		System.out.println();
		
		
		
//		System.out.println(l.sort(null));
//		Collection.sort(l);
//		l.sort(null);
		
		
		
//		l.stream().filter((e)->e%2==1).sum(); 
		//The method sum() is undefined for the type Stream<Integer>
//		System.out.println(l.Intstream().filter((e)->e%2==1).sum());
		//The method Intstream() is undefined for the type List<Integer>
		
		
		
	}
}
