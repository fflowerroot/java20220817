package ch05.lecture.p04enum;

public class C01Enum {
	public static void main(String[] args) {
		MyEnum1 v1 = MyEnum1.CONSTANT_VALUE1;
		MyEnum1 v2 = MyEnum1.CONSTANT_VALUE2;
		System.out.println(v1);
		
		Enum e = v1;
		Object o = v1;
	}
}
