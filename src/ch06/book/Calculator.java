package ch06.book;

public class Calculator {

	int plus(int x, int y) {
		return x + y;
	}
	
	void powerOn() {
		System.out.println("Power on");
	}
	
	double avg(int x, int y) {
		double sum = plus(x,y); //아니! im인데 인스턴스 안만들어도 함수 사용가능 하잖아?
		return sum/2;
	}
	
	void execute() {
		double result = avg(7,10);
		println("결과는" + result);
	}
	void println(String message) {
		System.out.println(message);
	}
	
	int ddd = plus(1,2);
	//plus(1,2); 
	/* 아니 왜 위에코드는 되고 이건 안돼? 
	클래스영역에서는 iv,cv , im, cm 만 쓸 수 있어서 그런가? 
	>>>>>> ! 클래스 영역에서 호출한한수는 영원히 실행될 일이 없기 때문이야..
	
	정리해보자면.. 클래스영역에서는 안되고 함수 내에서 함수 호출 가능한데,
	메인메서드에서 호출하려면 같은 클래스 내부라도 static이 아니면 인스턴스 생성해야하고
	같은 클래스 내부의 메서드에서 호출하면 그냥 메서드이름()으로 호출 가능해.
	*/
	
//	Calculator myCalc = new Calculator();
//	myCalc.execute();  // 사용할 클래스에 에러가 있으니까 , 다른 클래스에서 에러없는 함수를 호출해도 
						// 에러가 남.....
	
}
