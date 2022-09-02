package org.test.unit_testing_with_junitJupitier;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;
public class TestAppleCalculator {
@Test
public void junitTest()
{
	AppleCalculator ob=new AppleCalculator();
	int result=ob.addApple(5, 5);
	assertEquals(10,result);
}
@Test
public void justTest1()
{
	AppleCalculator ob=new AppleCalculator();
	Boolean result=ob.booleanApple("apple");
	assertTrue(result);
}
@Test
public void testSimpleInterest()
{
	AppleCalculator ob=new AppleCalculator();
	assertEquals(100,ob.simpleInterest(1000, 5, 2));
}
@Test
public void testCheckNegativeNumber()
{
	AppleCalculator ob=new AppleCalculator();
	Boolean result=ob.checkNegativeNumber(-13);
	assertFalse(result);
	
}
@Test
public void testArray()
{
	AppleCalculator ob=new AppleCalculator();
	int expectedArray[]= {1,2,3,4,5};
	assertArrayEquals(expectedArray,ob.arrayTest());
}
}
