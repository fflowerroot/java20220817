package ch03.lecture.p2binary;

public class C02Arithmetic {
	public static void main(String[] args) {
		int i = 10_0000_0000;
		int j = 10_0000_0000;
		
		int k = i + j;
		System.out.println(k);
		
		k = k + i;
		System.out.println(k);
		
		long x = 10_0000_0000;
		long y = 10_0000_0000;
		long z = 2*x + y;
				
		System.out.println(z);
	}

}
