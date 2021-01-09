package com.session1.day3.ex1;

public class Parking {
	private int pid;
	private String loc;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public Parking(int pid, String loc) {
		this.pid = pid;
		this.loc = loc;
	}
	public Parking() {}

	public void printParking() {
		System.out.println("parking id:"+ pid+" loc: "+ loc);
	}
	
}
