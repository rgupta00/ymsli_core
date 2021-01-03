package a;

import java.sql.Date;

public class DemoDate {
	
	public static void main(String[] args) {
		//java util date
		java.util.Date dateUtil=new java.util.Date();
		
		//java sql date
		Date date=new Date(dateUtil.getTime());
		
	}

}
