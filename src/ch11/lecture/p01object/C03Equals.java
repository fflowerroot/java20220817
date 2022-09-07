package ch11.lecture.p01object;

public class C03Equals {
	public static void main(String[] args) {
		Book b = new Book(222);
		Book bb = new Book(111);
		
		System.out.println(b.code);
		System.out.println(bb.code);
		
		System.out.println(System.identityHashCode(bb));
		System.out.println(System.identityHashCode(b));
		
		System.out.println(b.equals(bb));
		System.out.println(b.equals(b));
	}
}
class Book extends Object { 
 int code;
	Book(){
		
	}
	Book(int code){
		this.code = code;
	}
	
	// 직접 equals메서드 재정의. 
	// equals 매서드 재정의 할 때 해시코드메서드도 변경해서 해시코드값도 같게 해줘야한대..(특별한 이유가 없으면)
	// 보통 해시코드는 참조값임. /> 아닌 경우도 있음! 예를들어 String의 해시코드는 참조값이 아니라 문자열 각 char값에 특정 숫자를 곱한 값이 해시코드이므로 내용이 같으면 같은 해시코드 값이 나온다! 
	@Override
	public boolean equals(Object obj) { 
		// TODO Auto-generated method stub
		if(obj instanceof Book) {
			Book o = (Book)obj;
			if(obj !=null) {
			return this.code==o.code;
			}
		}
		
		return super.equals(obj);
	}
	
	@Override
		public int hashCode() {
			// TODO Auto-generated method stub
			return code;
		}
};






















