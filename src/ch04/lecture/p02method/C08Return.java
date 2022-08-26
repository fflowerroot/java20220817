package ch04.lecture.p02method;

public class C08Return {
	// 힌트얻기 단축키로 변수명 한번에 rename하는 방법  :  변수명 클릭 후 ctrl + 1  > rename 
	// 그 외에 Ctrl + 1 로 여러가지 힌트를 얻고, 함수 생성등의 일을 할 수 도 있다.
	public static void main(String[] args) {
		long a = sum(1, 10);
		System.out.println(a);
		long b = sum(1, 100);
		System.out.println(b);
		long c = sum(50, 200);
		System.out.println(c);
	}
	long s = 0;
	// C08Return r=new C08Return(); // 클래스영역에서 인스턴스를 생성하니까 StackOverflow가 뜨네..?
	public static long sum(long a, long b) {
		C08Return r=new C08Return();
	//	long s = 0;
		for (long i = a; i <= b; i++) {
			r.s += i;
		}
		return r.s;

	}
}
