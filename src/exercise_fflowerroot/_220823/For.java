package exercise_fflowerroot._220823;

public class For {
	public static void main(String[] args) {

//			_______0_______
//			______101______
//			_____21012_____
//			____3210123____
//			___432101234___
//			__54321012345__
//			_6543210123456_
//			765432101234567

		for (int i = 0; i < 8; i++) {
			for (int j = 7; j > i; j--) {
				System.out.print("_");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}

			System.out.print("*");

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			for (int j = 7; j > i; j--) {
				System.out.print("_");
			}
			System.out.println();
		}
		// ---------------------------------------
		int ii = 1;
		for (int i = 0; i < 8; i++) {
			for (int j = 7; j > i; j--) {
				System.out.print("_");
			}
			ii = i;
			for (int j = 1; j <= i; j++) {

				System.out.print(ii);
				ii -= 1;
			}

			System.out.print("0");

			for (int j = 1; j <= i; j++) {
				System.out.print(ii + 1);
				ii += 1;
			}
			for (int j = 7; j > i; j--) {
				System.out.print("_");
			}
			System.out.println();
		}
	}
}
