package com.swingvy;

abstract class Money {
	protected int amount;
	protected String currency;
	
	abstract Money times(int multiplier);

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
