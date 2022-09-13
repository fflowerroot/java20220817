package ch13.lecture.p02inherit;

public class C01Generic {
	public static void main(String[] args) {

	}
}

class C1<T> {
}

//하위 타입의 타입 파라미터 갯수는 상위 타입과 같거나 많게
class C2<T> extends C1<T> {

}

class C3<T, U> extends C1<T> {

}

// 상위 타입의 타입 파라미터 명시 가능
class C4 extends C1<String> {

}
