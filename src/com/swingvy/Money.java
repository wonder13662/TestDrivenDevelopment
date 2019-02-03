package com.swingvy;

abstract class Money {
	protected int amount;
	
	abstract Money times(int multiplier);

	static Money dollar(int amount) {
		return new Dollar(amount);
	}
	
	public boolean equals(Object object) {
		Money money = (Money) object;
		return amount == money.amount && getClass().equals(money.getClass());
	}	
}
