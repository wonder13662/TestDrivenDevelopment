package com.swingvy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestJunit {
   @Test
   public void testAdd() {
      String str = "Junit is working fine";
      assertEquals("Junit is working fine",str);
   }
   
   // 43p
   
   // TODO
   // 1. $5 + 10CHF = $10(환율이 2:1일 경우)
   // 2. $5 x 2 = $10
   
   @Test
   public void testMultipleication() {
	   Dollar five = new Dollar(5);
	   five.times(2);
	   assertEquals(10, five.amount);
   }
}