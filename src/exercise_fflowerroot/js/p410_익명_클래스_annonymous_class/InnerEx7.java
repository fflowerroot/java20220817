package exercise_fflowerroot.js.p410_익명_클래스_annonymous_class;

import java.awt.Button;
import java.awt.event.*;

public class InnerEx7 {
	public static void main(String[] args) {
		Button b = new Button("Start");
		b.addActionListener(new EventHandler()); // ?? 음.. 다형성을 필드에 적용하지 않고 매개변수에 적용한 이유는?? ..
//		System.out.println(b.addActionListener(new EventHandler()));
	}
}

class EventHandler implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("ActionEvent occurred!");
	}
}
