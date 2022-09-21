package exercise_fflowerroot.js.p874_바이트기반_스트림;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class IOEx2 {
	//byte[](바구니)을 이용하면 한 번에 더 많은 물건을 옮길 수 있다.
	// 10바이트를 읽어왔지만 output에 출력할 때는 temp[5]부터 5바이트만 출력함.
	// 배열을 이용한 입출력은 작업의 효율을 증가시키므로 가능하면 입출력 대상에 따라 알맞은 크기의 배열을 사용하는 것이 좋다.
	public static void main(String[] args) {
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9}; 
		byte[] outSrc= null;
		byte[] temp = new byte[10];
		ByteArrayInputStream input = new ByteArrayInputStream(inSrc);
		ByteArrayOutputStream output = new ByteArrayOutputStream(); // 적을 파일이름 안적었네
		
		input.read(temp,0,temp.length); //(인풋스트림으로 당겨와서) 읽어와서 배열에 담았다가
		output.write(temp,5,5);// (아웃풋스트림으로 내보냄) 배열에 있는 것을 씀 // ?? 어디다 씀?? 아웃풋스트림이 가지고 있는건가?..
		outSrc = output.toByteArray(); // 아웃풋스트림 생성자 매개변수에 소스안적어줘서 지금 저장해주나봐.
		
		System.out.println("in src : " + Arrays.toString(inSrc));
		System.out.println("temp   : " + Arrays.toString(temp));
		System.out.println("outSrc : " + Arrays.toString(outSrc));
		
	}
}
