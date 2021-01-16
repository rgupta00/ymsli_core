package com.day5.session1;
// S   M   L XL  XXL
// 38 40 42 44

enum ShirtSize  {
	 
	S(38), M(40) , L(42), XL(44) ,XXL(46);
	
	int size;
	
	 ShirtSize(int size) {
		this.size=size;
	}
	public int getSize() {
		return size;
	}

	public String toString() {
        return super.toString()+": "+getSize();
    }

}
class Shirt{
	private String brand;
	private String color;
	private ShirtSize size;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	public Shirt(String brand, String color, ShirtSize size) {
		this.brand = brand;
		this.color = color;
		this.size = size;
	}
	public Shirt() {
	}
	
	public void print() {
		System.out.println("brand:"+ brand+" color : "+ color+ " size: "+size);
	}
}
public class DemoEnum {
	
	public static void main(String[] args) {
		
		Shirt shirt=new Shirt("PE", "blue", ShirtSize.S);
		shirt.print();
		
		
		
		System.out.println(ShirtSize.L);
		
		/*
		 * System.out.println(ShirtSize.L); //crl+alt+L ShirtSize[] values =
		 * ShirtSize.values(); for(ShirtSize temp: values) {
		 * System.out.println(temp+" : "+ temp.getSize()+" : "+ temp.ordinal()); }
		 * 
		 * 
		 * //String --> enum... UI ShirtSize s1=ShirtSize.valueOf("S");
		 * System.out.println(s1);
		 */
		
	}

}










