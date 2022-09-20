package exercise_fflowerroot.js.p797_함수형_인터페이스_Functional_Interface;

public class 람다식 {  
		// 람다는 익명객체
	
	public static void main(String[] args) {
		I2 inter = new I2() {
			@Override
			public int max(int a, int b) {
				return a > b ? a : b;
			}
		}; // 익명클래스 구현해서 익명객체생성
		System.out.println(inter.max(1, 0));
		
		// 익명객체에서 함수이름을 빼버린 것이 람다라고 볼 수 있지.
		//   >>  함수이름을 뺄 수있었던이유 :
		//			  람다는 추상메서드가 1개인 인터페이스만 구현 가능함 
		//		      메서드가 1개니까 선언부를 자세히 쓸 필요가 없다. 안써도 그 메서드인줄 아니까.
		
		I2 inter2 = (int a, int b)-> a > b ? a : b;  //람다식으로 익명객체 생성후 람다객체가 구현한 인터페이스 참조변수에 저장
		
		System.out.println(inter2.max(11, 0)); // 람다객체가 구현한 인터페이스의 참조변수로 람다객체가 오버라이딩한 메서드 사용
	}
}


interface I2 {
	int max(int a, int b);
}




























