package com.relations.compositon;
import java.util.*;
class Flat{
	private String ownerName;
	private String flatNo;
	
	
}

class Building{
	private String buildingName;
	private String location;
	private String address;
	
	private List<Flat> flats=new ArrayList<>();
	
	public void addFlat(Flat flat) {
		flats.add(flat);
	}
		
}

public class DemoCompositon {

	
	public static void main(String[] args) {
		
	}
}
