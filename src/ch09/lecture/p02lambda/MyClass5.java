package ch09.lecture.p02lambda;

import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;

public class MyClass5 {
	public static void main(String[] args) {
		IntConsumer o1;

		o1 = (i) -> { System.out.println(i * i); };
		o1.accept(3);
		o1.accept(4);
		o1.accept(10);

		DoubleConsumer o2;
		o2 = i -> System.out.println(i/2); // ?? int/int를 했는데 어떻게 실수가 나옴?
		
		o2.accept(5);
	
	}
}
