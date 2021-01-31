package com.day1.session2.ex3;

import java.util.*;
import java.util.function.Predicate;

public class AppleAppV2 {
	// he want the list of all green apples
	public static List<Apple> getAllApplesOnCondiation(List<Apple> apples, Predicate<Apple>predicate) {
		List<Apple> selectedApples = new ArrayList<>();
		for (Apple temp : apples) {
			if(predicate.test(temp)) {
				selectedApples.add(temp);
			}
		}
		return selectedApples;
	}
	
}
