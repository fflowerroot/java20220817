package exercise_fflowerroot._20220829;

import ch07.book.Parent;

public class BindingTest {
	public static void main(String[] args) {
		Parent p = new Child();
		Child c = new Child();
		
		System.out.println("p.x = "+p.x);
		p.method2();
		
				
	}
}
