package exercise_fflowerroot.js;

public class DefaultM_StaticM implements A {
	public static void main(String[] args) {
		A.sm();
//		A.dm();
		A a = new DefaultM_StaticM(); 
		a.dm();
		
		
	}
	
	@Override
	public void dm() {
	}

	@Override
	public void am() {
	}
//	@Override 
//	public static void sm() {   //The method sm() of type DefaultM_StaticM must override or implement a supertype method ....??
//		System.out.println("dd");
//	}
	
}
interface A{
	default void dm() {
		System.out.println("dm..");
	}
	static void sm() {
		System.out.println("sm..");
	}
	abstract void am();
	
}
