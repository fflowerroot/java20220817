package ch06.book;

public class Television {
	static String company = "Samsung";
	static String model = "LCD";
	static String info;
	
	static {
		info = company + "-" + model;
	}  /* 초기화블럭은 왜 쓰지? 
		 이것저것 조합해서 써야하는데 일일이 쓰기 귀찮아서? 그냥 변수선언할 때 하면 안되나?
		
		*/
	
}
