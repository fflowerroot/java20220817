package ch10.lecture.p02try;

public class C04Finally {
	public static void main(String[] args) {
		try {
			System.out.println("..");
			return;
		}finally {
			System.out.println("finally .. catch block 없이 사용 가능");
		}
	}
}
