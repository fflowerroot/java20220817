package ch14.book.exercise.q5;

import java.util.function.IntBinaryOperator;

public class LambdaExample {
	private static int[] scores = {10,50,3};
	
	public static int maxOrMin(IntBinaryOperator operator) {
		int r = scores[0];
		for(int score:scores) {
			r = operator.applyAsInt(r, score);
		}
		return r;
	}
	public static void main(String[] args) {
		
//		int max = maxOrMin(IntBinaryOperator operator = (int s) -> ;);
		int max = maxOrMin();
		int min = maxOrMin(x,y)->Math.min(x, y);
		System.out.println("max:"+max);
		int min = maxOrMin();
		System.out.println("min:"+min);
	  
	}
}
