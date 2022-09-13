package ch13.lecture.p03bound;

public class C01Bound {
	public static void main(String[] args) {
//		C2<Object> o1 = new C2<>();
		C2<Number> o1= new C2();
		C2<Number> o2= new C2<>();
		
		
	}
}
class C1<T>{
	public void m1(T p) {
//		p.doubleValue();
	}
}

// bounded type parameter 제한된 타입 파라미터
class C2<T extends Number>{
	
}
