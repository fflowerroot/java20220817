package exercise_fflowerroot.baekjoon;

import java.util.Scanner;

public class n2525 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		Scanner sc=new Scanner();//The constructor Scanner() is undefined
		int h = sc.nextInt();
		int m = sc.nextInt();
		int cookingTime = sc.nextInt();
		int t= m+cookingTime ;
		if(t<60) {System.out.println(h+" "+t);}
		else System.out.println(t/60+h>=24? t/60+h-24 +" "+t%60
				:t/60+h+" "+t%60) ;
		
	}
}
