package com.day8.session1.prop;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DemoPropFile {

	public static void main(String[] args) throws IOException {
		//InputStream inputStream=new FileInputStream(new File("db.properties"));
		InputStream inputStream=DemoPropFile.class.getClassLoader().getResourceAsStream("db.properties");
		Properties properties=new Properties();
		properties.load(inputStream);
		
		System.out.println(properties.getProperty("username"));
		System.out.println(properties.getProperty("password"));
		System.out.println(properties.getProperty("name"));
		
	}
}
