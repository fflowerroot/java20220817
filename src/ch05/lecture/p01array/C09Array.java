package ch05.lecture.p01array;

public class C09Array {
	public static void main(String[] args) {
		int[][] a = { { 1, 2 }, { 3, 4 }, { 5, 6 } }; // 2차원인트배열 a의 아이템의 개수는 3개
		System.out.println(a.length);
		System.out.println(a[0].length + "," + a[1].length + "," + a[2].length);

		int[][] b = new int[2][3];
		System.out.println(b.length);
		
		int[][]c=new int[3][];
		System.out.println(c[0]); //null
		c[0]=new int[1];
		System.out.println(c[0][0]); // 0
	//	c[0]= {1,2,3};  // Array constants can only be used in initializers
		c[0]=new int[] {1,2};	
		c[1]=new int[] {1,2,3,4};
		System.out.println(c[2][0]); // NullPointerException
	// 배열 길이를 지정해주었을 때는, 아이템이 참조변수라면 주소가 null이고 아이템이 인트라면 값이0
	//	 길이조차 지정안했을때는 NullPointerExeption에러임.
		
	}

}
