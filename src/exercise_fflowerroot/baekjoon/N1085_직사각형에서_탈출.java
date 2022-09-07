package exercise_fflowerroot.baekjoon;

import java.util.*;

class N1085_직사각형에서_탈출 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();

		int xmin = x > w - x ? w - x : x;
		int ymin = y > h - y ? h - y : y;
		System.out.println(xmin > ymin ? ymin : xmin);
		
		 xmin = x > y ? y : x;
		 ymin = w-x > h - y ? h - y : w-x;
		System.out.println(xmin > ymin ? ymin : xmin);
		
		 xmin = x > h - y ? h - y : x;
		 ymin = y >  w - x ? w - x : y;
		System.out.println(xmin > ymin ? ymin : xmin);
	}
}

// ??  이걸  if문으로 바꾸려면??
// > if문을 병렬로 3번 써야하는건가..?
// 트리모양으로 보면 총 3번비교해야 할 것 같음..







