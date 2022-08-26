package ch05.lecture.p02reference;

public class C08Reference {
	public static void main(String[] args) {
		int[] a = {9, 8, 7};
		a = changeArray(a);
		System.out.println(a[0]);
		
		int[] b = {5, 6, 7};
		b = changeArray(b);
		System.out.println(b[0]);
		
		a[0] = 100;
		System.out.println(a[0]); // 100
		System.out.println(b[0]); // 2
		
		a=b;
		System.out.println(a[0]);
		b = new int[] {1,2,3,4};
		System.out.println(a[0]);
		
		a=b;
		System.out.println(a[0]);
		b[0]=1111;					// b에 새로운 주소값을 저장해주면 a랑 주소가 달라지지만
		System.out.println(a[0]);	//	 b의 아이템에 새로운 값을 저장해주면 a도 같이 바뀜(a도 같은 주소이므로)
		
	}
	
	public static int[] changeArray(int[] arr) {
		System.out.println(arr[0]);
		arr = new int[] {2, 4};  // ***! 배열을 저장해준다는 것은 주소값을 저장하는것. 배열의 값만 변경 불가.
		
		return arr;
	}
}