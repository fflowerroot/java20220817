package exercise_fflowerroot.practice.내부클래스와_내부인터페이스_상속__인터페이스의_내부클래스__클래스의_내부인터페이스;

import java.util.ArrayList;
import java.util.Map;

public class 내부클래스_상속 {
	public static void main(String[] args) {
		A a= new A();
		a.equals(a);
		ArrayList ar=new ArrayList<>();
	}
}
class b{
	class d{
		int i =22;
	}
	int i=1;
}
class c extends b{
	
}
class e extends b.d{
	e(){
		new b().super();
	}
} //No enclosing instance of type b is available due to some intermediate constructor invocation
class A implements Map.Entry<String, Integer>{

	@Override
	public String getKey() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer getValue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer setValue(Integer value) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
