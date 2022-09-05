package ch10.lecture.p06message;

public class C01Message {
	public static void main(String[] args) {
		System.out.println("main..");
		m1();
		System.out.println("main....");
	}
	private static void m1() {
		System.out.println("m1..");
		try {
			m2();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}
		System.out.println("m1....");
		
	}
	private static void m2() throws Exception {
		throw new Exception("예외 발생 원인은..");
	}
}
