package com.day6.session1.char_byte;
import java.io.*;
public class DemoIO {
	
	//file copy
	public static void main(String[] args) throws IOException{
		FileReader fr=new FileReader("ali.jpeg");
		FileWriter fw=new FileWriter("ali_temp.jpeg");
		int i=0;
		while((i=fr.read())!=-1) {
			fw.write(i);
		}
		
		fw.flush();// it force data to the file from the stream
		
		fw.close();
		fr.close();
		System.out.println("file copied...");
				
	}

}
