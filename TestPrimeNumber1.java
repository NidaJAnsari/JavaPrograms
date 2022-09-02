package org.test.unit_testing_with_junitJupitier;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
public class TestPrimeNumber1{
@Test
@RepeatedTest(5)
@Timeout(1)
@DisplayName("Prime Number checking test case")
	public void TestPrimeNumber1() throws InterruptedException 
	{
	  Prime ob=new Prime();
	  assertTrue(ob.PrimeNumber(5));
	}

	
}
