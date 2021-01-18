package com.day6.session1.io_serilization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//Duck and pond
final class Duck implements Serializable{
	String color="while";
}

class Pond implements Serializable {
	String location = "green park";
	 Duck duck = new Duck();

}

public class DemoSerCompsition {

	public static void main(String[] args) {
		Pond p=new Pond();
		p.location="g p new delhi";
		p.duck.color="black";
		try {
			ObjectOutputStream oos = 
					new ObjectOutputStream(new FileOutputStream(new File("demo_in.ser")));
			oos.writeObject(p);
			System.out.println("object is written in the file");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
