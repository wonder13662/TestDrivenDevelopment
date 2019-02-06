package com.swingvy;

/*
 * 값 객체 패턴(value object pattern): 객체의 인스턴스 변수가 생성자를 통해서 일단 설정된 후에는 결코 변하지 않는다.(59p)
 */

public class Dollar extends Money {
	public Dollar(int amount, String currency) {
		super(amount, currency);
	}
	
	Money times(int multiplier) {
		return new Dollar(amount * multiplier,  "USD");
	}
}
