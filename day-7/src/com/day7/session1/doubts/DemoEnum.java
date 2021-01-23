package com.day7.session1.doubts;

enum ShirtSize{
	L(38){
		@Override
		public String getPersonDesc() {
			//
			return "small build but u can be great";
		}
	}, 
	M(40){
		@Override
		public String getPersonDesc() {
			return "ok build but great";
		}
		
	}, 
	XL(42){
		@Override
		public String getPersonDesc() {
			return "99% have same build as u, but great";
		}
		
	},
	XXL(44){
		@Override
		public String getPersonDesc() {
			return "1% have same build as u great!!";
		}
		@Override
		public String hello() {
			return "hello by enum, big champ";
		}
		
	};
	private int size;

	private ShirtSize(int size) {
		this.size = size;
	}

	public int getSize() {
		return size;
	}
	public String hello() {
		return "hello by enum";
	}
	public abstract String getPersonDesc();
}
public class DemoEnum {
	
	public static void main(String[] args) {
		ShirtSize shirtSize1=ShirtSize.M;
		ShirtSize shirtSize2=ShirtSize.XXL;
		
		
		System.out.println(shirtSize1.getPersonDesc());
		System.out.println(shirtSize2.getPersonDesc());
		
		
		//System.out.println(shirtSize1.getSize());
		
//		ShirtSize shirtSize1=ShirtSize.M;
//		ShirtSize shirtSize2=ShirtSize.L;
//		if(shirtSize1.equals(shirtSize2)) {
//			System.out.println("are eq");
//		}else
//			System.out.println("are not eq");
	
	}

}
