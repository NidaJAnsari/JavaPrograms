package org.test.unit_testing_with_junitJupitier;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.JRE;

public class ConditionalExecutionOnJre {

	@Test
	@EnabledOnJre(value = JRE.JAVA_8)
	void addAppleTestCaseX()
	{
		System.out.println("addAppleTestCaseZ");
		AppleCalculator applecalculator=new AppleCalculator();
		assertEquals(2,applecalculator.addApple(1, 1));
	}
	
	@Test
	@EnabledForJreRange(max = JRE.JAVA_17,min = JRE.JAVA_8)
	void addAppleTestCaseZ()
	{
		System.out.println("addAppleTestCaseZ");
		AppleCalculator applecalculator=new AppleCalculator();
		assertEquals(8,applecalculator.addApple(4, 4));
	}
}

