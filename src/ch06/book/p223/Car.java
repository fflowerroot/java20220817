package ch06.book.p223;

public class Car {
	int gas;
	
	void setGas(int gas) {
		this.gas = gas;
	}
	boolean isLeftGas() {
		if(gas==0) {
			System.out.println("gas :  0");
			return false;
		}
		System.out.println("gas :  not 0");
		return true;
	}
	
	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("gas : "+ gas);
				gas-=1;
			}else {
				System.out.println("stop");
				return ;    //void 메서드에도 return 키워드 사용가능
			}
		}
	}
	
	void needToInject() {
		if(this.isLeftGas()) {
			System.out.println("No need to inject gas.");
		}else {
			System.out.println("Ingect gas.");
		}
	}
}
