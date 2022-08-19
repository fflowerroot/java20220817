package ch03.book;

public class ConditionalOperationExample {
	public static void main(String[] args) {
		int score = 85;
		char grade = score > 90 ? 'A' : score > 80 ? 'B' : 'C';
		System.out.println(grade);

		if (score > 90) {
			grade = 'A';
		} else if (score > 80) {
			grade = 'B';
		} else {
			grade = 'C';
		}
		System.out.println(grade);
		
		score = 90;
		grade = score >= 90 ? 'a' : score >= 80 ? 'b' : 'c';
		System.out.println(grade);
	}

}
