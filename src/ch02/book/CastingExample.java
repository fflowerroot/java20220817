package ch02.book;

public class CastingExample {
	public static void main(String[] args) {
		int iV = 44032;
		char cV = (char)(iV);
		System.out.println(cV);
		
		iV = 555561155;
		cV = (char)(iV);
		System.out.println(cV);
		System.out.println((int)cV);
		
		iV = 1234567890;
		cV = (char)(iV);
		System.out.println(cV);
		System.out.println((int)cV);   
		/* 더 크다고 더 크게 변형되는게 아니라 이진수로 변형되고나서 
		   잘리는 거지..? */
		
		long l = 1234567890123456789L;
		iV = (int)l;
		System.out.println(iV); 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
		
	}

