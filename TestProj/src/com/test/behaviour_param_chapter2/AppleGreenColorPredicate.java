package com.test.behaviour_param_chapter2;

public class AppleGreenColorPredicate implements ApplePredicate {

	@Override
	public boolean test(Apple apple) {

		return "Green".equalsIgnoreCase(apple.getColor());
	}

}
