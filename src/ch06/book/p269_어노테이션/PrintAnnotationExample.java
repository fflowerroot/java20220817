package ch06.book.p269_어노테이션;

import com.sun.jdi.Method;

public class PrintAnnotationExample {
	public static void main(String[] args) {
		Method[] declareMethods = Service.class.getDeclaredMethods();
		for(Method m : declareMethods) {
			if(m.isAnnotationPresent(PrintAnnotation.class))
		}
	}
}
