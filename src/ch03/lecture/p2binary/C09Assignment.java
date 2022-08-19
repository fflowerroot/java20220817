package ch03.lecture.p2binary;

public class C09Assignment {
	public static void main(String[] args) {
		/*	대입연산자는 오른쪽>왼쪽 방향으로 연산된다 */
		
		int i = 1;
		
		System.out.println(i *= 3);
		System.out.println(i %= 3);
		System.out.println(i += 3);
		System.out.println(i /= 3);
		System.out.println(i &= 3);
		System.out.println(i = i&3);
		boolean j = true;
		System.out.println(j &= false);
		System.out.println(j |= true);
		System.out.println(j ^= false);
		
		
		
	}
}
