package com.swingvy;

public class Dollar {
	
	public int amount;

	public Dollar(int amount) {
		this.amount = amount;
	}
	
	Dollar times(int multiplier) {
		amount *= multiplier;
		return null;
	}
}
