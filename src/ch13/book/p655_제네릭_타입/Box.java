package ch13.book.p655_제네릭_타입;

public class Box {
	private Object object;
	public void set(Object object) {
		this.object=object;
	}
	public Object get() {
		return object;
	}
	
}

class Apple{
}

class BoxExample{
	public static void main(String[] args) {
		Box box=new Box();
		box.set("hong");
	}
}
