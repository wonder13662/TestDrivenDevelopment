package com.swingvy;

class Money implements Expression {
	protected int amount;
	protected String currency;
	
	Money(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}
	
	static Money franc(int amount) {
		return new Money(amount, "CHF");
	}
	
	static Money dollar(int amount) {
		return new Money(amount, "USD");
	}	
	
	public boolean equals(Object object) {
		Money money = (Money) object;
		return amount == money.amount && currency().equals(money.currency);
	}	
	
	protected String currency() {
		return currency;
	}
	
	public String toString() {
		return amount + " " + currency;
	}

	Expression times(int multiplier) {
		return new Money(amount * multiplier,  currency);
	}
	
	public Expression plus(Expression addend) {
		return new Sum(this, addend);
	}
	
	public Money reduce(Bank bank, String to) {
		int rate = bank.rate(currency, to);
		return new Money(amount/rate, to);
	}
}
