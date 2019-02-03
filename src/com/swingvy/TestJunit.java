package com.swingvy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestJunit {
   // 43p
   
   // TODO
   // $5 + 10CHF = $10(환율이 2:1일 경우)
   // (NOW) $5 x 2 = $10
   // amount를 private으로 만들기
   // Dollar 부작용(side effect)?
   // Money 반올림?
   
   @Test
   public void testMultipleication() {
	   Dollar five = new Dollar(5);
	   five.times(2);
	   assertEquals(10, five.amount);
   }
}