package com.day5.session2.ex_handling;

import java.io.Closeable;
import java.io.IOException;

class Window implements Closeable{
	public Window() {
		System.out.println("ctr of window is called..");
	}
	@Override
	public void close() throws IOException {
		System.out.println("window is close..");
	}
	
	public void doWindowLogic() {
		System.out.println("logic of opending window.");
	}
	
}

class Door implements Closeable{
	public Door() {
		System.out.println("ctr of door is called..");
	}
	@Override
	public void close() throws IOException {
		System.out.println("door is close..");
	}
	
	public void doDoorLogic() {
		System.out.println("logic of opending Door.");
	}
}

public class DemoAutoClosable {

	public static void main(String[] args) {
		//---> L to R
		try(Window window=new Window(); Door door=new Door()){
			window.doWindowLogic();
			door.doDoorLogic();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}






