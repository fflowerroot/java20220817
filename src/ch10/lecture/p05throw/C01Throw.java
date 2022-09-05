package ch10.lecture.p05throw;


// 	'throws'   vs 	 'throw'
// 
// 		throw는 예외를 최초로 발생시키는 코드이다.
//		
public class C01Throw {
	public static void main(String[] args) {
		m1();
		System.out.println("next..");
	}
	private static void m1() {
		System.out.println("code1..");
		System.out.println("code2..");
		
		//  throw Exception (예외 발생)
		throw new RuntimeException();  // 인스턴스를 생성해서 던짐.
		                               // runtime예외라서 컨파일에러 안남. 
	}
}
