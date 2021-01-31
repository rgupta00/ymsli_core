package com.day1.session2.ex3;

import java.util.*;
import java.util.function.Predicate;

public class AppleTester {

	public static void main(String[] args) {

		List<Apple> apples = Arrays.asList(new Apple("red", 400), new Apple("green", 320), new Apple("green", 200),
				new Apple("red", 250));

		Predicate<Apple> heavyApplePredicate = apple -> apple.getWeight() > 300;
		Predicate<Apple> greenApplePredicate = apple -> apple.getColor().equals("green");
		
		
		

		List<Apple> heavyApples = AppleAppV2.getAllApplesOnCondiation(apples, heavyApplePredicate);

		System.out.println("---list of all heavy Apples-------");
		for (Apple apple : heavyApples) {
			System.out.println(apple);
		}

		

		List<Apple> greenApples = AppleAppV2.getAllApplesOnCondiation(apples, greenApplePredicate);

		System.out.println("---list of all green Apples-------");
		for (Apple apple : greenApples) {
			System.out.println(apple);
		}
		
		//get the list of green or heavy apples
		Predicate<Apple> greenOrHeavyPredicate=
				heavyApplePredicate.or(greenApplePredicate);
		
		
		List<Apple> heavyOrGreenApples = AppleAppV2.getAllApplesOnCondiation(apples, greenOrHeavyPredicate);

		System.out.println("---list of all green or heavy Apples-------");
		for (Apple apple : heavyOrGreenApples) {
			System.out.println(apple);
		}
		
		//green and heavy apple
		Predicate<Apple>p1=greenApplePredicate.and(heavyApplePredicate).negate();
		

//		System.out.println("---list of all green apples-------");
//		List<Apple> greenApples=AppleApp.getAllGreenApples(apples);
//		
//		for(Apple apple: greenApples) {
//			System.out.println(apple);
//		}
//		
//		System.out.println("---list of all heavy apples-------");
//		
//		List<Apple> heavyApples=AppleApp.getAllHeavyApples(apples);
//		
//		for(Apple apple: heavyApples) {
//			System.out.println(apple);
//		}

		// Most imp functional interface in java 8

		// Predicate

		// Function

		// Consumer

		// biConsumer
		Map<String, Integer> map = new HashMap<String, Integer>();

		// Supplier

		// BiFunction

	}
}
