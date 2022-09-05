package ch10.lecture.p02try;

public class C06Catch {
	public static void main(String[] args) {
		try {
			int a = 3/0;
//		}catch(Object e) { //No exception of type Object can be thrown; an exception type must be a subclass of Throwable
//			System.out.println("exception..");
		}catch(Throwable e) {  //Throwable class 부터 되네..
			System.out.println("exception..");
		}
	}
}
