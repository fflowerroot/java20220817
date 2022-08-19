package ch03.book;
	
public class LogicalOperatorExample {
	public static void main(String[] args) {
		int cCode = 'A';
		
		if(cCode>=65 & cCode<=90){
		System.out.println("대문자");
	    }
		
		if(cCode>=97 && cCode<=122) {
			System.out.println("소문자");
		}
		
		if(!(cCode<48) && !(cCode>57)) {
			System.out.println("number");
		}
		
		int i = 6;
		
		if(i%2==0	|	i%3==0) {
			System.out.println("2 또는 3의 배수");
		}
		
		if(i%2==0	||	i%3==0) {
			System.out.println("2 또는 3의 배수");
		}
		
		
		
		
  }
}

