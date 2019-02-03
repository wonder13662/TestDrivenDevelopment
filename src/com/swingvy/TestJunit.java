package com.swingvy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestJunit {
	
   // TODO
   // $5 + 10CHF = $10(환율이 2:1일 경우)
   // (DONE) $5 x 2 = $10
   // amount를 private으로 만들기
   // (DONE) Dollar 부작용(side effect)?
   // Money 반올림?
	// equals()
	// hashcode()
   
   @Test
   public void testMultipleication() {
	   Dollar five = new Dollar(5);
	   Dollar product = five.times(2);
	   assertEquals(10, product.amount);
	   product = five.times(3);
	   assertEquals(15, product.amount);
   }
}