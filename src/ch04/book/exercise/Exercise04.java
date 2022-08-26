package ch04.book.exercise;

import java.util.Scanner;

public class Exercise04 {
	public static void main(String[] args) {
		while(true) {
//			Scanner sc= new Scanner(System.in);
//			int u= sc.nextInt();
			
			int c1 =(int)(Math.random()*6+1);
			int c2=(int)(Math.random()*6+1);
			System.out.println("("+c1+", "+c2+")");
			
			if(c1+c2==5) {
				break;
			}
		}
	}
}
