package ch05.lecture.p01array;

public class C05Length {
	public static void main(String[] args) {
		int[] arr1 = new int[] { 2, 3, 4 }; 
		//배열은 좀 특별한 생성자를 쓰나? 다 같은데 ()대신 {}씀.
		
		int[] arr2 = { 2, 3, 4, 2, 3, 2 };
		printLength(arr1);
		printLength(new int[] { 1, 2, 3, 4,5 });
	}

//	static int printLength(int[]a) {
//		return a.length;

	static void printLength(int[] a) {
		System.out.println(a.length);

	}
}
