package ch04.lecture.p01control;

public class C09For {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= 1; j--) {
				System.out.print(j);
			}
		}
		System.out.println();

		for (int i = 0; i < 5; i++) {
			for (int j = 4; j >= 0; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("========");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		
//		int i;
//		int j;
//		
//		for (i = 0; i <=6; i=i+j) {
//			for (j = i; j <= i+j; i=i+ (++j)) {   //1+
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
		for (int i = 5; i >= 1; i--) {
			for(int k= 0;k<i;k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
				
			}
			
			System.out.println();
		}
		
		for (int i = 1; i <= 5; i++) {
			for(int k= 0;k<i;k++) {
				System.out.print(" ");
			}
			for (int j = 5; j <= i; j) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		

		
		
	}
}
