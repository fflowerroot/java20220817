package ch11.lecture.p01object;

public class C02Equals {
	public static void main(String[] args) {
		Object o1 = new Object();
		Object o2 = new Object();
		Object o3 = "ss";
		Object o4 = "ss";
		Object o5 = "aa";
		System.out.println(o1.equals(o2));
		System.out.println("ss".equals(o2));
		System.out.println("ss".equals(o3));
		System.out.println("ss".equals("ss"));
		System.out.println(o4.equals(o3));     
		   // String class 에서 Object class의 equals메서드를 오버라이딩했음. 호출 하면 실제 인스턴스의 메서드가 호출됨
		



	}
}
