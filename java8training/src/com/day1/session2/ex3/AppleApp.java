package com.day1.session2.ex3;

import java.util.*;

public class AppleApp {
	// he want the list of all green apples
	public static List<Apple> getAllGreenApples(List<Apple> apples) {
		List<Apple> selectedApples = new ArrayList<>();
		for (Apple temp : apples) {
			if(temp.getColor().equals("green")) {
				selectedApples.add(temp);
			}
		}
		return selectedApples;
	}
	//he want list of all heavy apples > 300
	public static List<Apple> getAllHeavyApples(List<Apple> apples) {
		List<Apple> selectedApples = new ArrayList<>();
		for (Apple temp : apples) {
			if(temp.getWeight()> 300) {
				selectedApples.add(temp);
			}
		}
		return selectedApples;
	}

	//he want list of all heavy apples > 300
	public static List<Apple> getAllHeavyAndGreenApples(List<Apple> apples) {
		List<Apple> selectedApples = new ArrayList<>();
		for (Apple temp : apples) {
			if(temp.getWeight()> 300 && temp.getColor().equals("green")) {
				selectedApples.add(temp);
			}
		}
		return selectedApples;
	}
}
