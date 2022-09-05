package ch10.book.p429_예외_처리_코드;

//import jdk.internal.reflect.CallerSensitive;
//import jdk.internal.reflect.Reflection;

public class TryCatchFinallyExample {
	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("aa");
		}catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
	}
}
//@CallerSensitive
//public static Class<?> forName(String className)
//            throws ClassNotFoundException {
//    Class<?> caller = Reflection.getCallerClass();
//    return forName0(className, true, ClassLoader.getClassLoader(caller), caller);
//}
