package ch05.lecture.p02reference;

public class C06Reference {
	public static void main(String[] args) {
		int[] a = { 9, 8 };
		notChangeItems(a);
		System.out.println(a[0]);

		int[] ee = new int[3];
		ee = {1,2,3}; // 배열을 한번에 입력하는건 처음 생성할때만 가능.....
	}

	static void notChangeItems(int[] i) {
		System.out.println(i[0]);
		// i= {3,4};
		i = new int[] { 3, 4 };

	}

	int[] ee = new int[3]; // 여기서 왜 배열생성 안돼?
	ee = {1,2,3};
}
