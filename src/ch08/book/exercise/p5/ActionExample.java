package ch08.book.exercise.p5;
//	 
public class ActionExample {
	public static void main(String[] args) {
		
		
		Action action = new Action() {
			@Override
			public void work() {
				System.out.println("working..");} };
		
				
		
		action.work();
	}

}


