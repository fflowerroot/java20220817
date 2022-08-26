package ch04.book;

public class ForSumFrom1To100Example {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; ++i) {
			sum += i;
		}
		System.out.println(sum);

		sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);
		//i++랑 ++i가 결과값이 같네.. 증감식이 한 문장의 실행의 완성이라서..?
		sum = 0;
		int i =1;
		for(; i <= 100; ++i) {   //초기화가 이미 되어 있는 경우 생략 가능!
			sum+=i;
		}
		System.out.println(sum);
		System.out.println(i); 
		// 증감식에 의해서 i가 101이 되고 조건식을 만족하지 못해서 for문 종료되었기 때문에 i값은 101.
		/* 그리고 변수는 선언한 코드블럭 안쪽에서만 쓸 수 있어
		그래서 i를 for문 밖에서 출력하려면 for문 밖에서 선언해야함*/
		System.out.println("초기화식, 증감식이 둘 이상일 수 있다! (쉼표로 구분)"); 
		//---------초기화식, 증감식이 둘 이상일 수 있다! (쉼표로 구분)
		for(int k=0,j=100; k<=51 && j>=50; k++,j--) {
			System.out.println(k+j);
		} 
		System.out.println("22222222222222222222222222"); 
		for(int k=0,j=100, m=1; k<=51 && j>=50; k++,j--,m++) {
			System.out.println(k+j+m);
		}
		System.out.println("333333333333333333333333333"); 
		for(int k=0,j=100, m=1; k<=51 ; k++,j--,m++) {
			System.out.println(k+j+m);
		}// 조건식을 &&로 묶는 경우에는 하나만 써도 결과가 동일하다.
		
		
		
		
		
	}	
}
