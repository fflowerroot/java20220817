package ch04.lecture.p01control;

public class C08For {
	//이중for문을 쓰지않고 해결할 수 있으면 그렇게 해라. 그게 더 좋대. 
	//이중for문은 기하급수적으로 늘어나는 방식이고, for문을 병렬로 연결하면 산술급수적으로 늘어나니까..
	public static void main(String[] args) {
		int a=44;
		int b=4;
		String line="";
        for(int i=0; i<a; i++){
            line+="*";
        }
        for(int i =0; i<b;i++){
            System.out.println(line);
        }
        System.out.println();
        
        for(int i =0;i<b;i++) {
        	for(int j=0;j<a;j++) {
        		System.out.print("*");
        	}
        	System.out.println();
        }
        		
        
        
	}

}
