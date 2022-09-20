package ch16.lecture.p02.stream;

import java.util.Optional;
import java.util.stream.Stream;

public class C03TerminalOperation___ {
	public static void main(String[] args) {
		Stream<String> s1=Stream.of("iron","panther","widow");
		s1.forEach((e)->System.out.println(e));
		
		Stream<String> s2=Stream.of("iron","panther","widow"); // of메서드가 반환하는 실제 인스턴스가 뭐야? 찾아 들어갔는데 찾을 수가 없음.  api에도 없음. public이 아닌가?
		Optional op1=s2.reduce((a,b)->a+", "+b);               //    > 그 인스턴스(BinaryOperator의 자손)가 오버라이딩한  reduce메서드가 실행된거잖아?
		System.out.println(op1.get());						   //      람다는 BinaryOperator의 익명객체를 생성한거고 /그럼 reduce 구현부가 뭐야? 
																//        > 구현부에는 BinaryOperator의 메서드를 이용한 식이 있겠지?
	}																
}
