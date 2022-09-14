package exercise_fflowerroot.js.p410_익명_클래스_annonymous_class;

public class InnerEx6 {
	Object iv =new Object() { void m(){} };
	static Object cv =new Object() {  void m() {}  };
	
	void m() {
		Object lv = new Object() { void m() {}  };
	}
}
