package com.swingvy;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class TestJunit {
	
   // TODO
   // $5 + 10CHF = $10(환율이 2:1일 경우)
   // (DONE) $5 x 2 = $10
   // (DONE) amount를 private으로 만들기
   // (DONE) Dollar 부작용(side effect)?
   // Money 반올림?
	// (DONE) equals()
	// hashcode()
	// Equal null
	// Equal object
	// (DONE) 5CHF x 2 = 10CHF
	// Dollar/Franc 중복
	// (DONE)공용 equals
	// 공용 times
	// (DONE)France과 Dollar 비교하기
	// 통화?
   
   @Test
   public void testMultipleication() {
	   Money five = Money.dollar(5);
	   assertEquals(Money.dollar(10), five.times(2));
	   assertEquals(Money.dollar(15), five.times(3));
   }
   
   @Test
   public void testEquality() {
		// 삼각측량
	   assertTrue(Money.dollar(5).equals(Money.dollar(5)));
	   assertFalse(Money.dollar(5).equals(Money.dollar(6)));
	   assertTrue(Money.franc(5).equals(Money.franc(5)));
	   assertFalse(Money.franc(5).equals(Money.franc(6)));
	   assertFalse(Money.franc(5).equals(Money.dollar(5)));
   }
   
   @Test
   public void testFrancMultiplication() {
	   Money five = Money.franc(5);
	   assertEquals(Money.franc(10), five.times(2));
	   assertEquals(Money.franc(15), five.times(3));
   }
}