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
   
   @Test
   public void testMultipleication() {
	   Dollar five = new Dollar(5);
	   assertEquals(new Dollar(10), five.times(2));
	   assertEquals(new Dollar(15), five.times(3));
   }
   
   @Test
   public void testEquality() {
		// 삼각측량
	   assertTrue(new Dollar(5).equals(new Dollar(5)));
	   assertFalse(new Dollar(5).equals(new Dollar(6)));
   }
   
   @Test
   public void testFrancMultiplication() {
	   Franc five = new Franc(5);
	   assertEquals(new Franc(10), five.times(2));
	   assertEquals(new Franc(15), five.times(3));
   }
}