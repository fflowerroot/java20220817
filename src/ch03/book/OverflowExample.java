package ch03.book;

public class OverflowExample {
	public static void main(String[] args) {
		int x, y = x = 1000000;
		int z = x * y;
		System.out.println(z);
		z = x * y * x * y * x ;
		System.out.println(z);
		
		long w = 100000000;
		System.out.println(w * w * w * w * w * w); 
		System.out.println(w * w * w * w * w * w * w); 
		System.out.println(w * w * w * w * w * w * w * w * w); 
		
		long v  = 100000000;
		//System.out.println(v*10e2000); 
		/*Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
		The literal 10e2000 of type double is out of range */
		
	}
}
