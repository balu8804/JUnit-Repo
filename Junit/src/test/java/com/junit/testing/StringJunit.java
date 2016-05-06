package com.junit.testing;

import static org.junit.Assert.*;


import org.junit.Test;

public class StringJunit {

	@Test
	public void testString() {
		String name="balu";
		String actual="";
		assertEquals(name,actual);
		
	}

}
