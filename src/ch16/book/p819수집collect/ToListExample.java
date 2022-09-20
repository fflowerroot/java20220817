package ch16.book.p819수집collect;

import java.util.Arrays;
import java.util.List;

import exercise_fflowerroot.practice.q중앙학원.Student;

public class ToListExample {
	public static void main(String[] args) {
		List<Student> totalList = Arrays.asList(
				new Student("h",10,Student.Sex.MALE),
				new Student("k",6,Student.Sex.FEMALE),
				new Student("s",10,Student.Sex.MALE));
		
		List<Student> maleList = totalList.stream()
				.filter(s->s.getSex()==Student.Sex.MALE)
				.collect(Collctors.toList());
		maleList.stream()
			.forEach(s->System.out.println(s.getName));
		
	} 
	
}
