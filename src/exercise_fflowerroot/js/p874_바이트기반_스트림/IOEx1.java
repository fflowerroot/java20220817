package exercise_fflowerroot.js.p874_바이트기반_스트림;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class IOEx1 {
	// 바이트배열 데이터를 복사하는 예제. read()와 write()를 사용하는 가장 기본적인 방법.
	// ?? 바이트배열은 사용하는 자원이 메모리 밖에 없으므로 가비지컬렉터에 의해 자동으로 자원을 반환하므로 close()를 이용해서 스트림을 닫지 않아도 된다.
	// read()와 write(int b)를 사용하기 때문에 한번에 1byte만 읽고 쓰므로 작업효율 떨어짐.
	public static void main(String[] args) {
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc= null;
		ByteArrayInputStream input = new ByteArrayInputStream(inSrc);
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		
		int data=0;
		while((data= input.read())!=-1){
			output.write(data);
		}
		outSrc = output.toByteArray();
		System.out.println("inSrc : "+Arrays.toString(inSrc));
		System.out.println("outSrc : "+Arrays.toString(outSrc));
		
	}
}
