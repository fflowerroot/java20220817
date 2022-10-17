package exercise_fflowerroot.js.p797_함수형_인터페이스_Functional_Interface;

public class 람다식연습 {
	public static void main(String[] args) {
		I2 i2=new I2() {
			public int max(int a, int b) {
				return a>b? a: b;
			}
		};
		System.out.println(i2.max(1, 0));
		
		I3 i3 = i-> System.out.println(i*10);
		i3.intC(1);
		//람다식 쓸 때 이런식으로 쓰면 인터페이스의 추상메서드 이름을 알아야하는데
		// 람다식을 매개변수로 쓰면 변수명을 몰라도 되지.. 
		// 그런데..... void이면 매개변수로 못쓰잖아?..
		
		System.out.println(s ->  );
	
	}
}
