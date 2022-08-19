package ch03.lecture.p2binary;

public class C08ShortCircuit {
	public static void main(String[] args) {
		/* 	Short circuit
		  		&&와 ||에서 발생 
		  		앞조건만 판단해도 결과가 나는 경우 뒷조건까지 가지 않는 것	*/
		
		int i = 3;
		if (i<0  &&  i>-5) { //Shotr circuit발생(앞 조건이 false이기 때문에 뒷 조건은 판단조차 안함) 
			System.out.println("...");
		}
		
		if( i++<0  &&  i++>-5) {	
		}
		System.out.println(i);
		
		if( i++<0  ||  i++>-5) {
			System.out.println("...");
		}
		System.out.println(i);
		
		if( i++<0  &  i++>-5) {	
		}
		System.out.println(i);
	}
}
