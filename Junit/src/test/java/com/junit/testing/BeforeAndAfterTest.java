package com.junit.testing;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BeforeAndAfterTest {
	@Before
	public void setUp()
	{
		System.out.println("Before Test1");
	}

	@Test
	public void test1() {
		System.out.println("test1");
	}
	
	@Test
	public void test2()
	{
		System.out.println("test 2");
	}
	@After
	public void setUP()
	{
		System.out.println("After Test");
	}
	
	
      
}
