package com.swingvy;

public class Dollar {
	
	public int amount;

	public Dollar(int amount) {
		this.amount = amount;
	}
	
	void times(int multiplier) {
		amount = amount * multiplier;
	}
}
