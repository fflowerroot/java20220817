package exercise_fflowerroot.js.p874_바이트기반_스트림;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class IOEx3 {
	public static void main(String[] args) {
		byte[] inSrc = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 }; // 읽어올 바이트 배열
		byte[] outSrc = null;// 출력할 곳
		byte[] temp = new byte[4];// 바구니
		ByteArrayInputStream inStream = new ByteArrayInputStream(inSrc);// 읽어올 수 있게 해주는 인풋스트림 // 생성할 때 읽어올 소스 매개변수로 넣었음.
		ByteArrayOutputStream outStream = new ByteArrayOutputStream();// 내보낼 수 있게 해주는 아웃풋스트림

		while (inStream.available() > 0) {
			try {
				inStream.read(temp); // 0123 4567 "8967" // 주의!
				outStream.write(temp);// 0123 4567 "8967"
				outSrc = outStream.toByteArray();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Arrays.toString(outSrc));
		}
		
		// ========원하는 결과가 나오게 하려고 작성한 코드=========
		System.out.println(" ========원하는 결과가 나오게 하려고 작성한 코드=========");
		byte[] inSrc2 = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 }; // 읽어올 바이트 배열
		byte[] outSrc2 = null;// 출력할 곳
		byte[] temp2 = new byte[4];// 바구니
		ByteArrayInputStream inStream2 = new ByteArrayInputStream(inSrc2);// 읽어올 수 있게 해주는 인풋스트림 // 생성할 때 읽어올 소스 매개변수로 넣었음.
		ByteArrayOutputStream outStream2 = new ByteArrayOutputStream();// 내보낼 수 있게 해주는 아웃풋스트림
		while (inStream2.available() > 0) {
			
			try {
				int len=
						inStream2.read(temp2); // 0123 4567 "8967" // 주의!
				outStream2.write(temp2,0,len);// 0123 4567 "8967"
				outSrc2 = outStream2.toByteArray();
				System.out.println(Arrays.toString(outSrc2));
				System.out.println("len:"+len);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println(" ========원하는 결과가 나오게 하려고 작성한 코드였는데.. -1은 어디서 나온거?=========");
		byte[] inSrc3 = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 }; // 읽어올 바이트 배열
		byte[] outSrc3 = null;// 출력할 곳
		byte[] temp3 = new byte[4];// 바구니
		ByteArrayInputStream inStream3 = new ByteArrayInputStream(inSrc3);// 읽어올 수 있게 해주는 인풋스트림 // 생성할 때 읽어올 소스 매개변수로 넣었음.
		ByteArrayOutputStream outStream3 = new ByteArrayOutputStream();// 내보낼 수 있게 해주는 아웃풋스트림

		while (inStream3.available() > 0) {
//			len:4
//			[4]
//			len:4
//			[4, 4]
//			len:2
//			[4, 4, 2]
//----------------------------- 왜 결과가 다르지? len에 저장했다가 쓰는거랑, 바로 쓰는거랑...
			// >>>>아... 한번 쓸 때마다 자원이 소모가 되는구나.  len저장할 때 한 번, 바로 저장할 때 또 한 번..
			//        그리고 요소가 더이상 없어서 read가 -1반환..
//			len:4
//			[4]
//			len:2
//			[4, -1]


		
			try {
				int len=inStream3.read(temp3); // 0123 4567 "8967" // 주의!
				System.out.println("len:"+len);
				outStream3.write(inStream3.read(temp3));// 0123 4567 "8967"
			//	outStream3.write(len);// 0123 4567 "8967"
				outSrc3 = outStream3.toByteArray();
				System.out.println(Arrays.toString(outSrc3));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
