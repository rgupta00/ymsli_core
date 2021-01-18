package com.day6.session1.io_serilization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class A {
	int i = 1;
	
	public A() {
		System.out.println("ctr of a");
	}
}


/*
 * if base class is not ser... but drived class is ser.. and we are trying to ser the object
 *  of drived class... "instance control flow" in invoked
 */
class B extends A implements Serializable{
	int j = 3;
	public B() {
		super();
		System.out.println("ctr of b");
	}

}

public class DemoSerInher {

	public static void main(String[] args) {
		
		/*
		 * ctr of a
		ctr of b
		object is written in the file
		-------------------------------
		
		ctr of a
		1
		99

		 */
		B b=new B();
		
		b.i=66;
		b.j=99;// latest value of i and j is saved while ser... it must be recived while doing de-ser
		
		//ser
		try {
			ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(new File("demo_in.ser")));
			oos.writeObject(b);
			System.out.println("object is written in the file");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//dec
		
		try {
			ObjectInputStream ois=new ObjectInputStream(new FileInputStream(new File("demo_in.ser")));
			
			B b1=(B) ois.readObject();
			System.out.println(b1.i);
			System.out.println(b1.j);
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}






