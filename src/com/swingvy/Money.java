package com.swingvy;

class Money {
	protected int amount;
	protected String currency;
	
	Money(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}
	
	Money times(int multiplier) {
		return null;
	}

	static Money franc(int amount) {
		return new Franc(amount, "CHF");
	}
	
	static Money dollar(int amount) {
		return new Dollar(amount, "USD");
	}	
	
	public boolean equals(Object object) {
		Money money = (Money) object;
		return amount == money.amount && getClass().equals(money.getClass());
	}	
	
	protected String currency() {
		return currency;
	}
}
