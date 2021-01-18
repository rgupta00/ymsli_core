package com.day6.session1.char_byte;
import java.io.*;
public class DemoIO2 {
	
	public static void main(String[] args) throws IOException{
		FileInputStream fr=new FileInputStream("ali.jpeg");
		FileOutputStream fw=new FileOutputStream("ali_v2.jpeg");
		int i=0;
		while((i=fr.read())!=-1) {
			fw.write(i);
		}
		
		fw.flush();
		fw.close();
		fr.close();
		System.out.println("file copied...");
				
	}

}
