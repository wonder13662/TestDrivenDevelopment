package com.swingvy;

public class Dollar {
	
	public int amount;

	public Dollar(int amount) {
		this.amount = amount;
	}
	
	public void times(int repeat) {
		this.amount = amount * repeat;
	}

}
