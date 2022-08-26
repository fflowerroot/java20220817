package ch07.book;

public class StudentExample {
	public static void main(String[] args) {
		Student student = new Student("Seo","123456-1234567", 22);
		System.out.println(student.name+", "+student.ssn+", "+student.studentNo);
	}
}
