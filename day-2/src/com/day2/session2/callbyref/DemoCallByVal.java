package com.day2.session2.callbyref;

public class DemoCallByVal {
	
	public static void main(String[] args) {
		
		int i,j;
		i=10; j=20;
		System.out.println("before swapping: i: "+ i+" j: "+ j);
		swap(i, j);
		System.out.println("after swapping: i: "+ i+" j: "+ j);
	}

	 static void swap(int i, int j) {
		int temp;
		temp=i;
		i=j;
		j=temp;
	}

}
