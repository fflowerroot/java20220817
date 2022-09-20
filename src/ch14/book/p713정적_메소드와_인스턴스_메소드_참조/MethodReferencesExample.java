package ch14.book.p713정적_메소드와_인스턴스_메소드_참조;

import java.util.function.IntBinaryOperator;

public class MethodReferencesExample {
	public static void main(String[] args) {
		IntBinaryOperator operator;

		operator = (x, y) -> Calculator.staticMethod(x, y);
		System.out.println("res1: "+operator.applyAsInt(1, 2));
		
		operator=Calculator::staticMethod;
		System.out.println("res2: "+ operator.applyAsInt(3, 4));

		Calculator o = new Calculator();
		operator=(x,y)->o.instanceMethod(x, y);
		System.out.println("res3: "+ operator.applyAsInt(5, 6));
		
		operator= o:: instanceMethod;
		System.out.println("res4: "+operator.applyAsInt(7, 8));
	
	}
	
	
	

}

class Calculator {
	static int staticMethod(int x, int y) {
		return x + y;
	}

	int instanceMethod(int x, int y) {
		return x + y;
	}
}