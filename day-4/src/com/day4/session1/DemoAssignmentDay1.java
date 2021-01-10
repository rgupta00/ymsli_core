package com.day4.session1;

import java.util.Arrays;

class ArrayLogic{
	public static int[] copyOf(int arr[]) {
		
		return Arrays.copyOf(arr, arr.length);
	}
}
public class DemoAssignmentDay1 {
	
	public static void main(String[] args) {
		int temp[]= {3,5,7};
		print(temp);
		
		int temp2[]=ArrayLogic.copyOf(temp);
	
		temp2[1]=333;
		print(temp);
		
	}

	private static void print(int[] temp) {
		for(int t: temp) {
			System.out.print(t+" ");
		}
		System.out.println();
	}
}
