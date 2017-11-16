package com.test.behaviour_param_chapter2;

/**
 * @author Abhi inventory item
 */
public class Apple {
	/* color of apple */
	private String color;
	/* weight of apple */
	private int weight;

	public Apple(String color, int weight) {
		super();
		this.color = color;
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Apple::::color:" + this.color + "::::weight:" + this.weight;
	}

}
