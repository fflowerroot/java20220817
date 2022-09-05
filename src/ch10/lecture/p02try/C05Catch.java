package ch10.lecture.p02try;

public class C05Catch {
	public static void main(String[] args) {
		String[]arr= {"100","200","삼백"};
		
		try {
		int a = Integer.parseInt(arr[0]);
		System.out.println(a*2);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("outofbounds..");
		}catch(NumberFormatException e) {
			System.out.println("numberformat..");
		}
		System.out.println("next..");
	}	
}
