package ch16.lecture.p02.stream;

import java.util.Arrays;

public class C15MethodReference {
	public static void main(String[] args) {
		String[]a1= {"f","a","b","c","d","e"};
		
		Arrays.sort(a1);
		
		//설명을 위해서 sort메서드의 내츄럴 오더기능을 풀어씀
		Arrays.sort(a1,(a,b)->a.compareTo(b));
		Arrays.sort(a1,String::compareTo); //위의 코드를 메서드reference로 대체
		
		System.out.println(Arrays.toString(a1));
		
		
		Arrays.sort(a1,(a,b)->b.compareTo(a));
		System.out.println(Arrays.toString(a1));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	} 
	
}
