package ch07.lecture.p02polymorphism.참조변수에따른_class멤버와_instance멤버의_사용;

public class CupExample {
	public static void main(String[] args) {
		// 참조변수 cup와 mug 모두 Mug인스턴스를 담고 있다.
		// 	 > 반대는 불가함.
		// 아래 코드의 결과는 ! 참조변수의 타입에 영향을 받지 않는 멤버(cv,cm,iv,im)는 iv밖에 없다!
		//   > 그러니까.. 참조변수에는 인스턴스의 주소값 뿐만아니라 어떤 참조변수의 타입도 저장되어있겠지.
		//		그러니까 참조변수타입에 영향을 받을수 있겠지?
		// !!! 결론 : 결국에 참조변수타입에 영향을 받지 않고 실제인스턴스의 것이 호출되는건..
		//		> '오버라이딩된! iv 뿐...이었음';;
		Cup cup = new Mug();
		cup.im(); // ?? Cup 멤버들을 다 없애니까..왜 인스턴스메서드호출까지 에러가 나지? >>오버라이딩되었을 경우에만.. 실제 인스턴스의  im을 호출하는거였어???....
		cup.cm();
		System.out.println(cup.iv);
		System.out.println(cup.cv);
		System.out.println();

		
		Mug mug = (Mug) cup;
		mug.im();
		mug.cm();
		System.out.println(mug.iv);
		System.out.println(mug.cv);
	}
}

class Cup {
	public static String cv = "Cup cv" ;
	public String iv = "Cup iv";

	public static void cm() {
		System.out.println("Cup cm...");
	}

	public void im() {
		System.out.println("Cup im..");
	}
}

class Mug extends Cup {
	public static String cv = "Mug cv" ;
	public String iv = "Mug iv";
	
	public static void cm() {
		System.out.println("Mug cm...");
	}

	public void im() {
		System.out.println("Mug im..");
	}
}
