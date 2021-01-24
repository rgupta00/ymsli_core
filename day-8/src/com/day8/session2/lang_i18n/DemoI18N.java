package com.day8.session2.lang_i18n;

import java.util.Locale;
import java.util.ResourceBundle;

public class DemoI18N {
	
	public static void main(String[] args) {
		String language="hi";
		String country="IN";
		
		Locale currentLocale;
		ResourceBundle messages;
		
		currentLocale =new Locale (language, country) ;
		
		messages =ResourceBundle. getBundle ("MessagesBundle", currentLocale);
						
		
		System.out.println(messages.getString("greetings")) ;
		System.out.println (messages.getString("inquiry"));
		System.out.println(messages.getString("farewell"));
	}

}
