package day8_design_pattern;

import java.lang.invoke.ConstantCallSite;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class DemoReflection {
	
	public static void main(String[] args) throws ClassNotFoundException, 
	InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
	
		Class class1=Class.forName("day8_design_pattern.Foo");
		
		Constructor []constructors=class1.getDeclaredConstructors();
		constructors[0].setAccessible(true);
		Foo newInstance = (Foo) constructors[0].newInstance();
		
		
		//Emp emp=new Emp();
		
		//1
		//Class class1=Class.forName("day8_design_pattern.Emp");
		
		//2
//		Emp emp=new Emp();
//		Class clazz=emp.getClass();
		
		//3
		//Class class1=Emp.class.getClass();
		
//		
//		Constructor[]constructors=class1.getDeclaredConstructors();
//		for(Constructor constructor: constructors) {
//			System.out.println(constructor.getModifiers());
//		}
//		
//		Method[] methods = class1.getDeclaredMethods();
//		
//		for(Method method: methods) {
//			System.out.print(method.getName()+" : ");
//			System.out.print(Modifier.toString(method.getModifiers())+" : ");
//			System.out.print(method.getReturnType()+" : ");
//			System.out.println(method.getParameterCount()+" : ");
//			
//			
//		}
//		
	}

}
