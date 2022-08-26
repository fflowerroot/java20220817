package ch05.lecture.p01array;

public class C07Array {
	public static void main(String[] args) {
		int[] arr1 = { -1, -2, -3 };
		int[] arr2 = { 1, 2, 3, 4 };
		int[] arr3 = { 100, 200, 300 };
		int s1 = sumFirstLast(arr1);
		int s2 = sumFirstLast(arr2);
		int s3 = sumFirstLast(arr3); 
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(sumFirstLast(new int[] { 1, 2, 3, 4 }));
		System.out.println(sumFirstLast(new int[] { 1000 }));
		System.out.println(new int[] { 1000 });  //배열전체는 객체/참조변수임 
	}

	private static int sumFirstLast(int[] arr) {
		return arr[0] + arr[arr.length - 1];
	}
//	private은 클래스내, default(생략한 것)은 package 내, public은 전영역(전 영역이 어디지?..)
}
