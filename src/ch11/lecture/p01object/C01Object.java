package ch11.lecture.p01object;

import java.util.Scanner;

public class C01Object {
	// object는 모든 클래스의 상위 클래스
	Object o1 = "topgun";
	Object o2 = new Scanner("jave");
	Object o3 = new ArrayIndexOutOfBoundsException();
	Object o4= new String[] {"a","b"};
	
	// 심지어 기본 타입도 대입 가능 !
	Object o5 = 1;
	Object o6 = true;
	Object o7 = 'c';
	
	Object[]o8 = { "gg", new int[] {1,2}, new ArrayIndexOutOfBoundsException(),1,true,'c'};
}
