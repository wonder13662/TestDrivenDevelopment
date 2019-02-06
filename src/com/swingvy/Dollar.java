package com.swingvy;

/*
 * 값 객체 패턴(value object pattern): 객체의 인스턴스 변수가 생성자를 통해서 일단 설정된 후에는 결코 변하지 않는다.(59p)
 */

public class Dollar extends Money {
	private String currency;
	public Dollar(int amount) {
		this.amount = amount;
		currency = "USD";
	}
	
	Money times(int multiplier) {
		return new Dollar(amount * multiplier);
	}
	
	String currency() {
		return currency;
	}
}
