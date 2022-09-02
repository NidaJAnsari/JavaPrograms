package org.test.unit_testing_with_junitJupitier;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
public class LifeCycleStages {
	@BeforeAll 
	static void BeforeAll() 
	{
		System.out.println("before all method");
	}
	@BeforeEach
	void BeforeEach()
	{
System.out.println("before each method");
}
	@AfterEach
	void AfterEach() 
	{
		System.out.println("after each method");
	}
	@AfterAll
	static void AfterAll() 
	{
		System.out.println("after all method");
	}
	@Test
	public void junitTest()
	{
		System.out.println("Test case 1");
		AppleCalculator ob=new AppleCalculator();
		int result=ob.addApple(5, 5);
		assertEquals(10,result);
	}
	@Test
	public void justTest1()
	{
		System.out.println("Test case 2");
		AppleCalculator ob=new AppleCalculator();
		Boolean result=ob.booleanApple("apple");
		assertTrue(result);
	}
	
}
