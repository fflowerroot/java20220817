package ch15.lecture.p03map;

import java.util.HashMap;
import java.util.Map;

public class C04Equals {
	public static void main(String[] args) {
		// key는 equals메소드를 활용해서 같은지 확인
		Map<Book,Integer> map2 = new HashMap<Book, Integer>();
		map2.put("java", 10000);//?
		
	}
}
class Book{
	private String title;
	public Book(String title) {
		super();  //상속받았으면 상위클래스의 생성자를 호출해줘야함. 왜?
		this.title=title;		
	}
	
@Override
public String toString() {
	// TODO Auto-generated method stub
	return super.toString();
}
}
