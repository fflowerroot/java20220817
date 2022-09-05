package ch10.lecture.p05throw;

public class C02Throw {
	public static void main(String[] args) throws Exception {
		m1();
	}
	private static void m1() throws Exception {
		throw new Exception(); // 런타임 예외가 아닌 일반 예외이므로 try/catch나 throws 키워드 이용하여 처리해야함.
	}
}
