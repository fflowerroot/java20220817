package ch05.book;

public class ArrayCreateByValueListExample2 {
	public static void main(String[] args) {
		int[] scores;
		scores = new int[] { 83, 90, 87 };
		int sum1 = 0;
		for (int i = 0; i < 3; i++) {
			sum1 += scores[i];
		}
		System.out.println(sum1);

		int sum2= add(new int[] {83,90,87});  // 매개변수로 들어간 배열의 이름은 없..어..
		System.out.println(sum2);			  //		>> 아마 파라미터에 이름이 이 배열의 이름..		
		
		int[] scores2 = new int[] {83,90,87};
		int sum3= add2(scores2);
		System.out.println(sum2); 
	}
	
	public static int add(int[]scores) {
		int sum=0;
		for(int i=0;i<3;i++) {
			sum+=scores[i];
	}
		return sum;
	}
		
		int[] scores2 = new int[] {83,90,87};
		int sum2= add2(scores2);
		//System.out.println(sum2); 		//클래스영역에서 함수호출 불가	
	

	public static int add2(int[] a) {
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum += a[i];
		}
		return sum;
	}
}
