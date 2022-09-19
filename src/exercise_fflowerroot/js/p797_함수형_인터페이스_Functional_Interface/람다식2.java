package exercise_fflowerroot.js.p797_함수형_인터페이스_Functional_Interface;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class 람다식2 {
	public static void main(String[] args) {
		List<String> l= Arrays.asList("abc","aaa","bbb","aaa");
		Collections.sort(l,new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s2.compareTo(s1);
			}
		}); 

	Collections.sort(l,(s1,s2)-> s2.compareTo(s1)); // 위와 같은 의미의 코드를 람다식으로 간단하게
	
	// 근데 무슨 메서드인지 이해가 안되네 ;
	}
}

//interface Comparator<T>{
//	int compare(T s1, T s2);
//}
