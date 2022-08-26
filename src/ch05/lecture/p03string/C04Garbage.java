package ch05.lecture.p03string;

public class C04Garbage {
	public static void main(String[] args) {
		// 객체가 있는데, 객체를 저장하는 참조변수가 없을 때
		// 	 그 객체는 쓰레기통에 버려짐
		
		int[]a= {1,2};
		a= new int[] {3,4};
		// 참조변수가 없는 객체는 사용할 수 있는 방법이 없다.
		//   왜냐하면 자바에서는 메모리를 건드릴 수 없기때문에.
		//    객체 {1,2}는 JVM의 Garbage collector에 의해 쓰레기통에 버려짐
		// 		결론은 c와 다르게 java는 직접 메모리 관리를 하지 않아도 된다.
	}
}
