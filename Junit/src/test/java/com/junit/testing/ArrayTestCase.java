package com.junit.testing;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ArrayTestCase {

	@Test
	public void Arraytest() {
		int[] numbers={5,8,3,6};
		int[] expected={3,5,6,8};
		Arrays.sort(numbers);
		assertArrayEquals(expected, numbers);
	}
	@Test
       public void nullTest()
       {
    	   int[] numbers=null;
    	   try{
    	   Arrays.sort(numbers);
    	   }
    	   catch(NullPointerException e)
    	   {
    		   //System.out.println("Numbers required");
    	   }
       }
	@Test(timeout=100)
	
	public void testSort_performance()
	{
	int array[]={5,78,54};	
	for(int i=1;i<=1000;i++)
	{
		array[0]=i;
		Arrays.sort(array);
		System.out.println(array);
	}
	}
	
	
}
