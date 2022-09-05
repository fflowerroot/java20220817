package ch10.lecture.p02try;

public class C07Catch {
	public static void main(String[] args) {
		String[]arr= {"삼백"};
		
		try {
			int a = Integer.parseInt(arr[0]);
		}catch(Exception e) {
			System.out.println("exception..");			
//		}catch(ArrayIndexOutOfBoundsException e) {
			//Unreachable catch block for ArrayIndexOutOfBoundsException. It is already handled by the catch block for Exception
			System.out.println("ArrayIndexOutOfBoundsException..");
		}
	}
}
