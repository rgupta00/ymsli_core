package day8_design_pattern.creational;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

//https://stackoverflow.com/questions/15019306/regarding-static-holder-singleton-pattern

//static holder pattern?
class MySingleton2{
	private static class StaticHolder{
		public static MySingleton2 instance=new MySingleton2();
	}
	private MySingleton2() {}
	
	public  static MySingleton2 getMySingleton() {
		return StaticHolder.instance;
	}
}


class MySingleton implements Cloneable, Serializable{
	
	private static final long serialVersionUID = 8171991621564855274L;
	//Eager init
	//lazy init
	private volatile static MySingleton mySingleton;
	
	private MySingleton() {}
	
	//t1 t2
	public  static MySingleton getMySingleton() {
		if(mySingleton==null) {
			synchronized (MySingleton.class) {
				if(mySingleton==null)
				mySingleton=new MySingleton();
			}
		}
			
	return mySingleton;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		//throw new CloneNotSupportedException();
		return mySingleton;
	}
	
	//java : de-ser:hey java during de-ser if u find this method dont do de-ser simply call this method
	private Object readResolve() {
		return mySingleton;
	}
	
}
public class DemoSingleton {
	
	public static void main(String[] args) throws CloneNotSupportedException, FileNotFoundException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		MySingleton mySingleton=MySingleton.getMySingleton();
		System.out.println(mySingleton.hashCode());
		
		//What happens if somebody call java ref: private ctr
		
		Constructor[]constructors=mySingleton.getClass().getDeclaredConstructors();
		
		constructors[0].setAccessible(true);
		
		MySingleton newInstance = (MySingleton) constructors[0].newInstance();
		
		System.out.println(newInstance.hashCode());
		
		//What happens if somebody do clonning of it?
//		
//		MySingleton mySingleton2=(MySingleton) mySingleton.clone();
//		
//		System.out.println(mySingleton2.hashCode());
		
		//What happens if somebody do seril of it?
		//ser
		
//		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(new File("foo.ser")));
//		
//		oos.writeObject(mySingleton);
//		
//		//de-ser
//		ObjectInputStream ois=new ObjectInputStream(new FileInputStream(new File("foo.ser")));
//		
//		MySingleton mySingleton2=(MySingleton) ois.readObject();
//		
//		System.out.println(mySingleton2.hashCode());
		
	}
}







