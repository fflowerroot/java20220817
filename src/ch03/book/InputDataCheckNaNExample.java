package ch03.book;

public class InputDataCheckNaNExample {
	public static void main(String[] args) {
		String userInput = "NaN";
		double val = Double.valueOf(userInput);
		
		double currentBalance = 10000.0;
		
		currentBalance += val;
		System.out.println(currentBalance);
		
		
		System.out.println(Double.isInfinite(3/0.0));
		System.out.println(3/0.0 + 2);  
		//NaN = Not a Number
	}
	
}
