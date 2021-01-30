package com.day11.exp;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno {
	public String foof() default "YMSLI freshers are champs";
	public boolean isDone() default false;
	public String[] myArr() default {"BTech","MCA"};
}
