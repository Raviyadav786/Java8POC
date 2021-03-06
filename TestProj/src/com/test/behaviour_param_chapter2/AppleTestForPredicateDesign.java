package com.test.behaviour_param_chapter2;

import java.util.ArrayList;
import java.util.List;

public class AppleTestForPredicateDesign {
	public static void main(String[] args) {

		List<Apple> inventory = AppleTestForNormalDesignApproach.getAppleInventory();

		System.out.println(getFilterApple(inventory, new AppleGreenColorPredicate()));
		
		System.out.println(getFilterApple(inventory,new AppleHeavyWeightPredicate()));

	}

	public static List<Apple> getFilterApple(List<Apple> inventory, ApplePredicate ap) {
		List<Apple> filterApple = new ArrayList<>();

		for (Apple apple : inventory)
			if (ap.test(apple))
				filterApple.add(apple);
		return filterApple;
	}
}
