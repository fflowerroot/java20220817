package ch02.lecture;

public class C12String {

	public static void main(String[] args) {
		String a = "javascript";
		String b = "vscode";
		
		int x, y, i, j = x = y = i = 0;  //j도 초기화 된 것에 주목..
		
		//x=1;
		//i=1;
		y=1;
		j=1;
		String c = a.substring(x,y);
		String d =b.substring(i,j);
		System.out.println(c+d);

	}

}
