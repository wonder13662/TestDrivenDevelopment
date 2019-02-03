package com.swingvy;

/*
 * 값 객체 패턴(value object pattern): 객체의 인스턴스 변수가 생성자를 통해서 일단 설정된 후에는 결코 변하지 않는다.(59p)
 */

public class Dollar extends Money {
	public Dollar(int amount) {
		this.amount = amount;
	}
	
	Dollar times(int multiplier) {
		return new Dollar(amount * multiplier);
	}
	
	public boolean equals(Object object) {
		Money money = (Money) object;
		return amount == money.amount;
	}
}
