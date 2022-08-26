package ch05.lecture.p02reference;

public class C03Reference {
	public static void main(String[] args) {
	//	a= new int[] {4,5,6};
		
		int[] a=new int[] {1,2,3};
		int[]b=a;
		a= new int[] {4,5,6};
		System.out.println(b[0]);
		
		int[] c=new int[] {1,2,3};
		int[]d=c;
		c= {4,5,6}; // ???? >> Array constants can only be used in initializers
		System.out.println(b[0]);
	}
}
