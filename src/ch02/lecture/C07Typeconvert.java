package ch02.lecture;

public class C07Typeconvert {
	/* 자동형변환 :  '작은것 >> 큰것' 은 자동으로 됨
	 - 근데.. 예외적으로? long은 float으로 자동형변환 됨
	 - 자동형변환 안되면 강제형변환 하면됨 
	 
	 기본형끼리의 형변환은 다(?) 되고, 참조형과 기본형간의 형변환은 안됨
	 */
	
	public static void main(String[] args) {
		float a = 1234567890123456789L;
		System.out.println(a); //(가능.. 왜 가능한거지? 값 손실되는데..?) 
		
	};
	
}
