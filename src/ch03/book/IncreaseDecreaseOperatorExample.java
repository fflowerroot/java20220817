package ch03.book;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("-------------------");
		x++;
		++x;
		System.out.println(+x);
		System.out.println("-------------------");
		y--;
		--y;
		System.out.println(y);
		System.out.println("-------------------");
		z= x++;
		System.out.println(z);
		System.out.println(x);
		System.out.println("-------------------");
		z = ++x;
		System.out.println(z);
		System.out.println(x);
		System.out.println("-------------------");
		z = ++x + y++;
		System.out.println(z);
		System.out.println(x);
		System.out.println(y);
		System.out.println("---------------------------------------");
		
		
		int m = 10;
		int n = 10;
		int o = --m;
		int p = n--;
		System.out.println(m);
		System.out.println(n);
		System.out.println(o);
		System.out.println(p);
		System.out.println("-------------------");
		int aa = 10;
		aa--;
		System.out.println(aa);
		System.out.println("-------------------");
		int bb = 10;
		System.out.println(bb--);
		System.out.println(bb--);
		System.out.println(--bb);
		
	}

}
