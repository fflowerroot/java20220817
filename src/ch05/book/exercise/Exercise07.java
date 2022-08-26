package ch05.book.exercise;

public class Exercise07 {
	public static void main(String[] args) {
		
		int max=0;
		int[] array = { 1, 5, 3, 8, 2 };
		int min=array[0];
//		int min =Integer.MAX_VALUE;
		
		for(int i=0; i<array.length;i++) {
			if(array[i]>max) {
			 max=array[i];
			}
		}

		System.out.println(max);
		
		for(int i=0; i<array.length;i++) {
			if(array[i]<min) {
			min=array[i];
			}
		}

		System.out.println(min);
	}

//	static int myMax(int[]a) {
//		int max = 0;
//		for(int i=0; i<a.length-1;i++) {
//			if(a[i]>=a[i+1]) {
//				max=a[i];
//			}else {
//				max=a[i+1];
//			}
//		}
		
	}

class B{
	
}
