package ch05.lecture.p01array;

public class C11ForEach {
	public static void main(String[] args) {
		//  향상된 for문 ( enganced for / for-each )
		
		int[] a= {1,2,3,4,5,6};
	
		for(int item:a) {
			System.out.println(item);
		}// 향상된 for문은 index가 없음. index를 활용하고 싶으면 일반for문을 사용해야함.
	}
}
