package exercise_fflowerroot.js.p367_매개변수의_다형성;

public class PrintStream {
	public void print(Object obj) {
//		write(String.valueOf(obj)); // 다른 패키지의  PrintStream  클래스에는 write메서드가 정의되어있나보지?
	}
	public static String valueOf(Object obj) {
		return (obj==null)? "null":obj.toString();
	}
}
