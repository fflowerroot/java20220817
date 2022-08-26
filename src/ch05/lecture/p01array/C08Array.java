package ch05.lecture.p01array;

public class C08Array {
	// 배열의 각 아이템은 객체가될 수 있다!! 즉 아이템에 주소가 들어갈 수 있다.
	
	public static void main(String[] args) {
		int[] a = { 4, 5, 6 }; // 일차원 인트배열. 각 아이템은 타입이 '인트'.
		int[][] b; // 이차원 인트배열. 각 아이템은 타입이 '참조타입'.
		//n차원배열 가능! 
		b = new int[][] { { 1, 2 }, { 3, 4 }, { 5, 6 } };
		
		System.out.println(b[0]);
		System.out.println(b[0][1]);
	}
}
