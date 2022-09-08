package exercise_fflowerroot.baekjoon;

public class N25083_새싹 {

public static void main(String[] args) {
//	System.out.println(
String a =
	"         ,r'\"7\r\n"
			+ "r`-_   ,'  ,/\r\n"
			+ " \\. \". L_r'\r\n"
			+ "   `~\\/\r\n"
			+ "      |\r\n"
			+ "      |\r\n"
			;
System.out.println(a);
	
	String s = "         ,r'\"7\n" + 	// \", \n 이 제어문자다.
	   "r`-_   ,'  ,/\n" + 		// \n 이 제어문자다.
	   " \\. \". L_r'\n" + 		// \\, \", \n 이 제어문자다.
	   "   `~\\/\n" + 			// \\, \n 이 제어문자다.
	   "      |\n" + 			// \n 이 제어문자다.
	   "      |";

System.out.print(s);

}
}
//	public class Main {
//		public static void main(String[] args) {
//			String s = "         ,r'\"7\n" + 	// \", \n 이 제어문자다.
//					   "r`-_   ,'  ,/\n" + 		// \n 이 제어문자다.
//					   " \\. \". L_r'\n" + 		// \\, \", \n 이 제어문자다.
//					   "   `~\\/\n" + 			// \\, \n 이 제어문자다.
//					   "      |\n" + 			// \n 이 제어문자다.
//					   "      |";
//	 
//			System.out.print(s);
//		}
//	}
