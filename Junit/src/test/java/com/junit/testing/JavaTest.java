package com.junit.testing;

import junit.framework.*;

import static org.junit.Assert.*;

import org.junit.Test;

public class JavaTest extends TestCase {
	protected int num1,num2;
	protected void setUp()
	{
		num1=3;
		num2=5;
	}

	@Test
	public void testAdd() {
		double result=num1+num2;
		assert(result==8);
	}

}
