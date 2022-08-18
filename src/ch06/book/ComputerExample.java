package ch06.book;

public class ComputerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer com = new Computer();
		
		int[] i = {1,2,3,4,5,6,7,8,9};
		int result1 =  com.sum1(i);
		System.out.println(result1);
		
		int result2 = com.sum2(1,2,3,4,5);
		System.out.println(result2);
		
	}

}