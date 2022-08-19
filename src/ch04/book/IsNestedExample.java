package ch04.book;

public class IsNestedExample {
	public static void main(String[] args) {
		int score = (int)(Math.random()*20)+81;
		
		String grade;
		
		if (score >= 90) {
			if(score >= 95) {
				grade = "a+";
			}else {
				grade = "a";
			}
		}else {
			if(score>=85) {
				grade = "b+";
			}else {
				grade = "b";
			}
		}
		System.out.println(grade);
	}
}
