package day8_design_pattern;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;


//CUstom annotation

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation{
	public String hello() default "yms demo";
	public boolean isDone() default true;
	public String[] choices() default {"btech","mca"};
}

class MyDemo{
	@MyAnnotation(hello="yms champs", isDone = true)
	public void foofDemo() {
		System.out.println("foofDemo of MyDemo");
	}
}

//annotation procesing using java reflection
public class CustomAnnotation {

	public static void main(String[] args) throws ClassNotFoundException {
		Class class1=Class.forName("day8_design_pattern.MyDemo");
		
		Method []methods=class1.getDeclaredMethods();
		
		for(Method method: methods) {
			if(method.isAnnotationPresent(MyAnnotation.class)) {
				MyAnnotation annotation=method.getAnnotation(MyAnnotation.class);
				System.out.println(annotation.hello());
				System.out.println(annotation.isDone());
				System.out.println(annotation.choices());
			}
		}
	}
}








