package com.day4.session2.inner;

class Outer {
	private int i = 66;

	class Inner {
		private int i = 99;

		public void doInner() {
			System.out.println("hello inner classes..." + i);
		}
	}
	//Object of inner class is not 
	//possible without outer class object*
	
	public void doLogic() {
		Inner inner=this.new Inner();
		inner.doInner();
	}
}

public class DemoInnerClass {
	public static void main(String[] args) {
		Outer outer=new Outer();
		outer.doLogic();
//		Outer.Inner inner = new Outer().new Inner();
//		inner.doInner();
	}

}
