package ch07.book.p325_226_강제_타입_변환_Casting;

public class ChildExample {
	public static void main(String[] args) {
		Parent parent = new Child();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		paren.field2 = "data2";
		parent.method3();
		
		Child child = (Child)parent;
		child.field2 ="yyy";
		child.method3();
	}
}
