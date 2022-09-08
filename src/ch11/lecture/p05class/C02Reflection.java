package ch11.lecture.p05class;

import java.lang.*;
import java.lang.reflect.Field;

public class C02Reflection {
	public static void main(String[] args) {
		Class c = String.class;
		
		Field[] fields = c.getFields();
		
	}
}
