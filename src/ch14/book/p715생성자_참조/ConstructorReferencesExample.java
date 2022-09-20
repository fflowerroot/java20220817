package ch14.book.p715생성자_참조;

import java.util.function.BiFunction;
import java.util.function.Function;



public class ConstructorReferencesExample {
	public static void main(String[] args) {
		Function<String,Member> f1=Member::new;
		Member m1=f1.apply("ange1");
		
		BiFunction<String, String,Member> f2=Member::new;
		Member m2=f2.apply("신천사", "angel");
		
	}
}

class Member{
	private String name;
	private String id;
	
	Member(){
		System.out.println("Member()..");
	}
	Member(String id){
		this.id=id;
	}
	Member(String name, String id){
		this.name=id;
		this.id=id;
	}
	String getId() { return id;}
	
}