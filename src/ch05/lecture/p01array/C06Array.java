package ch05.lecture.p01array;

public class C06Array {
	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 1, 2, 3, 4 };

		printFirstItem(arr1);
		printFirstItem(new int[] { 1000 });

		printLastItem(arr1);
		printLastItem(new int[] { 1, -1 });

		printMiddleItem(arr1); // 홀수면 가운데.짝수면 가운데 한칸 뒤 출력
		printMiddleItem(arr2);

	}

	private static void printMiddleItem(int[] a) {
//		if(a.length/2==1) {
//			System.out.println(a[a.length/2]);
//		}else {
		System.out.println(a[a.length / 2]);
	}

	private static void printFirstItem(int[] a) {
		System.out.println(a[0]);

	}

	private static void printLastItem(int[] a) {
		System.out.println(a[a.length - 1]);

	}

}
