package com.swingvy;

/*
 * 값 객체 패턴(value object pattern): 객체의 인스턴스 변수가 생성자를 통해서 일단 설정된 후에는 결코 변하지 않는다.(59p)
 */

public class Franc {
	
	private int amount;

	public Franc(int amount) {
		this.amount = amount;
	}
	
	Franc times(int multiplier) {
		return new Franc(amount * multiplier);
	}
	
	public boolean equals(Object object) {
		Franc dollar = (Franc) object;
		return amount == dollar.amount;
	}
}