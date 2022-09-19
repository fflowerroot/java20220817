package exercise_fflowerroot.js.p797_함수형_인터페이스_Functional_Interface;

public class LambdaEx1 {
	static void execute(Func f) {
		f.run();
	}
	static Func getFunc(){
		Func f = ()->System.out.println("getFunc실행중..");
		return f;
	}
	
	
	public static void main(String[] args) {
		Func f1 = ()->System.out.println("f1.run()");
		Func f2 = new Func() {
			public void run() {
				System.out.println("f2.run()");
			}
		};
		Func f3=getFunc();
		
		f1.run();
		f2.run();
		f3.run();
		execute(f1);
		execute(()->System.out.println("run()"));
		
	}
}

interface Func{
		void run();
	}


