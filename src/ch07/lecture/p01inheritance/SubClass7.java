package ch07.lecture.p01inheritance;

public class SubClass7 extends SuperClass7{
	public SubClass7() {
//		super(); // 이 코드는 필수임. 생략하면 컴파일러가 자동삽입함.
//  	super()생성자가 자동삽입되지 않는경우는 알맞는 생성자를 직접 작성해줘야함.
		//   >> mplicit super constructor SuperClass7() is undefined. Must explicitly invoke another constructor
		
		super(1);

//		SuperClass7();  // 안되네
	}
}
