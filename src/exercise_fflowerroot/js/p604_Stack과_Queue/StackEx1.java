package exercise_fflowerroot.js.p604_Stack과_Queue;

import java.util.Stack;

public class StackEx1 {//static m 7개( 1개는 main)
	public static Stack back = new Stack();
	public static Stack forward = new Stack();  //Stack 객체 2개 생성
	
	public static void main (String[] args) {
		goURL("1.nate");
		goURL("2.yahoo");
		goURL("3.naver");
		goURL("4.daum");
		
		printStatus();
		
		goBack();
		printStatus();
		
		goBack();
		printStatus();
		
		goForward();
		printStatus();
		
		goURL("codechobo.com");
		printStatus();
	}
	
	public static void printStatus() {
		System.out.println("back:"+back);
		System.out.println("forward:"+forward);
		System.out.println("Current screen is "+back.peek());
		System.out.println();
	}
	
	public static void goURL(String url) {
		back.push(url);
		if(!forward.empty()) forward.clear();		
	}
	public static void goForward() {
		if(!forward.empty()) back.push(forward.pop());
	}
	public static void goBack() {
		if(!back.empty()) forward.push(back.pop());
	}
	
}
class c{
	
}
//interface i implements c{ //Syntax error on token "implements", extends expected
//	
//}
//interface i extends c{//The type c cannot be a superinterface of i; a superinterface must be an interface !!
//	
//}


















