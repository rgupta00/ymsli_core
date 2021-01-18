package com.day6.session1.io_serilization;
import java.io.*;
public class DemoSeri {

	public static void main(String[] args) {
		  Account account=new Account(12, "rajiv", 500);
		   account.setBankName("sbi");
		   account.setPassword("foo123");
		 System.out.println(account);
		  
		//ObjectOutPutStream ----> FileOutputStream-- > file
		//ser
		try {
			ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(new File("demo.ser")));
			
			oos.writeObject(account);
			
			System.out.println("object is written in the file");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
