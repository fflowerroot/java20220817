package ch06.book.p269_어노테이션;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//public @interface PrintAnnotation {

	@Target({ElementType.METHOD})
	@Retention(RetentionPolicy.RUNTIME)
	public @interface PrintAnnotation{
		String value() default "-";
		int number() default 15;
	}

