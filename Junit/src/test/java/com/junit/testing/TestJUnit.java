package com.junit.testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestJUnit {

	@Test
	public void testAdd() {
		String str="JUnit is working";
		assertEquals("JUnit is working",str);
	}

}
