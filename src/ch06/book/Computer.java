package ch06.book;

public class Computer {
	int sum1(int[] i) {
		int sum = 0;
		for(int ii = 0; ii < i.length; ii++) {
			sum += i[ii];   /* for문이 아니라 다른 함수였다면 매개변수이름이 
			상위 함수의 매개변수이름과 같았어야.. 할거잖아? 그런데 for문이라서.. 
			for문의 매개변수(여기서는 ii)는 입력값이 없어도(?) 아니, 입력값이
			 필요없이 돌아가잖아!*/
			
		}
		return sum;
	}
	
	int sum2(int...i) {
		int sum = 0;
		for(int ii =0; ii < i.length; ii++) {
			sum += i[ii];
		}
		return sum;
	}
}
