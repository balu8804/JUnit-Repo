package com.junit.testing;

import static org.junit.Assert.*;
import com.junit.testing.StringHelper;

import org.junit.Test;

public class StringHelperTest {
	StringHelper helper=new StringHelper();
	

	@Test
	public void testTruncateAInFirst2Positions_AinFirst2Positions() {
		
		assertEquals("CD",helper.truncateAInFirstTwoPositions("AACD"));
	}
	@Test
	public void testTruncateAInFirst2Positions_AinFirstPosition()
	{
		assertEquals("CD",helper.truncateAInFirstTwoPositions("ACD"));
	}
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame()
	{
		assertEquals(false,helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
		
	}

}
