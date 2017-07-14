package com.rk.entity;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {
	Calculator c=new Calculator();
	
	public void testadd(){
		assertTrue(c.add(5, 4)==9);
	}
	public void testMultiply(){
		assertTrue(c.multiply(4, 5)==20);
	}
	public void testSub(){
		assertTrue(c.sub(9,5)==4);
	}
	public void testDivison(){
		assertTrue(c.divison(6,3)==2);
	}
}
