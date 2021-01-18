package com.day6.session1.io_serilization;
import java.io.*;
public class DemoDeSer {
	
	public static void main(String[] args) {
		try {
			ObjectInputStream ois=new ObjectInputStream(new FileInputStream(new File("demo.ser")));
			
			Account account=(Account) ois.readObject();
			System.out.println(account);
			
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
