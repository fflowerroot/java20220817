package ch03.book;

public class InputDataCheckNanExample_2 {
	public static void main(String[] args) {
		String userInput = "NaN";
		double val = Double.valueOf(userInput);
		
		double currentBalance = 10000.0;
		
		if(Double.isNaN(val)) {
			System.out.println("It can't be processed.. Because of NaN");
			val = 0.0;
		}
		currentBalance += val;
		System.out.println(currentBalance);
	}
}
