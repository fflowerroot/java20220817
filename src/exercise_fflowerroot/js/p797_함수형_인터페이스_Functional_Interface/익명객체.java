package exercise_fflowerroot.js.p797_함수형_인터페이스_Functional_Interface;

public class 익명객체 {
	public static void main(String[] args) {
		I inter = new I() {
			@Override
			public int max(int a, int b) {
				// TODO Auto-generated method stub
				return a > b ? a : b;
			}

			@Override
			public int min(int a, int b) {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		System.out.println(inter.max(1, 0));
		System.out.println(inter.min(1, 0));

	}
}

interface I {
	int max(int a, int b);
	int min(int a, int b);
}
