package ch03.lecture.p3ternary;

public class C01Ternary {
	public static void main(String[] args) {
		/* 삼항연산자 		? :
		  	1항 ? 2항 : 3항
		  	연산결과는 1항이 true이면 2항
		  			   1항이 flase면 3항	*/
		
		System.out.println(true? 3:2);
		System.out.println(false? 3:2);
	}
}
