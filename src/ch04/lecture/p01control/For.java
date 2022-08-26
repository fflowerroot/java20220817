package ch04.lecture.p01control;

public class For {
	public static void main(String[] args) {
//		String a = " ";
//		String b = "";
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = 5; k > i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		// j와 k가 규칙적으로 변한다. 그 변화를 상위의 i의 변화랑 엮는다..
		for (int i = 0; i < 5; i++) {
			for(int j=4; j>i; j--) {
				System.out.print(" ");
			}
			for(int k=0; k<i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");

		System.out.println();// ---------------

		System.out.print(" ");

		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.println();// ---------------

		System.out.print(" ");
		System.out.print(" ");

		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.println();// ---------------

		System.out.print(" ");
		System.out.print(" ");
		System.out.print(" ");

		System.out.print("*");
		System.out.print("*");
		System.out.println();// ---------------

		System.out.print(" ");
		System.out.print(" ");
		System.out.print(" ");
		System.out.print(" ");

		System.out.print("*");
		System.out.println();// ---------------

		for (int i = 0; i < 5; i++) {
			// space 출력
			for (int j = 4; j > i; j--) {
				System.out.print(" ");
			}

			// * 출력
			for (int l = 0; l <= i; l++) {
				System.out.print("*");
			}

			System.out.println();
		}
		int ii = 0;
		
		for(int i =0; i<4; i++) {
			for(int j=0; j <=i; j++) {
				System.out.print(ii++);
			}
			System.out.println();
		}
		
		int iii = 0;
		
		for(int i =0; i<5; i++) {
			for(int j=0; j <=i; j++) {
				System.out.print(ii++%10);
			}
			System.out.println();
		}
	}
}
/*
 *****
 ****
 ***
 **
 *
 * 
  0 5 / 1 4 / 2 3 / 3 2 / 4 1 /
  
  0
  12
  345
  6789
  
  0
  12
  345
  6789
  01234
 
 */
