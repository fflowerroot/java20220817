package ch07.book.p304_305;

public class B {
	A a = new A();
	a.field = "value";  //Syntax error on token "field", VariableDeclaratorId expected after this token
	a.m(); //Syntax error on token "m", Identifier expected after this token
	
	public void m() {
		A a = new A();
		a.field = "value";
		a.m();
		
	}
	
}
