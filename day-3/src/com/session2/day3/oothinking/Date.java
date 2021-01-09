package com.session2.day3.oothinking;

public class Date {
	private int day, month, year;
	private int days_in_month[]= {-1, 31,28,31,30,31,30,31,31,30, 31,30,31};
	
	public boolean isLeapYear() {
		return (year % 400 == 0) || ((year % 100 != 0) && (year % 4 == 0));
	}

	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public Date nextDay() {
		if(isLeapYear()) {
			days_in_month[2]=29;
		}
		
		//
		return null;
	}

}
