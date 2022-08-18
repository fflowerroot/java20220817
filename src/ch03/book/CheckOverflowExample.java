package ch03.book;

public class CheckOverflowExample {
	public static void main(String[] args) {
		try {
			int r = safeAdd(2000000000, 200000000);
			System.out.println(r);
		}catch(ArithmeticException e){
			System.out.println("overflow!!");
		}  
	}
		
		
	
	public static int safeAdd(int left, int right) {
		if(right > 0) {
			//if((left + right) > Integer.MAX_VALUE) {
			if(left  > Integer.MAX_VALUE - right) {
				throw new ArithmeticException("overflow!!");
			}
		}else {
//			if((left + right) < Integer.MIN_VALUE) {
			if(left  < Integer.MIN_VALUE - right) {
				throw new ArithmeticException("overlow!!");
			}
		}
		return left + right;
	}
}
