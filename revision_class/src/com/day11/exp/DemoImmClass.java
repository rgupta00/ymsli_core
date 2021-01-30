package com.day11.exp;
import java.util.*;

class Val {
	int val;

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}

	public Val(int val) {
		this.val = val;
	}

	public Val() {}
}

final class ImmClass {
	final private int i;
	final private int arr[];
	final	private Val val;
	final private Date date;
	final private List<String>list;
	
	public ImmClass(int i, int[] arr, Val val, Date date, List<String> list) {
		this.i = i;
		this.arr = Arrays.copyOf(arr, arr.length);//
		this.val = new Val(val.getVal());
		this.date = (Date) date.clone();
		this.list = Collections.unmodifiableList(list);
	}
	public int getI() {
		return i;
	}
	public int[] getArr() {
		return Arrays.copyOf(arr, arr.length);
	}
	public Val getVal() {
		return new Val(val.getVal());
	}
	public Date getDate() {
		return (Date) date.clone();
	}
	public List<String> getList() {
		return Collections.unmodifiableList(list);
	}
	
	
	public void print() {
		System.out.println("i:"+i);
		
		System.out.println("arr:");
		for(int temp: arr) {
			System.out.print(temp+ " ");
		}
		
		System.out.println("val:"+val.getVal());
		System.out.println("list:"+list);
		
		System.out.println(date);
	}

}

public class DemoImmClass {

	public static void main(String[] args) {
		int i=66;
		Val val=new Val();
		val.setVal(666);
		Date date=new Date();
		
		int arr[]= {4,6,7};
		List<String> list=new ArrayList<>();
		list.add("foo");
		list.add("bar");
		
		System.out.println("before changes");
		ImmClass class1=new ImmClass(i, arr, val, date, list);
		class1.print();
		System.out.println("after changes");
		System.out.println("-------------");
		
		class1.getDate().setDate(11);
		
		class1.print();
		
	}
	

}





