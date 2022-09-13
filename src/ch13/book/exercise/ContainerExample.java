package ch13.book.exercise;

public class ContainerExample {
	public static void main(String[] args) {
		Container<String, String> c1 = new Container<String,String>();
		c1.set("hong","deaf");
		String name1 = c1.getKey();
		String job  = c1.getValue();
		
		Container<String, Integer> c2 = new Container<String, Integer>();
		c2.set("hong",35);
		String name2 = c2.getKey();
		int age =c2.getValue();
	}
}
class Container<Stirng,T>{
	
	String s;
	T t;
	
	public void set(String s, T t) {
		// TODO Auto-generated method stub
		this.s =s;
		this.t=t;
		
	}

	public String getKey() {
		// TODO Auto-generated method stub
		return s;
	}

	public T getValue() {
		// TODO Auto-generated method stub
		return t;
	}
	
}
