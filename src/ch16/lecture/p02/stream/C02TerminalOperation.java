package ch16.lecture.p02.stream;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class C02TerminalOperation {
	public static void main(String[] args) {
		// Stream 연산
		// > 1. 중간 연산(중간 처리) intermediate operation
		// > 2. 종료 연산(최종 처리) terminal operation

		// 구분법: 중간연산 method는 리턴타입이 Stream
		// 최종연산 method는 리턴타입이 주로 Stream이 아님

		Stream<String> st = List.of("1", "2", "3", "4").stream();

		System.out.println(st.findAny());
//		Optional op =st.findAny(); // stream has already been operated upon or closed

		Stream<String> st2 = List.of("1", "2", "3", "4").stream();
		Optional op2 = st2.max((a, b) -> a.compareTo(b));
		System.out.println(op2.get());

	}
}
