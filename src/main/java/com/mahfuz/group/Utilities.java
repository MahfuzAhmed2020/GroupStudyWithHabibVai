package com.mahfuz.group;

import org.testng.Assert;



public class Utilities {
	
	
	
	
	
	/**
	 * thie method will take expected int values and compare them and 
	 * assert then provide the report. 
	 * @param expected
	 * @param actual
	 */
	public static void verifyStatu(int actual,int expected) {
		System.out.println("Expected value is: "+expected);
		System.out.println("Acutal value is: "+actual);
		Assert.assertEquals(actual, expected);
		System.out.println("The actual and expected value is matched. ");
	}
	/**
	 * thie method will take expected String values and compare them and 
	 * assert then provide the report. 
	 * @param expected
	 * @param actual
	 */
	public static void verifyStatu(String actual,String expected) {
		System.out.println("Expected value is: "+expected);
		System.out.println("Acutal value is: "+actual);
		Assert.assertEquals(actual, expected);
		System.out.println("The actual and expected value is matched. ");
	}
	



}
